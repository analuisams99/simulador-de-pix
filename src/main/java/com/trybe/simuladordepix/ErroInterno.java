package com.trybe.simuladordepix;

/**Classe ErroInterno que estende Classe abstrata ErroDePix. */
public class ErroInterno  extends ErroDePix {
  private static final long serialVersionUID = 1L;

  public ErroInterno() {
    super(Mensagens.ERRO_INTERNO);
  }
}
