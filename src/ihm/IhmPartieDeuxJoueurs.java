package ihm;

/**
 *
 * @author Arnaud
 */
public class IhmPartieDeuxJoueurs extends javax.swing.JFrame {

    

    /**
     * Creates new form ihmPartieDeuxJoueurs
     */
    public IhmPartieDeuxJoueurs() {        
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
        java.awt.GridBagConstraints gridBagConstraints;

        panelBoutons = new ihm.PanelBoutons();
        panelSynthese = new PanelSynthese(panelBoutons.getPartie());
        panelHistorique1 = new PanelHistorique(panelBoutons.getPartie());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        panelBoutons.setMaximumSize(new java.awt.Dimension(265, 95));
        getContentPane().add(panelBoutons, new java.awt.GridBagConstraints());
        getContentPane().add(panelSynthese, new java.awt.GridBagConstraints());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.2;
        getContentPane().add(panelHistorique1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IhmPartieDeuxJoueurs().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ihm.PanelBoutons panelBoutons;
    private ihm.PanelHistorique panelHistorique1;
    private ihm.PanelSynthese panelSynthese;
    // End of variables declaration//GEN-END:variables
}