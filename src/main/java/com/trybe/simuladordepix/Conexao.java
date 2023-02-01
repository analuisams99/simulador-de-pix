package com.trybe.simuladordepix;

import java.io.Closeable;
import java.io.IOException;

/**Interface Conexao que estende Closeable. */
public interface Conexao extends Closeable {

  String enviarPix(int valor, String chave) throws IOException;
}
