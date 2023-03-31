package academy.hibernate.servis;

import com.example.demo.entity.Person;
import com.example.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class PersonService {
    @Autowired
     PersonRepository personRepository;

    public Person getById(Long id) {
        return personRepository.getById(id);

    }
}
