# Bem vindo

Bem vindo ao meu repositório de estudo aula 001


## Estrutura dessa pasta

Esse projeto tem algumas pastas principais:

- `src`: Essa pasta armazena as classes, é a pasta fonte.
- `lib`: Isso aqui é uma pasta para dependências. 

## O que temos nesse projeto?

- Uma classe Main
- Uma classe Test
  
  A classe Main apenas realiza uma impressão e o mesmo vale apra a Test
## O que eu aprendi?

Para criar o método main posso apenas digitar `psvm` e caso tenha as extensões do Java para vscode, ao pressionar tab irá ser criado o método main.

E para printar podemos digitar `sout`, que funciona da mesma forma que o psvm, ele cria todo o código para realizar a impressão.

---
Em java temos 4 tipos de dados.

**`double`**, **`float`**, **`int`** e **`short`**

Para criar uma variável, precisamos especificar o tipo (int, short, double) -> Nome da variável -> valor da variável

A diferença entre short e int, é que o short consome 2 bytes, enquanto o int consome 4. Com isso dependendo da necessidade usamos um ou outro. O float é uma variável que permite números reais(consome 4 bytes) e o bool permite números reais (consome 8 bytes).


**`Char`**
É o tipo de variável que armazena letras

```Java
    char c = 'B'
```

**`Boolean`**
É uma variável que armazena valores como false ou true.

---
**`Operadores`** 

Basicamente em java, temos os usuais, **`+`** para soma,  **`-`** para subtração, **`*`** para multiplicação e **`/`** para divisão.  

---

**`Incrementar e Decrementar`**

São as formas de acrescentar e decrementar de forma mais "curta".

```Java
  a++;
```

Isso irá acrescentar mais um numero. 

O `+=` também funciona no Java. E todas suas variações, `-=`, `/=` e `*=`.

---
**`Conversão`**

Aqui falando de conversão entre int para double ou double para int.

Supondo que você queira colocar uma variável int em um double, é necessário usar (int):

```Java
  int a = (int)3.6;
```

O problema de fazer isso é que você vai acabar perdendo informação.

Porém o processo contrário, de colocar uma variável "menor" em uma maior não tem problema algum, podendo apenas atribuir o valor.

---
**`Classes`**

Sobre classes, todas as classes do java começam com letra maiúscula, mas só as classes, variavel, não pode ter letra maiúsculas.

Algumas classes precisam de importação. Para saber como importar é possível buscar na documentação ao dependendo da sua IDE, ela mesma irá te dizer.


`Scanner`

É usado para ler a entrada do usuário. 

A forma de usar é a seguinte

```Java
  Scanner leitor = new Scanner(System.in);
```


`String`

Para armazenar strings, usamos a classe Scanner.

```Java
  String s = "texto aqui";
```
Detalhe, só é permitido aspas duplas.


---
## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).


