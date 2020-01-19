package models;

import java.util.ArrayList;

public class StudSluzba {

	//svi studenti koji ce izaci na neki predmet
	private ArrayList<Student> studenti;

	public StudSluzba() {
		this.studenti = new ArrayList<>();
	}

	public ArrayList<Student> getStudenti() {
		return studenti;
	}

	public void setStudenti(ArrayList<Student> studenti) {
		this.studenti = studenti;
	}
	
	public void ucitajIspitniRok(Predmet predmet){
		System.out.println("----- ISPITNI ROK_-----");
		int brojacBrojaPoena = 48; // cisto neki brojac da ne moram rucno da unosim poene, vec tipa unesem 5 
							//studenata i svaki put povecavam brojac++ i tako ce zadnji imati 52 poena
		// ovaj for se zove foreach, po meni je prostiji od obicnog
		//zamisli kao da prolazis kroz neki niz studenata, i svaki novi prolaz for petlje ce biti 
		//neki novi student u tom nizu, trenutniStudentUListi ce biti koji je trenutni, tipa u 2. iteraciji for petlje ces dobiti
		// drugog studenta u ovoj nizu(listi -> svejedno je kako zamislis) 
		for(Student trenutniStudentUListi : this.studenti){
			Predmet noviPredmetZaStudenta = new Predmet(predmet.getNaziv());
			noviPredmetZaStudenta.setBrojPoena(brojacBrojaPoena);
			//u klasi student imas polje predmeti koje je lista, to sam ti reko da je LISTA SVIH PREDMETA NA KOJE JE IKAD IZASAO,
			//POSTO SAD IZLAZI NA NOVI ISPIT,MORAMO I TAJ PREDMET UBACITI U LISTU PA I RADIM TO
			//31. i 32. linija koda samo kopira predmet koji posaljemo iz main metode u ovu metodu
			trenutniStudentUListi.getPredmeti().add(noviPredmetZaStudenta); // sad se i taj predmet nalazi u listi
			System.out.println("Student "+trenutniStudentUListi.getIme()
					+" "+ trenutniStudentUListi.getPrezime()+" je ostvario "+noviPredmetZaStudenta.getBrojPoena()+" poena.");
			// samo uvecam brojac da ne bi svi imali isti broj poena
			brojacBrojaPoena++;
		}
		System.out.println("----- ISPITNI ROK -----");
	}
	public void poloziliPredmet(Predmet predmet){
		System.out.println("----- POLOZILI -----");
		//prodjemo kroz sve studente koji su izasli na ispit i prodjemo kroz sve predmete svakog studenta
		//(ovo je ona ugnjezdena petlja, samo zamisli nije tesko)
		for(Student s : this.studenti){
			for(Predmet p : s.getPredmeti()){
				//ako neki student ima u svojoj listi predmet koji se zove ovako kako smo prosledili,
				//onda znaci da je on izaso na taj ispit
				if(p.getNaziv() == predmet.getNaziv()){
					//sad provjeravamo da li je na tom ispitu ostvario vise od 50 poena
					if(p.getBrojPoena() > 50){
						//ako jeste ispisemo da je polozio
						System.out.println("Student "+s.getIme() + " " + s.getPrezime()
								+ " je polozio sa osvojenih "+ p.getBrojPoena());
					}
				}
			}
		}
	}
	
	
}
