package com.example.Hospital_info.Controller;
import com.example.Hospital_info.Module.Docterlist;
import com.example.Hospital_info.Module.MedicineList;
import com.example.Hospital_info.Module.Patintlist;
import com.example.Hospital_info.Service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "*")
public class VisitorController {
    @Autowired
    PatientService patientService;

    @GetMapping("home/medicinelist")
     List<MedicineList> medicinelist(){
        return patientService.Medicinelist();
    }

    @GetMapping("home/docterlist")
    List<Docterlist> docterlist(){
       return patientService.DocterList();
    }
    @GetMapping("/home/docterlistbyname")
    List<Docterlist> docterlistbyname(@RequestParam("name") String name){
        return patientService.Docterlistbyname(name);
    }

    @GetMapping("home/docterlistbySpeality")
    List<Docterlist> docterlistbySpeality(@RequestParam("Speality") String Speality){
        return patientService.DocterlistbySpeality(Speality);
    }

    @GetMapping("home/patient/patientAll")
    List<Patintlist>Listofpatient(){
        return patientService.newpatientlists();
    }
    @PutMapping("home/patient/assign_docters")
    List<Docterlist> Choose_docters(@RequestBody Patintlist patintlist){
        return patientService.Choose_docters(patintlist);
    }
    @GetMapping("home/patient/Securitycode")
    String securtycode(@RequestParam int code){
        return patientService.code(code);git
    }


}
