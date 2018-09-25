
import java.awt.HeadlessException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

/*
 * FILE : GameStateSave.java 
 *
 * DATE: 24/09/2018
 *
 * AUTHOR: @author Angela
 *
 * PURPOSE: Simulation of a Nano Virus that kills al tumorus cells.
 *
 * VERSION : V1.0
 */

/*

/**
 *
 * @author angela
 */
public class GameStateSave {
    static FileOutputStream openStream;// variables to open the data stream
    static ObjectOutputStream object2Write;// variables for the object to write
    public GameStateSave(){
        
    }
    public static void stateSave(File file) {   

    try {   // try method for exception handling 
        MainGameFrame simulation = new MainGameFrame();// the new MainGameFrame object 
        object2Write = new ObjectOutputStream(openStream);   // open teh data stream for object to be wirtten
        openStream = new FileOutputStream(file); // file parameter 
        object2Write.writeObject(simulation);   // object to be written MainGameFrame   
        object2Write.close();   // close the write
        openStream.close();   // close the data stream
        JOptionPane.showConfirmDialog(null,"State saved!");// User information message
          
    }// end of try 
    catch (IOException | HeadlessException e) {   // catch exception for exception handling
        JOptionPane.showConfirmDialog(null,e.toString() );  // User information message
    }// end of catch    
}  // end of method 
}// end of class
