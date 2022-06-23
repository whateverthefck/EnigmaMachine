package loading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author zed
 */
public class LoadingFrame extends javax.swing.JFrame {

    public LoadingFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        loadingBar = new javax.swing.JProgressBar();
        headText = new javax.swing.JLabel();
        loadingText = new javax.swing.JLabel();
        backgroundOpacity = new javax.swing.JLabel();
        backgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(600, 400));
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(600, 400));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loadingBar.setBackground(new java.awt.Color(23, 23, 23));
        loadingBar.setForeground(new java.awt.Color(170, 170, 170));
        loadingBar.setBorder(null);
        jPanel1.add(loadingBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 395, 602, 5));

        headText.setFont(new java.awt.Font("OCR A Extended", 1, 48)); // NOI18N
        headText.setForeground(new java.awt.Color(170, 170, 170));
        headText.setText("Enigma Machine");
        jPanel1.add(headText, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        loadingText.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        loadingText.setForeground(new java.awt.Color(170, 170, 170));
        loadingText.setText("Loading...");
        jPanel1.add(loadingText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 378, -1, -1));

        backgroundOpacity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Background80Opacity 1280x720.png"))); // NOI18N
        jPanel1.add(backgroundOpacity, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        backgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/EnigmaLoadingBackground 600x400.png"))); // NOI18N
        jPanel1.add(backgroundImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static LoadingFrame getFrame() {
        return new LoadingFrame();
    }

    public boolean loadComponents() {

        boolean b = true;

        try {
            for (int i = 0; i <= 100; i++) {
                loadingBar.setValue(i);
                Thread.sleep(15);

                if (i == 20) {
                    loadingText.setText("loadind modules...");
                }

                if (i == 50) {
                    loadingText.setText("Connecting to database...");
                    if (connectionprovider.SQLconnection.connect() == null) {
                        throw new Exception("Connection Failed");
                    }
                }

                if (i == 80) {
                    loadingText.setText("Starting application...");
                }

            }
        } catch (Exception ex) {
            loadingText.setText(ex.toString());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex1) {
                Logger.getLogger(LoadingFrame.class.getName()).log(Level.SEVERE, null, ex1);
            }
            b = false;
        }

        return b;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundImage;
    private javax.swing.JLabel backgroundOpacity;
    private javax.swing.JLabel headText;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar loadingBar;
    private javax.swing.JLabel loadingText;
    // End of variables declaration//GEN-END:variables
}
