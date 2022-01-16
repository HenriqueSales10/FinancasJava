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

O segundo módulo que o sistema apresenta é o módulo "Contas". Neste módulo, é possível cadastrar, editar e excluir as contas bancárias presentes no sistema. Também é possível realizar a pesquisa de contas informando o ID da conta desejada.

![Contas](https://user-images.githubusercontent.com/71890654/149642899-f90dc08d-8e54-4fb9-a00a-a00fe3cc2ee7.gif)

O terceiro módulo que o sistema possui é o módulo "Receitas". Este módulo permite ao usuário realizar o controle de suas receitas. Ao cadastrar a receita no sistema, o valor da receita não é adicionado diretamente na conta do usuário. Para que isto ocorra, deve-se registrar o recebimento da receita através do botão "Registrar recebimento". 

Este módulo também permite ao usuário listar na tabela somente as receitas registradas (Ou seja, somente as receitas que adicionaram valor do saldo da conta do usuário) e verificar o total de receitas registradas através dos botões "Listar receitas registradas" e "Visualizar total de receitas" além de permitir realizar uma busca por tipo de receita.

![Receitas](https://user-images.githubusercontent.com/71890654/149644704-e57d78a2-fcc9-405d-bcbc-7a9f86f3c5ac.gif)

O quarto módulo que o sistema possui é o módulo "Despesas". Este módulo permite ao usuário realizar o controle de suas despesas. Ao cadastrar a despesa no sistema, o valor da despesa não é descontado diretamente na conta do usuário. Para que isto ocorra, deve-se registrar a despesa através do botão "Registrar despesa". 

Este módulo também permite ao usuário listar na tabela somente as despesas registradas (Ou seja, somente as despesas que descontaram valor do saldo da conta do usuário) e verificar o total de despesas registradas através dos botões "Listar despesas registradas" e "Visualizar total de despesas" além de permitir realizar uma busca por tipo de despesa.

![Despesas](https://user-images.githubusercontent.com/71890654/149644901-11171c5a-e2b8-4018-a421-93613ae5dc5d.gif)

O último módulo do sistema chamado "Transferências", permite aos usuários realizarem transferências entre as contas existentes no sistema. Ao realizar transferências, o valor transferido é descontado diretamente da conta de origem e adicionado ao saldo da conta de destino.

![Transferencia](https://user-images.githubusercontent.com/71890654/149644944-36cdb864-aee8-46fe-8f60-305ed952f8c5.gif)





