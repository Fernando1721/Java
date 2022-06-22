
/**
 * POO - Encapsulamento e métodos especiais 
 */
package contas;

/**
 * @author Fernando Miranda
 *
 */
public class Conta {
	
	
// Atributos
// Para encapsular (proteger) uma variável devemos usar
// e modificar private e criar métodos específicos (get e set) para
// outras classes e pacotes terem acesso às variáveis
	
	// Passo 1: Modificador PRIVATE 
	
	private String cliente;
	private double saldo;
	
	
	/**
	 * Construtor
	 */
	public Conta() {
		System.out.println("============================");
		System.out.println("======= AGÊNCIA 0261 =======");
	}
	
	// ENCAPSULAMENTO - Passo 2:Criar os Métodos específicos (get e set)
	// Eclipse - botão direiro do mouse - Source - Generate Getters and Setters - 
	// Selecionar as variáveis encapsuladas
	/**
	 * Ler o conteúdo da variável cliente
	 * @return cliente
	 */
	
	public String getCliente() {
		return cliente;
	}
	/**
	 * Setar (atribuir) um nome a variável cliente
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

	// Métodos 
	/**
	 * Método Simples que Exibe o Valor do Saldo
	 */
	protected void exibirSaldo() {
		System.out.println("Saldo: R$ " + saldo);
	}
	
	/**
	 * Método Simples com uma variável local
	 * @param valor
	 */
	
	protected void sacar(double valor) {
		saldo -= valor;
		System.out.println("Débito: R$" + valor );
	}
	/**
	 * Método Simples com uma variável local para depositar um valor na conta
	 * @param valor
	 */

	protected void depositar(double valor) {
		saldo += valor;
		System.out.println("Crédito: R$" + valor );
	}
	
	/**
	 * Método Simples com uma variável local e um objeto que será criado 
	 * para indicar a conta de destino da tranferência do valors 
	 * @param destino
	 * @param valor
	 */
	
	protected void transferir(Conta destino, double valor) {
		this.sacar(valor);
		destino.depositar(valor);
		System.out.println("Transferência: R$ " + valor);
	}
	
	/**
	 * Método com retorno obrigatório da variável total
	 * @param cc1
	 * @param cc2
	 * @return total
	 */
	double soma(double cc1, double cc2) {
		double total = cc1 + cc2;
		return total;
	}
}
