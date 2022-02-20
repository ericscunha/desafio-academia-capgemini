<h1>
DESAFIO DE PROGRAMAÇÃO - ACADEMIA CAPGEMINI</h1>

<p>Este é um projeto que compõe a terceira etapa do processo de seleção para a <strong> <a href="http://capgemini.proway.com.br/">Academia Capgemini 2022</a></strong>. O objetivo dessa etapa é testar os conhecimentos do candidato em lógica de programação.

Foram propostos 3 desafios com diferentes níveis de dificuldades, que serão detalhados posteriormente.


<h2>
🛑 Pré-requistos
</h2>

- [x] <a href="https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html">Java JDK 17 </a>
- [x] IDE para desenvolvimento Java (Foi utilizado o <a href="https://www.jetbrains.com/pt-br/idea/download/#section=windows">Intellij</a>)
- [x] <a href="https://maven.apache.org/download.cgi">Maven</a>

<h2> 📚 Conteúdos</h2>
<ol>
    <li><a href="#desafios">Entendendo os Desafios</a></li>
    	<ul>
            <li><a href="#questao1">Questão 01</a></li>
            <li><a href="#questao2">Questão 02</a></li>
            <li><a href="#questao3">Questão 03</a></li>
	    </ul>
    <li><a href="#projeto">Acesso ao projeto</a></li>
    <li><a href="#executando">Executando o projeto</a></li>
    <li><a href="#recurso">Recursos</a></li>
    <li><a href="#uso">Orientações de uso</a></li>
</ol>

<h2>Entendendo os Desafios<a name="#desafio"></a></h2>

<h3>Questão 01<a href="#questao1"></a></h3>
<p>
    Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços. A base e altura da escada devem ser iguais ao valor de n. A última linha não deve conter nenhum espaço. </p>

**Exemplo:**

**Entrada:**

n = 6

**Saída:**

![Questao01](C:\Users\Eric\Documents\Questao01.png)

<h3>Questão 02<a href="#questao2"></a></h3>
<p>Débora se inscreveu em uma rede social para se manter em contato com seus amigos. A página de cadastro exigia o preenchimento dos campos de nome e senha, porém a senha precisa ser forte. O site considera uma senha forte quando ela satisfaz os seguintes critérios:</p>
<ol>
	<li>Possui no mínimo 6 caracteres.</li>
	<li>Contém no mínimo 1 digito.</li>
	<li>Contém no mínimo 1 letra em minúsculo.</li>
	<li>Contém no mínimo 1 letra em maiúsculo.</li>
	<li>Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+</li>
</ol>

<p>Débora digitou uma string aleatória no campo de senha, porém ela não tem certeza se é uma senha forte. Para ajudar Débora, construa um algoritmo que informe qual é o número mínimo de caracteres que devem ser adicionados para uma string qualquer ser considerada segura.</p>

**Exemplo:**
**Entrada:** Ya3

**Saída:**  3

**Explicação:**
Ela pode tornar a senha segura adicionando 3 caracteres, por exemplo, &ab, transformando a senha em Ya3&ab. 2 caracteres não são suficientes visto que a senha precisa ter um tamanho mínimo de 6 caracteres.

<h3>Questão 03<a href="#questao3"></a></h3>
<p>Duas palavras podem ser consideradas anagramas de si mesmas se as letras de uma palavra podem ser realocadas para formar a outra palavra. Dada uma string qualquer, desenvolva um algoritmo que encontre o número de pares de substrings que são anagramas.
**Exemplo:**
**Exemplo 1)**
Entrada: ovo
Saída: 2

**Explicação:**
A lista de todos os anagramas pares são: [o, o], [ov, vo] que estão nas posições [[0], [2]], [[0, 1], [1, 2]] respectivamente. 
    
**Exemplo 2)**
Entrada: ifailuhkqq
Saída: 3

**Explicação:**
A lista de todos os anagramas pares são: [i, i], [q, q] e [ifa, fai] que estão nas posições [[0], [3]], [[8],  [9]] e [[0, 1, 2], [1, 2, 3]].

<h2>Acesso ao projeto<a name="#projeto"></a></h2>

Para ter acesso, é preciso clonar o projeto do GitHub em um diretório de sua preferência:

```shell
cd "diretorio de sua preferencia"
git clone https://github.com/ericscunha/desafio-academia-capgemini.git
```

Agora você pode executar os vários comandos abaixo.

<h2>Executando o projeto<a name="#projeto"></a></h2>

Caso deseje executar diretamente o projeto através do arquivo **.jar* disponibilizado no projeto, execute o comando:

```shell
cd "diretorio onde foi clonado o projeto"
java -jar target/desafio-academia-capgemini-1.0-RELEASE.jar
```

É necessário ter o **Java JDK 17 ou superior** instalado, conforme os pré-requisitos.

<h2>Recursos<a name="#recurso"></a></h2>

- [x] Menu Principal
- [x] Questão 01 - Construindo Escada
- [x] Questão 02 - Validando Senhas
- [x] Questão 03 - Quantidade de anagramas na palavra

<h2>Orientações de uso<a name="#uso"></a></h2>

<h3>Passo 1</h3>
Ao executar a aplicação será exibida no terminal as opções (ver abaixo) possíveis de serem acessadas. Informe a opção deseja para ter acesso ao Desafio e pressione Enter.

Informe a opção que deseja acessar?
[ 1 ] - Questão 01 - Construindo Escada
[ 2 ] - Questão 02 - Validando Senhas
[ 3 ] - Questão 03 - Quantidade de anagramas na palavra
[ 0 ] - Encerrar aplicação

<h3>Passo 2 - Questão 01 - Construindo Escada</h3>
<p>A aplicação solicitará que informe quantos degraus deseja para a escada. Após informar pressione Enter. A aplicação apresentará a escada montada como saída de dados.</p>

<p>A escada será montada por * com base e altura de acordo com a quantidade de degraus informada.</p>

<p>Ao final será possível retornar ao Menu Principal (9) ou sair da aplicação (0).</p>

<h3>Passo 3 - Questão 02 - Validando Senhas</h3>
<p>A aplicação simulará a criação de usuário e senha. Por isso, solicitará primeiro o nome do usuário e na sequência a senha desejada.</p>

<p>Informada a senha, pressione Enter para validação dos dados.</p>

<p>Caso seja uma senha forte, a aplicação apresentará os dados registrados e uma mensagem informando que o cadastro foi realizado com sucesso.</p>

<p>Caso seja uma senha que não atenda aos requisitos definidos no desafio, a aplicação apresentará uma mensagem informando os motivos de não ser uma senha segura.</p>

<p>Para senha com tamanho inferior a 6, tamanho proposto no desafio. A saída de dados apresentará quantos dados são necessários para tornar a senha segura. (Exemplo: n = 3)</p>

<p>Ao final será possível retornar ao Menu Principal (9) ou sair da aplicação (0).</p>

<h3>Passo 4 - Questão 03 - Quantidade de anagramas na palavra</h3>
<p>A aplicação pedirá que seja informada uma palvra. Informe a palavra desejada e pressione Enter.</p>

<p>A aplicação apresentará como saída a quantidade de anagramas encontrados considerando partes da palavra informada.</p>

*Observação: Com objetivo de maximizar a possibilidade, no desenvolvimento deste desafio, a aplicação converterá letras maiúsculas em minúsculas.* 

<p>Ao final será possível retornar ao Menu Principal (9) ou sair da aplicação (0).</p>

<h3>Passo 5 - Encerrar aplicação</h3>
<p>Informando 0 (zero) a aplicação será encerrada.</p>


------------

Disponibilizado com por [ericscunha](https://www.linkedin.com/in/ericscunha/ "ericscunha").