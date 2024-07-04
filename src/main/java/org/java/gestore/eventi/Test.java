package org.java.gestore.eventi;

import java.util.Date;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		Evento evento = new Evento();
		
		System.out.println("Inserisci il titolo dell'evento");
		String titolo = userInput.nextLine();
		
		System.out.println("Inserisci la data dell'evento in formato GG/MM/AAAA");
		int data = userInput.nextInt();
		
		System.out.println("Inserisci il numero di posti totale dell'evento");
		int postiTotali = userInput.nextInt();
		
		System.out.println("Vuoi prenotare dei posti?");
		if (userInput.equals("si")) {
			System.out.println("Quanti posti vuoi prenotare?");
			int postiPrenotati = userInput.nextInt();
		} else {
			break;
		}
		
		evento.prenota();
		
		System.out.println();
		System.out.println(postiTotali);
		
		System.out.println("Vuoi disidire i posti prenotati?");
		if (userInput.equals("si")) {
			System.out.println("Quanti posti vuoi disdire?");
		} 
		evento.disdici();
		
		System.out.println(Concerto.ora);
		System.out.println(Concerto.prezzoUmano);
	
		userInput.close();
	
	}
	
}
