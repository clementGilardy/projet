package dev201503.tests;

import dev201503.beans.Acteurs;
import dev201503.beans.Films;
import dev201503.beans.Jouent;

public class test {

	public static void main(String[] args) {
		System.out.println("Tout les films :");
		Films films = new Films();
		films.init();
		System.out.println(films.toString());
		
		System.out.println("Tous les acteurs :");
		Acteurs acteurs = new Acteurs();
		acteurs.init();
		System.out.println(acteurs.toString());
		
		System.out.println("Acteurs contenant ll : ");
		System.out.println(acteurs.findByRegex(".*ll.*").toString());
		
		System.out.println("Film de l'acteur 1 :");
		Jouent jouent = new Jouent();
		jouent.init();
		System.out.println(jouent.getFilmsByCodeActeur(1, films).toString());
		System.out.println("Acteurs du film 1 :");
		System.out.println(jouent.getActeursByCodeFilm(1, acteurs));

	}

}
