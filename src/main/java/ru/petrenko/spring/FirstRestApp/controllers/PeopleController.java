package ru.petrenko.spring.FirstRestApp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.petrenko.spring.FirstRestApp.models.Person;
import ru.petrenko.spring.FirstRestApp.services.PeopleService;

import java.util.List;

@RestController // @Controller + @ResponseBody над каждым методом
@RequestMapping("/people")
public class PeopleController {

    private final PeopleService peopleService;

    @Autowired
    public PeopleController(PeopleService peopleService) {
        this.peopleService = peopleService;
    }

    @GetMapping("/{id}")
    public Person getPerson(@PathVariable("id") int id) {
        return peopleService.findOne(id); // Jackson конвертирует в JSON
    }

    @GetMapping
    public List<Person> getAll(Model model) {
        List<Person> personList = peopleService.getAll();
        model.addAttribute("personList", personList);
        model.addAttribute("personSize", personList.size());
        return personList;
    }

    @PostMapping("/delete/{id}")
    public void deletePerson(@PathVariable("id") int id) {
        peopleService.delete(id);
    }

    @PostMapping("/add")
    public ResponseEntity<Void> addPerson(@RequestBody Person person) {
        peopleService.save(person);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
