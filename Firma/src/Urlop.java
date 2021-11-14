
public class Urlop implements ObiektZDrukuj
{

	private int liczbaDni;

	public Urlop(int liczbaDni)
	{
		this.liczbaDni=liczbaDni;
	}
	
	
	@Override
	public void Wyswietl() {
		
		System.out.println("liczba dni urlopu: "+ liczbaDni);
	}
	
	
}
