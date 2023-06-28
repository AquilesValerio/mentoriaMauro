package br.com.projeto.mentoria.util;

import java.util.List;
import java.util.function.Function;

public final class ListHelper<IN, OUT> {

	public static <IN, OUT> List<OUT> converter(Function<IN, OUT> function, List<IN> list) {
		return list.stream().map(function).toList();
	}

	public  List<OUT> converter2(Function<IN, OUT> function, List<IN> list) {
		return list.stream().map(function).toList();
	}

/*	public static <IN, OUT> List<OUT> converter2(Function<IN, OUT> function, List<IN> list) {
		TesteClassGeneric  testeClassGeneric = new TesteClassGeneric();

			return testeClassGeneric.converter(function,list);
		//return list.stream().map(function).toList();
	}*/


/*class TesteClassGeneric<IN, OUT> {
	public  List<OUT> converter(Function<IN, OUT> function, List<IN> list) {
		return list.stream().map(function).toList();
	}*/

}
