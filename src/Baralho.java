
public class Baralho {

	private static final String CORINGA = "Coringa";
	private Carta[] cartas;
	private int ultimaCarta = 55;
	
	public Baralho() {
		inicializaCartas();
		ultimaCarta = 55;
	}

	private void inicializaCartas() {
		this.cartas = new Carta[56];

		inicializaCartasDeOuro();
		inicializaCartasDeEspadas();
		inicializaCartasDeCopas();
		inicializaCartasDePaus();
		inicializaCoringas();
	}

	private void inicializaCoringas() {
		for (int i=52; i < 56; i++)
			cartas[i] = new Carta(CORINGA, CORINGA);
	}

	private void inicializaCartasDePaus() {
		for (int i=39, j=1; i < 52; i++, j++)
			cartas[i] = new Carta(j, "Paus");
	}

	private void inicializaCartasDeCopas() {
		for (int i=26, j=1; i < 39; i++, j++)
			cartas[i] = new Carta(j, "Copas");
	}

	private void inicializaCartasDeEspadas() {
		for (int i=13, j=1; i < 26; i++, j++)
			cartas[i] = new Carta(j, "Espada");
	}

	private void inicializaCartasDeOuro() {
		for (int i=0, j=1; i < 13; i++, j++)
			cartas[i] = new Carta(j, "Ouro");
	}
	
	public void imprime() {
		for (Carta carta : cartas)
			System.out.println(carta);
	}
	
	public Carta daCarta() {
		Carta ultima = cartas[ultimaCarta];
		cartas[ultimaCarta--] = null;
		return ultima;
	}
	
	public boolean temCarta(Carta carta) {
		for (Carta c : cartas) {
			if (c != null && c.equals(carta))
				return true;
		}
		return false;
	}
	
	public void embaralha() {
		for (int i = 0; i < 50; i++) {
			int um = (int) Math.floor(Math.random() * 55);
			int dois = (int) Math.floor(Math.random() * 55);
			
			System.out.println("" + um + "  -  " + dois);
			
			Carta c1 = cartas[um];
			Carta c2 = cartas[dois];
			
			cartas[um] = c2;
			cartas[dois] = c1;	
		}
		
	}
	
}
