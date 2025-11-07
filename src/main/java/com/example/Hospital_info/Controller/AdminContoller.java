package com.example.Hospital_info.Controller;

import com.example.Hospital_info.Module.Docterlist;
import java.util.List;

import com.example.Hospital_info.Module.Patintlist;
import com.example.Hospital_info.Service.AdminServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class AdminContoller {
    @Autowired
    AdminServices adminServices;
    @GetMapping("/")
    public String HomeAdmin() {
        System.out.println("Hospital Info API is running successfully At Server..........!");
        return "Hospital Info API is running successfully!";
    }
    @PostMapping("Admin/addingdocters")
    public List<Docterlist> addingdocters(@RequestBody Docterlist docterlist){
        return adminServices.inserting(docterlist);
    }
    @DeleteMapping("Admin/deletedocters")
    public List<Docterlist> deletingdocters(@RequestBody Docterlist docterlist){
        return adminServices.Delete(docterlist);
    }
    @DeleteMapping("Admin/DeleteNameByName")
    public List<Docterlist> DeleteNameByName(@RequestParam String docname){
        System.out.println("docname = " + docname);
        return adminServices.DeleteByname(docname);
    }
    @PostMapping("Admin/inserting_patientlist")
    public List<Patintlist> inserting_newuserdetails(@RequestBody Patintlist patintlists){
        return adminServices.insert_userdetails(patintlists);
    }
    @DeleteMapping("Admin/deletebynmae")
    public List<Patintlist> deletebynmae(@RequestParam String name){
        return adminServices.deletebypatientname(name);
    }

}
