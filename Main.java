package com.company;

public class Main {

    public static void main(String[] args) {

    	AnimalDomestico g;
    	AnimalDomestico p;
    	Veterinario vet;

	    g = new Gato ("Tom", "negro");
	    vet = new Veterinario(g);
	    vet.curar();
	    /*g.saludar();*/
	    p = new Perro("Baby","cafe","golden1");
	    vet = new Veterinario(p);
	    /*p.saludar();*/
    }
}
