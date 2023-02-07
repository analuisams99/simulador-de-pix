# Simulador de Pix (tratamento de erros)

    Este projeto foi realizado com o objetivo de aprimorar o conhecimento na linguagem Java.

## :zap: Descrição
  Neste projeto, simulei um processo de transferência bancária via Pix, realizada por meio de um aplicativo mobile.
  
  O processo foi muito simples: a pessoa usuária do aplicativo preenche um valor e uma chave Pix e o aplicativo envia essas informações para o servidor do banco na nuvem. 
  
  - O objetivo foi **tratar os erros que podem acontecer** ao longo desta operação.

### :memo: Foram escritos dois componentes em Java:
  :pushpin: 1. **Processador de Pix:** é o componente que contém a lógica de negócio da operação. 
   
   Dadas as entradas (valor e chave Pix), o processador de Pix foi responsável por validá-las e enviá-las ao servidor na nuvem, interpretando a resposta recebida.
   
   - O processador de Pix interagiu com outros dois componentes que foram implementados pela Trybe:
     1. **Conexão:** representa um canal de comunicação entre o aplicativo mobile e o servidor na nuvem. O processador de Pix usou uma conexão para enviar os dados de entrada (valor e chave Pix).
     2. **Servidor:** é o componente que foi utilizado pelo processador de Pix para abrir uma nova conexão com o servidor na nuvem.


  :pushpin: 2. **Controlador de Pix:** é o componente que contém a lógica de apresentação deste fluxo.
   - Ele foi responsável por invocar o processador de Pix, passando as informações preenchidas pela pessoa usuária na tela do aplicativo. 
   - Também foi responsabilidade do componente capturar qualquer erro que possa acontecer durante o processo e informar a pessoa usuária sobre o resultado da operação.


### Tratamento de erros

  Durante a operação do Pix, ocorreram uma série de erros:

:pushpin: - Erros de aplicação validados localmente
    - Valor a ser transferido menor ou igual a zero
    - Chave Pix em branco

:pushpin: - Erros de aplicação validados pelo servidor
    - Saldo insuficiente
    - Chave Pix não encontrada
    - Erro interno (por exemplo, falha no servidor)

:pushpin: - Erros de comunicação (por exemplo, timeout de conexão)

:pushpin: Quanto aos erros da aplicação, não existem exceções que os representem na biblioteca padrão. Por isso foram criados _exceções customizadas_. 



## Instalação do projeto em sua máquina
  1. Clone o repositório
   
     `git@github.com:analuisams99/simulador-de-pix.git`
    
  2. Entre no diretório do repositório que você acabou de clonar:
  
     `cd simulador-de-pix`

  3. Instale as dependências:
    
     `mvn install`

## Para testar o projeto
  1. digite o comando no seu terminal
      
      `mvn test`
      
    Os códigos de testes, da pasta src/test/java/com/trybe/acc/java/simuladordepix, foram desenvolvidos pela Trybe.
    
---

-- Projeto desenvolvido por Ana Luisa Marques Simões, para fins didáticos. 2023
