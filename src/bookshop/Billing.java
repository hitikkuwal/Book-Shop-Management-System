
package bookshop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import java.util.Date;
import java.text.ParseException;

/**
 *
 * @author HP
 */
public class Billing extends javax.swing.JFrame {
    public Billing() {
        initComponents();
        DisplayBooks();
        CountRow();
        BillNumTb.setEditable(false);
        BookNameTb.setEditable(false);
        PriceTb.setEditable(false);
    }
/*public Billing(String UN)
{
    initComponents();
    UnameLbl.setText(UN);
    
        BookNameTb.setEditable(false);
        PriceTb.setEditable(false);
        CountRow();
        BillNumTb.setEditable(false);
}*/
Connection Con = null;
Statement St = null,  St1 =null;
ResultSet Rs = null, Rs1 = null;
private void DisplayBooks()
{
    try {
        Con = DriverManager.getConnection("jdbc:derby://localhost:1527/BookShopDb","User1","12345");
        St = Con.createStatement();
        Rs = St.executeQuery("select * from User1.BookTbl");
        BooksTable.setModel(DbUtils.resultSetToTableModel(Rs));
    } catch (Exception e) {
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        UnameLbl = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ClientNameTb = new javax.swing.JTextField();
        BookNameTb = new javax.swing.JTextField();
        PriceTb = new javax.swing.JTextField();
        QtyTb = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        AddToBilBtn = new javax.swing.JButton();
        PrintBtn = new javax.swing.JButton();
        ResetBtn = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        BooksTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        BillTxt = new javax.swing.JTextArea();
        GrdTotalLbl = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        BillNumTb = new javax.swing.JTextField();
        Ph = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        DateTb = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        UnameLbl1 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        Cadd = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 92, 6));
        jLabel2.setText("Book Sale Management System");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bookshop/icons8-close-window-32.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(358, 358, 358)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2)
            .addComponent(jLabel1)
        );

        UnameLbl.setBackground(new java.awt.Color(255, 255, 255));
        UnameLbl.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        UnameLbl.setForeground(new java.awt.Color(255, 92, 6));
        UnameLbl.setText("Seller");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bookshop/icons8-user-24.png"))); // NOI18N

        ClientNameTb.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        ClientNameTb.setForeground(new java.awt.Color(255, 92, 6));

        BookNameTb.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        BookNameTb.setForeground(new java.awt.Color(255, 92, 6));

        PriceTb.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        PriceTb.setForeground(new java.awt.Color(255, 92, 6));

        QtyTb.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        QtyTb.setForeground(new java.awt.Color(255, 92, 6));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 92, 6));
        jLabel8.setText("Book Name");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 92, 6));
        jLabel9.setText("Price");

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 92, 6));
        jLabel10.setText("Quantity");

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 92, 6));
        jLabel13.setText("Books List");

        AddToBilBtn.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        AddToBilBtn.setForeground(new java.awt.Color(255, 92, 6));
        AddToBilBtn.setText("Add To Bill");
        AddToBilBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddToBilBtnMouseClicked(evt);
            }
        });
        AddToBilBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddToBilBtnActionPerformed(evt);
            }
        });

        PrintBtn.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        PrintBtn.setForeground(new java.awt.Color(255, 92, 6));
        PrintBtn.setText("Print");
        PrintBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrintBtnMouseClicked(evt);
            }
        });
        PrintBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintBtnActionPerformed(evt);
            }
        });

        ResetBtn.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        ResetBtn.setForeground(new java.awt.Color(255, 92, 6));
        ResetBtn.setText("Reset");
        ResetBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResetBtnMouseClicked(evt);
            }
        });
        ResetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetBtnActionPerformed(evt);
            }
        });

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 92, 6));
        jLabel14.setText("Client Name");

        BooksTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Title", "Author", "Categories", "Quantity", "Price"
            }
        ));
        BooksTable.setRowHeight(28);
        BooksTable.setSelectionBackground(new java.awt.Color(255, 92, 6));
        BooksTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BooksTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(BooksTable);

        BillTxt.setColumns(20);
        BillTxt.setRows(5);
        jScrollPane2.setViewportView(BillTxt);

        GrdTotalLbl.setBackground(new java.awt.Color(255, 255, 255));
        GrdTotalLbl.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        GrdTotalLbl.setForeground(new java.awt.Color(255, 92, 6));
        GrdTotalLbl.setText("Total");

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 92, 6));
        jLabel16.setText("Books Bill");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bookshop/home-16.png"))); // NOI18N
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 92, 6));
        jLabel11.setText("Bill Number");

        BillNumTb.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        BillNumTb.setForeground(new java.awt.Color(255, 92, 6));
        BillNumTb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BillNumTbMouseClicked(evt);
            }
        });
        BillNumTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BillNumTbActionPerformed(evt);
            }
        });

        Ph.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Ph.setForeground(new java.awt.Color(255, 92, 6));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 92, 6));
        jLabel12.setText("Phone Num");

        DateTb.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        DateTb.setForeground(new java.awt.Color(255, 92, 6));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 92, 6));
        jLabel15.setText("Date");

        jPanel7.setBackground(new java.awt.Color(255, 0, 0));
        jPanel7.setPreferredSize(new java.awt.Dimension(72, 2));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 92, 6));
        jLabel5.setText("Sale");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bookshop/icons8-orange-book-48.png"))); // NOI18N

        UnameLbl1.setBackground(new java.awt.Color(255, 255, 255));
        UnameLbl1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        UnameLbl1.setForeground(new java.awt.Color(255, 92, 6));
        UnameLbl1.setText("Client Info");
        UnameLbl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UnameLbl1MouseClicked(evt);
            }
        });

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bookshop/icons8-user-24.png"))); // NOI18N

        Cadd.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Cadd.setForeground(new java.awt.Color(255, 92, 6));

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 92, 6));
        jLabel19.setText("Address");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UnameLbl)
                        .addGap(61, 61, 61)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UnameLbl1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(166, 166, 166)
                                .addComponent(jLabel13))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AddToBilBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ResetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(ClientNameTb)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(BookNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(QtyTb, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel10)
                                                    .addComponent(jLabel9)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(PriceTb, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jLabel14))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(BillNumTb, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel11))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel15)
                                            .addComponent(DateTb)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Ph, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel12))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel19)
                                            .addComponent(Cadd, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(238, 238, 238)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(GrdTotalLbl)
                                        .addGap(34, 34, 34))
                                    .addComponent(PrintBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addGap(225, 225, 225))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap())))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addComponent(UnameLbl)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel6))))
                    .addComponent(jLabel18)
                    .addComponent(UnameLbl1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(GrdTotalLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PrintBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8)
                            .addComponent(jLabel11)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BookNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(QtyTb, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BillNumTb, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DateTb, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ClientNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel19))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(PriceTb, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Ph, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Cadd, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddToBilBtn)
                            .addComponent(ResetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AddToBilBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddToBilBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToBilBtnActionPerformed

    private void PrintBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrintBtnActionPerformed

    private void ResetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResetBtnActionPerformed
int Stock = 0;
    private void BooksTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BooksTableMouseClicked
       DefaultTableModel model = (DefaultTableModel)BooksTable.getModel();
        int MyIndex = BooksTable.getSelectedRow();
        BId = Integer.valueOf(model.getValueAt(MyIndex,0).toString());
        BookNameTb.setText(model.getValueAt(MyIndex,1).toString());
        Stock = Integer.valueOf(model.getValueAt(MyIndex,4).toString());
        PriceTb.setText(model.getValueAt(MyIndex,5).toString());
    }//GEN-LAST:event_BooksTableMouseClicked


    private boolean isValidDate(String dateStr) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setLenient(false);
        try {
            Date date = sdf.parse(dateStr);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
    
    
    private void SaveBill()
{
    String phoneNumber = Ph.getText();
    String dateStr = DateTb.getText();
    
    if(BillNumTb.getText().isEmpty() || ClientNameTb.getText().isEmpty() || Ph.getText().isEmpty()|| dateStr.isEmpty() || Cadd.getText().isEmpty())
       {
           JOptionPane.showMessageDialog(this,"Missing Information");
       }
    else if (!isValidPhoneNumber(phoneNumber)) {
        JOptionPane.showMessageDialog(this, "Invalid Phone Number");
    }
    else if (!isValidDate(dateStr)) {
            JOptionPane.showMessageDialog(this, "Invalid Date. Use format yyyy-MM-dd");
        }
    
    else{
           try {
               Con = DriverManager.getConnection("jdbc:derby://localhost:1527/BookShopDb","User1","12345");
               PreparedStatement add = Con.prepareStatement("insert into BillTbl values(?,?,?,?,?,?)");
               add.setInt(1, Integer.valueOf(BillNumTb.getText()));
               add.setString(2, ClientNameTb.getText());
               add.setInt(3, Integer.valueOf(Total));
               add.setString(4, phoneNumber);
               add.setString(5, dateStr);
               add.setString(6, Cadd.getText());
               int row = add.executeUpdate();
               JOptionPane.showMessageDialog(this,"Bill Saved");
           } catch (Exception e) {
               e.printStackTrace();
           }
       }   
}
private boolean isValidPhoneNumber(String phoneNumber) {
    // Check if the phone number is between 10 and 15 digits and contains only digits
    return phoneNumber.matches("\\d{10}");
}
    private void Reset ()
{
    BookNameTb.setText("");
    PriceTb.setText("");
    QtyTb.setText("");
    Ph.setText("");
    DateTb.setText("");
    ClientNameTb.setText("");
    Cadd.setText("");
    BillTxt.setText("");
    i = 0;
    GrdTotalLbl.setText("Total");
} 
int BId;
private void UpdateBook() {
    int newQty = Stock - Integer.valueOf(QtyTb.getText());
    try {
               Con = DriverManager.getConnection("jdbc:derby://localhost:1527/BookShopDb","User1","12345");
              
              String Query = "Update User1.Booktbl set Quantity="+newQty+" where BID="+BId;
              Statement Delete = Con.createStatement();
              Delete.executeUpdate(Query);
              JOptionPane.showMessageDialog(this,"Book Updated");
              DisplayBooks();
             //Reset();
           } catch (Exception e) {
               e.printStackTrace();
           }
}
    int i = 0, Total=0, GrdTotal=0;
    private void AddToBilBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToBilBtnMouseClicked
      String phoneNumber = Ph.getText();
      String dateStr = DateTb.getText();
        
        if(QtyTb.getText().isEmpty() || BookNameTb.getText().isEmpty() || BillNumTb.getText().isEmpty() || ClientNameTb.getText().isEmpty() || Ph.getText().isEmpty() || dateStr.isEmpty() || Cadd.getText().isEmpty())
      {
          JOptionPane.showMessageDialog(this,"Missing Informatiom");
      }else if (!isValidPhoneNumber(phoneNumber)) {
        JOptionPane.showMessageDialog(this, "Invalid Phone Number");
    }
      else if (!isValidDate(dateStr)) {
            JOptionPane.showMessageDialog(this, "Invalid Date. Use format yyyy-MM-dd");
        }
      
      else if(Integer.valueOf(QtyTb.getText())> Stock)
      {
          JOptionPane.showMessageDialog(this,"No Enough Books In Stock");
      }else{
          i++;
          Total = Integer.valueOf(PriceTb.getText())*Integer.valueOf(QtyTb.getText());
          if(i == 1)
          {
              BillTxt.setText(BillTxt.getText()+"   ===================BOOK SHOP==================\n"+" NUM        PRODUCT        PRICE        QUANTITY        TOTAL        PHONE        DATE\n"+i+"       "+BookNameTb.getText()+"                "+PriceTb.getText()+"                   "+QtyTb.getText()+"                 "+Total+"                 "+Ph.getText()+"                 "+DateTb.getText()+"\n");
          }else{
               BillTxt.setText(BillTxt.getText()+i+"       "+BookNameTb.getText()+"               "+PriceTb.getText()+"                  "+QtyTb.getText()+"                "+Total+"                "+Ph.getText()+"                "+DateTb.getText()+"\n");
          }
          GrdTotal = GrdTotal + Total;
          GrdTotalLbl.setText("Rs "+GrdTotal);
          UpdateBook();
      }
      //CLIENT
      
      /*
       if
       {
           JOptionPane.showMessageDialog(this,"Missing Information");
       }else{
           try {
               Con = DriverManager.getConnection("jdbc:derby://localhost:1527/BookShopDb","User1","12345");
               PreparedStatement add = Con.prepareStatement("insert into UserTbl values(?,?,?,?,?)");
               
               
               
               int row = add.executeUpdate();
               JOptionPane.showMessageDialog(this,"User Saved");
              // DisplayUsers();
               Reset();
           } catch (Exception e) {
               e.printStackTrace();
           }
       }*/
    }//GEN-LAST:event_AddToBilBtnMouseClicked

    private void CountRow()
    {
        try {
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/BookShopDb","User1","12345");
            St1 = Con.createStatement();
            Rs1 = St1.executeQuery("select * from User1.BILLTBL order by BNUM DESC FETCH FIRST ROW ONLY");
            Rs1.next();
            int Id = Rs1.getInt(1)+1;
            BillNumTb.setText(Id+"");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    private void PrintBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintBtnMouseClicked
        try {
            BillTxt.print();
        } catch (Exception e) {
            
        }
        SaveBill();
        CountRow();
        Reset();
    }//GEN-LAST:event_PrintBtnMouseClicked

    private void ResetBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResetBtnMouseClicked
       Reset();
    }//GEN-LAST:event_ResetBtnMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
       System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel17MouseClicked

    private void BillNumTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BillNumTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BillNumTbActionPerformed

    private void BillNumTbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BillNumTbMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BillNumTbMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
         new Sale().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void UnameLbl1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UnameLbl1MouseClicked
      new Client().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_UnameLbl1MouseClicked

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
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Billing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddToBilBtn;
    private javax.swing.JTextField BillNumTb;
    private javax.swing.JTextArea BillTxt;
    private javax.swing.JTextField BookNameTb;
    private javax.swing.JTable BooksTable;
    private javax.swing.JTextField Cadd;
    private javax.swing.JTextField ClientNameTb;
    private javax.swing.JTextField DateTb;
    private javax.swing.JLabel GrdTotalLbl;
    private javax.swing.JTextField Ph;
    private javax.swing.JTextField PriceTb;
    private javax.swing.JButton PrintBtn;
    private javax.swing.JTextField QtyTb;
    private javax.swing.JButton ResetBtn;
    private javax.swing.JLabel UnameLbl;
    private javax.swing.JLabel UnameLbl1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
