
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
	Stos stos = new Stos();
		
	Osoba o1 = new Osoba("Krzysztof","Gajdosz");	
	Osoba o2 = new Osoba("2","2");
	Osoba o3 = new Osoba("3","3");
	Osoba o4 = new Osoba("4","4");
	
	stos.Dodaj(o1);
	stos.Dodaj(o2);
	stos.Dodaj(o3);
	stos.Dodaj(o4);
	
	stos.PobierzIWysawietlWszystkich();
	}
}