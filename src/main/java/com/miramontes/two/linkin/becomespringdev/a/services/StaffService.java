package com.miramontes.two.linkin.becomespringdev.a.services;

import com.miramontes.two.linkin.becomespringdev.a.models.Staff;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StaffService {

    private static final List<Staff> STAFFS = new ArrayList<>();
    static {
        for (int i = 0; i < 10; i++) {
            STAFFS.add(new Staff("ID" + i, "firstName" + i, "lastName" + i, "position" + i));
        }
    }

    public List<Staff> getAllStaffMembers() {
        return STAFFS;
    }
}
