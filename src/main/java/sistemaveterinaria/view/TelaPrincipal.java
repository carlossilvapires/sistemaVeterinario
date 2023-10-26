package sistemaveterinaria.view;

import java.util.ArrayList;
import sistemaveterinaria.controller.FicharioPessoas;
import sistemaveterinaria.model.Funcionario;


public class TelaPrincipal extends javax.swing.JFrame {

    FicharioPessoas ficharioPessoas;
    ArrayList<Funcionario> listaFuncs;
   
    public TelaPrincipal() {
        initComponents();
        listaFuncs = new ArrayList<>();
        ficharioPessoas = new FicharioPessoas();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuFuncionario = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Usuário");
        jMenuBar1.add(jMenu1);

        menuFuncionario.setText("Funcionários");
        menuFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuFuncionarioMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuFuncionario);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuFuncionarioMouseClicked
        
        TelaGerenciaFuncionario telaGerenciaFuncs = new TelaGerenciaFuncionario(this, rootPaneCheckingEnabled, ficharioPessoas);
        telaGerenciaFuncs.setVisible(true);
    }//GEN-LAST:event_menuFuncionarioMouseClicked

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuFuncionario;
    // End of variables declaration//GEN-END:variables
}
