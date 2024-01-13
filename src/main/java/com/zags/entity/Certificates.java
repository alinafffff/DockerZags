package com.zags.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;


@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "certificates")
public class Certificates {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "status")
    private final String status = "Оплачена";
    @Column(name = "date")
    private final LocalDate date = LocalDate.now();
    @Column(name = "act_number")
    private final long actNumber = 1000000 + (int) (Math.random() * 99999999);
    @Column(name = "zags")
    private final String zags = "Отдел ЗАГС по Октябрьскому району г. Саратова";

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="id_person")
    private Person idPerson;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="id_facilities")
    private Facilities idFacilities;
    @Column(name = "checking")
    private int checking = 0;

    public Certificates(Person idPerson, Facilities idFacilities) {
        this.idPerson = idPerson;
        this.idFacilities = idFacilities;
    }


}
