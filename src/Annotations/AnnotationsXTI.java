package Annotations;

import java.io.Serializable;

@SuppressWarnings("serial")
@CabecalhoXTI(
		criador = "Ricardo Lopes", 
		dataCriação = "08/10/2011", 
		instituicao = "Universidade XTI", 
		projeto = "Sistema de Avaliações",
		revisao = 2
	)


@ErrosCorrigidos("0001")
public class AnnotationsXTI implements Serializable {
	public static void main(String[] args) {
	}
	
	@Deprecated
	public void metodoaserdescontinuado(){
		System.out.println("Usar a anotação @Deprecated");
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
}
