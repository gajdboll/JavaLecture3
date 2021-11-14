//kazdy element stosu sklada sie z 2 rzeczy :
//z osoby (referencji) 
public class ElementStosu
{

	public Osoba osoba;
	public ElementStosu nastepny;
	
	
	public ElementStosu(Osoba osoba, ElementStosu nastepny) 
	{ 
		this.osoba = osoba;
		this.nastepny = nastepny; 
	}
}
