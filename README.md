# POOA T2
 * [Sobre](#About)
 * [Ideia de projeto](#Execution)
 * [Configuracoes](#Installation)
 * [Como utilizar?](#Usage)
 * [O que eu posso mudar? Como mudar?](#What-can-i-change)

### About
Trabalho 2 da disciplina de POOA ministrada pelos professor Delano durante o período 2021/1 - ENPE2, implementado pelos alunos:

Anderson H. Giacomini - 769720
Sophia S. Schuster - 760936

### Execution?
Para a construção da base do código, seguimos o tutorial do professor Daniel Lucrédio, disponível em <https://www.youtube.com/watch?v=HOKhJT7Hp1A>.
Fizemos um projeto Maven, utilizando a linguagem Java. Não foi utilizado nenhum padrão de projeto. 
Para seguir os dois primeiros princípios SOLID (Princípio da Responsabilidade Única (SRP) e Princípio do Aberto/Fechado(OCP)), levamos em consideração as videoaulas disponibilizadas pelo professor durante os dois primeiros módulos da matéria. Portanto, para seguirmos o primeiro princípio, dividimos nosso código em funções, garantindo que cada uma tivesse apenas uma responsabilidade. Para garantir o segundo princípio, encapsulamos as informações criando classes e fizemos repetidamente a pergunta:"Se fossemos estender o comportamento de alguma classe, qual seria o melhor código para receber essa mudança?".


### Installation
É necessário Java e Maven.

### Usage
Para rodar o nosso prijeto, basta realizar a importação do git como um projeto maven e adicionar o archetype "maven-archetype-quickstart".
Em seguida, abrir o terminal no projeto e executar o comando:
```
mvn exec:java -Dexec.mainClass="br.ufscar.dc.pooa.App"
```

### what-can-i-change
Para alterar qual site de noticia ou qual tipo de noticia (principais, secundárias [...] do site) se deseja utiliar, basta ir na main, que encontra-se no arquivo App.java, e, nas linhas 11 e 12, atualizar o link do site e a classe de referência do html que foi escolhida para fazer a seleção dos títulos.
Após a execução do programa, será criado um arquivo .csv com o tipo de título que foi selecionado, o próprio título da notícia e o link para ela. É possível adicionar qualquer tipo de processamento a essas notícias extraídas trabalhando com esse arquivo csv.
