package csheets.ext.share;

import java.io.Serializable;

/**
 * Classe utilizada para encriptar tipo de dados transferido entre sockets.
 *
 * @author Rui 1110506
 */
class ByteObject implements Serializable {

    public byte[] bytes;

    /**
     * Cria uma nova instacia do objecto ByteObject
     */
    public ByteObject(byte[] bytes) {
        this.bytes = bytes;
    }
}
