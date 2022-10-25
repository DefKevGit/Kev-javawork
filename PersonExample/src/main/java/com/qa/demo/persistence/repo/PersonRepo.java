package com.qa.demo.persistence.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.qa.demo.persistence.domain.Person;

@Repository
public interface PersonRepo extends JpaRepository<Person, Long> {

    @Query(value = "SELECT * from Person where name=?1",nativeQuery=true)
    List<Person> findPersonByName(String name); 

    @Query(value = "SELECT * from Person where name =?1 and age =?2  LIMIT 1",nativeQuery=true)
    Person findOnePersonByNameAndAge(String name, int age); 

    @Query(value = "SELECT * from Person where name =?1 and age =?2",nativeQuery=true)
    List<Person> findPeopleByNameAndAge(String name, int age);
    
    @Query(value = "SELECT * from Person where age >?1",nativeQuery=true)
    List<Person> findPersonByAgeGreaterThan(int age); 

    @Query(value = "SELECT * from Person where age <?1",nativeQuery=true)
    List<Person> findPersonByAgeLessThan(int age); 

    @Query(value = "SELECT * from Person where name IS NOT NULL",nativeQuery=true)
    List<Person> findPersonByNameIsNotNull(); 

    @Query(value = "SELECT * from Person where name IS NULL",nativeQuery=true)
    List<Person> findPersonByNameIsNull();

	 

}