package com.company;

public class Veterinario {

    AnimalDomestico animal;

    public Veterinario(AnimalDomestico animal) {
        this.animal = animal;
    }

    public void curar() {
        if (this.animal instanceof Gato){
            System.out.println("se esta curando al gato");
        }else{
            System.out.println("se esta cuarando al mas perron");
        }
    }
}