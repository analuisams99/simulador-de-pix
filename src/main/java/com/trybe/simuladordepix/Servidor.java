package com.trybe.simuladordepix;

import java.io.IOException;

/**Interface Servidor. */
public interface Servidor {

  Conexao abrirConexao() throws IOException;
}
