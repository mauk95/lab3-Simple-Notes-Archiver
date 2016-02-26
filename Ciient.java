import java.io.BufferedReader;
import java.io.BufferedWriter;
import static java.io.FileDescriptor.out;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JOptionPane;

public class Ciient {
   // String serverAddress="localhost";
   public static void ClientFunc() throws IOException{
       Socket sender = null;
    try{
        sender = new Socket("localhost",1115);
     //    BufferedReader input = new BufferedReader(new InputStreamReader(sender.getInputStream()));

   // PrintWriter out = new PrintWriter(sender.getOutputStream(),true);
    String user="";
    Notes n=new Notes();
    n.username=JOptionPane.showInputDialog(user, "What's your username: ");
    n.notes=JOptionPane.showInputDialog(user, "What's your notes: ");
    
    try{
         FileOutputStream fileOut =
         new FileOutputStream("Notes.ser");
         ObjectOutputStream out1 = new ObjectOutputStream(fileOut);
         out1.writeObject(n);
         out1.close();
         fileOut.close();
}catch(IOException i){
          i.printStackTrace();
      }
   }

    
//    System.out.println("enter username: ");
 //   String serverMsg = input.readLine()+"|=>|";
 //   System.out.println("GoodBye Server");
 //   String line = "";
  //  line += input.readLine();

 //   JOptionPane.showMessageDialog(null,serverMsg);
    
    catch(Exception ex){
    System.out.println("error making client socket");
    }
    
   }

}
