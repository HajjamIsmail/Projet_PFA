package com.example.projet.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Client implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codeClt;
    private String nomClt;
    @OneToMany(mappedBy = "client", fetch=FetchType.LAZY)
    private Collection<Compte> lstCpt;
}
