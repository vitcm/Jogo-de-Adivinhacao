# Jogo-de-Adivinhacao
Jogo onde os jogadores devem inserir um intervalo e tentar adivinhar o número sorteado.

DESCRIÇÃO DA ATIVIDADE:
"Utilize o JOptionPane para estabelecer a entrada e a saída de dados em um jogo de adivinhação.
O jogo deve gerar um número aleatório dentro de um intervalo. Esse intervalo deve ser informado pelo usuário, sendo que os objetos JOGADOR tentam adivinhar o número gerado.
É na classe JOGO que o aplicativo se inicia - é a única com o método MAIN. A classe JOGO acessa a classe CONTROLE, a qual possui o método INICIAJOGO.
O método INICIAJOGO é responsável pela execução do jogo e suas respectivas regras, além de acessar a classe JOGADOR para instanciar os respectivos objetos.
O aplicativo deve estabelecer a interação com o usuário que irá informar:
  a) O intervalo dentro do qual o número será gerado. Não deve ser menor que 50.
  b) A quantidade de palpites que cada jogador poderá efetuar (min 1 max 4)
  c) A quantidade de jogadores (min 3)
  d) O nome de cada jogador e os seus devidos palpites;
Em seguida, processará a análise dos palpites de cada jogador e efetuará a comparação com o número sorteado e apresentará um resumo dos palpites de cada jogador e o vencedor - se houver.
OBSERVAÇÕES:
1 - Cada aplicativo deve consistir as respectivas digitações, não deixando o usuário informar caracteres não numéricos para campos núméricos, por exemplo, 
e também deve avaliar se a informação digitada está compatível ao universo a que pertence
(por exemplo, verificar se o número de palpites informado está no intervalo dos requisitos). 
Essa consistência de digitação deve apresentar uma mensagem de acordo com o erro de entrada. Após a mensagem, deve solicitar novamente a informação.
2 - A quantidade de palpites dever ser a mesma para cada jogadof. Assim, se for estabelecido que deve-se efetuar três palpites, 
cada jogador terá o direito de três tentativas (simulações ou não);
3 - Um jogo deve possuir um ArrayList de jogadores, cujas informações serão armazenadas durante a execução do jogo."
