package com.miramontes.two.linkin.becomespringdev.a.models;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Room {
    private int id;
    private String number;
    private String name;
    private String info;

    public Room(int id, String number, String name, String info) {
        this.id = id;
        this.number = number;
        this.name = name;
        this.info = info;
    }
}
