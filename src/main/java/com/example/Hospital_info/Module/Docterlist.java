package com.example.Hospital_info.Module;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@AllArgsConstructor
@Data
public class Docterlist {
@Id
private int id;
private String docname;
private String Qualication;
private String specalist;

    public Docterlist() {
    }
}
