package com.example.Hospital_info.Repo;

import com.example.Hospital_info.Module.MedicineList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicineLists extends JpaRepository<MedicineList,Integer>{
}

