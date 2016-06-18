package ThreadsXTI;

/**
 * Breve descrição da ponte, do que ela faz. Porque foi criada, etc. etc. etc.
 * 
 * Comentários para a Classe
 * 
 * @author Nelson de Almeida Gomes
 * @author Segundo Autor Desconhecido.
 * @version 1.3
 * @since 1.0 
 * @see PonteNaoSincronizada
 * @see PonteSincronizada 
 * 
 */
public interface Ponte {
	
	
	/**
	 * 
	 * Comentário para Métodos
	 * 
	 * Armazena o valor informado na ponte e Geralmente será chamado pela classes produtoras
	 * 
	 * @param valor
	 * @throws InterruptedException
	 */	
	public void set(int valor) throws InterruptedException;
	
	
	/**
	 * 
	 * Comentário para Métodos
	 * 
	 * Recupera a informação armazenada na ponta. Será chamado pelas consumidoras de dados
	 * 
	 * @return
	 * @throws InterruptedException
	 */
	public int get() throws InterruptedException;
}
