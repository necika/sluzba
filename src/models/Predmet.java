package models;

public class Predmet {

	private String naziv;
	//svaki student ima koliko je osvojio poena na predmetu, e ovo brojPoena ti je taj broj koji je osvojio
	private int brojPoena;
	
	public Predmet(String naziv) {
		this.naziv = naziv;
		this.brojPoena = 0;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public int getBrojPoena() {
		return brojPoena;
	}

	public void setBrojPoena(int brojPoena) {
		this.brojPoena = brojPoena;
	}
	
	
	
}
