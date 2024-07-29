package org.java.gestore.eventi;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Test {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		//richiesta informazioni all'utente
		System.out.println("Inserisci il titolo dell'evento");
		String titolo = userInput.nextLine();
		
		System.out.println("Inserisci la data dell'evento in formato GG/MM/AAAA");
		String data = userInput.nextLine();
		
		
		//formattare data utente
		LocalDate date = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("DD/MM/YYYY");
		String textData = date.format(formatter);
		
		
		System.out.println("Inserisci il numero di posti totale dell'evento");
		int postiTotali = userInput.nextInt();
		userInput.nextLine();
		
		System.out.println("Inserisci l'ora dell'evento in formato hh.mm");
		String ora = userInput.nextLine();
		
		//formattare ora utente
		LocalTime hour = LocalTime.now();
		DateTimeFormatter formatterTwo = DateTimeFormatter.ofPattern("hh.mm");
		String textOra = hour.format(formatterTwo);
		
		
		System.out.println("Inserisci il prezzo dell'evento");
		float prezzo = userInput.nextFloat();
		userInput.nextLine();
		
		
		//creazione istanza concerto con i dati dell'utente
		Concerto concerto = null;
	    concerto = new Concerto(titolo, date, postiTotali, hour, prezzo);
		
		
		//richiesta prenotazioni e controlli
		System.out.println("Vuoi effettuare delle prenotazioni?");
		String userAnswer = userInput.nextLine();
		
		if (userAnswer.equals("si")) {
		   System.out.println("Quanti posti vuoi prenotare?");
		   int postiPrenotati = userInput.nextInt();
		   //controllo dell'ipunt dell'utente
		   if (postiPrenotati > postiTotali) {
	          System.out.println("Impossibile effettuare prenotazione: numero posti superiore a quello disponibile");
		   } 
		   
		   //effettuare la prenotazione
			for (int i = 0; postiPrenotati > i; i++) {
				if (postiPrenotati < postiTotali) {
					concerto.prenota();
				}
			}
			
			//informazioni per l'utente riguardanti i posti
			System.out.println("I posti ancora disponibili sono: " + concerto.postiDisponibili());
			System.out.println("I posti prenotati sono: " + postiPrenotati);
			userInput.nextLine();
		
		
		//richiesta disdette e controlli
		System.out.println("Vuoi effettuare delle disdette?");
		String userAnswerTwo = userInput.nextLine();
		
		if (userAnswerTwo.equals("si")) {
			System.out.println("Quanti posti vuoi disdire?");
			int postiDisdetti = userInput.nextInt();
			userInput.nextLine();
			//controllo dell'input dell'utente
			if (postiDisdetti > postiPrenotati) {
				System.out.println("Impossidbile effetttuare disdetta: numero posti superiore a quelli prenotati");
		    } 
			
			//effettuare la didetta
			for (int i = 0; postiPrenotati > i; i++) {
				if (postiDisdetti < postiPrenotati) {
					concerto.disdici();
				}
			}
			
			System.out.println("I posti ancora disponibili sono: " + concerto.postiDisponibili());
			System.out.println("I posti prenotati sono: " + postiPrenotati);
			System.out.println(concerto.toString());
		}
		
	  }
	    
	    userInput.close();

	}
  }

	



