package application;

import models.Predmet;
import models.StudSluzba;
import models.Student;

public class App {

	public static void main(String[] args) {
		Predmet predmet1 = new Predmet("Fizika");
		
		System.out.println("Pocetak");
		//studenti koje cemo da dodamu u listu studenti koja se nalazi kao polje u klasi studSluzba
		Student student1 = new Student("Nemanja","Salipurevic","RA",100,2016);
		Student student2 = new Student("Brko","Brkic","RA",100,2016);
		Student student3 = new Student("Srko","Srkic","RA",100,2016);
		Student student4 = new Student("Djuro","Djuric","RA",100,2016);
		Student student5 = new Student("Pera","Peric","RA",100,2016);
		
		StudSluzba sluzba = new StudSluzba();
		//imamo sluzbu napravili smo je iznad i sad dodajemo sve studente u listu studenata
		sluzba.getStudenti().add(student1);
		sluzba.getStudenti().add(student2);
		sluzba.getStudenti().add(student3);
		sluzba.getStudenti().add(student4);
		sluzba.getStudenti().add(student5);
		//sada imamo 5 studenata koji su izasli na neki ispit u ispitnom roku
		//ucitavamo novi ispit i prosledjujemo predmet1, odnosno pravimo ispit za predmet koji ima ime "fizika"
		sluzba.ucitajIspitniRok(predmet1);
		//zavrsio se ispit i imaju svi bodove i hocemo da izdvojimo samo one koji su polozili taj predmet fiziku
		//i prosledjujemo taj predmet1 a to je "fizika" to ti je 10. linija koda gdje pravim predmet
		sluzba.poloziliPredmet(predmet1);
		
	}

}
