package main;

import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 *
 * @author zed
 */
public class MainFrame {

    public static JFrame getFrame() {

        JFrame frame = new JFrame("Enigma Machine");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setUndecorated(true);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        JComponent contentPane = PanelSwapper.getInstance();

        contentPane.setOpaque(true);
        frame.setContentPane(contentPane);

        frame.pack();
        frame.setLocationRelativeTo(null);

        return frame;
    }

}
