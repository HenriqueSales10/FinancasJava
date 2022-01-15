# DesafioPubFuture
 Desafio PubFuture - Finanças pessoais
 
Versão do JDK: 14.0.1 Versão do NetBeans: 8.2 Versão do Wamp: 3.2.3 64bit
 
Para que o programa funcione corretamente, é necessário iniciar o WampServer e logo após, executar o script do banco de dados presente neste repositório no MySQL Workbench ou o banco de dados desejado para criar a base de dados.

Após criar a base de dados, deve-se importar o projeto para o NetBeans, após importar, é necessário verificar se as bibliotecas do programa (presentes na pasta "lib" do repositório) foram importadas corretamente no pacote das bibliotecas. Caso não tenham sido, é necessário adicioná-las no pacote "Bibliotecas" do projeto, caso contrário, o programa não funcionará.

A classe "ConnectionFactory", do pacote "connection" deve ser configurada com a URL do endereço onde o banco de dados foi criado, juntamente com o usuário do banco de dados, e a senha do mesmo (Para realizar tais alterações basta substituir as informações que estão entre aspas pelas informações do banco de dados de quem for executar o programa).

Após todos estes passos, será possível executar o programa, através de sua classe principal "Principal.java" localizada no pacote telaPrincipal.
 
O sistema está dividido em 5 módulos.

O primeiro módulo é o módulo Home, que é apresentado sempre que o sistema é executado.
![Tela inicial](https://user-images.githubusercontent.com/71890654/149629556-8fecf55e-674a-4e08-a2f0-4789fb55a94d.png)
