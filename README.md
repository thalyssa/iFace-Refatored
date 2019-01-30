# iFace-Refatored

## Funcionalidades

### Criação de conta:
  As contas criadas são armazenadas numa ArrayList de usuários na classe main. A estrutura foi escolhida por seu comportamento dinâmico e métodos de manipulação existentes.

### Edição de perfil:
  O usuário pode alterar todos os dados da sua conta (nome, login e senha), um por vez. O novo dado é registrado e armazenado no objeto.

### Adicionar amigo:
  O usuário logado fornece o e-mail de quem deseja adicionar como amigo e esse dado é procurado na lista de cadastros. Com o ID do usuário a ser adicionado, o pedido de amizade é armazenado na lista de solicitações em aberto do usuário.

### Enviar mensagem:
  É dada ao usuário a opção de enviar mensagens para outro usuário ou para uma comunidade.
  Caso a mensagem seja enviada para outro usuário, o e-mail do destinatário é usado como parâmetro de busca e a mensagem é adicionada na lista interna do objeto. Caso seja para uma comunidade, o nome da mesma é usado como parâmetro de busca e a mensagem é armazenada na lista de mensagens da comunidade, podendo ser visualizada por todos os membros.

### Criar comunidade:
  Assim como os usuários, as comunidades são armazenadas numa ArrayList. Recebem nome, descrição e o usuário logado é automaticamente registrado como moderador daquele objeto.

### Recuperar informações:
  Essa função recupera todas as informações referentes ao usuário atualmente logado no sistema. Quando chamada, retorna as informações de: login, lista de amigos e lista de mensagens, contidas no próprio objeto, após isso a função verifica a lista de membros de cada comunidade criada e exibe as que o usuário faz parte.

### Deletar perfil:
  A função compara o objeto responsável por sinalizar o usuário com a sessão ativa no sistema com os usuários cadastrados, removendo o objeto da lista assim que a busca retorna sua posição.


## Classes
  
### user
  A classe reúne os métodos responsáveis pela manipulação dos usuários. A centralização dos métodos nesta classe é importante principalmente para o gerenciamento dos pedidos de amizade e das listas de dados dos usuários, como as de amigos, comunidades e mensagens associadas à conta de alguma forma.

### community
  A classe reúne os métodos responsáveis pela manipulação das comunidades. Com a centralização desses métodos, a manipulação de informações das comunidades se torna mais simples, porém existem dados duplicados em relação aos usuários, uma vez que os membros são armazenados em mais uma ArrayList dentro do objeto.
   
### messages
  Como a assinatura dos métodos referentes á manipulação de mensagens é igual para qualquer destinatário (usuário ou comunidade), os métodos foram agrupados em apenas uma classe, porém as implementações de cada método devem respeitar as particularidades de seus objetos destinatários, então tanto os métodos quanto a classe messages são abstratos.

### main
  Classe onde se localizam as funções de controle e manipulação do sistema (tela de login, tela inicial, criação de usuários/comunidades), funções referentes ao usuário logado (edição/exclusão de perfil e visualização das informações referentes ao perfil), e funções de interação entre o usuário logado e outros usuários (envio de pedidos de amizade, pesquisa de comunidades, juntar-se a uma comunidade). A junção de todos os métodos nesta classe facilita a manipulação dos dados, porém o excesso de código pode deixar uma impressão de classe "poluída".

## Distribuição dos Métodos
  Os métodos foram distribuídos em suas classes de acordo com os objetos que manipulam: Métodos referentes à operações internas dentro de um objeto user estão na classe user, o raciocínio análogo pode ser feito para a classe community. Métodos que, de alguma forma, necessitem da interação entre duas ou mais instâncias de objetos (Que podem ou não ser do mesmo tipo) estão na classe main.

## Herança
  A herança foi usada nas classes user e community, que herdam da classe messages os métodos de envio e armazenamento de mensagens.

## Abstratação
  Os métodos relativos às mensagens enviadas possuem a mesma assinatura para qualquer objeto com o qual se associem, porém as particularidades de cada classe devem ser levadas em conta na hora da implementação. Por isso a classe messages foi implementada como uma classe abstrata, assim como seus métodos.
