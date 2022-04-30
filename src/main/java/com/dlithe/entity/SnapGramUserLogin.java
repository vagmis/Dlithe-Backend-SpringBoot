package com.dlithe.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@Table(name="user_login")
public class SnapGramUserLogin {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "user_id")
    private int userId;

    @Column(name = "user_name")
    private String  userName;

    @Column(name = "user_age")
    private int userAge;

    @Column(name = "user_email")
    private String userEmailId;


}
