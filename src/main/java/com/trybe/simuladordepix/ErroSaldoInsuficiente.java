package com.trybe.simuladordepix;

/**Classe ErroSaldoInsuficiente que estende Classe abstrata ErroDePix. */
public class ErroSaldoInsuficiente  extends ErroDePix {
  private static final long serialVersionUID = 1L;

  public ErroSaldoInsuficiente() {
    super(Mensagens.SALDO_INSUFICIENTE);
  }
}
