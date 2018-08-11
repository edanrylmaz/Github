/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


public class Kitap_Listesi extends javax.swing.JFrame {

   
      
      public Kitap_Listesi() throws SQLException {
              
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        KitapListesiTable = new javax.swing.JTable();
        CikisButon = new javax.swing.JButton();
        AnaMenuButon = new javax.swing.JButton();
        KitapListesiButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(1, 1, 1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("KİTAP LİSTESİ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(350, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(152, 141, 70));

        KitapListesiTable.setAutoCreateRowSorter(true);
        KitapListesiTable.setBackground(new java.awt.Color(254, 254, 254));
        KitapListesiTable.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        KitapListesiTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "KİTAP ADI", "YAZAR ADI", "KİTABIN SAYISI"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        KitapListesiTable.setSelectionBackground(new java.awt.Color(1, 1, 1));
        jScrollPane1.setViewportView(KitapListesiTable);

        CikisButon.setBackground(new java.awt.Color(152, 141, 70));
        CikisButon.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        CikisButon.setForeground(new java.awt.Color(1, 1, 1));
        CikisButon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proje/users-exit-icon(1).png"))); // NOI18N
        CikisButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CikisButonActionPerformed(evt);
            }
        });

        AnaMenuButon.setBackground(new java.awt.Color(152, 141, 70));
        AnaMenuButon.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        AnaMenuButon.setForeground(new java.awt.Color(1, 1, 1));
        AnaMenuButon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proje/home-icon(1).png"))); // NOI18N
        AnaMenuButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnaMenuButonActionPerformed(evt);
            }
        });

        KitapListesiButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        KitapListesiButton.setForeground(new java.awt.Color(1, 1, 1));
        KitapListesiButton.setText("LİSTELE");
        KitapListesiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KitapListesiButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 823, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(AnaMenuButon)
                        .addGap(57, 57, 57)
                        .addComponent(CikisButon)
                        .addGap(50, 50, 50))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(KitapListesiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(KitapListesiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CikisButon, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AnaMenuButon, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void KitapListesiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KitapListesiButtonActionPerformed
          try {
              runKitap_Listesi();
          } catch (SQLException ex) {
              Logger.getLogger(Kitap_Listesi.class.getName()).log(Level.SEVERE, null, ex);
          }
    }//GEN-LAST:event_KitapListesiButtonActionPerformed

    private void CikisButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CikisButonActionPerformed
        login don = new login();
        don.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_CikisButonActionPerformed

    private void AnaMenuButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnaMenuButonActionPerformed
        Ana_Menu don = new Ana_Menu();
        don.setVisible( true);
        setVisible(false);
    }//GEN-LAST:event_AnaMenuButonActionPerformed

void runKitap_Listesi() throws SQLException {
    String query ="Select kitap_adi,yazar,adet from kitaplar ";
    DefaultTableModel KitapListesiModel =(DefaultTableModel) KitapListesiTable.getModel();
    Object satir []= new Object [3];
     KitapListesiModel.setRowCount(0);
     Database db = new Database();
     db.rs=db.st.executeQuery(query);
     int i =1;
     while(db.rs.next()){
            satir[0]=db.rs.getString(1);
            
            satir[1]=db.rs.getString(2);
            satir[2]=db.rs.getInt(3);
            KitapListesiModel.addRow(satir);
        }
}
        
      

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Kitap_Listesi().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Kitaplarim.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AnaMenuButon;
    private javax.swing.JButton CikisButon;
    private javax.swing.JButton KitapListesiButton;
    private javax.swing.JTable KitapListesiTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
