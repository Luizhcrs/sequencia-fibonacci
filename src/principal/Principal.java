package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		int numero, numeroUm, numeroDois, erroNumero;
		numero = 1;
		numeroUm = 0;
		// Isonamento do possivel erro ao escolher o numero 0;
		erroNumero = 0;
		List<String> lista = new ArrayList<String>();
		Scanner ler = new Scanner(System.in);
		System.out.println("------------------------------------------");
		System.out.println("SEQU�NCIA FIBONACCI.");
		System.out.println("------------------------------------------");
		System.out.println("Digite a quantidade de n�meros Fibonacci: ");
		numeroDois = ler.nextInt();
		String numeroZero = "" + erroNumero;
		lista.add(numeroZero);
		numeroDois = numeroDois - 1;
		// For onde os numeros fibonacci s�o gerados para lista
		for (int i = 0; i <= numeroDois; i++) {
			numero = numero + numeroUm;
			numeroUm = numero - numeroUm;
			String fibo = "" + numero;
			lista.add(fibo); 
			}
		System.out.println(lista);
		System.out.println("------------------------------------------");
		System.out.println("Digite o n�mero Fibonacci:  ");
		System.out.println("------------------------------------------");
		String nome = ler.next();
		boolean a = true;
		for (int i = 0; i < lista.size(); ) {
			String s = lista.get(i);
			if (s.equals(nome)) {
				System.out.println("O n�mero (" + nome + ") faz parte da sequ�ncia Fibonacci.");
				int depois = i + 1;
				System.out.println("O pr�ximo n�mero da sequ�ncia � (" + lista.get(depois) + ").\n");
				a = false;
				break;
			}
			i++;
		}
		if  ( a == true){
			System.err.println("O n�mero (" + nome + ") n�o faz parte da sequ�ncia.");
		}
		
		}
	}

