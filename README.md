# iFace-Refatored

# Funcionalidades

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
  Assim como os usuários, as comunidades são armazenadas numa ArrayList. Recebem nome e descrição como dados e o usuário logado é automaticamente registrado como moderador daquele objeto.

### Recuperar informações:
  Essa função recupera todas as informações referentes ao usuário atualmente logado no sistema. Quando chamada, retorna as informações de login, lista de amigos e lista de mensagens, contidas no próprio objeto, após isso a função verifica a lista de membros de cada comunidade criada e exibe as que o usuário faz parte.

### Deletar perfil:
  A função compara o objeto responsável por sinalizar o usuário com a sessão ativa no sistema com os usuários cadastrados, removendo o objeto da lista assim que a busca retorna sua posição.
