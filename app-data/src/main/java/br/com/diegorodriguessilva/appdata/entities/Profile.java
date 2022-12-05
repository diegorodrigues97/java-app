package br.com.diegorodriguessilva.appdata.entities;

import javax.persistence.*;

@Entity
@Table(name = "profile")
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String authority;
}
