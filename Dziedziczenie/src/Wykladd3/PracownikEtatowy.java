package Wykladd3;

public class PracownikEtatowy extends Pracownik 
{
private double placaBrutto;
private int urlop;

public PracownikEtatowy(String imie, String nazwisko, String stanowisko, String numerKarty, double placaBrutto, int urlop)
{
	super(imie,nazwisko,stanowisko,numerKarty);//to jest wywolanie konstruktora z klasy pracownik czyli uzupelnienie imiennia, nazwisk, stanowiska, numeru karty pracownika etatowego 
	this.placaBrutto=placaBrutto;
	this.urlop=urlop;
	}

public void Wyswietl()
{
	super.Wyswietl(); // to jest wywolanie metody wyswietl z klasy Pracownik czyli wyswietlenie imienia i nazeiska pracownika, stanowiska & numeru karty pracownika etatowego 
	System.out.println("Placa Brutto: "+ placaBrutto);
	System.out.println("Urlop: "+ urlop);
	// System.out.println("***********************");
}
public void WyswietlNazwiskoIPlaceBrutto()
{
	System.out.println("Nazwisko: "+ nazwisko);
	 
	System.out.println("Placa Brutto: "+ placaBrutto);
	
}


}
