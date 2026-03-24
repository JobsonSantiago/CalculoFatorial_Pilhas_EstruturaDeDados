package controller;
import model.*;

public class FatController {

	public FatController() {
		super();
	}
	
	Pilha p = new Pilha();
	
	public int fatorial (int valor) {
		int r = 0;
		if(valor == 0) {
			return 1;
		}
		
		//Inserindo acima do topo, topo * i  (i inicialmente é igual valor - 1)
		for(int i = valor ; i > 1; i--) {
			try {
				p.push(p.top() * i);
			} catch (Exception e) {
				//Inserindo valor original na pilha (topo = valor)
				p.push(valor);
			}
		}
		//Retirando topo que é igual ao fatorial
		try {
			r = p.pop();
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}
		//Retornando fatorial
		return r;

	}

}
