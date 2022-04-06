package com.example.projet.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("V")
@NoArgsConstructor @AllArgsConstructor
public class Virement extends Operation{

}
