# Questão 4 — Arrays

Um array de tipos primitivos, como `int[]` ou `double[]`, guarda valores. Já um array de objetos, como `Aluno[]`, guarda referências para objetos.

## a) Como a memória é usada

Quando fazemos `new int[3]`, são criadas três posições que começam com o valor zero. Em um array de objetos, como `new Aluno[3]`, as posições começam como `null`, porque os objetos ainda precisam ser criados.

Por exemplo:

```java
Aluno[] alunos = new Aluno[2];
alunos[0] = new Aluno("Ana", "123");
```

Nesse caso, o array tem espaço para duas referências, mas só a primeira aponta para um objeto criado.

## b) Cuidados

- Verificar se a posição não está `null` antes de usar o objeto.
- Não acessar uma posição fora do tamanho do array.
- Criar os objetos antes de chamar seus métodos.
- Lembrar que duas variáveis podem apontar para o mesmo objeto.
