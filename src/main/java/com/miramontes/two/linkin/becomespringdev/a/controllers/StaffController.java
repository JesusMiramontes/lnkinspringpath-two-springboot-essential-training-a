package com.miramontes.two.linkin.becomespringdev.a.controllers;

import com.miramontes.two.linkin.becomespringdev.a.services.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/staffs")
public class StaffController {
    private final StaffService staffService;

    @Autowired
    public StaffController(StaffService staffService) {
        this.staffService = staffService;
    }

    @GetMapping
    public String getAllStaffs(Model model){
        model.addAttribute("staffs", staffService.getAllStaffMembers());
        return "staffs";
    }
}
