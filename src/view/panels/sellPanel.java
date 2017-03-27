/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.panels;

import control.sellcontrol;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.fatora;
import model.sellInfoModel;
import model.tablesmart;

/**
 *
 * @author compucare
 */
public class sellPanel extends javax.swing.JPanel {

    sellcontrol sell;
    tablesmart tsmart;
    String listType = "customer";

    private ArrayList<sellInfoModel> itemsList = new ArrayList<>();
    private Object items[][];

    private final String tablecols[] = {"اسم المنتج", "الكمـيـة", "سعر الوحده", "سعر الكل"};

    public sellPanel() {
        initComponents();
        sell = new sellcontrol();
        List.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        //start code of fill Customer List when open panel
        Object custs[][] = sell.searchCustomers("");
        DefaultListModel listModel = new DefaultListModel();

        for (int i = 0; i < custs.length; i++) {
            listModel.addElement(custs[i][1]);
        }
        List.setModel(listModel);
        // end code of fill Customer List when open panel

        tsmart = new tablesmart();
        DefaultTableModel model = new DefaultTableModel(tablecols, 1);
        TableItems.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        TableItems.setModel(model);

        lblsaved.setIcon(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtcustomer = new javax.swing.JTextField();
        txtProuduct = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCount = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableItems = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        lblMoney = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtpaid = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        List = new javax.swing.JList();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        btnsure = new javax.swing.JButton();
        lblsaved = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 170, 170));
        setForeground(new java.awt.Color(0, 102, 51));
        setPreferredSize(new java.awt.Dimension(1000, 475));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(0, 204, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(900, 74));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("اسم المشترى");

        txtcustomer.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        txtcustomer.setForeground(new java.awt.Color(0, 0, 102));
        txtcustomer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 170, 170), 2));
        txtcustomer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcustomerKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcustomerKeyReleased(evt);
            }
        });

        txtProuduct.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        txtProuduct.setForeground(new java.awt.Color(0, 0, 102));
        txtProuduct.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 170, 170), 2));
        txtProuduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProuductActionPerformed(evt);
            }
        });
        txtProuduct.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtProuductKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtProuductKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("اسم المنتج");

        txtPrice.setEditable(false);
        txtPrice.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        txtPrice.setForeground(new java.awt.Color(0, 0, 102));
        txtPrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 170, 170), 2));
        txtPrice.setMaximumSize(new java.awt.Dimension(100, 50));
        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("السعر");

        txtCount.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        txtCount.setForeground(new java.awt.Color(0, 0, 102));
        txtCount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 170, 170), 2));
        txtCount.setMaximumSize(new java.awt.Dimension(100, 50));
        txtCount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCountKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCountKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("الكمية");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/add2.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(txtCount, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(10, 10, 10)
                .addComponent(txtProuduct, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addGap(7, 7, 7)
                .addComponent(jLabel2)
                .addGap(10, 10, 10)
                .addComponent(txtcustomer, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCount, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProuduct, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(710, 300));

        TableItems.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 170, 170), 2));
        TableItems.setForeground(new java.awt.Color(0, 153, 51));
        TableItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TableItems.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableItemsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableItems);

        jPanel7.setBackground(new java.awt.Color(0, 204, 255));

        lblMoney.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        lblMoney.setForeground(new java.awt.Color(255, 255, 255));
        lblMoney.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMoney.setText("0.0");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel8.setText("المدفوع");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel9.setText("الاجمالي : ");

        txtpaid.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtpaid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 170, 170), 2));
        txtpaid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpaidKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(212, 212, 212)
                .addComponent(txtpaid)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(28, 28, 28))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtpaid, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 759, Short.MAX_VALUE))
                .addGap(2, 2, 2))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.setMaximumSize(new java.awt.Dimension(90, 500));
        jPanel4.setPreferredSize(new java.awt.Dimension(80, 319));

        List.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        List.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        List.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(List);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(0, 204, 255));

        jButton3.setBackground(new java.awt.Color(0, 204, 204));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("تعديل");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(0, 204, 204));
        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("جديد");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(0, 204, 204));
        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("حذف");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(0, 204, 204));
        jButton8.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("تاكيد وطباعة");

        btnsure.setBackground(new java.awt.Color(0, 204, 204));
        btnsure.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnsure.setForeground(new java.awt.Color(255, 255, 255));
        btnsure.setText("تاكيد");
        btnsure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsureActionPerformed(evt);
            }
        });

        lblsaved.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/mark (2).png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addComponent(btnsure, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(lblsaved)
                .addGap(182, 182, 182)
                .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnsure, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lblsaved, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 970, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 763, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)))
                .addGap(5, 5, 5))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        jPanel6.setBackground(new java.awt.Color(0, 170, 170));
        jPanel6.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("بــيــع");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/1458935647_testimonials.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtProuductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProuductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProuductActionPerformed

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed

    private void txtcustomerKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcustomerKeyReleased
        String s = txtcustomer.getText();
        listType = "customer";
        Object custs[][] = sell.searchCustomers(s);
        DefaultListModel listModel = new DefaultListModel();

        for (int i = 0; i < custs.length; i++) {
            listModel.addElement(custs[i][1]);
        }
        List.setModel(listModel);


    }//GEN-LAST:event_txtcustomerKeyReleased

    private void txtProuductKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProuductKeyReleased
        String s = txtProuduct.getText();
        listType = "prouduct";

        Object products[][] = sell.searchProuducts(s);
        DefaultListModel listModel = new DefaultListModel();

        for (int i = 0; i < products.length; i++) {
            listModel.addElement(products[i][1]);
        }
        List.setModel(listModel);


    }//GEN-LAST:event_txtProuductKeyReleased

    private void ListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListValueChanged
        if (listType.equals("customer")) {
            if (List.getSelectedIndex() != -1) {
                txtcustomer.setText(List.getSelectedValue() + "");
                txtProuduct.requestFocus();
            }
        } else if (listType.equals("prouduct")) {
            if (List.getSelectedIndex() != -1) {
                String selectedValue = List.getSelectedValue() + "";
                txtProuduct.setText(selectedValue);
                Double ProuductPrice = (double) sell.prouctPrice(selectedValue);
                if (ProuductPrice != 0) {
                    txtPrice.setText(ProuductPrice + "");
                }
                txtCount.requestFocus();
            }
        }


    }//GEN-LAST:event_ListValueChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (isValidate()) {
            sellInfoModel item = new sellInfoModel();
            item.setProuductName(txtProuduct.getText());
            item.setProuduct_price(Double.parseDouble(txtPrice.getText()));
            item.setProuduct_count(Integer.parseInt(txtCount.getText()));
            itemsList.add(item);
            if (sell.isAvalibleAmountOfProuduct(txtProuduct.getText(), sumItemAmount(txtProuduct.getText())) == false) {
                JOptionPane.showMessageDialog(null, "لا يوجد كمية متوفرة من هذا المنتج ");
                itemsList.remove(itemsList.size() - 1);
            } else {
                this.items = new Object[itemsList.size()][4];
                for (int i = 0; i < itemsList.size(); i++) {
                    items[i][0] = itemsList.get(i).getProuductName();
                    items[i][1] = itemsList.get(i).getProuduct_count();
                    items[i][2] = itemsList.get(i).getProuduct_price();
                    items[i][3] = (itemsList.get(i).getProuduct_price() * itemsList.get(i).getProuduct_count());

                }
                DefaultTableModel model = new DefaultTableModel(items, tablecols);
                TableItems.setModel(model);
                tsmart.setItemsTableAlignment(TableItems);
                lblMoney.setText(sell.allMoney(itemsList) + "");
                txtProuduct.setText("");
                txtPrice.setText("");
                txtCount.setText("");
                txtProuduct.requestFocus();
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void TableItemsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableItemsMouseClicked
        int row = TableItems.getSelectedRow();
        if (row != -1) {
            String pr = "" + TableItems.getValueAt(row, 0);
            String pr_count = "" + TableItems.getValueAt(row, 1);
            String pr_price = "" + TableItems.getValueAt(row, 2);
            txtProuduct.setText(pr);
            txtCount.setText(pr_count);
            txtPrice.setText(pr_price);

        }


    }//GEN-LAST:event_TableItemsMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int row = TableItems.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(null, "من فضلك اختر ما تريد تعديله");
        } else {
            if (isValidate()) {

                int sur = JOptionPane.showConfirmDialog(null, "هل انت متاكد من انك تريد التعديل !!");
                if (sur == 0) {
                    int lastValue = itemsList.get(row).getProuduct_count();
                    itemsList.get(row).setProuduct_count(Integer.parseInt(txtCount.getText()));
                    if (sell.isAvalibleAmountOfProuduct(txtProuduct.getText(), sumItemAmount(txtProuduct.getText())) == false) {
                        JOptionPane.showMessageDialog(null, "لا يوجد كمية متوفرة من هذا المنتج ");
                        itemsList.get(row).setProuduct_count(lastValue);
                    } else {
                        this.items = new Object[itemsList.size()][4];

                        for (int i = 0; i < itemsList.size(); i++) {
                            items[i][0] = itemsList.get(i).getProuductName();
                            items[i][1] = itemsList.get(i).getProuduct_count();
                            items[i][2] = itemsList.get(i).getProuduct_price();
                            items[i][3] = (itemsList.get(i).getProuduct_price() * itemsList.get(i).getProuduct_count());

                        }
                        DefaultTableModel model = new DefaultTableModel(items, tablecols);
                        TableItems.setModel(model);
                        tsmart.setItemsTableAlignment(TableItems);
                        lblMoney.setText(sell.allMoney(itemsList) + "");
                    }
                } else {
                    TableItems.clearSelection();
                }
            }
        }


    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        int row = TableItems.getSelectedRow();
        System.out.println(row);
        if (row == -1) {
            JOptionPane.showMessageDialog(null, "من فضلك اختر ما تريد حذفه !");
        } else {
            int sur = JOptionPane.showConfirmDialog(null, "هل انت متاكد من انك تريد حذف هذا المنتج !!");
            if (sur == 0) {
                itemsList.remove(row);
                this.items = new Object[itemsList.size()][4];

                for (int i = 0; i < itemsList.size(); i++) {
                    items[i][0] = itemsList.get(i).getProuductName();
                    items[i][1] = itemsList.get(i).getProuduct_count();
                    items[i][2] = itemsList.get(i).getProuduct_price();
                    items[i][3] = (itemsList.get(i).getProuduct_price() * itemsList.get(i).getProuduct_count());

                }
                DefaultTableModel model = new DefaultTableModel(items, tablecols);
                TableItems.setModel(model);
                tsmart.setItemsTableAlignment(TableItems);
                lblMoney.setText(sell.allMoney(itemsList) + "");
            } else {
                TableItems.clearSelection();
            }
        }


    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        int confirm = JOptionPane.showConfirmDialog(null, "هل انت متاكد من بدا فاتورة جديده والغاء هذه");
        if (confirm == 0) {
            itemsList.removeAll(itemsList);
            this.items = new Object[itemsList.size()][4];

            DefaultTableModel model = new DefaultTableModel(items, tablecols);
            TableItems.setModel(model);
            tsmart.setItemsTableAlignment(TableItems);
            txtcustomer.setText("");
            txtProuduct.setText("");
            txtPrice.setText("");
            txtCount.setText("");
            txtpaid.setText("");
            lblsaved.setIcon(null);
            lblMoney.setText(sell.allMoney(itemsList) + "");
            txtcustomer.setEditable(true);
            txtCount.setEditable(true);
            txtProuduct.setEditable(true);
            List.setEnabled(true);
            btnsure.setEnabled(true);

        }

    }//GEN-LAST:event_jButton6ActionPerformed

    private void txtCountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCountKeyReleased
        if (txtCount.getText().matches("\\d*")) {
            txtCount.setBackground(Color.white);
        } else {
            txtCount.setBackground(Color.red);
        }

    }//GEN-LAST:event_txtCountKeyReleased

    private void btnsureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsureActionPerformed

        String customerName = txtcustomer.getText();
        int CustID = sell.getCustomerId(customerName);
        if (CustID == 0) {
            int confirm = JOptionPane.showConfirmDialog(null, "اسم المشتري هذا لم يسجل من قبل هل تريد اضافته الان ؟");
            if (confirm == 0) {
                int cusid = sell.insertCustomerandGetId(customerName);

                if (!txtpaid.getText().equals("") && (txtpaid.getText().matches("\\d*\\.\\d*") || txtpaid.getText().matches("\\d*"))) {
                    fatora ft = new fatora();
                    ft.setCustomerID(cusid);
                    ft.setMdfo3(Double.parseDouble(txtpaid.getText()));
                    ft.setAllMoney(Double.parseDouble(lblMoney.getText()));
                    sell.addFatora(ft);
                    sell.insertAllFatoraItems(ft.getFatoraID(), itemsList, ft.getBaki());

                    // empty and disable 
                    txtcustomer.setEditable(false);
                    txtCount.setEditable(false);
                    txtProuduct.setEditable(false);
                    List.setEnabled(false);
                    btnsure.setEnabled(false);

                    lblsaved.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/mark (2).png")));

                } else {
                    txtpaid.setBackground(Color.red);
                }

            }

        } else {

            // if customer is exists before 
            if (!txtpaid.getText().equals("") && (txtpaid.getText().matches("\\d*\\.\\d*") || txtpaid.getText().matches("\\d*"))) {
                if (Double.parseDouble(txtpaid.getText()) < Double.parseDouble(lblMoney.getText())) {
                    fatora ft = new fatora();
                    ft.setCustomerID(CustID);
                    ft.setMdfo3(Double.parseDouble(txtpaid.getText()));
                    ft.setAllMoney(Double.parseDouble(lblMoney.getText()));
                    sell.addFatora(ft);
                    sell.insertAllFatoraItems(ft.getFatoraID(), itemsList, ft.getBaki());
                    lblsaved.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/mark (2).png")));

                    // empty and disable 
                    txtcustomer.setEditable(false);
                    txtCount.setEditable(false);
                    txtProuduct.setEditable(false);
                    List.setEnabled(false);
                    btnsure.setEnabled(false);
                } else {
                    JOptionPane.showMessageDialog(null, "تحذير لقد ادخلت المدفوع اكتر من الاجمالي !");
                }

            } else {
                txtpaid.setBackground(Color.red);
            }

        }


    }//GEN-LAST:event_btnsureActionPerformed

    private void txtpaidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpaidKeyReleased

        if (txtpaid.getText().matches("\\d*.\\d*") || txtpaid.getText().equals("")) {
            txtpaid.setBackground(Color.white);
        } else {
            txtpaid.setBackground(Color.red);

        }


    }//GEN-LAST:event_txtpaidKeyReleased

    private void txtcustomerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcustomerKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            txtProuduct.requestFocus();
        }


    }//GEN-LAST:event_txtcustomerKeyPressed

    private void txtProuductKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProuductKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            txtCount.requestFocus();
        }


    }//GEN-LAST:event_txtProuductKeyPressed

    private void txtCountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCountKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            if (isValidate()) {
                sellInfoModel item = new sellInfoModel();
                item.setProuductName(txtProuduct.getText());
                item.setProuduct_price(Double.parseDouble(txtPrice.getText()));
                item.setProuduct_count(Integer.parseInt(txtCount.getText()));
                itemsList.add(item);
                if (sell.isAvalibleAmountOfProuduct(txtProuduct.getText(), sumItemAmount(txtProuduct.getText())) == false) {
                    JOptionPane.showMessageDialog(null, "لا يوجد كمية متوفرة من هذا المنتج ");
                    itemsList.remove(itemsList.size() - 1);
                } else {
                    this.items = new Object[itemsList.size()][4];
                    for (int i = 0; i < itemsList.size(); i++) {
                        items[i][0] = itemsList.get(i).getProuductName();
                        items[i][1] = itemsList.get(i).getProuduct_count();
                        items[i][2] = itemsList.get(i).getProuduct_price();
                        items[i][3] = (itemsList.get(i).getProuduct_price() * itemsList.get(i).getProuduct_count());

                    }
                    DefaultTableModel model = new DefaultTableModel(items, tablecols);
                    TableItems.setModel(model);
                    tsmart.setItemsTableAlignment(TableItems);
                    lblMoney.setText(sell.allMoney(itemsList) + "");
                    txtProuduct.setText("");
                    txtPrice.setText("");
                    txtCount.setText("");
                    txtProuduct.requestFocus();
                }
            }

        }
    }//GEN-LAST:event_txtCountKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList List;
    private javax.swing.JTable TableItems;
    private javax.swing.JButton btnsure;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblMoney;
    private javax.swing.JLabel lblsaved;
    private javax.swing.JTextField txtCount;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtProuduct;
    private javax.swing.JTextField txtcustomer;
    private javax.swing.JTextField txtpaid;
    // End of variables declaration//GEN-END:variables

    public boolean isValidate() {
        if (txtcustomer.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "من فضلك ادخل اسم المشتري !");
            return false;
        } else if (txtProuduct.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "من فضلك اختر المنتج");

            return false;
        } else if (txtCount.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "من فضلك ادخل الكمية المطلوبه !");

            return false;
        } else if (sell.isAvalableProuduct(txtProuduct.getText()) == false) {
            JOptionPane.showMessageDialog(null, "تاكد انك اخترت منتج متوفر");

            return false;
        } else if (!txtCount.getText().matches("\\d*") || Integer.parseInt(txtCount.getText()) == 0) {
            JOptionPane.showMessageDialog(null, "تاكد انك ادخلت الكمية بصيغة ارقام فقط");

            return false;
        } else if (sell.isAvalibleAmountOfProuduct(txtProuduct.getText(), sumItemAmount(txtProuduct.getText())) == false) {
            JOptionPane.showMessageDialog(null, "لا يوجد كمية متوفرة من هذا المنتج ");

            return false;
        }

        return true;
    }

    public int sumItemAmount(String prouduct) {
        int amount = 0;
        for (int i = 0; i < itemsList.size(); i++) {
            if (itemsList.get(i).getProuductName().equals(prouduct)) {
                amount += itemsList.get(i).getProuduct_count();
            }
        }

        return amount;
    }

}
