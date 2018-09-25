// java imports for the Tumor Move class
import javax.swing.JOptionPane;// Swing JOptionPane import for use of JOptionPanes

/*
 * FILE : TumorMove.java 
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
The move of the tumor will be the TumorMove Class
*/
public class TumorMove {
 
   // the TumorMove1 () method will be used in order for the tumor to move 
    static void TumorMove1(){
       // if (NextMove.move==0&&MainGameFrame.list2.){
       if (NextMove.move==0&&MainGameFrame.getRed().getText().equals(MainGameFrame.getRed1())){
                   
                   MainGameFrame.getRed().setIcon(MainGameFrame.getImage());//setting red button to tumor icon
                   MainGameFrame.getRed().setText("Tumerized");// setting red button to tumor text
                   JOptionPane.showMessageDialog(null,"Your turn. Press play again !");//JOptionPane for user info
            
                  NextMove.move+=2;// incrementing the move so that the player can determine the next move
        } 
       else if (NextMove.move==0&&MainGameFrame.getWhite().getText().equals(MainGameFrame.getWhite1())){
                   JOptionPane.showMessageDialog(null,"Your turn. Press play again !");//JOptionPane for user info
                   MainGameFrame.getWhite().setIcon(MainGameFrame.getImage());// setting white button to tumor icon 
                   MainGameFrame.getWhite().setText("Tumerized");// setting white button to tumor text
           
           // decrementing the move so that the player can determine the next move
           NextMove.move+=1;// overloading operator
        }//of if else

    }//end  of TumorMove1() method
    
}// end of TumorMove class

