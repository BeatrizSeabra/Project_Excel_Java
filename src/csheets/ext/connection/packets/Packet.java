/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csheets.ext.connection.packets;

import csheets.ext.connection.Connection;

/**
 *
 * @author 1120588
 * @author 1121228
 * @author 1110506
 * 
 */
public abstract class Packet {

    public abstract void writeData(Connection connection);

    public abstract byte[] getData();

    public abstract Object readData(byte[] data);

}
