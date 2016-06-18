package ThreadsXTI;

/**
 * Breve descri��o da ponte, do que ela faz. Porque foi criada, etc. etc. etc.
 * 
 * Coment�rios para a Classe
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
	 * Coment�rio para M�todos
	 * 
	 * Armazena o valor informado na ponte e Geralmente ser� chamado pela classes produtoras
	 * 
	 * @param valor
	 * @throws InterruptedException
	 */	
	public void set(int valor) throws InterruptedException;
	
	
	/**
	 * 
	 * Coment�rio para M�todos
	 * 
	 * Recupera a informa��o armazenada na ponta. Ser� chamado pelas consumidoras de dados
	 * 
	 * @return
	 * @throws InterruptedException
	 */
	public int get() throws InterruptedException;
}
