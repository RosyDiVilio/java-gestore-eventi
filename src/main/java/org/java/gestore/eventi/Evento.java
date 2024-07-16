package org.java.gestore.eventi;

import java.time.LocalDate;
import java.util.Date;

public class Evento implements Prenota, Disdici {
	
	private String titolo;
	private Date data;
	private int postiTotali;
	private int postiPrenotati;
	
	public Evento(String titolo, Date data, int postiTotali, int postiPrenotati ) {
		
		if (data.before(LocalDate())) {
			System.out.println("La data inserita è già passata");
		}
		
		if (postiTotali <= 0) {
			System.out.println("Il numero di porsti totali inserito non è corretto");
		}

		this.titolo = titolo;
		this.data = data;
		this.postiTotali = postiTotali;
		this.postiPrenotati = 0;
	}
	
	public String getTitolo() {
		return this.titolo;
	}
	
	public void setTitolo() {
		this.titolo = titolo;
	}
	
	public Date getData() {
		return this.data;
	}
	
	public Date LocalDate() {
		return data;
	}
	
	public void setData() {
		if (data.after(LocalDate())) {
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
	   if (data.after(LocalDate())) {
		   postiPrenotati = postiPrenotati + 1;
	   } else {
		   System.out.println("La data non è disponibile: non puoi prenotare i posti");
	   } if (postiPrenotati > postiTotali) {
		   System.out.println("Disponibilità posti esaurita");
	   }
	}
	
	@Override
	public void disdici() {
		if (data.after(LocalDate()) && postiPrenotati > 0) {
		postiPrenotati = postiPrenotati - 1;
	    } else if (data.before(LocalDate())){
		System.out.println("La data non è disponibile: non puoi disdire i posti");
	    } else if (postiPrenotati <= 0) {
	    System.out.println("Non ci sono posti da disdire");	
	    } 
    }
	
	@Override 
	public String toString() {
		return this.data + " " + "-" + " " + this.titolo;
	}
	
}


