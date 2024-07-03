package org.java.gestore.eventi;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		Evento evento = new Evento();
		
		System.out.println("Inserisci il titolo dell'evento");
		String titolo = userInput.nextLine();
		
		System.out.println("Inserisci la data dell'evento");
		int data = userInput.nextInt();
		
		System.out.println("Inserisci il numero di posti totale dell'evento");
		int postiTotali = userInput.nextInt();
		
		System.out.println("Vuoi prenotare dei posti?");
		if (userInput = "si") {
			System.out.println("Quanti posti vuoi prenotare?");
			int postiPrenotati = userInput.nextInt();
		} else {
			break;
		}
		
		evento.prenota();
		
		System.out.println(postiPrenotati);
		System.out.println(postiTotali);
		
		System.out.println("Vuoi disidire i posti prenotari?");
		if (userInput = "si") {
			System.out.println("Quanti posti vuoi disdire?");
		} 
		evento.disdici();
	}
	
}
