package Principal;

import javax.swing.*;


public class VentanaPrincipal extends JFrame {
    private JPanel pnlVentanaPrincipal;

    private void inicializarMenu(){
        JMenuBar barraMenu = new JMenuBar();

        JMenu menuPersonas = new JMenu();

        barraMenu.add(barraMenu);

    }
    public VentanaPrincipal(){
        inicializarMenu();
        this.setVisible(true);
        this.setSize(1000,800);
    }
}
