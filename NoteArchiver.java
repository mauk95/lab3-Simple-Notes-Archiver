package notearchiveserver;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maukhan.bscs13seecs
 */
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import static java.io.FileDescriptor.out;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import static java.lang.System.in;
import static java.lang.System.out;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JOptionPane;
import notearchiveserver.Notes;


public class NoteArchiver {
    @SuppressWarnings("null")
    public static void serve() throws IOException
    {
             
    ServerSocket listener = null;
    try{
        System.out.println("hello");
        listener = new ServerSocket(1115);
        while(true){
            System.out.println("hello1");
            Socket socket = listener.accept();
                    Notes n = null;
                    
      try{
                   FileOutputStream fileOut =
         new FileOutputStream("Notes.ser");
         FileInputStream fileIn = new FileInputStream("Notes.ser");
         ObjectInputStream in = new ObjectInputStream(fileIn);
         n = (Notes) in.readObject();
         in.close();
         fileIn.close();
         }catch(IOException i){
         i.printStackTrace();
         return;
      }catch(ClassNotFoundException c)
      {
         System.out.println("Employee class not found");
         c.printStackTrace();
         return;
      }
      System.out.println("Deserialized Employee...");
      System.out.println("userName: " + n.username);
      System.out.println("notes: " + n.notes);



  /*                      String clientMsg="";
                        PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
                        BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                        System.out.println("Welcome to the Server");
                        clientMsg = input.readLine()+"|=>|";
                        System.out.println("GoodBye Client");
                        clientMsg += input.readLine();
                        System.out.println("client says:"+clientMsg);
                    
    */               
                   // finally{
                    socket.close();
                    //}
            }
    }
    catch(Exception ex){
        System.out.println("error maing socket in server");
    }
    
    finally{
        listener.close();
    }

    }


}
