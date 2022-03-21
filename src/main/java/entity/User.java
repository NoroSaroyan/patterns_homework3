package entity;

import lombok.data;
import javax.persistence.*;

@Entity
@Table(name = "users")
@Data
@Scope("session")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "phoneNumber")
    private String phoneNumber;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "secondName")
    private String secondName;

}