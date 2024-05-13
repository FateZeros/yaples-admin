package me.fatezero.entity;

import lombok.Getter;
import lombok.Setter;
import me.fatezero.common.entity.BaseEntity;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="sys_user")
public class User extends BaseEntity {
    @Id
    @Column(name = "user_id")
    private Long id;

    private String username;
}
