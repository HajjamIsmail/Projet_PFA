package com.example.projet.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Groupe implements Serializable{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codeGrp;
    private String nomGrp;
    @ManyToMany(mappedBy = "lstGroup")
    private Collection<Employe> lstEmp;
}
