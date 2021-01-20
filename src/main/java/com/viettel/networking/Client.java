package com.viettel.networking;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Client using socket to send and receive message from Server
 *
 * @author HuanNT
 */
public class Client {
    public static final String SERVER_IP = "127.0.0.1";
    public static final int SERVER_PORT = 7;

    public static void main(String[] args) throws IOException {
        Socket socket = null;
        try {
            // create new socket
            socket = new Socket(SERVER_IP, SERVER_PORT);
            System.out.println("Connected: " + socket);

            OutputStream outputStream = socket.getOutputStream();
            InputStream inputStream = socket.getInputStream();

            // send 2 numbers to server
            outputStream.write(1);
            outputStream.write(2);

            // receive result from server
            int output = inputStream.read();
            System.out.println(output);

        } catch (Exception ex) {
            System.out.println("Error: "+ex.getMessage());
        } finally {
            if (socket != null) {
                socket.close();
            }
        }
    }
}
