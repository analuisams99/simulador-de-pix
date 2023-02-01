package com.trybe.simuladordepix;

/**Classe ErroChaveEmBranco que estende Classe abstrata ErroDePix. */
public class ErroChaveEmBranco  extends ErroDePix {
  private static final long serialVersionUID = 1L;

  public ErroChaveEmBranco() {
    super(Mensagens.CHAVE_EM_BRANCO);
  }

}
