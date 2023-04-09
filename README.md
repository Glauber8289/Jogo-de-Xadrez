# Jogo-de-Xadrez
Projeto jogo de Xadrez finalizado,fiz esse projeto baseando-se no projeto chess-system do Nelio Alves.

Definições gerais:
O jogo esta sendo feito através do git bash, não foquei tanto no designer, pois no momento meu foco e treinar meu raciocínio lógico no back-end, peço desculpas aos meus amigos do front-end rs.

Vamos la, as peças que estão em amarelo, são equivalente as pretas, e as brancas obviamente as brancas, ao clicar em uma peça o jogo te mostrara os caminhos possíveis para aquela peça, caso voce faça algo errado que restrinja as regras do jogo, uma exceção será lançada e uma mensagem de erro aparecera ao usuário.

Por exemplo o tabuleiro percorre da linha 1 a 8 e as colunas percorrem a até h, se o usuário digitar h9 uma exceção aparecerá informando que so e possível se movimentar de h1 até h8.


Como saberei qual e o Rei, rainha bispo e etc ?

Nomeei as peças em inglês para que não houvesse duplicidade de letras por exemplo Rei e Rainha teríamos duas letras R.

Portanto as peças ficaram classificadas da seguinte forma :
Rainha- Letra Q
Rei- Letra K
Bispo-Letra B
Cavalo- Letra N
Torre- Letra R
Peão-Letra P

Para movimentar as peças o programa te perguntara qual a posição de origem, por exemplo se quero um peão na coluna d e na linha 2 terei que digitar d2 e assim sucessivamente, conforme voce for capturando as peças do adversario, um vetor irá te mostrar todas as peças capturadas, todas as regras do Xadrez estão corretas, check check mate, cavalo so pode andar em L, bispo na diagonal e etc.Também temos um contador que obviamente conta o turno e informa qual o jogador da rodada se e o Branco, ou o Preto porem deixei em ingles também White or Black.

Meu aprendizado:

Me desafiei a realizar este projeto, tive que administrar bem meu tempo por ser um projeto bem complexo, mas valeu a pena pois aprimorei bastante meus conhecimentos realicionados a POO no Java, no projeto temos, polimorfismo,herança,downcasting, upcasting, vetores, listas, exceptions tudo o que venho estudando e aprimorando.![Chess system 2023-03-01 215545](https://user-images.githubusercontent.com/107453279/222303306-c2af58a2-fe02-47e3-8384-63d67e74c218.png)
