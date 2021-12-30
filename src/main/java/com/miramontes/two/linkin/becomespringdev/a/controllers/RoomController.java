package com.miramontes.two.linkin.becomespringdev.a.controllers;

import com.miramontes.two.linkin.becomespringdev.a.models.Room;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/rooms")
public class RoomController {
    private static final List<Room> ROOMS = new ArrayList<>();
    static {
        for (int i = 0; i < 10; i++) {
            ROOMS.add(new Room(i, "Numb" + i, "Name" + i, "Info" + i));
        }
    }

    @GetMapping
    public String getAllRooms(Model model){
        model.addAttribute("rooms", ROOMS);
        return "rooms";
    }
}
