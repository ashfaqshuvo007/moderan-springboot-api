package com.moderan.hometask.person;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PersonRepository extends JpaRepository<Person, Integer>{
    //Custom query
    public static final String searchString = "select * from person_data p where p.person like %:search%";

    @Query(value = searchString, nativeQuery = true)
    List<Person> findBySearchString(@Param("search") String search);
    
}
