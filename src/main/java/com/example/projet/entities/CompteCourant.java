package com.example.projet.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;

@Entity
@DiscriminatorValue("CC")
@Data @NoArgsConstructor @AllArgsConstructor
public class CompteCourant extends Compte {
    private double decouvert;
}
