package cadastroBancario;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		
		//Preparacao para leitura do teclado
		InputStreamReader leitorEntrada = new InputStreamReader(System.in);
		BufferedReader leitor = new BufferedReader(leitorEntrada);
		
		//Interacao com o usuario
		System.out.println("Digite a operacao que deseja realizar:");
		System.out.println("1 - Abrir uma nova conta");
		System.out.println("2 - Entrar na sua conta");
		
		int opcaoLida = Integer.parseInt(leitor.readLine());

		if (opcaoLida == 1){
			
			System.out.println("Qual tipo de conta voce deseja abrir?");
			System.out.println("1 - Conta Corrente");
			System.out.println("2 - Poupanca");
			System.out.println("3 - Aplicacoes em fundo");
			
			int opcaoTipoDeConta = Integer.parseInt(leitor.readLine());
			
			if(opcaoTipoDeConta == 1){
				
			}
			
			if(opcaoTipoDeConta == 2){

			}

			if(opcaoTipoDeConta == 3){

			}
		}
		
		if (opcaoLida == 2){

		}
		
	}

}
