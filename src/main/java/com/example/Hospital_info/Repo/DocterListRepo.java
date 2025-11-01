package com.example.Hospital_info.Repo;
import com.example.Hospital_info.Module.Docterlist;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Repository
public interface DocterListRepo extends JpaRepository<Docterlist,Integer> {
     List<Docterlist> findByDocname(String Docname);
    List<Docterlist> findBySpecalist(String specialist);
    void deleteByDocname(String docname);
    @Query(nativeQuery = true,value = "select * from Docterlist where specalist like :arrayOfWord ")
    List<Docterlist> Getdissessbased_DocterList(@Param("arrayOfWord") String arrayOfWord);

    // @Query(value = "delete from where docname=:docname", nativeQuery = true)
}
