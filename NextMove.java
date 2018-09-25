
/*
 * FILE : NextMove.java 
 *
 * DATE: 24/09/2018
 *
 * AUTHOR: @author Angela
 *
 * PURPOSE: Simulation of a Nano Virus that kills al tumorus cells.
 *
 * VERSION : V1.0
 */

// Java imports for the NextMove class
import java.io.File;
import javax.swing.ImageIcon;// swing import for the Image Icon use
import javax.swing.JButton; // swing import for teh JButton use
import javax.swing.JOptionPane; // swing import for the JOptionPane use.



/**
 *
 * @author angela
 */
// the NextMove class Represents the Nano Next Move
public class NextMove {
// variable declaration area 
static int move =1;// move variable to determine who is to move next Nano Virus or Tumorous cell
// Image Icons for the cells
static ImageIcon white;
static JButton white1;
static ImageIcon up;
static ImageIcon left;
static ImageIcon right;
static ImageIcon down;
static double direction;
// class next move constructor
    public NextMove(){
                  /*initialization of the Image Icons and buttons 
                  happen within the constructor*/
                  white=new ImageIcon(this.getClass().getResource("white.png"));
                  down=new ImageIcon(this.getClass().getResource("down.png"));
                  right=new ImageIcon(this.getClass().getResource("right.png"));
                  up=new ImageIcon(this.getClass().getResource("up.png"));
                  left=new ImageIcon(this.getClass().getResource("left.png"));
                  white1= new JButton(white);
    }// end method NextMove
 
    

public static void Play(){
                // remove all the Icons form up, down , left and right 
                 MainGameFrame.downButton.setIcon(up);
                 MainGameFrame.upButton.setIcon(down);
                 MainGameFrame.leftButton.setIcon(right);
                 MainGameFrame.rightButton.setIcon(left);


    
}// end of play method 
// method below will calculate the move to which the Nano cell determines to go
public static void MoveCalculator(){
                   // coords for the cells 1
                   int xTumor=Integer.parseInt(MainGameFrame.getTfTumorX().getText());
                   int yTumor=Integer.parseInt(MainGameFrame.getTfTumorY().getText());
                   int zTumor=Integer.parseInt(MainGameFrame.getTfTumorZ().getText());
                   // coords for the cells 2
                   int xNano=Integer.parseInt(MainGameFrame. getT3().getText());
                   int yNano=Integer.parseInt(MainGameFrame. getT5().getText());
                   int zNano=Integer.parseInt(MainGameFrame. getT4().getText());
                   // calculating the distance to next cell
                   direction =Math.round(Math.sqrt( Math.pow(xNano-xTumor,2)+Math.pow(yNano-yTumor,2)+Math.pow(zNano-zTumor,2)));
                   //making the direction an integer
                   int d1= (int)direction;
                   //making the direction a readable string value
                   String d= Integer.toString(d1);
                   //seting the Textfield for direction to the string value 
                   MainGameFrame.getT8().setText(d);

}// end MoveCalculator() method
public static void Move(File file){

if (MainGameFrame.getT7().getText().equals("PLAY!")){
   if(move==1&&direction<5000){
                        JOptionPane.showMessageDialog(null,"First Move!"); 
                        String unitsMove;
                        unitsMove = JOptionPane.showInputDialog(null,"How many units do you want to move ? 250 or 1800 or 2000");
                        int units=Integer.parseInt(unitsMove);
       if (units==250&&MainGameFrame.getNano1().getText().equals(MainGameFrame.getNano2())){
          
                         MainGameFrame.getTumor().setIcon(MainGameFrame.getHalf());
                         MainGameFrame.getTumor().setText("Nano_Virus/Tumor");
                         // decrementing the move so that the tumor/computer can play next
                         move=0;// move set to 0 for tumor to take a turn
                         JOptionPane.showMessageDialog(null,"Wait till next round to KILL");// JOption Message for user information
    
            }//end  if 
    else if (units==1800&&MainGameFrame.getNano1().getText().equals(MainGameFrame.getNano2())&&MainGameFrame. getT3().getText().equals
                        (MainGameFrame. getT3().getText())&&MainGameFrame. getT5().getText().equals
                        (MainGameFrame. getT5().getText())&&MainGameFrame. getT4().getText().equals
                        (MainGameFrame. getT4().getText())){
                         MainGameFrame.getTumor().setText("Nano_Virus/Tumor");
                         MainGameFrame.getTumor().setIcon(MainGameFrame.getHalf());
                         JOptionPane.showMessageDialog(null,"Wait until next round to KILL");// JOption Message for user information

                         move=0;// move set to 0 for tumor to take a turn
     
    }// end else if 
    else if (units==2000&&MainGameFrame.getNano1().getText().equals(MainGameFrame.getNano2())){
                        JOptionPane.showMessageDialog(null,"Moving up!");// JOption Message for user information
        if (MainGameFrame.getTumor().getText().equals(MainGameFrame.getTumor1())){
                        MainGameFrame.getTumor().setText("Nano_Virus/Tumor");
                        MainGameFrame.getTumor().setIcon(MainGameFrame.getHalf());
                        JOptionPane.showMessageDialog(null,"Cant Kill now wait until next Round!");
                        move=0;//move set to 0 for tumor to take a turn
        }// end  if 
        
     }// end else if 
    }// end move 1() method
    
    }if (move==2){// second move 
                            String unitsMove;
                            JOptionPane.showMessageDialog(null,"Second Move: You can KILL now: 250 units to kill");//JOption message for user information
                            unitsMove = JOptionPane.showInputDialog(null,"How many units ?250 or 1800 or 2000");//JOption message for user information
                            int units=Integer.parseInt(unitsMove);// get units to move from user and parse to int for use
        if (units==250&&MainGameFrame.getTumor().getText().equals("Nano_Virus/Tumor")){
                            MainGameFrame.getTumor().setIcon(MainGameFrame.getNano());// setting icons
                            MainGameFrame.getTumor().setText("New Nano_Virus");
                            JOptionPane.showMessageDialog(null," Killed !!!");// user display message
        if (MainGameFrame.getRed().getText().equals("Tumerized")){
                            MainGameFrame.getRed().setText("replicate");// set red button text to new text
                            MainGameFrame.getRed().setIcon(MainGameFrame.getReplicate());// set red to new image
        if(MainGameFrame.getRed().getText().equals("New Nano_Virus")){
                            JOptionPane.showMessageDialog(null,"More Nano viruses!"+"Nano Wins");
                            System.exit(0);// close program Nano wins
                    
                }// end if
            }//end if
                            move=0;//move set to 0 for tumor to take a turn
                            JOptionPane.showConfirmDialog(null,"Saving State!");// JOption message for user information
                           // GameStateSave.stateSave(file);   
    }
        else if (units==1800&&MainGameFrame.getNano1().getText().equals(MainGameFrame.getNano2())){
                            JOptionPane.showMessageDialog(null," Killed !!!");
                            MainGameFrame.getTumor().setIcon(MainGameFrame.getNano());
                            MainGameFrame.getTumor().setText("Nano_Virus");
                            MainGameFrame.getNano1().setText("Replicate");// setting text
                            MainGameFrame.getNano1().setIcon(MainGameFrame.getReplicate());// setting icons
                            move=0;//move set to 0 for tumor to take a turn
                            JOptionPane.showConfirmDialog(null,"Saving State!");// JOption message for user information
               if (MainGameFrame.getRed().getText().equals("Tumerized")){
                            MainGameFrame.getRed().setText("replicate");
                            MainGameFrame.getRed().setIcon(MainGameFrame.getReplicate());
                 if(MainGameFrame.getTumor().getText().equals("Nano_Virus")){
                            JOptionPane.showMessageDialog(null,"More Nano viruses!"+"Nano Wins");// user display message
                            System.exit(0);// close program Nano wins
                }// end if
            }//if 
                           // GameStateSave.stateSave(file);
    }// end if else
        else if (units==2000&&MainGameFrame.getNano1().getText().equals(MainGameFrame.getNano2())){
                         JOptionPane.showMessageDialog(null,"Moving up!");//JOption message for user information
        if (MainGameFrame.getTumor().getText().equals(MainGameFrame.getTumor1())){
                         MainGameFrame.getTumor().setText("Nano_Virus/Tumor");
                         MainGameFrame.getTumor().setIcon(MainGameFrame.getHalf());// set tumor button to half icon / half meaning wait for next turn to kill
                         JOptionPane.showMessageDialog(null,"Cant Kill now wait until next Round!");//JOption message for user information
                        move=0;// move to 0 for tumor turn
            if (MainGameFrame.getRed().getText().equals("Tumerized")){
                         MainGameFrame.getRed().setText("replicate");// set red button text to repicate text
                         MainGameFrame.getRed().setIcon(MainGameFrame.getReplicate());// set red icon to replicate image
               if(MainGameFrame.getTumor().getText().equals("Nano_Virus/Tumor")){
                         JOptionPane.showMessageDialog(null,"More Tumors !"+"Tumor Wins");// user display message
                         System.exit(0);// close program tumor wins
                }//end if
            }// end if 
                           // GameStateSave.stateSave(file);
        }// end if  
     } // end else if 
   }// end move 2
 }// end move method

}// end next move class


