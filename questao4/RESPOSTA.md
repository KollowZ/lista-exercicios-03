# Questão 4 — Arrays primitivos e arrays de objetos

## Diferença
Um array primitivo (`int[]`, `double[]`) armazena diretamente valores primitivos. Um array de objetos (`Aluno[]`, `Produto[]`) armazena referências a objetos; suas posições começam como `null`.

## a) Alocação de memória
- `new int[3]` cria três posições inicializadas com zero; em `double[]`, começam com `0.0`.
- `new Aluno[3]` cria três referências `null`, não três objetos `Aluno`. Cada objeto deve ser instanciado separadamente, por exemplo `alunos[0] = new Aluno("Ana", "123")`.
- Arrays e objetos são alocados no heap; variáveis podem guardar referências a eles.

## b) Cuidados
1. Verificar `null` antes de chamar métodos para evitar `NullPointerException`.
2. Usar índices de `0` a `length - 1` para evitar `ArrayIndexOutOfBoundsException`.
3. Instanciar os objetos necessários; criar o array não cria seus elementos.
4. Lembrar que atribuir uma referência não copia o objeto: duas referências podem apontar para a mesma instância.
5. Validar os dados antes de utilizá-los.

Exemplo:
```java
Aluno[] alunos = new Aluno[2]; // começa com null
alunos[0] = new Aluno("Ana", "123");
if (alunos[0] != null) System.out.println(alunos[0].getNome());
```
