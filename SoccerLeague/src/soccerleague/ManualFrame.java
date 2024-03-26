/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package soccerleague;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Miguel Vargas
 */
public class ManualFrame extends javax.swing.JFrame {

    /**
     * Creates new form ManualFrame
     */
    public ManualFrame() {

        initComponents();
        acceptBtn.setText("START TOURNAMENT");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        posTable = new javax.swing.JTable();
        team1lbl = new javax.swing.JLabel();
        team2lbl = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        goalsteam1tf = new javax.swing.JTextField();
        goalsteam2tf = new javax.swing.JTextField();
        acceptBtn = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        posTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Position", "Team", "Matches played", "Matches win", "Matches Losed", "Goals in favor", "Goals losed"
            }
        ));
        jScrollPane1.setViewportView(posTable);

        team1lbl.setText("Alianza FC");

        team2lbl.setText("America de Cali");

        jLabel3.setText("VS");

        jLabel2.setText("Goals: ");

        jLabel4.setText("Goals: ");

        acceptBtn.setText("ACCEPT");
        acceptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(team1lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(team2lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(goalsteam1tf, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(168, 168, 168)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(goalsteam2tf, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(acceptBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(230, 230, 230))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(team2lbl)
                    .addComponent(team1lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(goalsteam1tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(goalsteam2tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(acceptBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private SoccerTeam[] list1;
    private SoccerTeam[] list2;
//Funtion for transport de dates of a frame to other

    public void setDato(SoccerTeam[] list1, SoccerTeam[] list2) {
        this.list1 = list1;
        this.list2 = list2;
    }

//This funtion return a boolean and help us to know if the string can be a integer number
    public boolean verifyText(String text1, String text2) {
        boolean flat = true;
        try {   //Happy case
            // try to convert the string in integer
            int number1 = Integer.parseInt(text1);
            int number2 = Integer.parseInt(text2);
            if(number1<0 || number2<0){ //Range validation
             JOptionPane.showMessageDialog(null, "The text entered cannot be negative numbers","", JOptionPane.INFORMATION_MESSAGE);
             flat=false;
            }                           
        } catch (NumberFormatException ex) {    //Cant be a integer
             JOptionPane.showMessageDialog(null, "It is not possible to enter non-numeric characters","", JOptionPane.INFORMATION_MESSAGE);
            flat = false;
        }
        return flat;
    }

    //----------------------Buttom Events----------------------------------------
    int pos1 = 0;
    int pos2 = 1;
    ArrayList<SoccerTeam> teamsPlayed = new ArrayList<SoccerTeam>();    //This array will conteins 
    private void acceptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptBtnActionPerformed
        //Accept buttom event

        if (pos1 >= 19) { //All already played with all, End condition
            acceptBtn.setText("THE TOURNAMENT WAS ENDED");
            JOptionPane.showMessageDialog(null, "The WINNER tornment is "+teamsPlayed.get(0).getName(),"", JOptionPane.INFORMATION_MESSAGE);
            //WINNER CODE   

        } else {    //GAME CODE
            acceptBtn.setText("FOLLOW GAME --->");
            //code of game
            String text1 = goalsteam1tf.getText();
            String text2 = goalsteam2tf.getText();

            if (verifyText(text1, text2)) {  //The string can be a integer number
                 
                int goals1 = Integer.parseInt(text1);
                int goals2 = Integer.parseInt(text2);
                SoccerTeam.playMatchManual(list1[pos1], list2[pos2], goals1, goals2); //The matches play

               
                goalsteam1tf.setText("");
                goalsteam2tf.setText("");

                //Table code
                if (!teamsPlayed.contains(list1[pos1])) { //The team isnt contain in the arrayTeams
                    teamsPlayed.add(list1[pos1]);       //Add de team to te array
                }
                if (!teamsPlayed.contains(list2[pos2])) {
                    teamsPlayed.add(list2[pos2]);
                }
                 pos2++;
                //Sort de list                   
                Collections.sort(teamsPlayed, new Comparator<SoccerTeam>() {
                    public int compare(SoccerTeam teamm1, SoccerTeam teamm2) {
                        return Integer.compare(teamm2.getPoints(), teamm1.getPoints());
                    }
                });
                            
                System.out.println("TAMAÑO DE LA LISTA"+teamsPlayed.size());    /////////
                //Create model table 
                   System.out.println(teamsPlayed.get(1).getName());
                
                DefaultTableModel table = new DefaultTableModel();

                table.addColumn("Position");          //Add de columns names to the model
                table.addColumn("Team");
                table.addColumn("games played");
                table.addColumn("matches won");
                table.addColumn("lost matches");
                table.addColumn("Goals in favor");
                table.addColumn("goals against");
                table.addColumn("Points");
                
                
                 int position =1;
                for( int i=0;i<=teamsPlayed.size()-1;i++){
                table.addRow(new Object[]{
            position,
            teamsPlayed.get(i).getName(), 
            teamsPlayed.get(i).getMatchsPlayed(),
            teamsPlayed.get(i).getWinMatch(),
            teamsPlayed.get(i).getLoseMatch(),
            teamsPlayed.get(i).getGoalsWin(),
            teamsPlayed.get(i).getGoalsLose(),
            teamsPlayed.get(i).getPoints()                                            
                     });
                
              
                
                
               if(i!=teamsPlayed.size()-1){
                    
             if(teamsPlayed.get(i).getPoints()!=teamsPlayed.get(i+1).getPoints())  {
             position++;        
             }                           
               }     
               
               
               
               posTable.setModel(table);        
                }
           
                
             team1lbl.setText(list1[pos1].getName());
             team2lbl.setText(list2[pos2].getName());
                
                if (pos2 >= 20) {   //next iteration condition for pos1
                    pos1++;
                    pos2 = pos1 + 1;
                }            
            } else {
                System.out.println("NOT A NUMBER");
                //SHOW A MESSAGE "THE TEXT INSERTED, IS NOT A INTEGER NUMBER"
            }
         
        }
        
        //End accept buttom event
    }//GEN-LAST:event_acceptBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ManualFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManualFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManualFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManualFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManualFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptBtn;
    private javax.swing.JTextField goalsteam1tf;
    private javax.swing.JTextField goalsteam2tf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable posTable;
    private javax.swing.JLabel team1lbl;
    private javax.swing.JLabel team2lbl;
    // End of variables declaration//GEN-END:variables
}
