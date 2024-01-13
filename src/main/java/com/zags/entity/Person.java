package com.zags.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;


@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "patronymic")
    private String patronymic;
    @Column(name = "birthday")
    private Date birthday;
    @Column(name = "passport_series")
    private int passportSeries;
    @Column(name = "passport_number")
    private int passportNumber;
    @Column(name = "snils")
    private String snils;
    @Column(name = "email")
    private String email;
}
