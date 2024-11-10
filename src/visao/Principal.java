package visao;

import dao.ConexaoBanco;
import javax.swing.JFrame;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktop = new javax.swing.JDesktopPane();
        jmbBarraMenu = new javax.swing.JMenuBar();
        jmArquivo = new javax.swing.JMenu();
        jmCadastro = new javax.swing.JMenu();
        jmCidade = new javax.swing.JMenuItem();
        jmBairro = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jmTipoContato = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmContatos = new javax.swing.JMenuItem();
        jmSobre = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Contatos");
        setResizable(false);

        jDesktop.setBackground(new java.awt.Color(102, 204, 255));
        jDesktop.setForeground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout jDesktopLayout = new javax.swing.GroupLayout(jDesktop);
        jDesktop.setLayout(jDesktopLayout);
        jDesktopLayout.setHorizontalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jDesktopLayout.setVerticalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 561, Short.MAX_VALUE)
        );

        jmArquivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/arquivo.png"))); // NOI18N
        jmArquivo.setMnemonic('A');
        jmArquivo.setText("Arquivo");
        jmArquivo.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
                jmArquivoMenuCanceled(evt);
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
            }
        });

        jmCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/novo.png"))); // NOI18N
        jmCadastro.setText("Cadastro");

        jmCidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cidade.png"))); // NOI18N
        jmCidade.setText("Cidade");
        jmCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCidadeActionPerformed(evt);
            }
        });
        jmCadastro.add(jmCidade);

        jmBairro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bairro.png"))); // NOI18N
        jmBairro.setText("Bairro");
        jmBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmBairroActionPerformed(evt);
            }
        });
        jmCadastro.add(jmBairro);
        jmCadastro.add(jSeparator2);

        jmTipoContato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tipo.png"))); // NOI18N
        jmTipoContato.setText("Tipo de Contato");
        jmTipoContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmTipoContatoActionPerformed(evt);
            }
        });
        jmCadastro.add(jmTipoContato);

        jmArquivo.add(jmCadastro);
        jmArquivo.add(jSeparator1);

        jmContatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/contato.png"))); // NOI18N
        jmContatos.setText("Contatos");
        jmContatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmContatosActionPerformed(evt);
            }
        });
        jmArquivo.add(jmContatos);

        jmbBarraMenu.add(jmArquivo);

        jmSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/me.png"))); // NOI18N
        jmSobre.setMnemonic('S');
        jmSobre.setText("Sobre");
        jmbBarraMenu.add(jmSobre);

        setJMenuBar(jmbBarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktop)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmArquivoMenuCanceled(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jmArquivoMenuCanceled

    }//GEN-LAST:event_jmArquivoMenuCanceled

    private void jmContatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmContatosActionPerformed
        ContatoVisao tela = new ContatoVisao();
        jDesktop.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_jmContatosActionPerformed

    private void jmCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCidadeActionPerformed
        CidadeVisao tela = new CidadeVisao();
        jDesktop.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_jmCidadeActionPerformed

    private void jmBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmBairroActionPerformed
        BairroVisao tela = new BairroVisao();
        jDesktop.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_jmBairroActionPerformed

    private void jmTipoContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmTipoContatoActionPerformed
        TContatoVisao tela = new TContatoVisao();
        jDesktop.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_jmTipoContatoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktop;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenu jmArquivo;
    private javax.swing.JMenuItem jmBairro;
    private javax.swing.JMenu jmCadastro;
    private javax.swing.JMenuItem jmCidade;
    private javax.swing.JMenuItem jmContatos;
    private javax.swing.JMenu jmSobre;
    private javax.swing.JMenuItem jmTipoContato;
    private javax.swing.JMenuBar jmbBarraMenu;
    // End of variables declaration//GEN-END:variables
}
