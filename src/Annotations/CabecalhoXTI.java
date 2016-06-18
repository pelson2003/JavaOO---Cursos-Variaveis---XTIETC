package Annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Documented
public @interface CabecalhoXTI {
	//Somente aceita tipos primitivos de dados
	String instituicao();
	String projeto();
	String dataCriação();
	String criador();
	int revisao() default 1;
}
