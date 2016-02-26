/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notearchiveserver;
import java.io.IOException;
import notearchiveserver.NoteArchiver;
import notearchiveserver.Notes;
/**
 *
 * @author maukhan.bscs13seecs
 */
public class ServiceHandler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       NoteArchiver.serve();
    }
    
}
