package com.miramontes.two.linkin.becomespringdev.a.data;

import com.miramontes.two.linkin.becomespringdev.a.models.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
