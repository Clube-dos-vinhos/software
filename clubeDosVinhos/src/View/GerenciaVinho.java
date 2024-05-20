package View;

import Model.Vinho;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;

public class GerenciaVinho extends javax.swing.JFrame {

    private Vinho objVinho;

    public GerenciaVinho() {
        initComponents();
        this.objVinho = new Vinho();
        this.carregaTabela();
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
        ClubeDosCinco = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        gpesquisa = new javax.swing.JTextField();
        Logo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        gtable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        gdescricao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        gnome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        gestoque = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        gpreco = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        gcadastro = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        gtipo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        gregiao = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        gmarca = new javax.swing.JTextField();
        gcancelar = new javax.swing.JButton();
        galterar = new javax.swing.JButton();
        gapagar = new javax.swing.JButton();
        BotaoMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(72, 14, 38));

        jPanel1.setBackground(new java.awt.Color(72, 14, 38));
        jPanel1.setForeground(new java.awt.Color(72, 14, 38));
        jPanel1.setAlignmentX(0.0F);
        jPanel1.setAlignmentY(0.0F);
        jPanel1.setAutoscrolls(true);
        jPanel1.setInheritsPopupMenu(true);
        jPanel1.setMinimumSize(new java.awt.Dimension(1080, 720));
        jPanel1.setLayout(null);

        ClubeDosCinco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/clube dos cinco.png"))); // NOI18N
        ClubeDosCinco.setMaximumSize(new java.awt.Dimension(1080, 720));
        ClubeDosCinco.setMinimumSize(new java.awt.Dimension(1080, 720));
        ClubeDosCinco.setPreferredSize(new java.awt.Dimension(1080, 720));
        jPanel1.add(ClubeDosCinco);
        ClubeDosCinco.setBounds(530, 10, 530, 70);

        jLabel2.setText("Pesquisar:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 40, 70, 16);

        gpesquisa.setBackground(new java.awt.Color(85, 31, 54));
        gpesquisa.setPreferredSize(new java.awt.Dimension(200, 50));
        gpesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                gpesquisaKeyReleased(evt);
            }
        });
        jPanel1.add(gpesquisa);
        gpesquisa.setBounds(90, 30, 500, 33);

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logoclubedoscinco.png"))); // NOI18N
        jPanel1.add(Logo);
        Logo.setBounds(830, 360, 230, 350);

        gtable.setBackground(new java.awt.Color(85, 31, 54));
        gtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Descrição", "Quantidade em Estoque", "Preço", "Data de Cadastro", "Tipo", "Região", "Marca"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        gtable.setGridColor(new java.awt.Color(85, 31, 54));
        gtable.setSelectionBackground(new java.awt.Color(85, 31, 54));
        gtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(gtable);
        if (gtable.getColumnModel().getColumnCount() > 0) {
            gtable.getColumnModel().getColumn(0).setMinWidth(30);
            gtable.getColumnModel().getColumn(1).setMinWidth(150);
            gtable.getColumnModel().getColumn(2).setMinWidth(150);
            gtable.getColumnModel().getColumn(3).setMinWidth(30);
            gtable.getColumnModel().getColumn(4).setMinWidth(30);
            gtable.getColumnModel().getColumn(5).setMinWidth(20);
            gtable.getColumnModel().getColumn(6).setMinWidth(30);
            gtable.getColumnModel().getColumn(7).setMinWidth(30);
            gtable.getColumnModel().getColumn(8).setMinWidth(30);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 90, 1040, 240);

        jLabel3.setText("Nome:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 370, 36, 16);

        gdescricao.setBackground(new java.awt.Color(85, 31, 54));
        gdescricao.setMinimumSize(new java.awt.Dimension(0, 0));
        gdescricao.setPreferredSize(new java.awt.Dimension(115, 32));
        gdescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gdescricaoActionPerformed(evt);
            }
        });
        jPanel1.add(gdescricao);
        gdescricao.setBounds(90, 400, 540, 32);

        jLabel4.setText("Descrição:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 410, 80, 16);

        gnome.setBackground(new java.awt.Color(85, 31, 54));
        gnome.setMinimumSize(new java.awt.Dimension(0, 0));
        gnome.setPreferredSize(new java.awt.Dimension(115, 32));
        jPanel1.add(gnome);
        gnome.setBounds(70, 360, 560, 32);

        jLabel5.setText("Quantidade em Estoque:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 450, 140, 16);

        gestoque.setBackground(new java.awt.Color(85, 31, 54));
        jPanel1.add(gestoque);
        gestoque.setBounds(170, 440, 460, 32);

        jLabel6.setText("Preço:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 490, 37, 16);

        gpreco.setBackground(new java.awt.Color(85, 31, 54));
        jPanel1.add(gpreco);
        gpreco.setBounds(70, 480, 560, 32);

        jLabel7.setText("Data de Cadastro:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(30, 530, 110, 16);

        gcadastro.setBackground(new java.awt.Color(85, 31, 54));
        jPanel1.add(gcadastro);
        gcadastro.setBounds(130, 520, 500, 32);

        jLabel8.setText("Tipo:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(30, 570, 26, 16);

        gtipo.setBackground(new java.awt.Color(85, 31, 54));
        jPanel1.add(gtipo);
        gtipo.setBounds(70, 560, 560, 32);

        jLabel9.setText("Região:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(30, 610, 60, 16);

        gregiao.setBackground(new java.awt.Color(85, 31, 54));
        jPanel1.add(gregiao);
        gregiao.setBounds(80, 600, 550, 32);

        jLabel10.setText("Marca:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(30, 650, 43, 16);

        gmarca.setBackground(new java.awt.Color(85, 31, 54));
        jPanel1.add(gmarca);
        gmarca.setBounds(70, 640, 560, 33);

        gcancelar.setBackground(new java.awt.Color(169, 169, 169));
        gcancelar.setForeground(new java.awt.Color(72, 14, 38));
        gcancelar.setText("Cancelar");
        gcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gcancelarActionPerformed(evt);
            }
        });
        jPanel1.add(gcancelar);
        gcancelar.setBounds(690, 430, 90, 23);

        galterar.setBackground(new java.awt.Color(169, 169, 169));
        galterar.setForeground(new java.awt.Color(72, 14, 38));
        galterar.setText("Alterar");
        galterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                galterarActionPerformed(evt);
            }
        });
        jPanel1.add(galterar);
        galterar.setBounds(690, 510, 90, 23);

        gapagar.setBackground(new java.awt.Color(169, 169, 169));
        gapagar.setForeground(new java.awt.Color(72, 14, 38));
        gapagar.setText("Apagar");
        gapagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gapagarActionPerformed(evt);
            }
        });
        jPanel1.add(gapagar);
        gapagar.setBounds(690, 590, 90, 23);

        BotaoMenu.setBackground(new java.awt.Color(94, 31, 54));
        BotaoMenu.setForeground(new java.awt.Color(169, 169, 169));
        BotaoMenu.setText("Voltar ao menu");
        BotaoMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoMenuActionPerformed(evt);
            }
        });
        jPanel1.add(BotaoMenu);
        BotaoMenu.setBounds(550, 690, 120, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void gcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gcancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_gcancelarActionPerformed

    private void galterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_galterarActionPerformed

        try {
            int id = 0;
            String nome = "";
            String descricao = "";
            int quant_estoque = 0;
            double preco = 0.0;
            int data_cadastro = 0;
            String tipo = "";
            String regiao = "";
            String marca = "";

            if (this.gnome.getText().length() < 2) {
                throw new Mensagens("Nome deve conter ao menos 2 caracteres.");
            } else {
                nome = this.gnome.getText();
            }

            if (this.gdescricao.getText().length() < 2) {
                throw new Mensagens("Descrição deve conter ao menos 2 caracteres.");
            } else {
                descricao = this.gdescricao.getText();
            }

            if (this.gestoque.getText().length() <= 0) {
                throw new Mensagens("Qauntidade em estoque deve ser número e maior que zero.");
            } else {
                quant_estoque = Integer.parseInt(this.gestoque.getText());
            }

            if (this.gpreco.getText().length() <= 0.0) {
                throw new Mensagens("Preço deve ser número e maior que zero.");
            } else {
                preco = Double.parseDouble(this.gpreco.getText());
            }

            if (this.gcadastro.getText().length() < 0) {
                throw new Mensagens("Data de Cadastro deve conter uma data.");
            } else {
                data_cadastro = Integer.parseInt(this.gcadastro.getText());
            }

            if (this.gtipo.getText().length() < 2) {
                throw new Mensagens("Tipo deve conter ao menos 2 caracteres.");
            } else {
                tipo = this.gtipo.getText();
            }

            if (this.gregiao.getText().length() < 2) {
                throw new Mensagens("Região deve conter ao menos 2 caracteres.");
            } else {
                regiao = this.gregiao.getText();
            }

            if (this.gmarca.getText().length() < 2) {
                throw new Mensagens("Marca deve conter ao menos 2 caracteres.");
            } else {
                marca = this.gmarca.getText();
            }

            if (this.gtable.getSelectedRow() == -1) {
                throw new Mensagens("Primeiro selecione um vinho para alterar.");
            } else {
                id = Integer.parseInt(this.gtable.getValueAt(this.gtable.getSelectedRow(), 0).toString());

                ArrayList<Vinho> minhalista = new ArrayList<>();
                minhalista = objVinho.getMinhaLista();
                boolean flag = false;
                for (Vinho v : minhalista) {
                    if (nome.equals(v.getNome())) {
                        flag = true;
                    }
                }
                if (flag == true) {
                    throw new Mensagens("Vinho Existente");

                }
            }

            if (this.objVinho.UpdateVinhoBD(tipo, regiao, marca, id, nome, descricao, quant_estoque, preco, data_cadastro)) {

                this.gnome.setText("");
                this.gdescricao.setText("");
                this.gestoque.setText("");
                this.gpreco.setText("");
                this.gcadastro.setText("");
                this.gtipo.setText("");
                this.gregiao.setText("");
                this.gmarca.setText("");
                JOptionPane.showMessageDialog(rootPane, "Vinho alterado com sucesso!");
            }
            System.out.println(this.objVinho.getMinhaLista().toString());
        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um número.");
        } finally {
            carregaTabela();
        }
    }//GEN-LAST:event_galterarActionPerformed

    private void gtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gtableMouseClicked

        if (this.gtable.getSelectedRow() != -1) {

            String nome = this.gtable.getValueAt(this.gtable.getSelectedRow(), 1).toString();
            String descricao = this.gtable.getValueAt(this.gtable.getSelectedRow(), 2).toString();
            String quant_estoque = this.gtable.getValueAt(this.gtable.getSelectedRow(), 3).toString();
            String preco = this.gtable.getValueAt(this.gtable.getSelectedRow(), 4).toString();
            String data_cadastro = this.gtable.getValueAt(this.gtable.getSelectedRow(), 5).toString();
            String tipo = this.gtable.getValueAt(this.gtable.getSelectedRow(), 6).toString();
            String regiao = this.gtable.getValueAt(this.gtable.getSelectedRow(), 7).toString();
            String marca = this.gtable.getValueAt(this.gtable.getSelectedRow(), 8).toString();

            this.gnome.setText(nome);
            this.gdescricao.setText(descricao);
            this.gestoque.setText(quant_estoque);
            this.gpreco.setText(preco);
            this.gcadastro.setText(data_cadastro);
            this.gtipo.setText(tipo);
            this.gregiao.setText(regiao);
            this.gmarca.setText(marca);
        }
    }//GEN-LAST:event_gtableMouseClicked

    private void gapagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gapagarActionPerformed
        try {
            int id = 0;
            if (this.gtable.getSelectedRow() == -1) {
                throw new Mensagens("Primeiro selecione um Vinho para apagar.");
            } else {
                id = Integer.parseInt(this.gtable.getValueAt(this.gtable.getSelectedRow(), 0).toString());
            }
            int confirma_apagar = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja apagar este Vinho?");

            if (confirma_apagar == 0) {

                if (this.objVinho.DeleteVinhoBD(id)) {

                    this.gnome.setText("");
                    this.gdescricao.setText("");
                    this.gestoque.setText("");
                    this.gpreco.setText("");
                    this.gcadastro.setText("");
                    this.gtipo.setText("");
                    this.gregiao.setText("");
                    this.gmarca.setText("");
                    JOptionPane.showMessageDialog(rootPane, "Vinho apagado com sucesso!");
                }
            }

            System.out.println(this.objVinho.getMinhaLista().toString());

        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } finally {

            carregaTabela();
        }
    }//GEN-LAST:event_gapagarActionPerformed

    private void gpesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gpesquisaKeyReleased

        DefaultTableModel md = (DefaultTableModel) gtable.getModel();
        TableRowSorter<DefaultTableModel> md1 = new TableRowSorter<>(md);
        gtable.setRowSorter(md1);
        md1.setRowFilter(RowFilter.regexFilter(gpesquisa.getText()));
    }//GEN-LAST:event_gpesquisaKeyReleased

    private void gdescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gdescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gdescricaoActionPerformed

    private void BotaoMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoMenuActionPerformed
        super.dispose();
    }//GEN-LAST:event_BotaoMenuActionPerformed

    @SuppressWarnings("unchecked")
    public void carregaTabela() {

        DefaultTableModel modelo = (DefaultTableModel) this.gtable.getModel();
        modelo.setNumRows(0);

        ArrayList<Vinho> minhalista = new ArrayList<>();
        minhalista = objVinho.getMinhaLista();

        for (Vinho v : minhalista) {
            modelo.addRow(new Object[]{
                v.getId(),
                v.getNome(),
                v.getDescricao(),
                v.getQuant_estoque(),
                v.getPreco(),
                v.getData_cadastro(),
                v.getTipo(),
                v.getRegiao(),
                v.getMarca(),});
        }
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
            java.util.logging.Logger.getLogger(GerenciaVinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciaVinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciaVinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciaVinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenciaVinho().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoMenu;
    private javax.swing.JLabel ClubeDosCinco;
    private javax.swing.JLabel Logo;
    private javax.swing.JButton galterar;
    private javax.swing.JButton gapagar;
    private javax.swing.JTextField gcadastro;
    private javax.swing.JButton gcancelar;
    private javax.swing.JTextField gdescricao;
    private javax.swing.JTextField gestoque;
    private javax.swing.JTextField gmarca;
    private javax.swing.JTextField gnome;
    private javax.swing.JTextField gpesquisa;
    private javax.swing.JTextField gpreco;
    private javax.swing.JTextField gregiao;
    private javax.swing.JTable gtable;
    private javax.swing.JTextField gtipo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}