package me.fatezero.entity;

import me.fatezero.common.entity.BaseEntity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name="sys_user")
public class User implements BaseEntity {
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_name")
    private String userName;

    /**
     * create date time.
     */
    private LocalDateTime createTime;

    /**
     * update date time.
     */
    private LocalDateTime updateTime;
}
