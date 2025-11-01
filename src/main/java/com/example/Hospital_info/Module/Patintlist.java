package com.example.Hospital_info.Module;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

@Entity
public class Patintlist {
    @Id
    private int id;
    private String name;
    private String disseses;
    private String docteralloted;
    private int code;
    public Patintlist() {
    }
}
