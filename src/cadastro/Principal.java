package cadastro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		List<Pessoa> listaPessoa = new ArrayList<Pessoa>();

		while (JOptionPane.showConfirmDialog(null, "DESEJA CADASTRAR UM USUÁRIO?") == 0) {
			pessoa = new Pessoa();
			
			Scanner teclado = new Scanner(System.in);
			System.out.println("DIGITE O NOME:");
			pessoa.nome = teclado.nextLine();
			System.out.println("DIGITE A IDADE:");
			pessoa.idade = Integer.parseInt(teclado.nextLine());
			System.out.println("DIGITE A CIDADE:");
			pessoa.cidade = teclado.nextLine();

			listaPessoa.add(pessoa);

		}
		System.out.println("RESULTADO:");

		for (Pessoa p : listaPessoa) {
			System.out.println("");
			System.out.println(p.nome);
			System.out.println(p.cidade);
			System.out.println(p.idade);
		}

	}

}
