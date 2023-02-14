package jogoDeAdivinhacao2;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Jogo2 {

	public static void main(String[] args) 
	{
		Controle2 controle = new Controle2();
		Scanner leitor = new Scanner (System.in);
		int op;
		do
		{
			String bemVindos = "Bem vindas(os) ao Jogo Adivinhe So! \nEscolha o que deseja: \n\t1-Ver regras \n\t2-Jogar \n\t3-Encerrar";
			try {
			String bemVJP = JOptionPane.showInputDialog(null,bemVindos,"Bem vindas(os)",1);
			op=Integer.parseInt(bemVJP);
			}catch(Exception e){
				String erro = JOptionPane.showInputDialog(null,"Invalido. Favor insira um valor inteiro","Erro!",2);
				op=Integer.parseInt(erro);
			}
			switch(op)
			{
			case 1: 
				controle.regras();
				break;
			case 2:
				controle.iniciaJogo();
				break;
			case 3:
				JOptionPane.showMessageDialog(null,"*****Saindo!*****");
			}
		}
		while(op!=3);

	}

}
