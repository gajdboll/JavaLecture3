
public class Stos 
{

	private ElementStosu wierzcholek; // jak stos powstaje to na poczatku jest pusty i przyjmuje wartosc null
	//czyli konstruktor stosu musi stworzyc stos pusty
	
	
	
	public void Dodaj(Osoba obiekt)
	{
		ElementStosu nowy = new ElementStosu(obiekt,wierzcholek);
		wierzcholek = nowy;
		//lub
		//wierzcholek = new ElementStosu(obiekt, wierzcholek);
	}
	
}
