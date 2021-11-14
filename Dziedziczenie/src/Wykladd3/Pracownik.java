package Wykladd3;

//pracownik ma wszystko co osoba
public class Pracownik extends Osoba
{
private String stanowisko;
private String numerKarty;
 
public Pracownik() {}
public Pracownik(String imie,String nazwisko, String stanowisko, String numerKarty)
{
super(imie, nazwisko); // to wywoluje konstruktor z klasy osoba czyli wyperlnia imie i nazwisko pracownika
this.stanowisko=stanowisko;
this.numerKarty=numerKarty;
}


public void Wyswietl()
{
	super.Wyswietl(); // to jest wywolanie metody wyswietl z klasy Osoba czyli wyswietlenie imienia i nazeiska pracownika
	System.out.println("stanowisko: "+ stanowisko);
	System.out.println("numerKarty: "+ numerKarty);
	 System.out.println("***********************");
}
}
