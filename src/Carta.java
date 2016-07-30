
public class Carta {

	static final String CORINGA = "Coringa";
	static final String OURO = "Ouro";
	
	private String nome;
	private String naipe;
	
	public Carta(String nome, String naipe) {
		this.nome = nome;
		this.naipe = naipe;
	}

	public Carta(int numero, String naipe) {
		this(nomeDadoNumero(numero), naipe);
	}

	private static String nomeDadoNumero(int numero) {
		String[] nomes = new String[14];
		nomes[1] = "Um";
		nomes[2] = "Dois";
		nomes[3] = "Três";
		nomes[4] = "Quatro";
		nomes[5] = "Cinco";
		nomes[6] = "Seis";
		nomes[7] = "Sete";
		nomes[8] = "Oito";
		nomes[9] = "Nove";
		nomes[10] = "Dez";
		nomes[11] = "Valete";
		nomes[12] = "Dama";
		nomes[13] = "Rei";
		return nomes[numero];
	}

	public String getNome() {
		return nome;
	}

	public String getNaipe() {
		return naipe;
	}

	@Override
	public String toString() {
		return "Carta [nome=" + nome + ", naipe=" + naipe + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((naipe == null) ? 0 : naipe.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carta other = (Carta) obj;
		if (naipe == null) {
			if (other.naipe != null)
				return false;
		} else if (!naipe.equals(other.naipe))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	
}
