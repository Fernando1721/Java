/**
 * Seguros
 */
package seguros;

import contas.Conta;

/**
 * @author Fernando Miranda
 *
 */
public class SeguroPessoaFisica extends Conta {

	/**
	 * M�todo Pricipal
	 * @param args
	 */
	public static void main(String[] args) {
		// Cliente 3
		// Usando o modificador (protected) devemos usar a pr�pria
		// heran�a (SeguroPessoaFisica) para criar o objeto
		// Para n�o ter acesso direto dos m�todos e vari�veis da classe modelo (Conta)		
		SeguroPessoaFisica cc3 = new SeguroPessoaFisica();
		cc3.setCliente("Robson Vaamonde"); 
		cc3.setSaldo(9000);
		System.out.println("Cliente: " + cc3.getCliente());
		cc3.exibirSaldo();
		

	}

}
