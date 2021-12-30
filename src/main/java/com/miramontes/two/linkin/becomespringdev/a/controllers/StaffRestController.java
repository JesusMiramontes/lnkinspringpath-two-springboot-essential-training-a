package com.miramontes.two.linkin.becomespringdev.a.controllers;

import com.miramontes.two.linkin.becomespringdev.a.models.Staff;
import com.miramontes.two.linkin.becomespringdev.a.services.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/staff")
public class StaffRestController {
    private final StaffService staffService;

    @Autowired
    public StaffRestController(StaffService staffService) {
        this.staffService = staffService;
    }

    @GetMapping
    public List<Staff> getAllStaffMembers(){
        return staffService.getAllStaffMembers();
    }
}
