package com.example.Hospital_info.Repo;

import com.example.Hospital_info.Module.Patintlist;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface Patenitrepo extends JpaRepository<Patintlist,Integer> {
    @Modifying
    @Transactional
    @Query(nativeQuery = true,value = "delete from Patintlist where name=:name")
    void deleteByName(@Param("name") String name);
}
