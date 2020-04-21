package aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entidades.Produto;
import servicos.ServicoCalculo;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		List<Produto> lista = new ArrayList<>();
		
		String diretorio = "C:\\Users\\ednne\\OneDrive\\Documentos\\Cursos\\Java\\Exercicios\\Arquivos\\ingenerics.txt";
							
		try (BufferedReader br = new BufferedReader(new FileReader(diretorio))) {
			
			String linha = br.readLine();
			while (linha != null) {
				String[] campos = linha.split(",");
				lista.add(new Produto(campos[0], Double.parseDouble(campos[1])));
				linha = br.readLine();
			}
			Produto x = ServicoCalculo.maximo(lista);
			System.out.println("Mais caro: ");
			System.out.print(x);
		}
		catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}

	}

}
