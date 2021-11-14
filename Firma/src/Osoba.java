
public class Osoba implements ObiektZDrukuj //osoba jest implementacja
{
private String imie;
private String nazwisko;
private int id;
static private int LiczbaPracownikow;

public Osoba(String imie, String nazwisko, int id)
{
	this.imie = imie;
	this.nazwisko=nazwisko;
	this.id = id;
	LiczbaPracownikow++;
}
public Osoba(String imie, String nazwisko )
{
	this(imie , nazwisko, 0); // tym konstr wywoluje pierwszy
	 
}
public Osoba()
{
	this("Adam","Kowalski",1); // to jest wywolanie w jednym konstruktorze innego konstruktora, w tym konstr. wywolujemy Konstr. pierwszy
}

public static int IlePracownikow()
{
	return LiczbaPracownikow;
}
public void Wyswietl()
{
	//System.out.println("ID: "+ id);
	System.out.println("Imie: "+ imie);
	System.out.println("Nazwisko: "+ nazwisko);
	 System.out.println("***********************");
}

public Osoba PowiekszID()
{
	id++;
	return this; //ta funkcja zwraca Pracownika na rzecz ktorego jest wywolana
}


}