
/*
 * FILE : NanoVirusSimulation.java 
 *
 * DATE: 24/09/2018
 *
 * AUTHOR: @author Angela
 *
 * PURPOSE: Simulation of a Nano Virus that kills all tumorus cells.
 *
 * VERSION : V1.0
 */

// Java Imports 
import java.awt.event.ActionEvent;// Abstract Window Toolkit import for use of Action Event Listener
import java.awt.event.ActionListener;// Abstract Window Toolkit import for use of Action Listener
import java.io.File;// Java import for input output file writes
import java.io.Serializable;// Import to input output object writes
import java.util.ArrayList; // Util import for use of Array list 
import java.util.Collections;// Util Collections import in order to shuffle list of array
import java.util.Random; // Util Random import for use of Randomizer of numbers
import javax.swing.ImageIcon;// Swing import for use of Image Icons
import javax.swing.JButton;// Swing import for use of JButtons
import javax.swing.JFrame;
import javax.swing.JOptionPane;// Swing JOptionPane import for use of JOptionPanes
import javax.swing.JTextField;
// class MainGameFrame 
public class MainGameFrame extends javax.swing.JFrame implements ActionListener , Serializable {
  // ArrayLists for cells  
 static ArrayList list = new ArrayList();
 //Buttons for the different cells
 private static JButton white;
 private static JButton red;
 private static JButton nano1;
 private static JButton tumor;
 // icons for the cells and game panel
 private static ImageIcon imgWhite;
 private static ImageIcon nano;
 private static ImageIcon nanoGif;
 private static ImageIcon image;
 private static ImageIcon replicate;
 private static ImageIcon imgRed;
 private static ImageIcon play;
 private static ImageIcon half;
 // random numebr generators
 static  Random randomGenerator = new Random();
static  long randomNumber = (randomGenerator.nextInt(5000) + 1);
 static Random rand = new Random();
// String declarations for the types of the celss
 private static String red1="red";
 private static String white1="white";
 private static String nano2="nano";
 private static String tumor1="tumor";
 // Cell container of Button array to hold all the cells
 private static JButton[] celContainer ;
 private static int[] randomNo ;
 private static ImageIcon imgJava;
 //constructor definition for the MainGameFrame
 public MainGameFrame() {
                // Variable initialization occurs within the constructor
                celContainer=new JButton[101]; // JButton array acts as a container for all Cells
                white = new JButton();// white button will hold white cells
                red = new JButton();// red button will hold red cells
                nano1 = new JButton();// nano1 button will hold nano cells
                tumor= new JButton();// tumor button will hold tumorous cells
                imgJava= new ImageIcon(this.getClass().getResource("JavaIcon.png"));// customized icon for the JFrame
                imgWhite=new ImageIcon(this.getClass().getResource("white.png"));//icon for the white blood cells
                replicate=new ImageIcon(this.getClass().getResource("replicate.png"));// icon for the replicated blood cells
                nano= new ImageIcon(this.getClass().getResource("nano.png"));// icon for the nano cells
                image = new ImageIcon(this.getClass().getResource("tumor.png"));// icon for the tumorous cells
                imgRed= new ImageIcon(this.getClass().getResource("red.png"));// icon for the red blood cells
                half=new ImageIcon(this.getClass().getResource("half.png"));// icon represents move 1 whereby the nano cell has not yet killed
                //the tumorous cell
                initComponents();// all the components within the GUI initialized
                PanelInitialization();// call for the panel Initialization method
                this.setSize(1800,1000);// setting the size of the JFrame
                this.setLocationRelativeTo(null);// Setting the location to null//meaning to the center of the screen
                this.setIconImage(imgJava.getImage());//create a customized Icon for the game
        
    }
/*
 @Comment: Below are all the Getter and Setter methods ( Accessors and Mutators ) for JButtons / JButton Text
 * , Text fields & Image Icons so that the other classes can directly access the fields. Other classes will use the
 * getter methods to get the information required to continue
 */
    public static JTextField getT3() {
        return t3;
    }

    public static JButton getWhite() {
        return white;
    }

    public static void setWhite(JButton white) {
        MainGameFrame.white = white;
    }

    public static JButton getRed() {
        return red;
    }

    public static void setRed(JButton red) {
        MainGameFrame.red = red;
    }

    public static JButton getNano1() {
        return nano1;
    }

    public static void setNano1(JButton nano1) {
        MainGameFrame.nano1 = nano1;
    }

    public static JButton getTumor() {
        return tumor;
    }

    public static void setTumor(JButton tumor) {
        MainGameFrame.tumor = tumor;
    }

    public static String getRed1() {
        return red1;
    }

    public static void setRed1(String red1) {
        MainGameFrame.red1 = red1;
    }

    public static String getWhite1() {
        return white1;
    }

    public static void setWhite1(String white1) {
        MainGameFrame.white1 = white1;
    }

    public static String getNano2() {
        return nano2;
    }

    public static void setNano2(String nano2) {
        MainGameFrame.nano2 = nano2;
    }

    public static String getTumor1() {
        return tumor1;
    }

    public static void setTumor1(String tumor1) {
        MainGameFrame.tumor1 = tumor1;
    }

    public static void setT3(JTextField t3) {
      MainGameFrame.t3 = t3;
    }

    public static  JTextField getT4() {
        return t4;
    }

    public static void setT4(JTextField t4) {
        MainGameFrame.t4 = t4;
    }

    public  static JTextField getT7() {
        return t7;
    }

    public static void setT7(JTextField t7) {
        MainGameFrame.t7 = t7;
    }

    public static JTextField getT8() {
        return t8;
    }

    public static void setT8(JTextField t8) {
        MainGameFrame.t8 = t8;
    }

    public static JTextField getTfTumorX()
            {
        return tfTumorX;
    }

    public static void setTfTumorX(JTextField tfTumorX) {
        MainGameFrame.tfTumorX = tfTumorX;
    }

    public static JTextField getTfTumorY() {
        return tfTumorY;
    }

    public static void setTfTumorY(JTextField tfTumorY) {
        MainGameFrame.tfTumorY = tfTumorY;
    }

    public static JTextField getTfTumorZ() {
        return tfTumorZ;
    }

    public static void setTfTumorZ(JTextField tfTumorZ) {
        MainGameFrame.tfTumorZ = tfTumorZ;
    }

    public static JTextField getT5() {
        return t5;
    }

    public static void setT5(JTextField tf5) {
        MainGameFrame.t5 = tf5;
    }
     public static ImageIcon getNano() {
        return nano;
    }

    public static ImageIcon getImage() {
        return image;
    }

    public static void setImage(ImageIcon image) {
        MainGameFrame.image = image;
    }

    public static void setNano(ImageIcon nano) {
        MainGameFrame.nano = nano;
    }

    public static ImageIcon getReplicate() {
        return replicate;
    }

    public static void setReplicate(ImageIcon replicate) {
        MainGameFrame.replicate = replicate;
    }

    public static ImageIcon getHalf() {
        return half;
    }

    public static void setHalf(ImageIcon half) {
        MainGameFrame.half = half;
    }
    
    /**
    * @ Comment: End of Getter and Setter Methods 
    *
    */
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        gameInitial = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton23 = new javax.swing.JButton();
        t3 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton106 = new javax.swing.JButton();
        downButton = new javax.swing.JButton();
        leftButton = new javax.swing.JButton();
        upButton = new javax.swing.JButton();
        rightButton = new javax.swing.JButton();
        t5 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        t7 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        tfTumorZ = new javax.swing.JTextField();
        tfTumorX = new javax.swing.JTextField();
        tfTumorY = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        t8 = new javax.swing.JTextField();
        HELP = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome to the Game");
        setSize(new java.awt.Dimension(800, 1000));
        getContentPane().setLayout(null);

        gameInitial.setBackground(new java.awt.Color(255, 255, 255));
        gameInitial.setLayout(new java.awt.GridLayout(15, 15, 10, 10));
        jScrollPane2.setViewportView(gameInitial);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(390, 0, 940, 650);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout2.png"))); // NOI18N
        jButton23.setToolTipText("Click here to Exit game!");
        jButton23.setContentAreaFilled(false);
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });
        jPanel1.add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 100, -1));

        t4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t4ActionPerformed(evt);
            }
        });
        jPanel1.add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 100, -1));

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Narkisim", 0, 14)); // NOI18N
        jLabel12.setText("Ticket No");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 195, 70, 0));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/type2.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 330, 280));

        jButton106.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nanos.gif"))); // NOI18N
        jButton106.setContentAreaFilled(false);
        jButton106.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton106ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton106, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 120, 130));

        downButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/down.png"))); // NOI18N
        downButton.setToolTipText("Finding direction");
        downButton.setContentAreaFilled(false);
        downButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downButtonActionPerformed(evt);
            }
        });
        jPanel1.add(downButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 50, 50));

        leftButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/left.png"))); // NOI18N
        leftButton.setToolTipText("Finding direction");
        leftButton.setContentAreaFilled(false);
        leftButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftButtonActionPerformed(evt);
            }
        });
        jPanel1.add(leftButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 50, 50));

        upButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/up.png"))); // NOI18N
        upButton.setToolTipText("Finding direction");
        upButton.setContentAreaFilled(false);
        upButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upButtonActionPerformed(evt);
            }
        });
        jPanel1.add(upButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 50, 50));

        rightButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/right.png"))); // NOI18N
        rightButton.setToolTipText("Finding direction");
        rightButton.setContentAreaFilled(false);
        rightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightButtonActionPerformed(evt);
            }
        });
        jPanel1.add(rightButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 50, 70));

        t5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t5ActionPerformed(evt);
            }
        });
        jPanel1.add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 100, -1));

        jLabel2.setText("[ X ]");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 20, -1));

        jLabel3.setText("[ Y ]");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 20, -1));

        jLabel4.setText("Co-ordinates Cell_2");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 120, -1));

        t7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t7ActionPerformed(evt);
            }
        });
        jPanel1.add(t7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 90, -1));

        jLabel7.setText("[ Z ]");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 20, -1));

        jLabel8.setText("[ DIRECTION ]");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 90, 20));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/play.png"))); // NOI18N
        jButton1.setToolTipText("Click to begin ");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 70, 60));

        jLabel5.setText("Co-ordinates Nano");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 110, -1));

        tfTumorZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTumorZActionPerformed(evt);
            }
        });
        jPanel1.add(tfTumorZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 90, -1));

        tfTumorX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTumorXActionPerformed(evt);
            }
        });
        jPanel1.add(tfTumorX, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 90, -1));

        tfTumorY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTumorYActionPerformed(evt);
            }
        });
        jPanel1.add(tfTumorY, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 90, -1));

        jLabel9.setText("[ ACTION ]");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 60, 20));
        jPanel1.add(t8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 100, -1));

        HELP.setBackground(new java.awt.Color(255, 255, 102));
        HELP.setText("HELP");
        HELP.setToolTipText("Click here for help contents!");
        HELP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HELPActionPerformed(evt);
            }
        });
        jPanel1.add(HELP, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, -1, -1));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 360, 680);

        getAccessibleContext().setAccessibleName("Nano Virus");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
       // The logoff exit button
        Object source = evt.getSource();
        
        if (source.equals(jButton23)){
            // close the system
            System.exit(0);
            // dispose the screen
            this.dispose();
        }// end if 
    }//GEN-LAST:event_jButton23ActionPerformed

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t3ActionPerformed

    private void t4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t4ActionPerformed

    }//GEN-LAST:event_t4ActionPerformed

    private void jButton106ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton106ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton106ActionPerformed

    private void downButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downButtonActionPerformed
// no actions for buttons just for look and feel    
    }//GEN-LAST:event_downButtonActionPerformed

    private void leftButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftButtonActionPerformed
  // no actions for buttons just for look and feel 
    }//GEN-LAST:event_leftButtonActionPerformed

    private void upButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upButtonActionPerformed
     // no actions for buttons just for look and feel 
    }//GEN-LAST:event_upButtonActionPerformed

    private void rightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightButtonActionPerformed
 // no actions for buttons just for look and feel     
    }//GEN-LAST:event_rightButtonActionPerformed

    private void t5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t5ActionPerformed

    private void t7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                  // setting the Action textfield to "PLAY!"
                  t7.setText("PLAY!");// 
                  // using the Action textfield in order to get the user move
                  //call the method from the Next Move class
                  NextMove.MoveCalculator();// call to NextMove Class method MoveCalculator
          if (t7.getText().equals("PLAY!")){
                     //call the method from the Next Move class
                     NextMove.Play();
                     File file = null;
                     NextMove.Move(file);
                     //call the method from the Tumor Move class
                     TumorMove.TumorMove1();
        }// end if
    }//GEN-LAST:event_jButton1ActionPerformed
//Text Fields below
    private void tfTumorZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTumorZActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTumorZActionPerformed

    private void tfTumorXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTumorXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTumorXActionPerformed

    private void tfTumorYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTumorYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTumorYActionPerformed

    private void HELPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HELPActionPerformed
                   help help = new help();//calling the help class 
                   help.setVisible(true);// setting the help frame to visible
                   help.pack();// packing the help class
                   help.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// when close is selected the help and close disappears
                   this.dispose();// the help frame disposable after close 
    }//GEN-LAST:event_HELPActionPerformed


    /**
     * Main method below
     * @param args
     */
    public static void main(String args[]) {
         
         
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainGameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                // adding Messages for the user to understand how the game works
                    nanoGif=new ImageIcon(this.getClass().getResource("nanos.gif"));
                    play =new ImageIcon(this.getClass().getResource("play.png"));
                     JOptionPane.showMessageDialog(
                        null,
                        " Let's Simulate!",
                        "Begin Simulation", JOptionPane.INFORMATION_MESSAGE,
                        nanoGif);
                        JOptionPane.showMessageDialog(
                        null,
                        " Find the Nano cell click on it and then click on the play button to begin .",
                        "Let's Simulate!", JOptionPane.INFORMATION_MESSAGE,
                        play);
                 // setting MainGameFrame to visible.                 
                 new MainGameFrame().setVisible(true);
                 
            }//end of run() method
        });// end of Runable method
    }// end of main method
   // method to set random Coords 
    public static void randomCoords(){
                           // variable for random number
                           Random randomize = new Random();
                           //variables for x , y and z
                           int  x= randomize.nextInt(5000) + 1;
                           int  y= randomize.nextInt(5000) + 1;
                           int  z= randomize.nextInt(5000) + 1;
                           // setting the fields of the random numbers above
                           tfTumorX.setText(Integer.toString(randomize.nextInt(x)));
                           tfTumorY.setText(Integer.toString(randomize.nextInt(y)));
                           tfTumorZ.setText(Integer.toString(randomize.nextInt(z)));
        
    }// end of randoCoords() method
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HELP;
    public static javax.swing.JButton downButton;
    public static javax.swing.JPanel gameInitial;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton106;
    private javax.swing.JButton jButton23;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JButton leftButton;
    public static javax.swing.JButton rightButton;
    private static javax.swing.JTextField t3;
    private static javax.swing.JTextField t4;
    private static javax.swing.JTextField t5;
    private static javax.swing.JTextField t7;
    private static javax.swing.JTextField t8;
    private static javax.swing.JTextField tfTumorX;
    private static javax.swing.JTextField tfTumorY;
    private static javax.swing.JTextField tfTumorZ;
    public static javax.swing.JButton upButton;
    // End of variables declaration//GEN-END:variables

    void PanelInitialization() {// private method to create the panel on which the cells are placed
          
          
 for(int x = 0; x < celContainer.length; x++)// for loop looping through celContainer
    {  
                     randomNo = new int[1];// random number array for the cell container 
         if (rand.nextDouble() < 0.25){// probability 25% white blood cells
 for(int i = 0; i < randomNo.length; i++){// for loop looping to place white cells

                    randomNo[i] = (int)(Math.random() * 5000)+1;
                    celContainer[x] = (white=new JButton(imgWhite));// white cell image placed at random on panel
                    white.setText("white");// white buttons settign text to Type white
                    white.addActionListener(this);// add an action listener to listen for which button was clicked
                    list.add(celContainer[x]);
       }// adding the cell container onto the array list
    }// end if
 }// end for
     for(int x = 0; x < celContainer.length; x++)
    {   
       if (rand.nextDouble() < 0.75){// probability 75% red blood cells
        for(int i = 0; i < randomNo.length; i++){// for loop looping to place red cells
                             
                    randomNo[i] = (int)(Math.random() * 5000)+1;
                    celContainer[x] = (red=new JButton(imgRed));
                    red.setText("red");// white buttons setting text to Type white
                    red.addActionListener(this);// add an action listener to listen for which button was clicked
                    list.add(celContainer[x]);// add the cell container 
         }// end for
       }// end if
    }// end for
      for(int x = 0; x < celContainer.length; x++)
    {   
if (rand.nextDouble() < 0.05){// probabilty for the tumor cell
for(int i = 0; i < randomNo.length; i++){// loop through random numbers 
            
                    randomNo[i] = (int)(Math.random() * 5000)+1;
                    celContainer[x] = (tumor=new JButton(image));// add the tumor button to the panel
                    tumor.setText(tumor1);// set the button tumor text
                    tumor.addActionListener(this);// add an action listener to the tumor buttons
                    list.add(celContainer[x]);// add the buttons to the cell container
            
             }// end for
         }// end if
}// end for
     for(int x = 0; x < celContainer.length; x++)
    {   // loop through the cell container
        if (rand.nextDouble() < 0.01){// Probability of nano cell occurance 
        for(int i = 0; i < randomNo.length; i++){// loop randomly 
                    randomNo[i] = (int)(Math.random() * 5000)+1;
                    celContainer[x] = (nano1=new JButton(nano));//add the nano virus cells
                    nano1.setText(nano2);// set the nano virus cells text
                    nano1.addActionListener(this);// add an action listener to the nano virus cells
                    list.add(celContainer[x]);// add the nano cell to the cell container
                        }// end for
         }// end if
    }//end for
    Collections.shuffle(list);// randomize the list of cells
    for(int x = 0; x < list.size(); x++)
    {
                      gameInitial.add((JButton)list.get(x));// add the buttons to the game panel 
      }// end for
   }// Panel method () end

    @Override// overide notation
    public void actionPerformed(ActionEvent e) {// action performed method for actions that may have occured within game panel
   
         if (tumor.getText().equals(tumor1)){

                   Random randomize = new Random();// randomize variable 
                   int  x= randomize.nextInt(5000) + 1;//x variable
                   int  y= randomize.nextInt(5000) + 1;// y variable
                   int  z= randomize.nextInt(5000) + 1;// z variable
                   t3.setText(Integer.toString(randomize.nextInt(x)));// set text of each variable
                   t5.setText(Integer.toString(randomize.nextInt(y)));
                   t4.setText(Integer.toString(randomize.nextInt(z)));
                   randomCoords();// get the randomize coOrds method 
         }// end if
         else if (white.getText().equals(white1)){
     
                   Random randomize = new Random();//randomize 
                   int  x= randomize.nextInt(5000) + 1;//x variable
                   int  y= randomize.nextInt(5000) + 1;// y variable
                   int  z= randomize.nextInt(5000) + 1;// z variable
                   t3.setText(Integer.toString(randomize.nextInt(x)));// set the text of each variable
                   t5.setText(Integer.toString(randomize.nextInt(y)));
                   t4.setText(Integer.toString(randomize.nextInt(z)));
                   randomCoords();// get randomize coOrds method
               }// end if else
            else if (red.getText().equals(red1)){
     
                   Random randomize = new Random();
                   int  x= randomize.nextInt(5000) + 1;//x variable
                   int  y= randomize.nextInt(5000) + 1;// y variable
                   int  z= randomize.nextInt(5000) + 1;// z variable
                   t3.setText(Integer.toString(randomize.nextInt(x)));// set the text for each variabel
                   t5.setText(Integer.toString(randomize.nextInt(y)));
                   t4.setText(Integer.toString(randomize.nextInt(z)));
                   randomCoords();// get method randomize coOrds method
               }// end if else
           }// end of action performed method
    }// end of Frame class


  

