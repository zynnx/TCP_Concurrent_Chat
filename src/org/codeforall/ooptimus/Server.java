package org.codeforall.ooptimus;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
    int portNumber = 8002;
        try {
           ServerSocket socket  = new ServerSocket(portNumber);
            Socket socketClient = socket.accept();
            while (true) {
                PrintWriter output = new PrintWriter(socketClient.getOutputStream(), true);
                BufferedReader input = new BufferedReader(new InputStreamReader(socketClient.getInputStream()));

                String out = input.readLine();
                System.out.println(out);
                //output.println(out.toUpperCase());
                Scanner text = new Scanner(System.in);
                System.out.println("What did you make?");
                output.println(text.next());

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}