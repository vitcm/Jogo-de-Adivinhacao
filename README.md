##ENGLISH
# Guessing Game
Game where players must insert a number range and try to guess the drawn number.

DESCRIPTION:
"Use JOptionPane to establish the entry and out of data in a guessing game. 
The game must raffle a random number inside a range, that must be informed by the user. The objects JOGADORES must try to guss the number drawn.
In the class GAME the app starts - it's the only class with MAIN methos. The class GAME access the class CONTROLE, with possesses the method INICIAJOGO.
The method INICIAJOGO is responsible for the game's execution and it's rules, in addition to access the class JOGADOR to instantiate the respecive objects.
The app must establish the interaction with the user, who will inform:
  a) the number range in which the number will be drawn. It must not be lesser than 50.
  b) the quantity of guesses each player will get.
  c) The quantity of players.
  d) The name of each player and their guesses.
Following, it will process each guess and make the comparisson with the drawn number, showing a brief of each player and theis guesses, and the winner (if the is one).
OBS.:
1 - The player must not be able to type non numerical numbers for numerical fields. The information must be compatible with the universe it belongs.
2 - The quantity of guesses must be the same to all the players.
3 - A game must have a ArrayList of players, which will save the informations during the game."

##PORTUGUÊS BRASIL

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
2 - A quantidade de palpites dever ser a mesma para cada jogador. Assim, se for estabelecido que deve-se efetuar três palpites, 
cada jogador terá o direito de três tentativas (simulações ou não);
3 - Um jogo deve possuir um ArrayList de jogadores, cujas informações serão armazenadas durante a execução do jogo."
