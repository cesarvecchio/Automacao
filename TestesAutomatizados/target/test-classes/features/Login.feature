#language: pt
#encoding: UTF-8

@login
Funcionalidade: Login

  Cenario: usuario invalido
    Quando eu informar o usuario "Ad"
    E informar senha "asd"
    E clicar no botao login
    Entao o sistema exibe a mensagem de usuario invalido

	@loginSucesso
  Cenario: Realizar login
    Quando eu informar o usuario "Admin"
    E informar senha "admin123"
    E clicar no botao login
    Entao o sistema exibe a mensagem de usuario logado
