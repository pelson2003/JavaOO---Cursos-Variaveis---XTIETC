package br.com.fabricadeprogramador.aula1;

public class OlaMundo {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("Duke");
		String str1 = sb1.toString();
		String str2 = new String(str1);
		System.out.println(str1 == str2);
		
	}

}
