// import the index file (need name)
//package com.CHAWInc.model;

//import com.CHAWInc.view.MaintenanceWindow;

//public class SearchEngine {
    //public static void main(String[] args) {
  //  }
//}
package com.CHAWInc.view;
import java.awt.event.ActionEvent;

/**
 *
 * @author Walter Goes
 */
public class SearchEngine extends javax.swing.JFrame {

    /**
     * Creates new form SearchEngine
     */
    public SearchEngine() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Search here");

        jButton1.setText("Search");

        jRadioButton1.setText("All of the Search Terms");

        jRadioButton2.setText("Any of the Search Terms");

        jRadioButton3.setText("Exact Phrase");

        jButton2.setText("Maintenance...");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Exit");

        javax.swing.GroupLayout layout = new
                javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                layout.createSequentialGroup()

                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGap(58, 58, 58)
                                                        .addComponent(jRadioButton1,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 200,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(53, 53, 53)
                                                        .addComponent(jRadioButton2))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGap(43, 43, 43)
                                                        .addComponent(jLabel1,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 382,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGap(34, 34, 34)
                                                        .addComponent(jButton2,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 133,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))

                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                44, Short.MAX_VALUE)

                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                false)
                                                .addComponent(jRadioButton3,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton1,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 91,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButton3,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(89, 89, 89))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)

                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1,
                                                javax.swing.GroupLayout.PREFERRED_SIZE, 46,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton1,
                                                javax.swing.GroupLayout.PREFERRED_SIZE, 46,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)

                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jRadioButton1)
                                        .addComponent(jRadioButton2)
                                        .addComponent(jRadioButton3))

                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        176, Short.MAX_VALUE)

                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                        false)
                                        .addComponent(jButton2,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                                        .addComponent(jButton3,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
        MaintenanceWindow s = new MaintenanceWindow();
        // s.setVisible(true);      Need to fix this line of code as it seems to screw everything up
        //The error is cannot find symbol
    }

    //Replaced public static void main with a constructor here

    //public static void main(String []args)
    public static void main (String [] args){
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel
        //setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay
with the default look and feel.
         * For details see
http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info :
                    javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(com.CHAWInc.view.SearchEngine.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(com.CHAWInc.view.SearchEngine.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(com.CHAWInc.view.SearchEngine.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(com.CHAWInc.view.SearchEngine.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new com.CHAWInc.view.SearchEngine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    // End of variables declaration


}
















//we need a path to our .txt file

        //need to make an arraylist
        
        //String searchFile = getInput();  //this will be the method??
        
        //need to display the search results somehow
        
     



        //user input method, doing a scanner i think is the best way
        // feel free to change or give suggestions to improve
        //public static String getInput() {
          //  Scanner sc = new Scanner(System.in);
            //System.out.println("Enter your search: ")
            //String nameTitle = sc.nextLine();
            //sc.close();
            
           // return titlename;

            //open maintance button



