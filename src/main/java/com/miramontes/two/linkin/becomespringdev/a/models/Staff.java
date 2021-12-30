package com.miramontes.two.linkin.becomespringdev.a.models;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Staff {
    private String id;
    private String firstName;
    private String lastName;
    private String position;

    public Staff(String id, String firstName, String lastName, String position) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
    }
}
