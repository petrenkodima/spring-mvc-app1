package ru.petrenko.spring.FirstRestApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.petrenko.spring.FirstRestApp.models.Person;


@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {

}
