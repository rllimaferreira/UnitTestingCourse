import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import Excecoes.ExcecaoDeListaVazia;

public class ArrayUtils {

	public static int maiorValor(List<Integer> lista) throws ExcecaoDeListaVazia {
		if (lista == null || lista.isEmpty()) throw new ExcecaoDeListaVazia("Lista não pode estar vazia");

		int maior = Integer.MIN_VALUE;
		for (int valor: lista) {
			if (valor > maior) {
				maior = valor;
			}
		}
		return maior;
	}

	public static int menorValor(List<Integer> lista) throws ExcecaoDeListaVazia {
		if (lista == null || lista.isEmpty()) throw new ExcecaoDeListaVazia("Lista não pode estar vazia");

		int menor = Integer.MAX_VALUE;
		for (int valor: lista) {
			if (valor < menor) {
				menor = valor;
			}
		}
		return menor;
	}

	public static int media(List<Integer> lista) {
		if (lista == null || lista.isEmpty()) return 0;
		int sum = 0;
		for (int valor: lista) {
			sum += valor;
		}
		return sum / lista.size();
	}

	public static double mediana(List<Double> lista) throws ExcecaoDeListaVazia {
		if (lista == null || lista.isEmpty()) throw new ExcecaoDeListaVazia("Lista não pode estar vazia");
		List<Double> listaFinal = new ArrayList<Double>();
		for (Double double1 : lista) {
			if(double1 != null){
				listaFinal.add(double1);
			}
		}

		List<Double> listaOrdenada = listaFinal.stream().sorted().collect(Collectors.toList());
		boolean eImpar = listaFinal.size() % 2 == 1;
		int indiceDoMeio = (listaFinal.size() / 2);
		if (eImpar) {
			return listaOrdenada.get(indiceDoMeio);
		}
		int indiceDoMeio2 = (listaFinal.size() / 2) -1;
		double resultado = (listaOrdenada.get(indiceDoMeio) + listaOrdenada.get(indiceDoMeio2).doubleValue()) / 2;
		return resultado;
	}
}
