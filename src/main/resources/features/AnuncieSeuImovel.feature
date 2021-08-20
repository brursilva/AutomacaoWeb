#language: pt

@AnuncieSeuImovel

Funcionalidade: AnuncieSeuImovel| Enviar Formulario

  Contexto:
    Dado acesso o Portal da Lopes

  Esquema do Cenário: Anuncie Seu Imovel | Enviar Formulario

    E clico no header Anuncie Seu Imovel
    E verifico que a URL é aberta "/paginas/anuncie-seu-imovel"
    E informo o nome "<Nome>" do Anunciante
    E preencho o Email "<Email>" do Anunciante
    E preencho o Telefone "<Telefone>" do Anunciante
    E clico na opção "<Opcao Imovel>"
    E informo o CEP "<CEP>"
    E informo o numero do endereco "<Num>"
    E informo o Bairro "<Bairro>"
    Quando informo o Estado "<Estado>"
    Entao clico no botao Enviar

    Exemplos:
      | Opcao Imovel |
      | Vender       |
      | Alugar       |

