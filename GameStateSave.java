
import java.awt.HeadlessException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author angela
 */
public class GameStateSave {
    static FileOutputStream openStream;
    static ObjectOutputStream object2Write;
    public GameStateSave(){
        
    }
    public static void stateSave(File file) {   

    try {   
        MainGameFrame simulation = new MainGameFrame();
        object2Write = new ObjectOutputStream(openStream);   
        openStream = new FileOutputStream(file); 
        object2Write.writeObject(simulation);      
        object2Write.close();   
        openStream.close();   
        JOptionPane.showConfirmDialog(null,"State saved!");
          
    } catch (IOException | HeadlessException e) {   
        JOptionPane.showConfirmDialog(null,e.toString() );  
    }   
}   
}
