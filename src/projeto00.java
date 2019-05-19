//import com.jgoodies.looks.plastic.PlasticLookAndFeel;
//import com.jgoodies.looks.plastic.theme.BrownSugar;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class projeto00 extends javax.swing.JFrame {

    public projeto00() {
    setTitle("Hawking");
    setResizable(false);
    setIcon();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jCadastrar = new javax.swing.JButton();
        jEntrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jclock = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCadastrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCadastrar.setText("Cadastrar");
        jCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(jCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jEntrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jEntrar.setText("Entrar");
        jEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(jEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setMinimumSize(new java.awt.Dimension(290, 134));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Developed by Willian C. Rodrigues");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Developer by Willian C. Rodrigues");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 230, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 200, 310, 40));

        jclock.setText("Horas");
        getContentPane().add(jclock, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/hawking.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 140, 50));

        setSize(new java.awt.Dimension(327, 295));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

         //SkyBlue()
        //BrownSugar()
       // DarkStar()  
      //DesertGreen()
     //Silver()
    //ExperienceRoyale()
              try {
            PlasticLookAndFeel.setPlasticTheme(new BrownSugar());
                  try {
                      UIManager.setLookAndFeel("com.jgoodies.looks.plastic.Plastic3DLookAndFeel");
                  } catch (InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                      Logger.getLogger(projeto00.class.getName()).log(Level.SEVERE, null, ex);
                  }          
        } catch (ClassNotFoundException ex) {
        }SwingUtilities.updateComponentTreeUI(this); //tratando o erro !

Timer timer =new Timer (1000, new hora()); // colaca horas !
timer.start(); 
    }//GEN-LAST:event_formWindowOpened

    private void jEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEntrarActionPerformed
       proje00 pro = new proje00 (this, true); //relaciona o proje00 com o projeto00
       pro.setVisible(true);
    }//GEN-LAST:event_jEntrarActionPerformed

    private void jCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadastrarActionPerformed
   cadastro cad = new cadastro (); //relaciona o proje00 com o projeto00
      cad.setVisible(true);
    }//GEN-LAST:event_jCadastrarActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(projeto00.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(projeto00.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(projeto00.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(projeto00.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new projeto00().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jCadastrar;
    private javax.swing.JButton jEntrar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel jclock;
    // End of variables declaration//GEN-END:variables

class hora implements ActionListener{
@Override
public void actionPerformed(ActionEvent e){
Calendar now = Calendar.getInstance();
jclock.setText(String.format("%1$tH:%1$tM",now));
//:%1$tS - SEGUNDOS 

}
}
   private void setIcon() {
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icons.png"))); 
       
       //OBS O Toolkit tem que importa a biblioteca, setInconImagen é para adicionar a imagen no canto da tela !
  
    }
}
