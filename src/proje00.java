import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class proje00 extends javax.swing.JDialog {

    public proje00(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        
        setTitle("Hawking");
        setResizable(false);
        setIcon();
     initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        jenviar = new javax.swing.JButton();
        jsair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jnome = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jdata = new javax.swing.JFormattedTextField();
        jchegada = new javax.swing.JFormattedTextField();
        jsaida = new javax.swing.JFormattedTextField();
        jHora = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jenviar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jenviar.setText("Enviar");
        jenviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jenviarActionPerformed(evt);
            }
        });
        getContentPane().add(jenviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        jsair.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jsair.setText("Sair");
        jsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsairActionPerformed(evt);
            }
        });
        getContentPane().add(jsair, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, -1, -1));

        jLabel1.setText("Nome");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel2.setText("Chegada");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel3.setText("Saida");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 30, -1));

        jnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnomeActionPerformed(evt);
            }
        });
        getContentPane().add(jnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 270, -1));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/hawking.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 190, 60));

        jLabel7.setText("Data");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        try {
            jdata.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.##.####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jdata, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 270, -1));

        try {
            jchegada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jchegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 270, -1));

        try {
            jsaida.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jsaida, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 270, -1));

        jHora.setText("Horas");
        getContentPane().add(jHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        setSize(new java.awt.Dimension(403, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
Timer timer =new Timer (1000, new hora()); // colaca horas !
timer.start(); 

    }//GEN-LAST:event_formWindowOpened

    private void jnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnomeActionPerformed

    }//GEN-LAST:event_jnomeActionPerformed

    private void jsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jsairActionPerformed

    private void jenviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jenviarActionPerformed
         File Ponto = new File ("C:\\Users\\Willian\\Documents\\Ponto\\fun.txt"); //OBS: o \ tem quer ser igual em todos os campos !

  try{
  FileWriter fw = new FileWriter(Ponto, true);
  BufferedWriter bw = new BufferedWriter (fw);

  bw.write(jnome.getText() + "\n" + jchegada.getText() + " - Chegada.\n" + 
  jsaida.getText() + " - Saida.\n"+ jdata.getText() + " - Data" + "\n---------------------");
 
if (jnome.getText().equals("")){ //caso os campo fiquem em branco !
JOptionPane.showMessageDialog(null, "Algo deu errado, verifique os campos !", "Hawking", JOptionPane.WARNING_MESSAGE); 
return ;
}else if(jchegada.getText().trim().length() < 4) {
                JOptionPane.showMessageDialog(null, "Algo deu errado, verifique os campos !", "Hawking", JOptionPane.WARNING_MESSAGE); 
                jchegada.requestFocusInWindow();
                 return ;
}else if(jsaida.getText().trim().length() < 4) {
                JOptionPane.showMessageDialog(null, "Algo deu errado, verifique os campos !", "Hawking", JOptionPane.WARNING_MESSAGE); 
                jsaida.requestFocusInWindow();
                 return ;
}else if(jdata.getText().trim().length() < 8) {
                JOptionPane.showMessageDialog(null, "Algo deu errado, verifique os campos !", "Hawking", JOptionPane.WARNING_MESSAGE); 
                jdata.requestFocusInWindow();
                 return ;
}
  bw.newLine(); //escreve no arquivo !
  bw.close();
  fw.close();

jnome.setText(""); //limpa os campos !
jchegada.setText("");
jsaida.setText("");
jdata.setText(""); 
   
JOptionPane.showMessageDialog(null, "Enviado !", "Hawking", JOptionPane.INFORMATION_MESSAGE);
  }catch(IOException ex){
  }
    }//GEN-LAST:event_jenviarActionPerformed

    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(() -> {
            proje00 dialog = new proje00(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jHora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JFormattedTextField jchegada;
    private javax.swing.JFormattedTextField jdata;
    private javax.swing.JButton jenviar;
    private javax.swing.JTextField jnome;
    private javax.swing.JFormattedTextField jsaida;
    private javax.swing.JButton jsair;
    // End of variables declaration//GEN-END:variables

class hora implements ActionListener{
@Override
public void actionPerformed(ActionEvent e){
Calendar now = Calendar.getInstance();
jHora.setText(String.format("%1$tH:%1$tM",now));
//:%1$tS - SEGUNDOS 

}
}
  private void setIcon() {
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icons.png"))); 
       
       //OBS O Toolkit tem que importa a biblioteca, setInconImagen é para adicionar a imagen no canto da tela !
    }
}
