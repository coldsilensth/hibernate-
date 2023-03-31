package academy.hibernate.entity.oneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data //аннотация заменяет геттеры-сеттеры
@AllArgsConstructor
@NoArgsConstructor
public class GoodComment {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String text;
    @ManyToOne(fetch = FetchType.LAZY)//
    private GoodTopic topic;

//eager - для меньшего кол-во данных для загрузки страницы
    //getters/setters/constructors
}