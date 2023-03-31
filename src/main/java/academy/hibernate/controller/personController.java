package academy.hibernate.controller;

import com.example.demo.entity.Person;
import com.example.demo.servis.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


public class personController {
    @Autowired
    PersonService service;

    @GetMapping("/{id}")
    Person getById(@PathVariable Long id) {
        return service.getById(id);
    }
}
