package view;
import model.Pilha;

import javax.swing.JOptionPane;

import controller.FatController;

public class Principal {

	public static void main(String[] args) {
		FatController f = new FatController();
		int valor = -1;
		
		while(valor < 0 || valor > 10) {
			valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor: "));
		}

		System.out.println("Fatorial de "+valor+ " é: "+ f.fatorial(valor));
	}

}
