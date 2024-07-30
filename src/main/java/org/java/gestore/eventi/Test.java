package org.java.gestore.eventi;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Test {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		//richiesta informazioni all'utente
		System.out.println("Inserisci il titolo dell'evento");
		String titolo = userInput.nextLine();
		
		//richiesta, controllo e formattazione data utente
		LocalDate data = null;
        while (data == null) {
            System.out.println("Inserisci la data del concerto nel formato yyyy/MM/dd");
            String dataInput = userInput.nextLine();
            try {
                data = LocalDate.parse(dataInput, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
                if (data.isBefore(LocalDate.now())) {
                    System.out.println("La data dell'evento è già passata");
                    data = null;
                }
            } catch (DateTimeParseException e) {
                System.out.println("Formato della data non valido. Utilizza il formato yyyy/MM/dd");
            }
         }
		
		//richiesta informazioni utente
		System.out.println("Inserisci il numero di posti totale dell'evento");
		int postiTotali = userInput.nextInt();
		userInput.nextLine();

		
		//richiesta, controllo e formattazione ora utente
		LocalTime ora = null;
        while (ora == null) {
            System.out.println("Inserisci l'ora del concerto in formato: HH:mm");
            String oraInput = userInput.nextLine();
            try {
                ora = LocalTime.parse(oraInput, DateTimeFormatter.ofPattern("HH:mm"));
            } catch (DateTimeParseException e) {
                System.out.println("Formato dell'ora non valido. Assicurati di utilizzare il formato HH:mm.");
            }
        }
        
		
		//richiesta informazioni utente
		System.out.println("Inserisci il prezzo dell'evento");
		float prezzo = userInput.nextFloat();
		userInput.nextLine();
		
		
		//creazione istanza concerto con i dati dell'utente
	    Concerto concerto = new Concerto(titolo, data, postiTotali, ora, prezzo);
		
		
		//richiesta prenotazioni e controlli
		System.out.println("Vuoi effettuare delle prenotazioni?");
		String userAnswer = userInput.nextLine();
		
		if (userAnswer.equals("no")) {
			System.out.println("I posti ancora disponibili sono: " + concerto.postiDisponibili());
			System.out.println("I posti prenotati sono: " + concerto.getPostiPrenotati());
			System.out.println(concerto.toString());
		} else if (userAnswer.equals("si")) {
		   System.out.println("Quanti posti vuoi prenotare?");
		   int postiPrenotati = userInput.nextInt();
		   //controllo dell'ipunt dell'utente
		   if (postiPrenotati > postiTotali) {
	          System.out.println("Impossibile effettuare prenotazione: numero posti superiore a quello disponibile");
		   } 
		   
		   //effettuare la prenotazione
			for (int i = 0; postiPrenotati > i; i++) {
				if (concerto.getPostiPrenotati() < concerto.getPostiTotali()) {
					concerto.prenota();
				}
			}
			
			//informazioni per l'utente riguardanti i posti
			System.out.println("I posti ancora disponibili sono: " + concerto.postiDisponibili());
			System.out.println("I posti prenotati sono: " + concerto.getPostiPrenotati());
			userInput.nextLine();
		
		
		//richiesta disdette e controlli
		System.out.println("Vuoi effettuare delle disdette?");
		String userAnswerTwo = userInput.nextLine();
		
		if (userAnswerTwo.equals("no")) {
			System.out.println("I posti ancora disponibili sono: " + concerto.postiDisponibili());
			System.out.println("I posti prenotati sono: " + concerto.getPostiPrenotati());
			System.out.println(concerto.toString());
			userInput.nextLine();
		} else if (userAnswerTwo.equals("si")) {
			System.out.println("Quanti posti vuoi disdire?");
			int postiDisdetti = userInput.nextInt();
			userInput.nextLine();
		
		
			//controllo dell'input dell'utente
			if (postiDisdetti > postiPrenotati) {
				System.out.println("Impossibile effetttuare disdetta: numero posti superiore a quelli prenotati");
		    } 
			
			//effettuare la didetta
			for (int i = 0; postiDisdetti > i; i++) {
				if (postiDisdetti < concerto.getPostiPrenotati()) {
					concerto.disdici();
				}
			}
			
			System.out.println("I posti ancora disponibili sono: " + concerto.postiDisponibili());
			System.out.println("I posti prenotati sono: " + (postiPrenotati - postiDisdetti));
			System.out.println(concerto.toString());
		}
		
	  }
	    
	    userInput.close();

	}
  }

	



