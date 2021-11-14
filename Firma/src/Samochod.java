
public class Samochod implements ObiektZDrukuj

{

	private String numerRejestracyjny;
	private String vin;
	public Samochod(String numerRejestracyjny, String vin)
	{
		this.numerRejestracyjny=numerRejestracyjny;
		this.vin=vin;
	}
	@Override
	public void Wyswietl() {


		System.out.println("Numer rejestracyjny: "+ numerRejestracyjny);
		System.out.println("VIN: "+ vin);
		
	}
}
