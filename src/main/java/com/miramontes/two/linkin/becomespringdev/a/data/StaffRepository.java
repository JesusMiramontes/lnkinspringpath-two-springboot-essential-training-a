package com.miramontes.two.linkin.becomespringdev.a.data;

import com.miramontes.two.linkin.becomespringdev.a.models.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<Staff, String> {
}
