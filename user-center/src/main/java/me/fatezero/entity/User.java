package me.fatezero.entity;

import me.fatezero.base.BaseEntity;

import javax.persistence.*;

@Table(name="sys_user")
@Entity
public class User extends BaseEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Long id;

    private String username;
}
