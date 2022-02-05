package org.test;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public class Principal {
	public static void main(String[] args) {
		//new ClasseQualquer().metodoQualquer((key1,key2) -> somaImpl(key1,key2));
		
		BinaryOperator<Integer> t = Integer::sum;
		
		int soma = 0;
		System.out.println(Arrays.asList(1,2).stream().map((numero) -> numero).reduce(soma, t));
	}
	
	//implemetação do método da interface funcional
	static void somaImpl(Integer param1, Integer param2) {
		System.out.println(param1 + param2);
	}
}