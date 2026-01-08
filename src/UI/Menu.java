package UI;

import javax.swing.*;

public class Menu extends  JFrame {
    private JButton gestionareZboruriButton;
    private JButton gestionarePasageriButton;
    private JPanel MenuP;


    private void createUIComponents() {
        // lasă GOL – IntelliJ va gestiona componentele
    }

    public static void main(String[] args) {


        JFrame frame = new JFrame("Airport Management System");
        frame.setContentPane(new Menu().MenuP);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
