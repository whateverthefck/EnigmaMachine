package main;

import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author zed
 */
public class PanelSwapper extends JPanel {

    private PanelSwapper() {
        super(new BorderLayout());
        add(new MainPanel());
    }

    public static PanelSwapper getInstance() {
        return instance;
    }

    public void showMainPanel() {

        removeAll();
        add(new MainPanel());

        repaint();
        revalidate();
    }

    public void showSettingsPanel() {
        
        removeAll();
        add(new main.settings.SettingsPanel());

        repaint();
        revalidate();
    }

    public void showPanel(JPanel panel) {

        removeAll();
        add(panel);

        repaint();
        revalidate();
    }

    private static final PanelSwapper instance = new PanelSwapper();
}
