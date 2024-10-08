package com.forloop.bosukba.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter
@ToString
public class User {

    @Id @GeneratedValue
    private Long id;

    private String password;

    private String nickname;
}
