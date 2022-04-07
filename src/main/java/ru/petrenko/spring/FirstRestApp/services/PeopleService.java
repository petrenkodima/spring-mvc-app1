package ru.petrenko.spring.FirstRestApp.services;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.petrenko.spring.FirstRestApp.models.Person;
import ru.petrenko.spring.FirstRestApp.repository.PeopleRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PeopleService {

    private final PeopleRepository peopleRepository;

    public List<Person> getAll() {
        return peopleRepository.findAll(Sort.by(Sort.Order.asc("date"),
                Sort.Order.desc("priorityId")));
    }

    public Person save(Person person) {
        return peopleRepository.save(person);
    }

    public void delete(int id) {
        peopleRepository.deleteById(id);
    }

    public Person findOne(int id) {
        Optional<Person> foundPerson = peopleRepository.findById(id);
        return foundPerson.orElse(null);
    }

}
