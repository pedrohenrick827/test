package lab03;
/**
 * A Agenda deve ser responsavel pela manutenção de um contato, sendo ela desde a criação de um novo contato, como
 * a pesquisa de contatos na Agenda.
 * @author pedro
 *
 */
public class Agenda {
	
	private Validacao validacao;
	private Contato[] contatos;
	
	public Agenda() {
		this.contatos = new Contato[100];
		this.validacao = new Validacao();
	}
	/**
	 * Controi um novo contato no Array de contatos, que no caso, é a agenda.
	 * 
	 * @param posicao
	 * @param nome
	 * @param sobrenome
	 * @param telefone
	 * @return true or false
	 */
	public boolean cadastraContato(int posicao, String nome, String sobrenome, String telefone) {
		validacao.validaString(nome, "Nome não pode ser vazio ou nulo.");
		validacao.validaString(sobrenome, "Sobrenome não pode ser vazio ou nulo.");
		validacao.validaString(telefone, "Telefone não pode ser vazio ou nulo.");
		if(posicao>100 || posicao < 1) {
			throw new IndexOutOfBoundsException("POSIÇÃO INVÁLIDA!");
		}
		Contato contato = new Contato(nome, sobrenome, telefone);
		this.contatos[posicao-1] = contato;
		return true;
	}
	/**
	 * Método utilizado para retornar o nome do contato, a apartir da posicao indicada.
	 * @param posicao
	 * @return posicao nome sobrenome
	 */
	public String exibirContato(int posicao) {
		if(posicao>100 || posicao < 1) {
			throw new IndexOutOfBoundsException("POSIÇÃO INVÁLIDA!");
		}
		if(contatos[posicao-1] == null ) {
			return "POSIÇÃO INVÁLIDA!";
		
		}else {
			return this.contatos[posicao-1].toString();
		}
		
	}
	/**
	 * Representação textual de todos os contatos presente na agenda.
	 * 
	 * @return contatos da agenda
	 */
	public String toString() {
		String listaContatos = "";
		for(int i = 0 ; i<contatos.length ; i++) {
			if(contatos[i] != null) {
				listaContatos += (i+1) + " - " + contatos[i].getNome() + " " + contatos[i].getSobrenome() + "\n";
			}
		}
		return listaContatos;
	}
}
