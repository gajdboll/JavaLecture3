/*Poprzedni stos umial tylk o przechowywac tylko osoby a teraz potrzebujemy stosu ktore bedzie umial przechowywac inne obiekty ex. samochody, fatury itp.
Budujemy taki stos uzywajac interfacow w javie (gdyby takiego interfacu nie bylo - musielibysmy oddzielne stosy do przechowywania tych elementoe.
Bylaby wtedy niedopuszczalna powtarzalnosc kodu
 * */
public class Stos 
{
	public ObiektZDrukuj obiekt;
	private ElementStosu wierzcholek; // jak stos powstaje to na poczatku jest pusty i przyjmuje wartosc null
	//czyli konstruktor stosu musi stworzyc stos pusty
	
	
	public Stos()
	{
		wierzcholek=null;
	}
	//to jest funkcja ktora dodaje nowa osobe dostosu
	public void Dodaj( ObiektZDrukuj obiekt)
	{
		ElementStosu nowy = new ElementStosu(obiekt,wierzcholek);
		wierzcholek = nowy;
		//lub
		//wierzcholek = new ElementStosu(obiekt, wierzcholek);
	}
	
	//to jest funkcja ktora pobiera / zdejmuje osobe dostosu
	public ObiektZDrukuj Pobierz()
	{
		ObiektZDrukuj o = wierzcholek.obiekt; 
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
