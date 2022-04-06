package com.example.projet.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@DiscriminatorValue("CE")
@Data @NoArgsConstructor @AllArgsConstructor
public class CompteEpargne extends Compte{
    private double taux;
}
