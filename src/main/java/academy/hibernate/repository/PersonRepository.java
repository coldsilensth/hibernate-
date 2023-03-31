package academy.hibernate.repository;


import com.example.demo.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;


//будет помогать рабоать с базой
public interface PersonRepository extends JpaRepository<Person,Long> { //слева - класс справа - тип персона

}
//< - женерик