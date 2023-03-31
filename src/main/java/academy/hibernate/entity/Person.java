package academy.hibernate.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Persons3", uniqueConstraints = {@UniqueConstraint(columnNames = {"taxNumber"})})
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "persons_sequence")
    @SequenceGenerator(name = "persons_sequence", sequenceName = "persons_seq", allocationSize = 1)
    private Long id;

    @Column(nullable = false, length = 30)
    private String name;

    private String surname;

    @Column(length = 14, unique = true)
    private String taxNumber;
}