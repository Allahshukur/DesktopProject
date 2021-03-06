/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lbmsDesktop;

import az.Allahshukur.entity.StudentEntity;
import az.Allahshukur.repository.StudentRepository;
import lbmsDesktop.util.NumberUtil;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

/**
 * ////////// * @author User
 */
public class MainFrame extends javax.swing.JFrame {

    private StudentRepository studentRepository = new StudentRepository();

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        tableList();


    }

    private List<StudentEntity> studentList;

    private void tableList(){
        fillTable1(this.studentRepository.getAll());
    }

    private void fillTable1(List<StudentEntity> studentList){
        DefaultTableModel tableModel = new DefaultTableModel();

        Vector<Vector<Object>> rows = new Vector<>();
        for (StudentEntity s: studentList) {
            Vector<Object> rowData = new Vector<>();
            rowData.add(s.getId());
            rowData.add(s.getName());
            rowData.add(s.getSurname());
            rowData.add(s.getAge());
            rowData.add(s.getScholarship());
            rows.add(rowData);
        }

        Vector<String> columNames = new Vector<>(Arrays.asList("id","Name","Surname","Age","Scholarship"));

        tableModel.setDataVector(rows,columNames);
        tableStudents.setModel(tableModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txtsurname = new javax.swing.JTextField();
        lbName = new javax.swing.JLabel();
        lblsurname = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        lblage = new javax.swing.JLabel();
        txtScholarship = new javax.swing.JTextField();
        lblscholarship = new javax.swing.JLabel();
        btnSearch = new java.awt.Button();
        SpinnerAge = new javax.swing.JSpinner();
        btnDelete = new java.awt.Button();
        btnAdd = new java.awt.Button();
        jScrollBar1 = new javax.swing.JScrollBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableStudents = new javax.swing.JTable();
        lblstudentpage = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusTraversalPolicyProvider(true);

        jTabbedPane2.setAutoscrolls(true);
        jTabbedPane2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jPanel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        txtsurname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtsurname.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbName.setText("Name");

        lblsurname.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblsurname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblsurname.setText("Surname");

        txtname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtname.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblage.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblage.setText("Age");

        txtScholarship.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtScholarship.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtScholarship.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtScholarshipActionPerformed(evt);
            }
        });

        lblscholarship.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblscholarship.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblscholarship.setText("Scholarship");

        btnSearch.setBackground(new java.awt.Color(51, 204, 255));
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSearch.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSearch.setLabel("Search");
        btnSearch.setName("Search"); // NOI18N
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        SpinnerAge.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        SpinnerAge.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SpinnerAge.setName(""); // NOI18N
        SpinnerAge.setValue(0);

        btnDelete.setBackground(new java.awt.Color(255, 0, 0));
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnDelete.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnDelete.setLabel("Delete");
        btnDelete.setName("Delete"); // NOI18N
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeleteMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnDeleteMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnDeleteMouseReleased(evt);
            }
        });
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(0, 153, 255));
        btnAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAdd.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnAdd.setLabel("Add");
        btnAdd.setName("Add"); // NOI18N
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtname)
                            .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(52, 52, 52))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbName, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                        .addGap(87, 87, 87)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                .addGap(4, 4, 4))
                            .addComponent(txtsurname))
                        .addGap(22, 22, 22))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(lblsurname, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                        .addGap(73, 73, 73)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SpinnerAge)
                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(1, 1, 1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(lblage, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                        .addGap(32, 32, 32)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(lblscholarship, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                        .addGap(231, 231, 231))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(txtScholarship)
                        .addGap(221, 221, 221))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblage, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblscholarship)
                        .addComponent(lblsurname)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtsurname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtScholarship, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SpinnerAge, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32))
        );

        tableStudents.setAutoCreateRowSorter(true);
        tableStudents.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 255), new java.awt.Color(51, 0, 255), new java.awt.Color(102, 0, 255), new java.awt.Color(255, 0, 0)));
        tableStudents.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tableStudents.setModel(new javax.swing.table.DefaultTableModel(
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
        tableStudents.setAutoscrolls(false);
        tableStudents.setRowHeight(30);
        tableStudents.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tableStudentsKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tableStudents);

        lblstudentpage.setBackground(new java.awt.Color(0, 255, 255));
        lblstudentpage.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lblstudentpage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblstudentpage.setText("Welcome to Student page");
        lblstudentpage.setToolTipText("");
        lblstudentpage.setAutoscrolls(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1237, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(lblstudentpage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblstudentpage, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Student", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1265, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 651, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Teacher", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1296, 739));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteMouseReleased(MouseEvent evt) {
    }

    private void btnDeleteMousePressed(MouseEvent evt) {
    }

    private void btnDeleteMouseClicked(MouseEvent evt) {
    }

    private void txtScholarshipActionPerformed(ActionEvent evt) {
    }

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int clientAnswer = JOptionPane.showConfirmDialog(
                this,
                "Are you sure?",
                "Be Careful",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE);

        if (clientAnswer==JOptionPane.YES_OPTION) {
            int selectedRow = tableStudents.getSelectedRow();
            Integer id= NumberUtil.agePositiv(this.tableStudents.getModel().getValueAt(selectedRow,0));
            this.studentRepository.delete(id);
            tableList();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed


    private void btnDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseEntered
        // TODO add your handling code here:
        System.out.println("Enter");
    }//GEN-LAST:event_btnDeleteMouseEntered

    private void btnDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseExited
        // TODO add your handling code here:
        System.out.println("exit");
    }//GEN-LAST:event_btnDeleteMouseExited

    private void txtNull(){
        txtsurname.setText(null);
        txtname.setText(null);
        SpinnerAge.setValue(0);
        txtScholarship.setText(null);
    }


    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        studentRepository.insert(
                new StudentEntity()
                .setName(txtname.getText())
                .setSurname(txtsurname.getText())
                .setAge(NumberUtil.agePositiv(SpinnerAge.getValue()))
                .setScholarship(NumberUtil.parseBigdecimal(txtScholarship.getText()))
        );
        tableList();
        txtNull();
    }//GEN-LAST:event_btnAddActionPerformed

    private void tableStudentsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableStudentsKeyReleased
        if (evt.getKeyCode()== KeyEvent.VK_ENTER){
            int selectedRow=tableStudents.getSelectedRow();
            Integer id=NumberUtil.agePositiv(tableStudents.getModel().getValueAt(selectedRow,0));
            String name=(String) tableStudents.getModel().getValueAt(selectedRow,1);
            String surname=(String) tableStudents.getModel().getValueAt(selectedRow,2);
            Integer age=NumberUtil.agePositiv(tableStudents.getModel().getValueAt(selectedRow,3));
            BigDecimal scholarship=NumberUtil.parseBigdecimal(tableStudents.getModel().getValueAt(selectedRow,4));

            this.studentRepository.update(
                    new StudentEntity()
                    .setId(id)
                    .setName(name)
                    .setSurname(surname)
                    .setAge(age)
                    .setScholarship(scholarship)
            );
            tableList();
        }
    }//GEN-LAST:event_tableStudentsKeyReleased

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
         List<StudentEntity> studentList=this.studentRepository.findList(
                txtname.getText(),
                txtsurname.getText(),
                NumberUtil.agePositiv(SpinnerAge.getValue()),
                NumberUtil.parseBigdecimal(txtScholarship.getText())
        );
        fillTable1(studentList);
        txtNull();
    }//GEN-LAST:event_btnSearchActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner SpinnerAge;
    private javax.swing.ButtonGroup btn;
    private java.awt.Button btnAdd;
    private java.awt.Button btnDelete;
    private java.awt.Button btnSearch;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lblage;
    private javax.swing.JLabel lblscholarship;
    private javax.swing.JLabel lblstudentpage;
    private javax.swing.JLabel lblsurname;
    private javax.swing.JTable tableStudents;
    private javax.swing.JTextField txtScholarship;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtsurname;
    // End of variables declaration//GEN-END:variables
}
