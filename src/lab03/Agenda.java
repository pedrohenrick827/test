package lab03;

public class Agenda {
	
	Contato[] contatos;
	
	public Agenda() {
		this.contatos = new Contato[100];
		
	}
	public void cadastraContato(int posicao, String nome, String sobrenome, String telefone) {
		
		Contato contato = new Contato(nome, sobrenome, telefone);
		this.contatos[posicao-1] = contato;
		
	}
	public String exibirContato(int posicao) {
		return this.contatos[posicao-1].toString();
	}
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
