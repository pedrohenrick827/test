package lab03;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		Scanner entrada = new Scanner(System.in);
		String opcao;

		do {
			System.out.print("(C)adastrar Contato\n" + "\n" + "(L)istar Contatos\n" + "\n" + "(E)xibir Contato\n" + "\n"
					+ "(S)air\n" + "\n" + "Opção> ");
			opcao = entrada.next().toLowerCase();
			switch (opcao) {
			case "c":
				System.out.print("Posicao: ");
				int posicao = entrada.nextInt();
				if (posicao > 100 || posicao < 1) {
					System.out.println("\nPOSICAO INVÁLIDA!");
				} else {
					System.out.print("\nNome: ");
					String nome = entrada.next();
					if (nome.equals("")) {

					} else {
						System.out.print("Sobrenome: ");
						String sobrenome = entrada.next();
						if (sobrenome.equals("")) {

						} else {
							System.out.print("Telefone: ");
							String telefone = entrada.next();
							if (telefone.equals("")) {

							} else {
								agenda.cadastraContato(posicao, nome, sobrenome, telefone);
								System.out.println("CADASTRO REALIZADO!\n");
							}
						}
					}
				}

				break;
			case "l":
				System.out.println(agenda.toString());
				break;
			case "e":
				System.out.print("Contato>");
				int posicaoContato = entrada.nextInt();
				System.out.println("\n" + agenda.exibirContato(posicaoContato));
				break;
			case "s":
				break;
			default:
				System.out.println("OPÇÃO INVÁLIDA!");
				break;
			}
		} while (!opcao.equals("s"));

	}

}
