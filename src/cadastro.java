import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.Timer;


public class cadastro extends javax.swing.JFrame {

    public cadastro() {
        setTitle("Hawking");
        setResizable(false);
        setIcon();
        initComponents();
   
    }

    cadastro(projeto00 aThis, boolean b) {
        throw new UnsupportedOperationException("Not supported yet.");}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jnome = new javax.swing.JTextField();
        jsetor = new javax.swing.JTextField();
        jfuncao = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Bcadastra = new javax.swing.JButton();
        Blimpa = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jcpf = new javax.swing.JFormattedTextField();
        janiversario = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jHora = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnomeActionPerformed(evt);
            }
        });
        getContentPane().add(jnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 260, -1));

        jsetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsetorActionPerformed(evt);
            }
        });
        getContentPane().add(jsetor, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 260, -1));

        jfuncao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfuncaoActionPerformed(evt);
            }
        });
        getContentPane().add(jfuncao, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 260, -1));

        jLabel1.setText("Nome");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel2.setText("Aniversario");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel3.setText("Setor");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel4.setText("Função");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        Bcadastra.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Bcadastra.setText("Cadastra");
        Bcadastra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcadastraActionPerformed(evt);
            }
        });
        getContentPane().add(Bcadastra, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        Blimpa.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Blimpa.setText("Limpar");
        Blimpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlimpaActionPerformed(evt);
            }
        });
        getContentPane().add(Blimpa, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, -1, -1));

        jLabel5.setText("CPF");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        try {
            jcpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jcpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 260, -1));

        try {
            janiversario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####.##.##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        janiversario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                janiversarioActionPerformed(evt);
            }
        });
        getContentPane().add(janiversario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 260, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/hawking.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 150, 40));

        jHora.setText("Horas");
        getContentPane().add(jHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        setSize(new java.awt.Dimension(387, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BlimpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlimpaActionPerformed
jnome.setText("");
janiversario.setText("");
jsetor.setText("");
jfuncao.setText("");
jcpf.setText("");
    }//GEN-LAST:event_BlimpaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
Timer timer =new Timer (1000, new hora()); // colaca horas !
timer.start(); 
    }//GEN-LAST:event_formWindowOpened

    private void jnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnomeActionPerformed
        // TODO add your handling code here:
        String cadnome = jnome.getText();
    }//GEN-LAST:event_jnomeActionPerformed

    private void BcadastraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcadastraActionPerformed
try {
// * Drive Conector MySQL.
Class.forName("com.mysql.jdbc.Driver");
 
// * Conexão como BD.
Connection con = (Connection) DriverManager.getConnection(
"jdbc:mysql://127.0.0.1:3306/hawking", "root", "root");
 
// * Objeto comdo SQL.
Statement stmt = (Statement) con.createStatement();
 
// * Pega os dados informado no formulário,
//int cadMat = Integer.parseInt(entCodigo.getText());
String cadnome = jnome.getText();
String cadaniversario = janiversario.getText();
String cadsetor = jsetor.getText();
String cadfuncao = jfuncao.getText();
String cadcpf = jcpf.getText();

 
// * Insere os dados do formulário no BD.
stmt.executeUpdate("insert into info (nome, aniversario, setor, funcao, cpf) values ('"
+ cadnome
+ "','"
+ cadaniversario
+ "','"
+ cadsetor 
+ "','"
+ cadfuncao
+ "','"
+ cadcpf
+"')");
JOptionPane.showMessageDialog(null, "Dados Salvos!");
// * Fecha a conexão do o DB.
con.close();
 
} catch (SQLException Erro) {
JOptionPane.showMessageDialog(null,
"Erro com SQL" + Erro.getMessage());
// Trata erros de conexão.
} catch (ClassNotFoundException Erro) {
 
JOptionPane.showMessageDialog(null, "Driver não encontrado!");

}

    }//GEN-LAST:event_BcadastraActionPerformed

    private void janiversarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_janiversarioActionPerformed
        // TODO add your handling code here:
        String cadaniversario = janiversario.getText();
    }//GEN-LAST:event_janiversarioActionPerformed

    private void jsetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsetorActionPerformed
        // TODO add your handling code here:
        String cadsetor = jsetor.getText();
    }//GEN-LAST:event_jsetorActionPerformed

    private void jfuncaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfuncaoActionPerformed
        // TODO add your handling code here:
        String cadfuncao = jfuncao.getText();
    }//GEN-LAST:event_jfuncaoActionPerformed

    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(() -> {
            new cadastro().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bcadastra;
    private javax.swing.JButton Blimpa;
    private javax.swing.JLabel jHora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JFormattedTextField janiversario;
    private javax.swing.JFormattedTextField jcpf;
    private javax.swing.JTextField jfuncao;
    private javax.swing.JTextField jnome;
    private javax.swing.JTextField jsetor;
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
