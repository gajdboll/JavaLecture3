
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

	stos.Dodaj(new Osoba("Krzysztof","Gajdosz"));
	stos.Dodaj(new Osoba("2","2"));
	stos.Dodaj(new Osoba("3","3"));
	stos.Dodaj(new Osoba("4","4"));
	
	stos.PobierzIWysawietlWszystkich();
	}
}