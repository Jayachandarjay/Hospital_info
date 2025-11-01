package com.example.Hospital_info.Service;

import com.example.Hospital_info.Module.Docterlist;
import com.example.Hospital_info.Module.MedicineList;
import com.example.Hospital_info.Module.Patintlist;
import com.example.Hospital_info.Repo.DocterListRepo;
import com.example.Hospital_info.Repo.MedicineLists;
import com.example.Hospital_info.Repo.Patenitrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PatientService {

    @Autowired
    MedicineLists medicineLists;
    @Autowired
    DocterListRepo docterListRepo;
    @Autowired
    Patenitrepo patenitrepo;


    public List<MedicineList> Medicinelist() {
        return medicineLists.findAll();
    }

    public List<Docterlist> DocterList() {
        return docterListRepo.findAll();
    }

    public List<Docterlist> Docterlistbyname(String docname) {
        return docterListRepo.findByDocname(docname);
    }

    public List<Docterlist> DocterlistbySpeality(String specalist) {
        return docterListRepo.findBySpecalist(specalist);
    }

    public List<Patintlist> newpatientlists() {
        return patenitrepo.findAll();
    }

    public List<Docterlist> Choose_docters(Patintlist patintlist) {
        String Disseses=patintlist.getDisseses();
        String[] ArrayOfWords=Disseses.split(" ");
        List<List<Docterlist>> list=new ArrayList<>();
        for(int i=0;i<ArrayOfWords.length;i++) {
            String value = "%" + ArrayOfWords[i] + "%";
            if(docterListRepo.Getdissessbased_DocterList(value)!=null){
                list.add(docterListRepo.Getdissessbased_DocterList(value));
            }

        }
        List<Docterlist> list1=new ArrayList<>();

        for(int i=0;i<list.size();i++){
            for(int j=0;j<list.get(i).size();j++){
               list1.add(list.get(i).get(j));
            }
        }

        return list1;
    }


    public String code(int code) {
   return "";
    }
}
