package org.codeforall.ooptimus;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        String host = "localHost";
        int portNumber = 8002;

        try {
            Socket socketClient = new Socket(host, portNumber);
            PrintWriter output = new PrintWriter(socketClient.getOutputStream(), true);
            while(true) {
                BufferedReader input = new BufferedReader(new InputStreamReader(socketClient.getInputStream()));
                Scanner text = new Scanner(System.in);
                System.out.println("What did you want?");
                output.println(text.next());
                //output.println(input);

                System.out.println(input.readLine());

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
