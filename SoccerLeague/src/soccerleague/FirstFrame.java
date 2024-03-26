/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package soccerleague;
import java.util.Comparator;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel Vargas
 */

public class FirstFrame extends javax.swing.JFrame {

    /**
     * Creates new form FirstFrame
     */
    public FirstFrame() {
        initComponents();      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        autoGameBtn = new javax.swing.JButton();
        ManualGameBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setText("COLOMBIAN SOCCER LEAGUE");

        autoGameBtn.setText("Auto Game");
        autoGameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autoGameBtnActionPerformed(evt);
            }
        });

        ManualGameBtn.setText("Manual Game");
        ManualGameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManualGameBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(autoGameBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ManualGameBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(autoGameBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(ManualGameBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(73, 73, 73))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
//----------------------Buttom Events----------------------------------------
    
    
    private void autoGameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autoGameBtnActionPerformed
        //Buttom AutoGame Event
           
        SoccerTeam team1 = new SoccerTeam("Alianza FC");
        SoccerTeam team2 = new SoccerTeam("America de Cali");
        SoccerTeam team3 = new SoccerTeam("Atletico Bucaramanga");
        SoccerTeam team4 = new SoccerTeam("Chico");
        SoccerTeam team5 = new SoccerTeam("Deportivo Pereira");
        SoccerTeam team6 = new SoccerTeam("Envigado");
        SoccerTeam team7 = new SoccerTeam("Fortaleza");
        SoccerTeam team8 = new SoccerTeam("Jaguares FC");
        SoccerTeam team9 = new SoccerTeam("Junior");
        SoccerTeam team10 = new SoccerTeam("La Equidad");
        SoccerTeam team11 = new SoccerTeam("Medellin");
        SoccerTeam team12 = new SoccerTeam("Millonarios");
        SoccerTeam team13 = new SoccerTeam("Nacional");
        SoccerTeam team14 = new SoccerTeam("Once Caldas");
        SoccerTeam team15 = new SoccerTeam("Pasto");
        SoccerTeam team16 = new SoccerTeam("Patriotas");
        SoccerTeam team17 = new SoccerTeam("Rionegro");
        SoccerTeam team18 = new SoccerTeam("Santa Fe");
        SoccerTeam team19 = new SoccerTeam("Tolima");
        SoccerTeam team20 = new SoccerTeam("Deportivo Cali");
        
            //List with every team
        SoccerTeam list1 [] = {team1,team2,team3,team4,team5,team6,team7,team8,team9,team10,team11,team12,team13,team14,team15,team16,team17,team18,team19,team20};
         SoccerTeam list2 [] = {team1,team2,team3,team4,team5,team6,team7,team8,team9,team10,team11,team12,team13,team14,team15,team16,team17,team18,team19,team20};
        
        for (int i =0; i<20;i++){
        for (int j=0;j<20;j++){          
            if(list1[i].getPlayedTeams().contains(list2[j])==false && list1[i]!=list2[j]){  //one team cannot play with other team again               
                SoccerTeam.playMatch(list1[i],list2[j]);                            
            }                  
          }     
        }
        
      //  Sorting list1 for the positions depending the points
        Comparator<SoccerTeam> comparador = (p1, p2) -> Integer.compare(p2.getPoints(), p1.getPoints());     
        Arrays.sort(list1, comparador);
          
          
        for(SoccerTeam variable : list1){
            System.out.println(variable.getName());
        }
        
       TableFrame form2 = new TableFrame(); 
        form2.setDato(list1);
        form2.setVisible(true);                 //Open the other jframe

    //End AUTO BUTTOM EVENT
    }//GEN-LAST:event_autoGameBtnActionPerformed

    private void ManualGameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManualGameBtnActionPerformed
        //Manual Game buttom event
          SoccerTeam team1 = new SoccerTeam("Alianza FC");
        SoccerTeam team2 = new SoccerTeam("America de Cali");
        SoccerTeam team3 = new SoccerTeam("Atletico Bucaramanga");
        SoccerTeam team4 = new SoccerTeam("Chico");
        SoccerTeam team5 = new SoccerTeam("Deportivo Pereira");
        SoccerTeam team6 = new SoccerTeam("Envigado");
        SoccerTeam team7 = new SoccerTeam("Fortaleza");
        SoccerTeam team8 = new SoccerTeam("Jaguares FC");
        SoccerTeam team9 = new SoccerTeam("Junior");
        SoccerTeam team10 = new SoccerTeam("La Equidad");
        SoccerTeam team11 = new SoccerTeam("Medellin");
        SoccerTeam team12 = new SoccerTeam("Millonarios");
        SoccerTeam team13 = new SoccerTeam("Nacional");
        SoccerTeam team14 = new SoccerTeam("Once Caldas");
        SoccerTeam team15 = new SoccerTeam("Pasto");
        SoccerTeam team16 = new SoccerTeam("Patriotas");
        SoccerTeam team17 = new SoccerTeam("Rionegro");
        SoccerTeam team18 = new SoccerTeam("Santa Fe");
        SoccerTeam team19 = new SoccerTeam("Tolima");
        SoccerTeam team20 = new SoccerTeam("Deportivo Cali");
        
            //List with every team
        SoccerTeam list1 [] = {team1,team2,team3,team4,team5,team6,team7,team8,team9,team10,team11,team12,team13,team14,team15,team16,team17,team18,team19,team20};
         SoccerTeam list2 [] = {team1,team2,team3,team4,team5,team6,team7,team8,team9,team10,team11,team12,team13,team14,team15,team16,team17,team18,team19,team20};
  
        ManualFrame frameM = new ManualFrame();
        
        frameM.setDato(list1, list2);  //Transpost the two lists
    
        frameM.setVisible(true);
   
        frame1.dispose();

        //END manual buttom event
    }//GEN-LAST:event_ManualGameBtnActionPerformed

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //-------DONT TOUCH----------------------------------------------------------------------
    
      static FirstFrame frame1 = new FirstFrame();       //My own instance of the frame 1
    /**
     * @param args the command line arguments
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
            java.util.logging.Logger.getLogger(FirstFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FirstFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FirstFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FirstFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 frame1.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ManualGameBtn;
    private javax.swing.JButton autoGameBtn;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables







}



