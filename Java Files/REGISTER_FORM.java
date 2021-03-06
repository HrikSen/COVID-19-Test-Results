/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project_novelvista;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.border.Border;
//import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.ButtonGroup;
import java.sql.Statement;
/**
 *
 * @author USER
 */
public class REGISTER_FORM extends javax.swing.JFrame {

    /**
     * Creates new form REGISTER_FORM
     */
    public REGISTER_FORM() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(jRadioButton_Male);
        bg1.add(jRadioButton_Female);
        ButtonGroup bg2 = new ButtonGroup();
        bg2.add(jRadioButton_Other);
        bg2.add(jRadioButton_Positive);
        bg2.add(jRadioButton_Negative);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_BG = new javax.swing.JPanel();
        jPanel_BG2 = new javax.swing.JPanel();
        jPanel_BG3 = new javax.swing.JPanel();
        jButton_Register = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_UName = new javax.swing.JTextField();
        jTextField_FName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField_Phone = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton_Positive = new javax.swing.JRadioButton();
        jRadioButton_Female = new javax.swing.JRadioButton();
        jRadioButton_Other = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jRadioButton_Male = new javax.swing.JRadioButton();
        jRadioButton_Negative = new javax.swing.JRadioButton();
        jPasswordField_CPassword = new javax.swing.JPasswordField();
        jPasswordField_Password = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jLabel_Minimize = new javax.swing.JLabel();
        jLabel_Cross = new javax.swing.JLabel();
        jPanel_LOGIN = new javax.swing.JPanel();
        jLabel_Register = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel_BG.setBackground(new java.awt.Color(102, 153, 255));

        jPanel_BG2.setBackground(new java.awt.Color(153, 204, 255));

        jPanel_BG3.setBackground(new java.awt.Color(153, 255, 255));

        jButton_Register.setBackground(new java.awt.Color(0, 153, 153));
        jButton_Register.setFont(new java.awt.Font("Felix Titling", 1, 16)); // NOI18N
        jButton_Register.setText("REGISTER");
        jButton_Register.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton_Register.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Register.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_Register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_RegisterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_RegisterMouseExited(evt);
            }
        });
        jButton_Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RegisterActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jLabel1.setText("Username:");

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jLabel2.setText("Full Name:");

        jTextField_UName.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N

        jTextField_FName.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jTextField_FName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_FNameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jLabel3.setText("Password:");

        jTextField_Phone.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jTextField_Phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_PhoneKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jLabel4.setText("Confirm Password:");

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jLabel5.setText("Phone:");

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jLabel6.setText("Gender:");

        jRadioButton_Positive.setText("Positive");
        jRadioButton_Positive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_PositiveActionPerformed(evt);
            }
        });

        jRadioButton_Female.setText("Female");
        jRadioButton_Female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_FemaleActionPerformed(evt);
            }
        });

        jRadioButton_Other.setText("Other");
        jRadioButton_Other.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_OtherActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jLabel7.setText("Covid Test Result:");

        jRadioButton_Male.setText("Male");
        jRadioButton_Male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_MaleActionPerformed(evt);
            }
        });

        jRadioButton_Negative.setText("Negative");
        jRadioButton_Negative.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_NegativeActionPerformed(evt);
            }
        });

        jPasswordField_CPassword.setText("jPasswordField1");

        jPasswordField_Password.setText("jPasswordField1");

        jLabel8.setForeground(new java.awt.Color(153, 0, 51));
        jLabel8.setText(">> Already have an account? Sign in!");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel_BG3Layout = new javax.swing.GroupLayout(jPanel_BG3);
        jPanel_BG3.setLayout(jPanel_BG3Layout);
        jPanel_BG3Layout.setHorizontalGroup(
            jPanel_BG3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_BG3Layout.createSequentialGroup()
                .addGroup(jPanel_BG3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_BG3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel_BG3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel_BG3Layout.createSequentialGroup()
                                .addGroup(jPanel_BG3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel_BG3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(63, 63, 63)
                                .addGroup(jPanel_BG3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField_UName)
                                    .addComponent(jTextField_FName, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                                    .addComponent(jTextField_Phone, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                                    .addComponent(jPasswordField_Password)))
                            .addGroup(jPanel_BG3Layout.createSequentialGroup()
                                .addGroup(jPanel_BG3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel_BG3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel_BG3Layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addGroup(jPanel_BG3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton_Register, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel_BG3Layout.createSequentialGroup()
                                                .addComponent(jRadioButton_Positive)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jRadioButton_Negative))))
                                    .addGroup(jPanel_BG3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPasswordField_CPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))))
                            .addGroup(jPanel_BG3Layout.createSequentialGroup()
                                .addGap(148, 148, 148)
                                .addComponent(jRadioButton_Male)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton_Female)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton_Other))))
                    .addGroup(jPanel_BG3Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel8)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel_BG3Layout.setVerticalGroup(
            jPanel_BG3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_BG3Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel_BG3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_FName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel_BG3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_UName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_BG3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_BG3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel_BG3Layout.createSequentialGroup()
                        .addComponent(jPasswordField_CPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel_BG3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel_BG3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton_Female)
                    .addComponent(jRadioButton_Other)
                    .addComponent(jRadioButton_Male))
                .addGap(18, 18, 18)
                .addGroup(jPanel_BG3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton_Positive)
                    .addComponent(jRadioButton_Negative))
                .addGap(18, 18, 18)
                .addComponent(jButton_Register, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(23, 23, 23))
        );

        jLabel_Minimize.setFont(new java.awt.Font("Yu Gothic", 1, 22)); // NOI18N
        jLabel_Minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Minimize.setText("-");
        jLabel_Minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_MinimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_MinimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_MinimizeMouseExited(evt);
            }
        });

        jLabel_Cross.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel_Cross.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Cross.setText("X");
        jLabel_Cross.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel_Cross.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Cross.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_CrossMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_CrossMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_CrossMouseExited(evt);
            }
        });

        jPanel_LOGIN.setBackground(new java.awt.Color(153, 204, 255));
        jPanel_LOGIN.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel_Register.setBackground(new java.awt.Color(153, 204, 255));
        jLabel_Register.setFont(new java.awt.Font("Curlz MT", 1, 24)); // NOI18N
        jLabel_Register.setForeground(new java.awt.Color(102, 0, 204));
        jLabel_Register.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Register.setText("REGISTER");

        javax.swing.GroupLayout jPanel_LOGINLayout = new javax.swing.GroupLayout(jPanel_LOGIN);
        jPanel_LOGIN.setLayout(jPanel_LOGINLayout);
        jPanel_LOGINLayout.setHorizontalGroup(
            jPanel_LOGINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_LOGINLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Register, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_LOGINLayout.setVerticalGroup(
            jPanel_LOGINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_Register, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel_BG2Layout = new javax.swing.GroupLayout(jPanel_BG2);
        jPanel_BG2.setLayout(jPanel_BG2Layout);
        jPanel_BG2Layout.setHorizontalGroup(
            jPanel_BG2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_BG2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_BG2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_BG3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_BG2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel_LOGIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105)
                        .addComponent(jLabel_Minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_Cross, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel_BG2Layout.setVerticalGroup(
            jPanel_BG2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_BG2Layout.createSequentialGroup()
                .addGroup(jPanel_BG2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_BG2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel_LOGIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_BG2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel_BG2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_Minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Cross, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel_BG3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel_BGLayout = new javax.swing.GroupLayout(jPanel_BG);
        jPanel_BG.setLayout(jPanel_BGLayout);
        jPanel_BGLayout.setHorizontalGroup(
            jPanel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_BGLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel_BG2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel_BGLayout.setVerticalGroup(
            jPanel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_BGLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel_BG2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_RegisterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_RegisterMouseEntered
        // TODO add your handling code here:
        jButton_Register.setBackground(new Color(0,204,204));
    }//GEN-LAST:event_jButton_RegisterMouseEntered

    private void jButton_RegisterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_RegisterMouseExited
        // TODO add your handling code here:
        jButton_Register.setBackground(new Color(0,153,153));

    }//GEN-LAST:event_jButton_RegisterMouseExited

    private void jButton_RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RegisterActionPerformed
        // TODO add your handling code here:
        //Statement  stmt;
        String fname = jTextField_FName.getText();
        String uname = jTextField_UName.getText();
        String password = String.valueOf(jPasswordField_Password.getPassword());
        String cpassword = String.valueOf(jPasswordField_CPassword.getPassword());
        String phone = jTextField_Phone.getText();
        String gender = "Male";
        String report = "Positive";
       
        if(jRadioButton_Female.isSelected()){
            gender = "Female";
        }
        else if(jRadioButton_Other.isSelected()){
            gender = "Other";
        }
        
        if(jRadioButton_Negative.isSelected()){
            report = "Negative";
        }
        
        if(verifyFields()){
            if(!checkUsername(uname)){
            PreparedStatement ps;
            ResultSet rs;
            
            try {
					Connection conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres", "Tulo2509");
					String query="insert into users values(?,?,?,?,?,?)";
					ps=conn.prepareStatement(query);
					ps.setString(1,uname);
					ps.setString(2,password);
                                        ps.setString(3,fname);
                                        ps.setString(4,phone);
                                        ps.setString(5,gender);
                                        ps.setString(6,report);
					
					int i=ps.executeUpdate();
                                        if(i!=0){
                                            JOptionPane.showMessageDialog(jButton_Register,i+"Your account has been created successfully.");
                                            ps.close();
                                        }
                                        else
                                        {
                                            JOptionPane.showMessageDialog(jButton_Register,i+"Error: Check your information.");
                                        }
					
					conn.close();
                                        /*ps= conn.createStatement();         
					String sql1="Select * from users where username='"+uname+"'";
					String sql2="Select * from users where password='"+password+"'";
                                        String sql3="Select * from users where f_name='"+fname+"'";
                                        String sql4="Select * from users where phone='"+phone+"'";
                                        String sql5="Select * from users where gender='"+gender+"'";
                                        String sql6="Select * from users where report='"+report+"'";
                                        
                                        rs=ps.executeQuery(sql1);
                                        rs=ps.executeQuery(sql2);
                                        rs=ps.executeQuery(sql3);
                                        rs=ps.executeQuery(sql4);
                                        rs=ps.executeQuery(sql5);
                                        rs=ps.executeQuery(sql6);
                                        
					if(rs.next()) {
						//
						//New welcomepage=new New();
                                                //username_exists = true;
                                                JOptionPane.showMessageDialog(null, "Username already taken. Choose another one.");
					}*/
					
					
				} catch(Exception e1) {System.out.println(e1);}
            
        }
        }

    }//GEN-LAST:event_jButton_RegisterActionPerformed

    private void jLabel_MinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MinimizeMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel_MinimizeMouseClicked

    private void jLabel_MinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MinimizeMouseEntered
        Border jLabel_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.WHITE);
        jLabel_Minimize.setBorder(jLabel_border);
        jLabel_Minimize.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel_MinimizeMouseEntered

    private void jLabel_MinimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MinimizeMouseExited
        Border jLabel_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK);
        jLabel_Minimize.setBorder(jLabel_border);
        jLabel_Minimize.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel_MinimizeMouseExited

    private void jLabel_CrossMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CrossMouseClicked
        // TODO add your handling code here:
        System.exit(0);

    }//GEN-LAST:event_jLabel_CrossMouseClicked

    private void jLabel_CrossMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CrossMouseEntered
        Border jLabel_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.WHITE);
        jLabel_Cross.setBorder(jLabel_border);
        jLabel_Cross.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel_CrossMouseEntered

    private void jLabel_CrossMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CrossMouseExited

        Border jLabel_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK);
        jLabel_Cross.setBorder(jLabel_border);
        jLabel_Cross.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel_CrossMouseExited

    private void jTextField_FNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_FNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_FNameActionPerformed

    private void jRadioButton_PositiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_PositiveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_PositiveActionPerformed

    private void jRadioButton_FemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_FemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_FemaleActionPerformed

    private void jRadioButton_OtherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_OtherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_OtherActionPerformed

    private void jRadioButton_MaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_MaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_MaleActionPerformed

    private void jRadioButton_NegativeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_NegativeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_NegativeActionPerformed

    private void jTextField_PhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_PhoneKeyTyped
        // TODO add your handling code here:
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_PhoneKeyTyped

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        LOGIN_FORM rf = new LOGIN_FORM();
        rf.setVisible(true);
        rf.pack();
        rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
        // TODO add your handling code here:
        Border jLabel_border = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.RED);
        jLabel8.setBorder(jLabel_border);
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
        // TODO add your handling code here:
        Border jLabel1_border = BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(0,153, 153));
        jLabel8.setBorder(jLabel1_border);
    }//GEN-LAST:event_jLabel8MouseExited

    /**
     * @param args the command line arguments
     */
    
    public boolean verifyFields(){
        String fname = jTextField_FName.getText();
        String uname = jTextField_UName.getText();
        String password = String.valueOf(jPasswordField_Password.getPassword());
        String cpassword = String.valueOf(jPasswordField_CPassword.getPassword());
        String phone = jTextField_Phone.getText();
        
        if(fname.trim().equals("") || uname.trim().equals("") || phone.trim().equals("")){
            JOptionPane.showMessageDialog(null, "One or more fields are empty.", "Empty Fields", 2);
            return false;
        }
        
        else if(!password.equals(cpassword)){
            JOptionPane.showMessageDialog(null, "Passwords do not match.", "Confirm Password", 2);
            return false;
        }
        
        else
            return true;
    }
    
    public boolean checkUsername(String username){
        Statement st;
        ResultSet rs;
        boolean username_exists = false;
        
        try {
					Connection conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres", "Tulo2509");
					
                                        st= conn.createStatement();         
					String sql="Select * from users where username='"+username;
					rs=st.executeQuery(sql);
					if(rs.next()) {
						//
						//New welcomepage=new New();
                                                username_exists = true;
                                                JOptionPane.showMessageDialog(null, "Username already taken. Choose another one.");
					}
					
					
				} catch(Exception e1) {System.out.println(e1);}
        return username_exists;
    }
    
    
    
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
            java.util.logging.Logger.getLogger(REGISTER_FORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(REGISTER_FORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(REGISTER_FORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(REGISTER_FORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new REGISTER_FORM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Register;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_Cross;
    private javax.swing.JLabel jLabel_Minimize;
    private javax.swing.JLabel jLabel_Register;
    private javax.swing.JPanel jPanel_BG;
    private javax.swing.JPanel jPanel_BG2;
    private javax.swing.JPanel jPanel_BG3;
    private javax.swing.JPanel jPanel_LOGIN;
    private javax.swing.JPasswordField jPasswordField_CPassword;
    private javax.swing.JPasswordField jPasswordField_Password;
    private javax.swing.JRadioButton jRadioButton_Female;
    private javax.swing.JRadioButton jRadioButton_Male;
    private javax.swing.JRadioButton jRadioButton_Negative;
    private javax.swing.JRadioButton jRadioButton_Other;
    private javax.swing.JRadioButton jRadioButton_Positive;
    private javax.swing.JTextField jTextField_FName;
    private javax.swing.JTextField jTextField_Phone;
    private javax.swing.JTextField jTextField_UName;
    // End of variables declaration//GEN-END:variables
}
