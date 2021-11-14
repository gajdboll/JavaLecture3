package Wykladd3;

public class Dziedziczenie {

	public static void main(String[] args) {


		System.out.println("Dziedziczenie");
		
		Osoba o1 = new Osoba("Adam", "Tomczyk");
		o1.Wyswietl();
		
		Pracownik p1 = new Pracownik("Adam", "Malysz", "Skoczek/Trener", "321");
		p1.Wyswietl();

		PracownikEtatowy pe1 = new PracownikEtatowy("Adam", "Malysz", "Skoczek/Trener", "321", 23.23, 25);
		pe1.Wyswietl();
		
	}

}
