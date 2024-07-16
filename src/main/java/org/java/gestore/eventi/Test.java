package org.java.gestore.eventi;

import java.util.Date;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Test {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Inserisci il titolo dell'evento");
		String titolo = userInput.nextLine();
		
		System.out.println("Inserisci la data dell'evento in formato GG/MM/AAAA");
		String data = userInput.nextLine();
		
		
		//formattare data utente
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/mm/yyyy");
		String textData = data.formatted(formatter);
		
		
		System.out.println("Inserisci il numero di posti totale dell'evento");
		int postiTotali = userInput.nextInt();
		userInput.nextLine();
		
		System.out.println("Inserisci l'ora dell'evento in formato hh.mm");
		String ora = userInput.nextLine();
		
		
		//formattare ora utente
		DateTimeFormatter formatterTwo = DateTimeFormatter.ofPattern("hh.mm");
		String textOra = ora.formatted(formatter);
		
		
		System.out.println("Vuoi effettuare delle prenotazioni?");
		String userAnswer = userInput.nextLine();
		
		if (userAnswer.equals("si")) {
		   System.out.println("Quanti posti vuoi prenotare?");
		   int postiPrenotati = userInput.nextInt();
		   userInput.nextLine();
		} else {
		   System.out.println("Nessuna prenotazione effettuata");
		} 
		
		//controllo dell'ipunt dell'utente
		if (postiPrenotati > postiTotali) {
			System.out.println("Impossibile effettuare prenotazione: numero posti superiore a quello disponibile");
		}
		
		//effettuare la prenotazione
		for (int i = 0; postiPrenotati < i; i++) {
			if (postiPrenotati < postiTotali) {
				evento.prenota();
			}
		}
		
		int postiDisponibili = postiTotali - postiPrenotati;
		System.out.println("I posti ancora disponibili sono: " + postiDisponibili);
		System.out.println("I posti prenotati sono: " + postiPrenotati);
		
		
		System.out.println("Vuoi effettuare delle disdette?");
		String userAnswerTwo = userInput.nextLine();
		
		if (userAnswerTwo.equals("si")) {
			System.out.println("Quanti posti vuoi disdire?");
			int postiDisdetti = userInput.nextInt();
			userInput.nextLine();
		} else {
			System.out.println("Nessuna disdetta effettuata");
		}
		
		//controllo dell'input dell'utente
		if (postiDisdetti > postiPrenotati) {
			System.out.println("Impossidbile effetttuare disdetta: numero posti superiore a quelli prenotati");
		}
		
		//effettuare la didetta
		for (int i = 0; postiDisdetti > i; i--) {
			if (postiDisdetti < postiPrenotati) {
				evento.disidci();
			}
			
		}

		System.out.println("I posti ancora disponibili sono: " + postiDisponibili);
		System.out.println("I posti prenotati sono: " + postiPrenotati);
		
		
		} 
	    
	
	    //userInput.close();

	}
	



