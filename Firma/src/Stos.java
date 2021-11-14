
public class Stos 
{

	private ElementStosu wierzcholek; // jak stos powstaje to na poczatku jest pusty i przyjmuje wartosc null
	//czyli konstruktor stosu musi stworzyc stos pusty
	
	
	public Stos()
	{
		wierzcholek=null;
	}
	//to jest funkcja ktora dodaje nowa osobe dostosu
	public void Dodaj(Osoba obiekt)
	{
		ElementStosu nowy = new ElementStosu(obiekt,wierzcholek);
		wierzcholek = nowy;
		//lub
		//wierzcholek = new ElementStosu(obiekt, wierzcholek);
	}
	
	//to jest funkcja ktora pobiera / zdejmuje osobe dostosu
	public Osoba Pobierz()
	{
		Osoba o = wierzcholek.osoba; 
		wierzcholek = wierzcholek.nastepny; 
		return o;
		 
	}
	public void PobierzIWysawietlWszystkich()
	{
		while(wierzcholek!=null)//dopoki wieszcholek jest rozny od null czy li stos nie jest pusty
		{
			Pobierz().Wyswietl();//pobieramy osobe ze stosy funkcja pobierz, ktora zwraca osobe ktora od razu wyswietlamy
		}
		 
	}
	
	
}
