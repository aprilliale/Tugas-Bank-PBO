
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rongrong
 */
public class Saldo extends javax.swing.JFrame {
    String str, str1;
    int t,s,tab=500000;
    
   

    /**
     * Creates new form Saldo
     */
    public Saldo() {
        initComponents();
        tabungan.setText(""+tab);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Setor = new javax.swing.JButton();
        Trans = new javax.swing.JButton();
        Uang = new javax.swing.JTextField();
        KEMBALI = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tabungan = new javax.swing.JTextField();
        Tarik1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setLayout(null);

        Setor.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Setor.setText("SETOR");
        Setor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetorActionPerformed(evt);
            }
        });
        jPanel1.add(Setor);
        Setor.setBounds(50, 250, 90, 40);

        Trans.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Trans.setText("TRANSFER");
        Trans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransActionPerformed(evt);
            }
        });
        jPanel1.add(Trans);
        Trans.setBounds(180, 250, 130, 40);

        Uang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UangActionPerformed(evt);
            }
        });
        jPanel1.add(Uang);
        Uang.setBounds(130, 190, 240, 50);

        KEMBALI.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        KEMBALI.setText("KEMBALI");
        KEMBALI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KEMBALIActionPerformed(evt);
            }
        });
        jPanel1.add(KEMBALI);
        KEMBALI.setBounds(190, 310, 120, 31);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MASUKKAN JUMLAH UANG");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(120, 160, 270, 22);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SALDO");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(200, 0, 110, 40);

        tabungan.setEditable(false);
        tabungan.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        tabungan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabunganActionPerformed(evt);
            }
        });
        jPanel1.add(tabungan);
        tabungan.setBounds(150, 70, 190, 60);

        Tarik1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Tarik1.setText("TARIK");
        Tarik1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tarik1ActionPerformed(evt);
            }
        });
        jPanel1.add(Tarik1);
        Tarik1.setBounds(350, 250, 90, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 520, 360);

        setBounds(0, 0, 533, 390);
    }// </editor-fold>//GEN-END:initComponents

    private void UangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UangActionPerformed

    private void SetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetorActionPerformed
        // TODO add your handling code here:
        
        String uang = Uang.getText();
        String tabung = tabungan.getText().toString();
        
        s= Integer.parseInt(uang);
        int hasil = Integer.parseInt(tabung);
        int total = s+hasil;
        
        if(s%100!=0)
            JOptionPane.showMessageDialog(null, "Mesin ATM BRI tidak menerima uang koin \n Silahkan Ulangi Kembali !", "Transaksi Gagal",0);
        else if(s<10000)
            JOptionPane.showMessageDialog(null, "Besaran minimal setor tunai adalah Rp.10.000,00", "ERROR",0);
        else if(s>=10000)
            tabungan.setText(""+total);
            
        
    
    }//GEN-LAST:event_SetorActionPerformed

    private void TransActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransActionPerformed
        // TODO add your handling code here:
        String tabung = tabungan.getText();
       
        t= Integer.parseInt(Uang.getText());
        int hasil = Integer.parseInt(tabungan.getText());
        int total = hasil-t;
        
        if(t%100!=0)
            JOptionPane.showMessageDialog(null, "Mesin ATM BRI tidak menerima uang koin \nSilahkan ulagi Lagi", "Transaksi Gagal",0);
        else{
            if(t>tab)
            JOptionPane.showMessageDialog(null, "Saldo anda tidak mencukupi \nSilahkan melakukan penyetoran", "Transaksi Gagal",0); 
            else if(t<50000)
            JOptionPane.showMessageDialog(null, "Besaran minimal transfer tunai adalah Rp.50.000,00", "Transaksi Gagal",0);
            else{
                tabungan.setText(""+total);
                if (tab<=50000)
                {
                    JOptionPane.showMessageDialog(null,"Saldo minimal harus RP 50.000,00 , Segera melakukan penyetoran untuk menghindari penutupan akun", "CAUTION", 2);
                }
            }
        }
    }//GEN-LAST:event_TransActionPerformed

    private void KEMBALIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KEMBALIActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Home().setVisible(true);
    }//GEN-LAST:event_KEMBALIActionPerformed

    private void tabunganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabunganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tabunganActionPerformed

    private void Tarik1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tarik1ActionPerformed
        // TODO add your handling code here:
        String tabung = tabungan.getText();
       
        t= Integer.parseInt(Uang.getText());
        int hasil = Integer.parseInt(tabungan.getText());
        int total = hasil-t;
        
        if(t%100!=0)
            JOptionPane.showMessageDialog(null, "Mesin ATM BRI tidak menerima uang koin \nSilahkan ulagi Lagi", "Transaksi Gagal",0);
        else{
            if(t>tab)
            JOptionPane.showMessageDialog(null, "Saldo anda tidak mencukupi \nSilahkan melakukan penyetoran", "Transaksi Gagal",0); 
            else if(t<10000)
            JOptionPane.showMessageDialog(null, "Besaran minimal pengambilan tunai adalah Rp.10.000,00", "Transaksi Gagal",0);
            else{
                tabungan.setText(""+total);
                if (tab<=10000)
                {
                    JOptionPane.showMessageDialog(null,"Saldo minimal harus RP 10.000,00 , Segera melakukan penyetoran untuk menghindari penutupan akun", "CAUTION", 2);
                }
            }
        }
    }//GEN-LAST:event_Tarik1ActionPerformed

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
            java.util.logging.Logger.getLogger(Saldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Saldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Saldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Saldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Saldo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton KEMBALI;
    private javax.swing.JButton Setor;
    private javax.swing.JButton Tarik1;
    private javax.swing.JButton Trans;
    private javax.swing.JTextField Uang;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tabungan;
    // End of variables declaration//GEN-END:variables
}
