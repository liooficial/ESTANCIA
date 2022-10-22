/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfas_alumno;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Geovanni
 */
public class Reservar_salon extends javax.swing.JFrame {

    /**
     * Creates new form Administrar_horario
     */
    public Reservar_salon(final String tipo,String nom) {
        initComponents();
        verificar(tipo);
        if(tipo.equals("Docente")){
        rsscalelabel.RSScaleLabel.setScaleLabel(lb_usuario,"src/img/profesor.png");
        }else{
        bt_registrarClase.setVisible(false);
        rsscalelabel.RSScaleLabel.setScaleLabel(lb_usuario,"src/img/estudiante.png");
        }
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
        lb_usuario = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lb_imgPC1 = new javax.swing.JLabel();
        lb_imgPC4 = new javax.swing.JLabel();
        lb_imgPC3 = new javax.swing.JLabel();
        lb_imgPC2 = new javax.swing.JLabel();
        lb_imgPC8 = new javax.swing.JLabel();
        lb_imgPC7 = new javax.swing.JLabel();
        lb_imgPC6 = new javax.swing.JLabel();
        lb_imgPC5 = new javax.swing.JLabel();
        lb_imgPC16 = new javax.swing.JLabel();
        lb_imgPC15 = new javax.swing.JLabel();
        lb_imgPC13 = new javax.swing.JLabel();
        lb_imgPC14 = new javax.swing.JLabel();
        lb_imgPC12 = new javax.swing.JLabel();
        lb_imgPC11 = new javax.swing.JLabel();
        lb_imgPC10 = new javax.swing.JLabel();
        lb_imgPC9 = new javax.swing.JLabel();
        lb_imgPC17 = new javax.swing.JLabel();
        lb_imgPC20 = new javax.swing.JLabel();
        lb_imgPC22 = new javax.swing.JLabel();
        lb_imgPC18 = new javax.swing.JLabel();
        lb_imgPC19 = new javax.swing.JLabel();
        lb_imgPC23 = new javax.swing.JLabel();
        lb_imgPC21 = new javax.swing.JLabel();
        lb_imgPC24 = new javax.swing.JLabel();
        lb_imgPC28 = new javax.swing.JLabel();
        lb_imgPC27 = new javax.swing.JLabel();
        lb_imgPC26 = new javax.swing.JLabel();
        lb_imgPC25 = new javax.swing.JLabel();
        lb_imgPC32 = new javax.swing.JLabel();
        lb_imgPC31 = new javax.swing.JLabel();
        lb_imgPC30 = new javax.swing.JLabel();
        lb_imgPC29 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        bt_registrarClase = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        pn_LAS = new javax.swing.JPanel();
        lb_LAS = new javax.swing.JLabel();
        pn_LDM = new javax.swing.JPanel();
        lb_LDM = new javax.swing.JLabel();
        pn_LDS = new javax.swing.JPanel();
        lb_LDS = new javax.swing.JLabel();
        pn_LPG = new javax.swing.JPanel();
        lb_LPG = new javax.swing.JLabel();
        pn_LSO = new javax.swing.JPanel();
        lb_LSO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(107, 8, 48));

        lb_usuario.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(244, 244, 244));

        lb_imgPC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/computadora-verde.png"))); // NOI18N

        lb_imgPC4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/computadora-verde.png"))); // NOI18N

        lb_imgPC3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/computadora-verde.png"))); // NOI18N

        lb_imgPC2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/computadora-verde.png"))); // NOI18N

        lb_imgPC8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/computadora-verde.png"))); // NOI18N

        lb_imgPC7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/computadora-verde.png"))); // NOI18N

        lb_imgPC6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/computadora-verde.png"))); // NOI18N

        lb_imgPC5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/computadora-verde.png"))); // NOI18N

        lb_imgPC16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/computadora-verde.png"))); // NOI18N

        lb_imgPC15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/computadora-verde.png"))); // NOI18N

        lb_imgPC13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/computadora-verde.png"))); // NOI18N

        lb_imgPC14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/computadora-verde.png"))); // NOI18N

        lb_imgPC12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/computadora-verde.png"))); // NOI18N

        lb_imgPC11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/computadora-verde.png"))); // NOI18N

        lb_imgPC10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/computadora-verde.png"))); // NOI18N

        lb_imgPC9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/computadora-verde.png"))); // NOI18N

        lb_imgPC17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/computadora-verde.png"))); // NOI18N

        lb_imgPC20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/computadora-verde.png"))); // NOI18N

        lb_imgPC22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/computadora-verde.png"))); // NOI18N

        lb_imgPC18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/computadora-verde.png"))); // NOI18N

        lb_imgPC19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/computadora-verde.png"))); // NOI18N

        lb_imgPC23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/computadora-verde.png"))); // NOI18N

        lb_imgPC21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/computadora-verde.png"))); // NOI18N

        lb_imgPC24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/computadora-verde.png"))); // NOI18N

        lb_imgPC28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/computadora-verde.png"))); // NOI18N

        lb_imgPC27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/computadora-verde.png"))); // NOI18N

        lb_imgPC26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/computadora-verde.png"))); // NOI18N

        lb_imgPC25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/computadora-verde.png"))); // NOI18N

        lb_imgPC32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/computadora-verde.png"))); // NOI18N

        lb_imgPC31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/computadora-verde.png"))); // NOI18N

        lb_imgPC30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/computadora-verde.png"))); // NOI18N

        lb_imgPC29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/computadora-verde.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel1.setText("Laboratorio de Administración de servidores");

        jPanel4.setBackground(new java.awt.Color(255, 198, 38));

        bt_registrarClase.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        bt_registrarClase.setText("Registrar clase");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_registrarClase)
                .addGap(421, 421, 421))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(bt_registrarClase)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lb_imgPC1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lb_imgPC2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lb_imgPC3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lb_imgPC4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(lb_imgPC25, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(lb_imgPC26, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(lb_imgPC27, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(lb_imgPC28, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lb_imgPC9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lb_imgPC10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lb_imgPC11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lb_imgPC12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(lb_imgPC17, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lb_imgPC18, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lb_imgPC19, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lb_imgPC20, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_imgPC5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_imgPC21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lb_imgPC22, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lb_imgPC23, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lb_imgPC24, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lb_imgPC6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lb_imgPC7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lb_imgPC8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lb_imgPC14, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lb_imgPC15, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lb_imgPC16, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addComponent(lb_imgPC13, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(294, 294, 294))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addComponent(lb_imgPC29, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(lb_imgPC30, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(lb_imgPC31, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(lb_imgPC32, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(51, 51, 51))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(382, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(233, 233, 233))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(59, 59, 59)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_imgPC1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_imgPC3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_imgPC2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_imgPC4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_imgPC5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_imgPC7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_imgPC6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_imgPC8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_imgPC9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_imgPC11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_imgPC10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_imgPC12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_imgPC14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_imgPC15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_imgPC13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_imgPC16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_imgPC17, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_imgPC19, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_imgPC18, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_imgPC20, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_imgPC22, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_imgPC21, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_imgPC23, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_imgPC24, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_imgPC25, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_imgPC27, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_imgPC26, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_imgPC28, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_imgPC30, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_imgPC29, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_imgPC31, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_imgPC32, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(1, 26, 93));

        pn_LAS.setBackground(new java.awt.Color(81, 209, 12));

        lb_LAS.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        lb_LAS.setText("LAS");

        javax.swing.GroupLayout pn_LASLayout = new javax.swing.GroupLayout(pn_LAS);
        pn_LAS.setLayout(pn_LASLayout);
        pn_LASLayout.setHorizontalGroup(
            pn_LASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_LASLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(lb_LAS)
                .addGap(41, 41, 41))
        );
        pn_LASLayout.setVerticalGroup(
            pn_LASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_LASLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_LAS)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pn_LDM.setBackground(new java.awt.Color(81, 209, 12));

        lb_LDM.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        lb_LDM.setText("LDM");

        javax.swing.GroupLayout pn_LDMLayout = new javax.swing.GroupLayout(pn_LDM);
        pn_LDM.setLayout(pn_LDMLayout);
        pn_LDMLayout.setHorizontalGroup(
            pn_LDMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_LDMLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(lb_LDM)
                .addGap(41, 41, 41))
        );
        pn_LDMLayout.setVerticalGroup(
            pn_LDMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_LDMLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_LDM)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pn_LDS.setBackground(new java.awt.Color(81, 209, 12));

        lb_LDS.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        lb_LDS.setText("LDS");

        javax.swing.GroupLayout pn_LDSLayout = new javax.swing.GroupLayout(pn_LDS);
        pn_LDS.setLayout(pn_LDSLayout);
        pn_LDSLayout.setHorizontalGroup(
            pn_LDSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_LDSLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(lb_LDS)
                .addGap(41, 41, 41))
        );
        pn_LDSLayout.setVerticalGroup(
            pn_LDSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_LDSLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_LDS)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pn_LPG.setBackground(new java.awt.Color(81, 209, 12));

        lb_LPG.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        lb_LPG.setText("LPG");

        javax.swing.GroupLayout pn_LPGLayout = new javax.swing.GroupLayout(pn_LPG);
        pn_LPG.setLayout(pn_LPGLayout);
        pn_LPGLayout.setHorizontalGroup(
            pn_LPGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_LPGLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(lb_LPG)
                .addGap(41, 41, 41))
        );
        pn_LPGLayout.setVerticalGroup(
            pn_LPGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_LPGLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_LPG)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pn_LSO.setBackground(new java.awt.Color(81, 209, 12));

        lb_LSO.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        lb_LSO.setText("LSO");

        javax.swing.GroupLayout pn_LSOLayout = new javax.swing.GroupLayout(pn_LSO);
        pn_LSO.setLayout(pn_LSOLayout);
        pn_LSOLayout.setHorizontalGroup(
            pn_LSOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_LSOLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(lb_LSO)
                .addGap(41, 41, 41))
        );
        pn_LSOLayout.setVerticalGroup(
            pn_LSOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_LSOLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_LSO)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pn_LAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pn_LDM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pn_LDS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pn_LPG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pn_LSO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pn_LAS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pn_LDM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pn_LDS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pn_LPG, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pn_LSO, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void verificar(String tipo) {
        try {
            String asunto="";
            Connection connection = Base_datos.getConnection();
            PreparedStatement ps;
            ResultSet rs;
            ps = connection.prepareStatement("SELECT Asunto,Cuerpo FROM Mensajes where TipoDeUsuarioAlQueSeDirige='"+tipo+"'");
            rs = ps.executeQuery();
            while(rs.next()){
                asunto=rs.getString("Asunto");
            }
            if(!"".equals(asunto)){
            mensaje ventana = new mensaje(tipo);
            ventana.setAlwaysOnTop(true);
            ventana.setVisible(true);
            this.setVisible(false);
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
            JOptionPane.showMessageDialog(null, ex.toString());
        }       
    }
    
    
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_registrarClase;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lb_LAS;
    private javax.swing.JLabel lb_LDM;
    private javax.swing.JLabel lb_LDS;
    private javax.swing.JLabel lb_LPG;
    private javax.swing.JLabel lb_LSO;
    private javax.swing.JLabel lb_imgPC1;
    private javax.swing.JLabel lb_imgPC10;
    private javax.swing.JLabel lb_imgPC11;
    private javax.swing.JLabel lb_imgPC12;
    private javax.swing.JLabel lb_imgPC13;
    private javax.swing.JLabel lb_imgPC14;
    private javax.swing.JLabel lb_imgPC15;
    private javax.swing.JLabel lb_imgPC16;
    private javax.swing.JLabel lb_imgPC17;
    private javax.swing.JLabel lb_imgPC18;
    private javax.swing.JLabel lb_imgPC19;
    private javax.swing.JLabel lb_imgPC2;
    private javax.swing.JLabel lb_imgPC20;
    private javax.swing.JLabel lb_imgPC21;
    private javax.swing.JLabel lb_imgPC22;
    private javax.swing.JLabel lb_imgPC23;
    private javax.swing.JLabel lb_imgPC24;
    private javax.swing.JLabel lb_imgPC25;
    private javax.swing.JLabel lb_imgPC26;
    private javax.swing.JLabel lb_imgPC27;
    private javax.swing.JLabel lb_imgPC28;
    private javax.swing.JLabel lb_imgPC29;
    private javax.swing.JLabel lb_imgPC3;
    private javax.swing.JLabel lb_imgPC30;
    private javax.swing.JLabel lb_imgPC31;
    private javax.swing.JLabel lb_imgPC32;
    private javax.swing.JLabel lb_imgPC4;
    private javax.swing.JLabel lb_imgPC5;
    private javax.swing.JLabel lb_imgPC6;
    private javax.swing.JLabel lb_imgPC7;
    private javax.swing.JLabel lb_imgPC8;
    private javax.swing.JLabel lb_imgPC9;
    private javax.swing.JLabel lb_usuario;
    private javax.swing.JPanel pn_LAS;
    private javax.swing.JPanel pn_LDM;
    private javax.swing.JPanel pn_LDS;
    private javax.swing.JPanel pn_LPG;
    private javax.swing.JPanel pn_LSO;
    // End of variables declaration//GEN-END:variables
}
