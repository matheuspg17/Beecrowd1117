# Resolução exercício Beecrowd1117

## Descrição do problema
Faça um programa que leia as notas referentes às duas avaliações de um aluno. Calcule e imprima a média semestral. Faça com que o algoritmo só aceite notas válidas (uma nota válida deve pertencer ao intervalo [0,10]). Cada nota deve ser validada separadamente.

## Como Funciona
1. O programa utiliza duas variáveis de controle de fluxo dinâmicas (`controle1 = 1` e `controle2 = 1`) para gerenciar as leituras de forma independente.
2. **Primeiro Laço `for`:** Repete a leitura da primeira nota (`nota1`). Se a nota for menor que 0 ou maior que 10, exibe `"nota invalida"` e incrementa `controle1++` para manter o laço ativo. Caso seja válida, define `controle1 = 0` para encerrar o loop.
3. **Segundo Laço `for`:** Aplica exatamente a mesma lógica de validação para a segunda nota (`nota2`), repetindo o processo até que um valor correto seja fornecido.
4. Após obter as duas notas válidas, o código calcula a média aritmética (`(nota1 + nota2) / 2`).
5. O resultado final é exibido no console utilizando `System.out.printf` com o formato `"media = [resultado]"`.