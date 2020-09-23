# Projeto API REST PAGDEVAPP 

## Descrição do Projeto
<p align="justify"> Este projeto tem por objetivo servir como apoio no cadastro de dividas e gerar cobranças para os devedores.</p>

![Badge](https://img.shields.io/static/v1?label=java&message=spring-boot&color=blue&style=for-the-badge&logo=JAVA)

### Funcionalidades atuais :checkered_flag:

- [X] Cadastrar divida :trophy:
- [X] Cadastrar devedores :trophy:
- [X] Listar dividas :trophy:
- [X] Listar divida por id :trophy:
- [X] Listar devedores por divida :trophy:
- [X] Excluir divida :trophy:
- [X] Excluir devedor :trophy:
- [ ] Pagar divida
- [ ] Pagar lista divida
- [ ] Gerar cobranças automáticas
- [ ] Validar entradas por tipo de dado
- [ ] Documentar swagger
- [ ] Integrar microserviço para divida
- [ ] Integrar microserviço para devedores
- [ ] Criar testes unitários

> Status do Projeto: Em desenvolvimento :warning:


### Front - Index do projeto - http://localhost:8080/dividas

- Nesta tela tem opções de cadastrar divida, detalhes da divida, pagar divida e excluir divida.

<img src="https://github.com/marciliodev/pagdevapp/blob/master/img/01.png?raw=true">

### Front - Cadastro de Divida - http://localhost:8080/cadastrarDivida

- Nesta tela tem opções de salvar a divida com seus parâmetros.

<img src="https://github.com/marciliodev/pagdevapp/blob/master/img/02.png?raw=true">

### Front - Detalhes de Divida - http://localhost:8080/{id}

- Nesta tela tem os detalhes da divida e opção de inserir devedores.

<img src="https://github.com/marciliodev/pagdevapp/blob/master/img/03.png?raw=true">

### Front - Dados da Divida - http://localhost:8080/pagarDivida?idDivida={id}

- Nesta tela é para realizar o pagamento de uma divida.

<img src="https://github.com/marciliodev/pagdevapp/blob/master/img/04.png?raw=true">

## Banco de Dados :books:

- Banco de dados utilizado - Mysql
- Nome do banco: pagdevapp
- Usuário: root
- Senha: marcilio

### Documentação Swagger - Em desenvolvimento :warning:

### Endpoints - Back - GET(Lista de Divida) - http://localhost:8080/api/dividas

- Deve-se definir como parâmetro no Headers o Content-Type com value application/json.
- Neste endpoint aparece a lista das dividas do sistema.
- Uma melhoria futura será exibir a lista de devedores vinculados a divida, igual ao front. :warning:

<img src="https://github.com/marciliodev/pagdevapp/blob/master/img/05.png?raw=true">

### Endpoints - Back - GET(Divida Por ID) - http://localhost:8080/api/divida/{id}

- Deve-se definir como parâmetro no Headers o Content-Type com value application/json.
- Neste endpoint aparece a divida específica por id.
- Uma melhoria futura será exibir a lista de devedores vinculados a divida, igual ao front. :warning:

<img src="https://github.com/marciliodev/pagdevapp/blob/master/img/06.png?raw=true">

### Endpoints - Back - POST(Salvar Divida) - http://localhost:8080/api/divida

- Deve-se definir como parâmetro no Headers o Content-Type com value application/json.
- Este endpoint serve para cadastrar uma divida.
- Utilizar o Body com opção raw e inserir os dados conforme ilustração.
- Não precisa inserir o idDivida, pois, a entidade já possui auto incremento no identificador.
- Uma melhoria futura será cadastrar uma lista de devedores vinculados a divida, igual ao front. :warning:

<img src="https://github.com/marciliodev/pagdevapp/blob/master/img/07.png?raw=true">

### Endpoints - Back - DELETE(Deletar Divida) - http://localhost:8080/api/divida

- Deve-se definir como parâmetro no Headers o Content-Type com value application/json.
- Este endpoint serve para deletar uma divida.
- Utilizar o Body com opção raw e inserir os dados conforme ilustração.

<img src="https://github.com/marciliodev/pagdevapp/blob/master/img/08.png?raw=true">

### Endpoints - Back - PUT(Atualizar Divida) - http://localhost:8080/api/divida

- Deve-se definir como parâmetro no Headers o Content-Type com value application/json.
- Este endpoint serve para atualizar uma divida.
- Utilizar o Body com opção raw e inserir os dados conforme ilustração.
- Ao atualizar o idDivida deve ser informado para localizar o id no banco que deseja ser atualizado.

<img src="https://github.com/marciliodev/pagdevapp/blob/master/img/09.png?raw=true">

### Endpoints - Back - GET(Lista de Devedores) - http://localhost:8080/api/devedores - Em Desenvolvimento :warning:

### Endpoints - Back - GET(Listar Devedor por Divida) - http://localhost:8080/api/devedor/{idDivida} - Em Desenvolvimento :warning:

### Endpoints - Back - POST(Salvar Devedor) - http://localhost:8080/api/devedor - Em Desenvolvimento :warning:

### Endpoints - Back - POST(Salvar Lista de Devedor por Divida) - http://localhost:8080/api/devedores/{idDivida} - Em Desenvolvimento :warning:

### Endpoints - Back - DELETE(Deletar Devedor) - http://localhost:8080/api/devedor - Em Desenvolvimento :warning:

### Endpoints - Back - PUT(Atualizar Devedor) - http://localhost:8080/api/devedor - Em Desenvolvimento :warning:

### Estratégias e Metódologias :checkered_flag:

- SCRUM :trophy: https://trello.com/b/NE5TmV6c/pagdev
- KABAN :trophy:
- #VAIQUEDACONFIA :trophy:

### Marcílio Aguiar - 23/09/2020 (Atualização do documento)
