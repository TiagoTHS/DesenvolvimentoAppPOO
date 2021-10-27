/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import javax.swing.JOptionPane;
import trabalhofinal.Data;
import trabalhofinal.Repositorio;
import trabalhofinal.Usuario;

/**
 *
 * @author huryel
 */
public class Registrar extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Registrar() {
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

        editarDadosPanel = new javax.swing.JPanel();
        nomejLabel = new javax.swing.JLabel();
        nomeCompleto = new javax.swing.JTextField();
        usuariojLabel = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        sexo = new javax.swing.JTextField();
        sexojLabel = new javax.swing.JLabel();
        passwordjLabel = new javax.swing.JLabel();
        diaNascimento = new javax.swing.JTextField();
        dataNascimentojLabel = new javax.swing.JLabel();
        senha = new javax.swing.JPasswordField();
        anoNascimento = new javax.swing.JTextField();
        mesNascimento = new javax.swing.JTextField();
        pesojLabel = new javax.swing.JLabel();
        alturajLabel = new javax.swing.JLabel();
        peso = new javax.swing.JTextField();
        altura = new javax.swing.JTextField();
        cadastrarjLabel = new javax.swing.JLabel();
        cadastrarTitlejLabel = new javax.swing.JLabel();
        registrarjButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(35, 31, 32));
        setPreferredSize(new java.awt.Dimension(530, 700));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        editarDadosPanel.setBackground(new java.awt.Color(35, 31, 32));

        nomejLabel.setBackground(new java.awt.Color(254, 254, 254));
        nomejLabel.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        nomejLabel.setForeground(new java.awt.Color(254, 254, 254));
        nomejLabel.setText("Nome:");

        usuariojLabel.setBackground(new java.awt.Color(254, 254, 254));
        usuariojLabel.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        usuariojLabel.setForeground(new java.awt.Color(254, 254, 254));
        usuariojLabel.setText("Usuário:");

        sexojLabel.setBackground(new java.awt.Color(254, 254, 254));
        sexojLabel.setForeground(new java.awt.Color(254, 254, 254));
        sexojLabel.setText("Sexo:");

        passwordjLabel.setBackground(new java.awt.Color(254, 254, 254));
        passwordjLabel.setForeground(new java.awt.Color(254, 254, 254));
        passwordjLabel.setText("Password");

        dataNascimentojLabel.setBackground(new java.awt.Color(254, 254, 254));
        dataNascimentojLabel.setForeground(new java.awt.Color(254, 254, 254));
        dataNascimentojLabel.setText("Data de Nascimento:");

        pesojLabel.setBackground(new java.awt.Color(254, 254, 254));
        pesojLabel.setForeground(new java.awt.Color(254, 254, 254));
        pesojLabel.setText("Peso");

        alturajLabel.setBackground(new java.awt.Color(254, 254, 254));
        alturajLabel.setForeground(new java.awt.Color(254, 254, 254));
        alturajLabel.setText("Altura");

        cadastrarjLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icone.png"))); // NOI18N

        cadastrarTitlejLabel.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        cadastrarTitlejLabel.setForeground(new java.awt.Color(241, 90, 35));
        cadastrarTitlejLabel.setText("CADASTRAR");

        registrarjButton.setText("REGISTRAR");
        registrarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarjButtonActionPerformed(evt);
            }
        });

        jButton1.setText("VOLTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout editarDadosPanelLayout = new javax.swing.GroupLayout(editarDadosPanel);
        editarDadosPanel.setLayout(editarDadosPanelLayout);
        editarDadosPanelLayout.setHorizontalGroup(
            editarDadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editarDadosPanelLayout.createSequentialGroup()
                .addGroup(editarDadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editarDadosPanelLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(editarDadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(editarDadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(usuariojLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, editarDadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(editarDadosPanelLayout.createSequentialGroup()
                                        .addComponent(nomejLabel)
                                        .addGap(398, 398, 398))
                                    .addComponent(nomeCompleto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(editarDadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sexojLabel)
                                    .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(editarDadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(editarDadosPanelLayout.createSequentialGroup()
                                    .addComponent(diaNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(mesNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(anoNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(dataNascimentojLabel)
                                .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(passwordjLabel)
                                .addComponent(pesojLabel)
                                .addComponent(alturajLabel)
                                .addComponent(peso, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(altura, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(editarDadosPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addGap(96, 96, 96)
                        .addGroup(editarDadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(editarDadosPanelLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(cadastrarjLabel))
                            .addComponent(cadastrarTitlejLabel))))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editarDadosPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(registrarjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(192, 192, 192))
        );
        editarDadosPanelLayout.setVerticalGroup(
            editarDadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editarDadosPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(editarDadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cadastrarjLabel)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cadastrarTitlejLabel)
                .addGap(18, 18, 18)
                .addComponent(nomejLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usuariojLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sexojLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordjLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dataNascimentojLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editarDadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diaNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anoNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mesNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(pesojLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alturajLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(altura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registrarjButton)
                .addContainerGap())
        );

        getContentPane().add(editarDadosPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 710));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void registrarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarjButtonActionPerformed
        String name = nomeCompleto.getText();
        String user = usuario.getText();
        String sex = sexo.getText();
        String password = String.valueOf(senha.getPassword());
        
        if (name.isEmpty() || user.isEmpty() || sex.isEmpty() || password.isEmpty() || diaNascimento.getText().isEmpty() || mesNascimento.getText().isEmpty() || anoNascimento.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos", "Alerta", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            Repositorio rep = new Repositorio();
            rep.leUsuarios();
            
            int dayN = Integer.parseInt(diaNascimento.getText());
            int monthN = Integer.parseInt(mesNascimento.getText());
            int yearN = Integer.parseInt(anoNascimento.getText());
            float weight = Float.parseFloat(peso.getText());
            float height = Float.parseFloat(altura.getText());
            
            if (!rep.getUsuarios().containsKey(user)){
                Usuario u = new Usuario (name, sex, user, password, new Data(dayN, monthN, yearN), weight, height, weight, height);
                rep.addUsuario(u);
                JOptionPane.showMessageDialog(null, "Usuario cadastrado com sucesso!", "Alerta", JOptionPane.INFORMATION_MESSAGE);
                Home h = new Home(u);
                h.setVisible(true);
                this.setVisible(false);
                rep.setNomeUser(u.getNomeUsuario());
                rep.attAlimento();
                rep.attExercicio();
                rep.attDietas();
                rep.attTreinos();
                rep.attRegistrosDiarios();
            }
            else {
                JOptionPane.showMessageDialog(null, "Nome de usuario já existe", "Alerta", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_registrarjButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Login l = new Login();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField altura;
    private javax.swing.JLabel alturajLabel;
    private javax.swing.JTextField anoNascimento;
    private javax.swing.JLabel cadastrarTitlejLabel;
    private javax.swing.JLabel cadastrarjLabel;
    private javax.swing.JLabel dataNascimentojLabel;
    private javax.swing.JTextField diaNascimento;
    private javax.swing.JPanel editarDadosPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField mesNascimento;
    private javax.swing.JTextField nomeCompleto;
    private javax.swing.JLabel nomejLabel;
    private javax.swing.JLabel passwordjLabel;
    private javax.swing.JTextField peso;
    private javax.swing.JLabel pesojLabel;
    private javax.swing.JButton registrarjButton;
    private javax.swing.JPasswordField senha;
    private javax.swing.JTextField sexo;
    private javax.swing.JLabel sexojLabel;
    private javax.swing.JTextField usuario;
    private javax.swing.JLabel usuariojLabel;
    // End of variables declaration//GEN-END:variables
}
