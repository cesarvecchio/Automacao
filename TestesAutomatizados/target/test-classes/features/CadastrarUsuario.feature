#language: pt
#encoding: UTF-8

@CadastrarUsuario
Funcionalidade: Cadastrar usuario

	@cadastro
  Cenario: cadastrar usuario
    Quando eu acionar a aba admin
    E acionar o botao add
    E informar o campo employer name "Fiona Grace"
    E informar o campo employer username "Pablo"
    E informar o campo employer password "12345678"
    E informar o campo employer confirmar password "12345678"
    E acionar o botao salvar
    Entao o sistema cadastra o usuario "Pablo"

