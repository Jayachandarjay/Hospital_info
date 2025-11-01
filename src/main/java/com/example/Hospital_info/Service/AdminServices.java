package com.example.Hospital_info.Service;

import com.example.Hospital_info.Module.Docterlist;
import com.example.Hospital_info.Module.Patintlist;
import com.example.Hospital_info.Repo.DocterListRepo;
import com.example.Hospital_info.Repo.Patenitrepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;
@Service
public class AdminServices {
    @Autowired
    DocterListRepo docterListRepo;
    @Autowired
    Patenitrepo patenitrepo;

    public List<Docterlist> inserting(Docterlist docterlist) {
        List<Docterlist> val= new ArrayList<>();
        val.add(docterListRepo.save(docterlist));
        System.out.println("val = " + val);
        return docterListRepo.findAll();
    }
    public List<Docterlist> Delete(Docterlist docterlist){
        docterListRepo.delete(docterlist);
        return docterListRepo.findAll();
    }
    @Transactional
    public List<Docterlist> DeleteByname(String docname) {
        List<Docterlist> val=docterListRepo.findAll();
                docterListRepo.deleteByDocname(docname);
                System.out.println("deleted"+docname);

        return docterListRepo.findAll();
    }
    public List<Patintlist> insert_userdetails(Patintlist patintlists) {
        List<Patintlist> val=new ArrayList<Patintlist>();
        val.add(patenitrepo.save(patintlists));
        return val;
    }

    public List<Patintlist> deletebypatientname(String name) {
        patenitrepo.deleteByName(name);

        return patenitrepo.findAll();
    }
}
