
import java.util.*;

/*
Ronald Danilo Chávez Calderón
200130586
*/

public class ADN_Decoder extends javax.swing.JFrame {

    /**
     * Creates new form ADN_Decoder_UI
     */
    public ADN_Decoder() {
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

        jLabel1_Title = new javax.swing.JLabel();
        jLabel_SequenceA = new javax.swing.JLabel();
        jLabel_SequenceB = new javax.swing.JLabel();
        jTextField_SequenceA = new javax.swing.JTextField();
        jTextField_SequenceB = new javax.swing.JTextField();
        jLabel_Sequences = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1_Title.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1_Title.setText("Decodificador de ADN");

        jLabel_SequenceA.setText("Secuencia A");

        jLabel_SequenceB.setText("Secuencia B");

        jLabel_Sequences.setText("Secuencias Mayores");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("Calcular las Secuencias Mayores");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel1_Title))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(jLabel_SequenceA))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(143, 143, 143)
                                .addComponent(jLabel_SequenceB))
                            .addComponent(jTextField_SequenceA)
                            .addComponent(jTextField_SequenceB)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addComponent(jLabel_Sequences))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jButton1)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1_Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_SequenceA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_SequenceA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_SequenceB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_SequenceB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_Sequences)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

        ArrayList<String> sequences = findSequences ( jTextField_SequenceA.getText(), jTextField_SequenceB.getText() );        
        
        for (int i = 0; i < sequences.size(); i++) {
            jTextArea1.setText(sequences.get(i) + "  ");
        }  

    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(ADN_Decoder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ADN_Decoder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ADN_Decoder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ADN_Decoder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ADN_Decoder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1_Title;
    private javax.swing.JLabel jLabel_SequenceA;
    private javax.swing.JLabel jLabel_SequenceB;
    private javax.swing.JLabel jLabel_Sequences;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField_SequenceA;
    private javax.swing.JTextField jTextField_SequenceB;
    // End of variables declaration//GEN-END:variables

    //To find the bigger common sequence between the secquences
    public static ArrayList findSequences ( String sequenceA, String sequenceB ) {
        
        char[] arrayA = sequenceA.toCharArray();
        ArrayList<Character> arrayListA = new ArrayList<Character>();
        for (int i = 0; i < arrayA.length ; i++) {
            arrayListA.add(arrayA[i]);
        }
        char[] arrayB = sequenceB.toCharArray();
        ArrayList<Character> arrayListB = new ArrayList<Character>();
        for (int i = 0; i < arrayB.length ; i++) {
            arrayListB.add(arrayB[i]);
        }
        
        ArrayList<Character> arrayListC = new ArrayList<Character>();
        ArrayList<String> arrayOfSequences = new ArrayList<String>();
        
        //Compares the sequences and makes an array of strings
        for (int i = 0; i < arrayListA.size(); i++) {
            for (int j = 0; j < arrayListB.size(); j++) {
                if ( arrayListA.get(i) == arrayListB.get(j) ) {
                    int temp = j;
                    for (int k = i; k < arrayListA.size(); k++) {
                        if ( temp < arrayListB.size() ) {
                            if ( arrayListA.get(k) == arrayListB.get(temp) ) {
                                arrayListC.add(arrayListA.get(k));
                                temp++;
                            }
                            else {
                                break;
                            }
                        }
                    }
                    arrayOfSequences.add(arrayListC.toString());
                    arrayListC.clear();
                }
            }
        }
        
        // We need to find the biggest size of the strings
        int temp = 0;
        for (int i = 0; i < arrayOfSequences.size(); i++) {
            if ( arrayOfSequences.get(i).length() > temp ) {
                temp = arrayOfSequences.get(i).length();
            }
        }
        
        //To show only the biggest sequences
        ArrayList<String> arrayOfBiggerSequences = new ArrayList<String>();
        for (int i = 0; i < arrayOfSequences.size(); i++) {
            if ( arrayOfSequences.get(i).length() == temp ) {
                arrayOfBiggerSequences.add(arrayOfSequences.get(i));
            }
        }
        
        /*
        //To convert to a simple array
        String[] biggerSequences = new String[arrayOfBiggerSequences.size()];
        for (int i = 0; i < biggerSequences.length; i++) {
            biggerSequences[i] = arrayOfBiggerSequences.get(i);
        }
        */
        
        return arrayOfBiggerSequences;
    }     

}
