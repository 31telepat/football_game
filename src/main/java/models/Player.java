package models;

import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table (name = "football_player")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

    public Player() {
    }

    public Player(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
