package enuntestexti;
public enum Medida {
	//Enum com Parametros
		MM("Milimetro"), CM("Centimetro"), M("Metro");
	//Metodo Construtor para inicializar titulo;
		public String titulo;
		Medida(String titulo){
			this.titulo = titulo;
		}
	//M�todo Construtor Padr�o;
		private Medida() {
		}
}
