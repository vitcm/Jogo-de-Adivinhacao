package jogoDeAdivinhacao2;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;


public class Controle2 
{
	static Controle2 c = new Controle2();
	static int contInterv=0;
	static int contJog=0;
	static int contPalp=0;
	static int contGanhador=0;
	static int contSorteio=0;
	
	public void iniciaJogo()
	{
		ArrayList<Jogador2> listaJogadores = new ArrayList<>();
		c.validaIntervalo();
		contInterv++;
		c.validaNumPalpites();
		contPalp++;
		int numJogadores = c.validaNumJogadores();
		contJog++;
		int numSorteado = c.sorteiaNumero();
		
		for(int i=0;i<numJogadores;i++)
		{
			String nomeJogador = c.recebeNome();
			String palpites = c.recebePalpites();
			Jogador2 j = new Jogador2();
			j.setNome(nomeJogador);
			j.setPalpite(palpites);
			listaJogadores.add(j);
		}
		String finale = "";
		for(int i=0;i<listaJogadores.size();i++)
		{
			Jogador2 auxiliar = new Jogador2();
			auxiliar = listaJogadores.get(i);
			finale+=auxiliar.getNome()+"\n"+auxiliar.getPalpite();
		}
		finale+="Numero sorteado: " + numSorteado;
		finale+="\nNumero de ganhadores: " + contGanhador + "\n";
		JOptionPane.showMessageDialog(null,finale);
		contInterv=0;
		contJog=0;
		contPalp=0;
		contSorteio=0;
		contGanhador=0;
	}
	
	// m�todo opcional para imprimir as regras
	public void regras()
	{
		String regras = "1 - Minimo de 3 jogadores. "
				+ "\n2 - O intervalo oferecido nao deve ser menor que 50. "
				+ "\n3 - A quantidade de palpites e de no minimo 1 e no maximo 4. "
				+ "\n4 - Todos os particicantes terao direito ao mesmo numero de palpites."
				+ "\n";
		JOptionPane.showMessageDialog(null,regras);
	}
	
	static int valor1=0,valor2=0,intervalo,contador=0;
	static String v ="";
	
	//pede para o jogador inserir o intervalo e verifica se e valido (ou seja, maior que 50)
	public String validaIntervalo()
	{
		String m1JP="",m2JP="";
		if(contInterv==0)
		{
			do
			{
				if(contador==0)
				{
					try {
					m1JP=JOptionPane.showInputDialog(null,"Digite um valor inicial para adivinhacao.","Intervalo",1);
					valor1 = Integer.parseInt(m1JP);
					}
					catch (Exception e)
					{
						String erro = JOptionPane.showInputDialog(null,"Invalido! Entrada de dados incorretos. Favor, digite um numero inteiro.","Erro!",2);
						valor1 = Integer.parseInt(erro);
					}
					try {
					m2JP=JOptionPane.showInputDialog(null,"Digite um valor final para adivinhacao.","Intervalo",1);
					valor2 = Integer.parseInt(m2JP);
					}
					catch (Exception e)
					{
						String erro = JOptionPane.showInputDialog(null,"Invalido! Entrada de dados incorretos. Favor, digite um numero inteiro.","Erro!",2);
						valor2 = Integer.parseInt(erro);
					}
					while(valor2<valor1)
					{
						try {
						m2JP=JOptionPane.showInputDialog(null,"O segundo numero inserido deve ser maior que o primeiro. "
								+ "Favor insira o 2o numero novamente.","Erro!",2);
						valor2 = Integer.parseInt(m2JP);
						}
						catch (Exception e)
						{
							String erro = JOptionPane.showInputDialog(null,"Invalido! Entrada de dados incorretos. Favor, digite um numero inteiro.","Erro!",2);
							valor2 = Integer.parseInt(erro);
						}
					}
				}
				else
				{
					try {
					m1JP=JOptionPane.showInputDialog(null,"Intevalo menor que 50. Invalido!"
							+ "Digite novamente um valor inicial para adivinhacao.","Erro!",2);
					valor1 = Integer.parseInt(m1JP);
					}
					catch (Exception e)
					{
						String erro = JOptionPane.showInputDialog(null,"Invalido! Entrada de dados incorretos. Favor, digite um numero inteiro.","Erro!",2);
						valor1 = Integer.parseInt(erro);
					}
					try {
					m2JP=JOptionPane.showInputDialog(null,"Digite novamente um valor final para adivinhacao.","Erro!",2);
					valor2 = Integer.parseInt(m2JP);
					}
					catch (Exception e)
					{
						String erro = JOptionPane.showInputDialog(null,"Invalido! Entrada de dados incorretos. Favor, digite um numero inteiro.","Erro!",2);
						valor2 = Integer.parseInt(erro);
					}
				}
				
				intervalo=valor2-valor1;
				contador++;
			}
			while(intervalo<50);
			v= valor1 +","+valor2;
		}
		contador=0;
		v = valor1 +","+valor2;
		return v;
	}
	
	static int numPalpite=0;
	
	// m�todo para receber o n�mero de palpites que ser�o jogados por cada jogador e valida o n�mero
	public int validaNumPalpites()
	{
		String m1JP="";
			if(contPalp==0)
			{
				try {
					m1JP=JOptionPane.showInputDialog(null,"Digite a quantidade de palpites.","Palpites",1);
					numPalpite = Integer.parseInt(m1JP);
				}
				catch (Exception e)
				{
					String erro = JOptionPane.showInputDialog(null,"Invalido! Entrada de dados incorretos. Favor, digite um numero de 1 a 4.","Erro!",2);
					numPalpite = Integer.parseInt(erro);
				}
				while(numPalpite<1 || numPalpite>4)
				{
					try {
						m1JP=JOptionPane.showInputDialog(null,"Quantidade invalida. Favor digitar um valor de 1 a 4.","Erro!",2);
						numPalpite = Integer.parseInt(m1JP);
					}
					catch (Exception e)
					{
						String erro = JOptionPane.showInputDialog(null,"Invalido! Entrada de dados incorretos. Favor, digite um numero de 1 a 4.","Erro!",2);
						numPalpite = Integer.parseInt(erro);
					}
				}
			}
		return numPalpite;
	}
	
	static int numJogadores = 0;
	
	//solicita ao usu�rio o n�mero de jogadores, al�m de validar - deve ser no m�n 3
	public int validaNumJogadores()
	{
		String m1JP="";
		if(contJog==0)
		{	
			try {
				m1JP=JOptionPane.showInputDialog(null,"Digite o numero de jogadores","Jogadores",1);
				numJogadores = Integer.parseInt(m1JP);
			}catch(Exception e)
			{
				String erro = JOptionPane.showInputDialog(null,"Invalido! Entrada de dados incorretos. Favor, digite um n�mero inteiro.","Erro!",2);
				numJogadores = Integer.parseInt(erro);
			}
			while (numJogadores<3)
			{
				try {
				m1JP=JOptionPane.showInputDialog(null,"Numero invalido. Minimo de 3 jogadores.","Erro!",2);
				numJogadores = Integer.parseInt(m1JP);
				}catch(Exception e)
				{
					String erro = JOptionPane.showInputDialog(null,"Invalido! Entrada de dados incorretos. Favor, digite um numero inteiro.","Erro!",2);
					numJogadores = Integer.parseInt(erro);
				}
			}
		}
		
		return numJogadores;
	}
	
	static int numSorteado=0;
	
	public int sorteiaNumero()
	{
		if(contSorteio==0)
		{
			Random r = new Random();
			
			String v = c.validaIntervalo(); // recebe a String formada por valor1,valor2 no metodo validaIntervalo()
			
			//Voltando a String v para valor 1 e valor2:
			String[] valores=v.split(","); // Manipula a String para conseguir pegar os valores separadamente
			int valor1 = Integer.parseInt(valores[0]);
			int valor2 = Integer.parseInt(valores[1]);
			
			//sorteando n�mero
			do
			{
				numSorteado=r.nextInt();
			}
			while(numSorteado<valor1 || numSorteado>valor2);
			contSorteio++;
		}
		return numSorteado;
	}
	
	public String recebeNome()
	{
		String nomeJogador="";
		//int numJogadores = c.validaNumJogadores();
		String n = JOptionPane.showInputDialog(null,"Digite o nome do jogador.","Nome",1);
		nomeJogador+="Jogador ";
		nomeJogador+=n;
		
		return nomeJogador;
	}
	
	public String recebePalpites()
	{
		String v = c.validaIntervalo(); // recebe a String formada por valor1,valor2 no metodo validaIntervalo()
		int numSorteado = c.sorteiaNumero();
		
		String m1JP="";
		
		//Voltando a String v para valor 1 e valor2:
		String[] valores=v.split(","); // Manipula a String para conseguir pegar os valores separadamente
		int valor1 = Integer.parseInt(valores[0]);
		int valor2 = Integer.parseInt(valores[1]);
		
		// recebendo palpites
		int qtdePalpites=c.validaNumPalpites();
		String palpites="";
		int palp=0;
		
			for(int i=1;i<=qtdePalpites;i++)
			{
				try {
					String m = "Digite o palpite "+i;
					m1JP = JOptionPane.showInputDialog(null,m,"Palpites",1);
					palp=Integer.parseInt(m1JP);
				}catch(Exception e)
				{
					String erro = JOptionPane.showInputDialog(null,"Invalido! Entrada de dados incorretos. Favor, digite um numero de 1 a 4.","Erro!",2);
					palp=Integer.parseInt(erro);
				}
				while(palp<valor1 || palp>valor2)
				{
					try {
						m1JP = JOptionPane.showInputDialog(null,"Valor fora do intervalo estipulado. Favor digitar novamente.","Erro!",2);
						palp=Integer.parseInt(m1JP);
					}catch(Exception e)
					{
						String erro = JOptionPane.showInputDialog(null,"Invalido! Entrada de dados incorretos. Favor, digite um numero de 1 a 4.","Erro!",2);
						palp=Integer.parseInt(erro);
					}
				}
				palpites+=Integer.toString(palp);
				if(palp==numSorteado)
				{
					palpites+=" - Numero ganhador!";
					contGanhador++;
				}
				palpites+="\n";
			}
		
		return palpites;
	}
}
