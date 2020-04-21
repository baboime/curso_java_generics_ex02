package servicos;

import java.util.List;

public class ServicoCalculo {
	
	public static <T extends Comparable<? super T>> T maximo(List<T> lista) {
		if (lista.isEmpty()) {
			throw new IllegalStateException("Lista não pode ser vazia");
		}
		T maximo = lista.get(0);
		for (T item : lista) {
			if (item.compareTo(maximo) > 0) {
				maximo = item;
			}
		}
		return maximo;
	}
}
