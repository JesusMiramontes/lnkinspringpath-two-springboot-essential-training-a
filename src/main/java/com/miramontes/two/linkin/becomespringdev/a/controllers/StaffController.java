package com.miramontes.two.linkin.becomespringdev.a.controllers;

import com.miramontes.two.linkin.becomespringdev.a.data.StaffRepository;
import com.miramontes.two.linkin.becomespringdev.a.services.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/staffs")
public class StaffController {
    private final StaffRepository staffRepository;

    @Autowired
    public StaffController(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    @GetMapping
    public String getAllStaffs(Model model){
        model.addAttribute("staffs", staffRepository.findAll());
        return "staffs";
    }
}
