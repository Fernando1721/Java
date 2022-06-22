
/**
 * POO - Encapsulamento e m�todos especiais 
 */
package contas;

/**
 * @author Fernando Miranda
 *
 */
public class Conta {
	
	
// Atributos
// Para encapsular (proteger) uma vari�vel devemos usar
// e modificar private e criar m�todos espec�ficos (get e set) para
// outras classes e pacotes terem acesso �s vari�veis
	
	// Passo 1: Modificador PRIVATE 
	
	private String cliente;
	private double saldo;
	
	
	/**
	 * Construtor
	 */
	public Conta() {
		System.out.println("============================");
		System.out.println("======= AG�NCIA 0261 =======");
	}
	
	// ENCAPSULAMENTO - Passo 2:Criar os M�todos espec�ficos (get e set)
	// Eclipse - bot�o direiro do mouse - Source - Generate Getters and Setters - 
	// Selecionar as vari�veis encapsuladas
	/**
	 * Ler o conte�do da vari�vel cliente
	 * @return cliente
	 */
	
	public String getCliente() {
		return cliente;
	}
	/**
	 * Setar (atribuir) um nome a vari�vel cliente
	 * @param cliente
	 */

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	/**
	 * Obter o saldo do cliente
	 * @return saldo
	 */

	public double getSaldo() {
		return saldo;
	}
	/**
	 * Setar (atribuir) um valor a conta
	 * @param saldo
	 */

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	// M�todos 
	/**
	 * M�todo Simples que Exibe o Valor do Saldo
	 */
	protected void exibirSaldo() {
		System.out.println("Saldo: R$ " + saldo);
	}
	
	/**
	 * M�todo Simples com uma vari�vel local
	 * @param valor
	 */
	
	protected void sacar(double valor) {
		saldo -= valor;
		System.out.println("D�bito: R$" + valor );
	}
	/**
	 * M�todo Simples com uma vari�vel local para depositar um valor na conta
	 * @param valor
	 */

	protected void depositar(double valor) {
		saldo += valor;
		System.out.println("Cr�dito: R$" + valor );
	}
	
	/**
	 * M�todo Simples com uma vari�vel local e um objeto que ser� criado 
	 * para indicar a conta de destino da tranfer�ncia do valors 
	 * @param destino
	 * @param valor
	 */
	
	protected void transferir(Conta destino, double valor) {
		this.sacar(valor);
		destino.depositar(valor);
		System.out.println("Transfer�ncia: R$ " + valor);
	}
	
	/**
	 * M�todo com retorno obrigat�rio da vari�vel total
	 * @param cc1
	 * @param cc2
	 * @return total
	 */
	double soma(double cc1, double cc2) {
		double total = cc1 + cc2;
		return total;
	}
}
