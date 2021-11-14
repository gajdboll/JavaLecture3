
public class Firma
{	

	public static void main(String[] args) 
	{
 	 
	/* Pracownik p1 = new Pracownik();
	 p1.Wyswietl();
	 System.out.println("Liczba pracownikow " +p1.IlePracownikow());
	 	 
	 Pracownik p2 = new Pracownik();
	 p2.Wyswietl();
	 System.out.println("Liczba pracownikow " +Pracownik.IlePracownikow());
	 System.out.println("Liczba pracownikow " +p2.IlePracownikow());
*/
		
	/*Osoba o1 = new Osoba("Krzysztof","Gajdosz");	
	Osoba o2 = new Osoba("2","2");
	Osoba o3 = new Osoba("3","3");
	Osoba o4 = new Osoba("4","4");
	ten kod mozna zastapic jedna linia - sprawdz pod spodem
	*/
	Stos stos = new Stos();
//obiekty
	/*stos.Dodaj(new Osoba("Krzysztof","Gajdosz"));
	stos.Dodaj(new Osoba("2","2"));
	stos.Dodaj(new Osoba("3","3"));
	stos.Dodaj(new Osoba("4","4"));*/
	//samochody
/*	stos.Dodaj(new Samochod("Krzysztof's CAR","GajdoszVIN"));
	stos.Dodaj(new Samochod("2","2"));
	stos.Dodaj(new Samochod("3","3"));
	stos.Dodaj(new Samochod("4","4"));*/
	
	//stos.Dodaj(new Osoba("os","os2"));
	
	stos.Dodaj(new Urlop(3));
	stos.Dodaj(new Urlop(2));
	stos.Dodaj(new Urlop(32));
	stos.Dodaj(new Urlop(1));
	
	
	stos.PobierzIWysawietlWszystkich();
	
	
	}
}