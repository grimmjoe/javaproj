package com.hamo.test.java.core.network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Created by hamleta on 2/28/2017.
 */
public class NetworkingInJavaTest {
    public static void main(String[] args) {
        testInetAddress();

        testSocketReadWrite();
    }

    private static void testSocketReadWrite() {

        System.out.println("Socket ReadWrite: START");
        try (Socket socket = new Socket("whois.internic.net", 43)) {
            OutputStream outputStream = socket.getOutputStream();
            String request = "MHProfessional.com\n";

            outputStream.write(request.getBytes());
            InputStream inputStream = socket.getInputStream();

            int c;
            while ((c = inputStream.read()) != -1) {
                System.out.print((char) c);
            }
        }
        catch (IOException ex)
        {
            System.out.println("Error: " + ex.getMessage());
        }
        finally {
            System.out.println("Socket ReadWrite: DONE");
        }
    }

    private static void testInetAddress() {
        System.out.println("Test: InetAddress - START");
        try {
            InetAddress address = InetAddress.getLocalHost();
            System.out.println("Local Host: " + address);

            address = InetAddress.getByName("www.energizeglobal.com");
            System.out.println("Energize: " + address);

            InetAddress addresses[] = InetAddress.getAllByName("www.google.com");
            for (InetAddress add: addresses) {
                System.out.println("Google: " + add);
            }

            address = InetAddress.getByName("www.bfjsdsdjdflkjfldjf.com");
        } catch (UnknownHostException ex)
        {
            System.out.println("Error: " + ex.getMessage());
        }
        finally {
            System.out.println("Test: InetAddress - DONE");
        }
    }
}
