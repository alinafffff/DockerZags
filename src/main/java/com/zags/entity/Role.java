package com.zags.entity;

import jakarta.persistence.*;
import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    @Column(name = "role")
    private String role;
    @Column(name = "login")
    private String login;
    @Column(name = "password")
    private String password;

    public Role(String role, String login, String password) {
        this.role = role;
        this.login = login;
        this.password = password;
    }
}
