# IA2
Trabalho 2 da disciplina de IA

Trabalho desenvolvido por 
Ivair Puerari
Jeferson A. Schein

Para a disciplina de Inteligencia Artificial
Ciencia da Computacao 
Universidade Federal da Fronteira Sul

Trabalho conciste em fazer um codificador de bits com uma maquina de estados,
após a codificacao é feito uma adicao de ruido, que é informado qual a chance de cada bit ter ruido,
depois de ter adicionado um ruido ao conjunto de bits
é feita a decodificacao para tentar encontrar o conjunto de bits de entrada

Para compilar o programa:

1 - Ir ate a pasta dos arquivos

$ cd Desktop/IA2

2 - Compilas

$ make

3 - Executar

$ java Java bitEntrada porcentagemRuido

bitEntrada - conjunto de bits de entrada - 10010101

porcentagemRuido - qual a chance de caada cada bit sofrer ruido - varia de 0 - 100

$ java Java 10010 50
