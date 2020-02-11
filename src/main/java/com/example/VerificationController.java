package com.example;

import com.example.cassendra.Person;
import com.example.cassendra.PersonKey;
import com.example.cassendra.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.UUID;

@RestController
public class VerificationController {

    @Autowired
    PersonRepository personRepository;

    @GetMapping("/monitor")
    public String checkHealth() {
        final PersonKey key = new PersonKey("John", LocalDateTime.now(), UUID.randomUUID());
        final Person p = new Person(key, "Doe", 1000);
        personRepository.insert(p);
      return "working";
    }

}
