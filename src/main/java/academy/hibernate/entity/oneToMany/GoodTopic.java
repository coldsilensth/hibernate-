package academy.hibernate.entity.oneToMany;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class GoodTopic {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String title;
    @OneToMany(mappedBy = "topic", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<GoodComment> comments=new ArrayList<>();

    public void addComment(GoodComment comment) {
        comments.add(comment);
        comment.setTopic(this);
    }
    public void removeComment(GoodComment comment) {
        comments.remove(comment);
        comment.setTopic(null);
    }
    //getters/setters/constructors
}