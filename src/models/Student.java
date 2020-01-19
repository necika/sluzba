package models;

import java.util.ArrayList;

public class Student extends Osoba{

	private String smer;
	private int brIndeksa;
	private int godinaUpisa;
	//ovo ti je lista svih predmeta na koje je ikad izasao, lista je
	//jel moze da izadje na vise ispita ne mora samo na jedan
	private ArrayList<Predmet> predmeti;
	
	public Student(String ime, String prezime, String smer, int brIndeksa,
			int godinaUpisa) {
		super(ime, prezime);
		this.smer = smer;
		this.brIndeksa = brIndeksa;
		this.godinaUpisa = godinaUpisa;
		this.predmeti = new ArrayList<Predmet>();
	}

	public String getSmer() {
		return smer;
	}

	public void setSmer(String smer) {
		this.smer = smer;
	}

	public int getBrIndeksa() {
		return brIndeksa;
	}

	public void setBrIndeksa(int brIndeksa) {
		this.brIndeksa = brIndeksa;
	}

	public int getGodinaUpisa() {
		return godinaUpisa;
	}

	public void setGodinaUpisa(int godinaUpisa) {
		this.godinaUpisa = godinaUpisa;
	}

	public ArrayList<Predmet> getPredmeti() {
		return predmeti;
	}

	public void setPredmeti(ArrayList<Predmet> predmeti) {
		this.predmeti = predmeti;
	}

}
