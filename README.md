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

### Front - Detalhes de Divida - http://localhost:8080/{$id}

- Nesta tela tem os detalhes da divida e opção de inserir devedores.

<img src="https://github.com/marciliodev/pagdevapp/blob/master/img/03.png?raw=true">

### Front - Dados da Divida - http://localhost:8080/pagarDivida?idDivida={$id}

- Nesta tela é para realizar o pagamento de uma divida.

<img src="https://github.com/marciliodev/pagdevapp/blob/master/img/04.png?raw=true">









