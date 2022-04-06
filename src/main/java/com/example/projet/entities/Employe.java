package com.example.projet.entities;

import java.io.Serializable;
import lombok.*;
import javax.persistence.*;
import java.util.Collection;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Employe implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codeEmp;
    private String nomEmp;
    @ManyToOne
    @JoinColumn(name="CODE_EMP_SUP")
    private Employe employeSup;
    @ManyToMany
    @JoinTable(name="EMP_GRP",
            joinColumns = @JoinColumn(name = "CODE_EMP"),
            inverseJoinColumns = @JoinColumn(name = "CODE_GRP")
    )
    private Collection<Groupe> lstGroup;
}
