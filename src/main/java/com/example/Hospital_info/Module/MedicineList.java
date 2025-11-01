package com.example.Hospital_info.Module;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class MedicineList {
    @Id
    private int id;
    private String nameofmedicine;
    private String price;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameofmedicine() {
        return nameofmedicine;
    }

    public void setNameofmedicine(String nameofmedicine) {
        this.nameofmedicine = nameofmedicine;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public MedicineList(int id, String nameofmedicine, String price) {
        this.id = id;
        this.nameofmedicine = nameofmedicine;
        this.price = price;
    }

    public MedicineList() {
    }
}
