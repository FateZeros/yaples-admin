package me.fatezero.entity;

import javax.persistence.*;

@Table(name="sys_user")
@Entity
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Long id;

    @Column(name = "user_name")
    private String username;
}
