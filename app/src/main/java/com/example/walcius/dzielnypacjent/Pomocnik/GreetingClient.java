package com.example.walcius.dzielnypacjent.Pomocnik;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * Created by Walcius on 2016-04-19.
 */
public class GreetingClient {
    public static String Comunication;
    //static String IP="192.168.43.133";
    static String IP="157.158.207.159";
    static int port = Integer.parseInt("6066");

    public static void Loguj(String login, String haslo) {

        final String l=login;
        final String h=haslo;

        new Thread() {
            public void run() {

                //String serverName = "localhost";

                try {
                    Socket client = new Socket(InetAddress.getByName(IP), port);
                    OutputStream outToServer = client.getOutputStream();
                    DataOutputStream out =new DataOutputStream(outToServer);

                    out.writeUTF("Log in patient");
                    InputStream inFromServer = client.getInputStream();
                    DataInputStream in =new DataInputStream(inFromServer);
                    if(in.readUTF().equals("ok"))
                    {
                        out.writeUTF(l+" "+h);
                        if(in.readUTF().equals("ok"))
                        {
                            Comunication="ok";
                        }
                        else
                        {
                            Comunication="nieok";
                        }
                    }
                    else
                    {
                        Comunication=Comunication+ "Server says " + in.readUTF();
                    }
                    client.close();

                }
                catch (IOException e)
                {
                    Comunication="zepsute";
                    e.printStackTrace();
                }

            }
        }.start();

    }


    public static void ZmienHaslo(final String login, final String haslo, final String noweHaslo) {

        new Thread() {
            public void run() {

                //String serverName = "localhost";
                try {
                    Socket client = new Socket(InetAddress.getByName(IP), port);
                    //Socket client = new Socket(InetAddress.getByName("157.158.188.72"), port);
                    // Socket client = new Socket(InetAddress.getByName("192.168.1.100"), port);
                    OutputStream outToServer = client.getOutputStream();
                    DataOutputStream out =new DataOutputStream(outToServer);

                    out.writeUTF("Change password");
                    InputStream inFromServer = client.getInputStream();
                    DataInputStream in =new DataInputStream(inFromServer);
                    if(in.readUTF().equals("ok"))
                    {
                        out.writeUTF(login+" "+haslo+" "+noweHaslo);
                        if(in.readUTF().equals("ok"))
                        {
                            Comunication="ok";
                        }
                        else
                        {
                            Comunication="nieok";
                        }
                    }
                    else
                    {
                        Comunication=Comunication+ "Server says " + in.readUTF();
                    }
                    client.close();

                }
                catch (IOException e)
                {
                    Comunication="zepsute";
                    e.printStackTrace();
                }

            }
        }.start();

    }
}
