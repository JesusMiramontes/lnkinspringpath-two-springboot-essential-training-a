package com.miramontes.two.linkin.becomespringdev.a.services;

import com.miramontes.two.linkin.becomespringdev.a.models.Room;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomService {
    private static final List<Room> ROOMS = new ArrayList<>();
    static {
        for (int i = 0; i < 10; i++) {
            ROOMS.add(new Room(i, "Numb" + i, "Name" + i, "Info" + i));
        }
    }

    public List<Room> getAllRooms(){
        return ROOMS;
    }
}
