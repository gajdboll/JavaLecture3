
public class Pracownik 
{
private String imie;
private String nazwisko;
private int id;
static private int LiczbaPracownikow;

public Pracownik(String imie, String nazwisko, int id)
{
	this.imie = imie;
	this.nazwisko=nazwisko;
	this.id = id;
	LiczbaPracownikow++;
}
public Pracownik(String imie, String nazwisko )
{
	this(imie , nazwisko, 0); // tym konstr wywoluje pierwszy
	 
}
public Pracownik()
{
	this("Adam","Kowalski",1); // to jest wywolanie w jednym konstruktorze innego konstruktora, w tym konstr. wywolujemy Konstr. pierwszy
}

public static int IlePracownikow()
{
	return LiczbaPracownikow;
}
public void Wyswietl()
{
	System.out.println("ID: "+ id);
	System.out.println("Imie: "+ imie);
	System.out.println("Nazwisko: "+ nazwisko);
	 System.out.println("***********************");
}

public Pracownik PowiekszID()
{
	id++;
	return this; //ta funkcja zwraca Pracownika na rzecz ktorego jest wywolana
}


}