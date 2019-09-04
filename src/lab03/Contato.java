package lab03;
/**
 * A classe contato fica responsavel por guardar as informações de um contato expecifico.
 * @author pedro
 *
 */
public class Contato {
	
	private String nome, sobrenome, telefone;
	/**
	 * Construtor de um novo contato.
	 * @param nome
	 * @param sobrenome
	 * @param telefone
	 */
	public Contato(String nome, String sobrenome, String telefone) {
		
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.telefone = telefone;
	}
	/**
	 * Represenção em String de um contato.
	 *  
	 * @return nomecompleto - telefone
	 */
	public String toString() {
		return nome + " " + sobrenome + " - " + telefone;
	}
	
	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}
	/**
	 * returna o nome completo do contato.
	 * 
	 * @return nomecompleto
	 */
	public String nomeCompleto() {
		return nome + " " + sobrenome;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((sobrenome == null) ? 0 : sobrenome.hashCode());
		result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
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
		Contato other = (Contato) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (sobrenome == null) {
			if (other.sobrenome != null)
				return false;
		} else if (!sobrenome.equals(other.sobrenome))
			return false;
		if (telefone == null) {
			if (other.telefone != null)
				return false;
		} else if (!telefone.equals(other.telefone))
			return false;
		return true;
	}
}
