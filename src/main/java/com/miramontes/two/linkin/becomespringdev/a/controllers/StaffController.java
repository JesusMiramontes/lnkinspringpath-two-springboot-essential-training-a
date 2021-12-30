package com.miramontes.two.linkin.becomespringdev.a.controllers;

import com.miramontes.two.linkin.becomespringdev.a.models.Staff;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller("/staffs")
public class StaffController {
    private static final List<Staff> STAFFS = new ArrayList<>();
    static {
        for (int i = 0; i < 10; i++) {
            STAFFS.add(new Staff("ID" + i, "firstName" + i, "lastName" + i, "position" + i));
        }
    }

    @GetMapping
    public String getAllStaffs(Model model){
        model.addAttribute("staffs", STAFFS);
        return "staffs";
    }
}
