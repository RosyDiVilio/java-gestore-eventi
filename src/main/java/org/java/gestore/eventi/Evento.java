package org.java.gestore.eventi;

import java.time.LocalDate;

public class Evento implements Prenota, Disdici{
	
	private String titolo;
	private LocalDate data;
	private int postiTotali;
	private int postiPrenotati;
	
	//costruttore per inizzializzare gli attributi
	public Evento(String titolo, LocalDate data, int postiTotali) {
		
		if (data.isBefore(LocalDate.now())) {
			System.out.println("La data inserita è già passata");
		}
		
		if (postiTotali <= 0) {
			System.out.println("Il numero di posti totali inserito non è corretto");
		}

		//inizializzazione degli attributi
		this.titolo = titolo;
		this.data = data;
		this.postiTotali = postiTotali;
		this.postiPrenotati = 0;
	}
	
	//metodi getter e setter per modificare e recuperare gli attributi
	public String getTitolo() {
		return this.titolo;
	}
	
	public void setTitolo() {
		this.titolo = titolo;
	}
	
	public LocalDate getData() {
		return this.data;
	}
	
	public void setData() {
		if (data.isAfter(LocalDate.now())) {
			this.data = data;
		} else {
			System.out.println("La data inserita è gia passata");
		}
	}
	
	public int getPostiTotali() {
		return this.postiTotali;
	}
	
	public void setPostiTotali() {
		if (postiTotali > 0) {
	    this.postiTotali = postiTotali;
		} else {
		   System.out.println("il numero di posti inserito non è corretto!");
		}
	}
	
	public int getPostiPrenotati() {
		return this.postiPrenotati;
	}
	
	public void setPostiPrenotati() {
		this.postiPrenotati = postiPrenotati;
	}
	
    @Override
	public void prenota() {
	   if (data.isBefore(LocalDate.now())) {
		   System.out.println("La data non è disponibile: non puoi prenotare i posti");
	   } if (postiPrenotati > postiTotali) {
		   System.out.println("Disponibilità posti esaurita");
	   }
	   postiPrenotati++;
	}
	
	@Override
	public void disdici() {
	    if (data.isBefore(LocalDate.now())){
		System.out.println("La data non è disponibile: non puoi disdire i posti");
	    } else if (postiPrenotati <= 0) {
	    System.out.println("Non ci sono posti da disdire");	
	    } 
		postiPrenotati--;
    }
	
	public int postiDisponibili() {
		return (postiTotali - postiPrenotati);
	}
	
	@Override 
	public String toString() {
		return this.data + " " + "-" + " " + this.titolo;
	}
	
}


