package academy.hibernate.entity.oneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

//один ко многим - тема/статья и комент
@Entity
@Data //аннотация заменяет геттеры-сеттеры
@AllArgsConstructor
@NoArgsConstructor
public class Topic {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String title;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true) //если мы удалим запись где-то то его комментари тоже удаляются
    @JoinColumn(name = "topic_id")
    private List<Comment> comments=new ArrayList<>();

    //getters/setters/constructors
}