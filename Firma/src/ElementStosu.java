//kazdy element stosu sklada sie z 2 rzeczy :
//z osoby (referencji) 
public class ElementStosu
{
	public ObiektZDrukuj obiekt;
	//public Osoba osoba;
	public ElementStosu nastepny;
	
	
	public ElementStosu(ObiektZDrukuj obiekt, ElementStosu nastepny) 
	{ 
		this.obiekt = obiekt;
		this.nastepny = nastepny; 
	}
}
