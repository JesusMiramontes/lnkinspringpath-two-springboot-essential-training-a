package com.miramontes.two.linkin.becomespringdev.a.services;

import com.miramontes.two.linkin.becomespringdev.a.data.RoomRepository;
import com.miramontes.two.linkin.becomespringdev.a.models.Room;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {

    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public List<Room> getAllRooms(){
        return roomRepository.findAll();
    }

    public Room getById(Long id) {
        return roomRepository.findById(id).get();
    }
}
