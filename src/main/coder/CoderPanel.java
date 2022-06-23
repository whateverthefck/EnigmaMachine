package main.coder;

/**
 *
 * @author zed
 */
public class CoderPanel extends javax.swing.JPanel {

    public CoderPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headText = new javax.swing.JLabel();
        line1 = new javax.swing.JLabel();
        originalText = new javax.swing.JTextField();
        codedText = new javax.swing.JTextField();
        line2 = new javax.swing.JLabel();
        RS = new javax.swing.JButton();
        SP = new javax.swing.JButton();
        M = new javax.swing.JButton();
        N = new javax.swing.JButton();
        B = new javax.swing.JButton();
        V = new javax.swing.JButton();
        C = new javax.swing.JButton();
        X = new javax.swing.JButton();
        Z = new javax.swing.JButton();
        L = new javax.swing.JButton();
        K = new javax.swing.JButton();
        J = new javax.swing.JButton();
        H = new javax.swing.JButton();
        G = new javax.swing.JButton();
        F = new javax.swing.JButton();
        D = new javax.swing.JButton();
        S = new javax.swing.JButton();
        A = new javax.swing.JButton();
        P = new javax.swing.JButton();
        O = new javax.swing.JButton();
        I = new javax.swing.JButton();
        U = new javax.swing.JButton();
        Y = new javax.swing.JButton();
        T = new javax.swing.JButton();
        R = new javax.swing.JButton();
        E = new javax.swing.JButton();
        W = new javax.swing.JButton();
        Q = new javax.swing.JButton();
        backButton = new javax.swing.JLabel();
        backgroundOpacity = new javax.swing.JLabel();
        backgroundImage = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headText.setFont(new java.awt.Font("OCR A Extended", 1, 56)); // NOI18N
        headText.setForeground(new java.awt.Color(242, 243, 244));
        headText.setText("Encode Message");
        add(headText, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, -1, -1));

        line1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Line 900x10.png"))); // NOI18N
        add(line1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, -1, -1));

        originalText.setEditable(false);
        originalText.setBackground(new java.awt.Color(69, 69, 71));
        originalText.setFont(new java.awt.Font("OCR A Extended", 1, 24)); // NOI18N
        originalText.setForeground(new java.awt.Color(69, 69, 71));
        originalText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        originalText.setText("ORIGINAL TEXT: ");
        originalText.setBorder(null);
        originalText.setOpaque(false);
        add(originalText, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 800, 40));

        codedText.setEditable(false);
        codedText.setFont(new java.awt.Font("OCR A Extended", 1, 36)); // NOI18N
        codedText.setForeground(new java.awt.Color(179, 179, 179));
        codedText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        codedText.setText("Click here to enable keyboard");
        codedText.setBorder(null);
        codedText.setOpaque(false);
        codedText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                codedTextKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                codedTextKeyReleased(evt);
            }
        });
        add(codedText, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 800, 60));

        line2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Line 900x10.png"))); // NOI18N
        add(line2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, -1, -1));

        RS.setFont(new java.awt.Font("OCR A Extended", 0, 36)); // NOI18N
        RS.setForeground(new java.awt.Color(179, 179, 179));
        RS.setText("RESET");
        RS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(179, 179, 179), 3));
        RS.setContentAreaFilled(false);
        RS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RSMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RSMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RSMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                RSMouseReleased(evt);
            }
        });
        add(RS, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 520, 160, 50));

        SP.setFont(new java.awt.Font("OCR A Extended", 0, 36)); // NOI18N
        SP.setForeground(new java.awt.Color(179, 179, 179));
        SP.setText("__");
        SP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(179, 179, 179), 2));
        SP.setContentAreaFilled(false);
        SP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SPMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SPMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                SPMouseReleased(evt);
            }
        });
        add(SP, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 590, 490, 50));

        M.setFont(new java.awt.Font("OCR A Extended", 0, 36)); // NOI18N
        M.setForeground(new java.awt.Color(179, 179, 179));
        M.setText("M");
        M.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(179, 179, 179), 3));
        M.setContentAreaFilled(false);
        M.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                MMouseReleased(evt);
            }
        });
        add(M, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 520, 80, 50));

        N.setFont(new java.awt.Font("OCR A Extended", 0, 36)); // NOI18N
        N.setForeground(new java.awt.Color(179, 179, 179));
        N.setText("N");
        N.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(179, 179, 179), 3));
        N.setContentAreaFilled(false);
        N.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                NMouseReleased(evt);
            }
        });
        add(N, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 520, 80, 50));

        B.setFont(new java.awt.Font("OCR A Extended", 0, 36)); // NOI18N
        B.setForeground(new java.awt.Color(179, 179, 179));
        B.setText("B");
        B.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(179, 179, 179), 3));
        B.setContentAreaFilled(false);
        B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BMouseReleased(evt);
            }
        });
        add(B, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 520, 80, 50));

        V.setFont(new java.awt.Font("OCR A Extended", 0, 36)); // NOI18N
        V.setForeground(new java.awt.Color(179, 179, 179));
        V.setText("V");
        V.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(179, 179, 179), 3));
        V.setContentAreaFilled(false);
        V.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                VMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                VMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                VMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                VMouseReleased(evt);
            }
        });
        add(V, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 520, 80, 50));

        C.setFont(new java.awt.Font("OCR A Extended", 0, 36)); // NOI18N
        C.setForeground(new java.awt.Color(179, 179, 179));
        C.setText("C");
        C.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(179, 179, 179), 3));
        C.setContentAreaFilled(false);
        C.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                CMouseReleased(evt);
            }
        });
        add(C, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 520, 80, 50));

        X.setFont(new java.awt.Font("OCR A Extended", 0, 36)); // NOI18N
        X.setForeground(new java.awt.Color(179, 179, 179));
        X.setText("X");
        X.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(179, 179, 179), 3));
        X.setContentAreaFilled(false);
        X.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                XMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                XMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                XMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                XMouseReleased(evt);
            }
        });
        add(X, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 520, 80, 50));

        Z.setFont(new java.awt.Font("OCR A Extended", 0, 36)); // NOI18N
        Z.setForeground(new java.awt.Color(179, 179, 179));
        Z.setText("Z");
        Z.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(179, 179, 179), 3));
        Z.setContentAreaFilled(false);
        Z.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ZMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ZMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ZMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ZMouseReleased(evt);
            }
        });
        add(Z, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 520, 80, 50));

        L.setFont(new java.awt.Font("OCR A Extended", 0, 36)); // NOI18N
        L.setForeground(new java.awt.Color(179, 179, 179));
        L.setText("L");
        L.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(179, 179, 179), 3));
        L.setContentAreaFilled(false);
        L.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                LMouseReleased(evt);
            }
        });
        add(L, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 450, 80, 50));

        K.setFont(new java.awt.Font("OCR A Extended", 0, 36)); // NOI18N
        K.setForeground(new java.awt.Color(179, 179, 179));
        K.setText("K");
        K.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(179, 179, 179), 3));
        K.setContentAreaFilled(false);
        K.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                KMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                KMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                KMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                KMouseReleased(evt);
            }
        });
        add(K, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 450, 80, 50));

        J.setFont(new java.awt.Font("OCR A Extended", 0, 36)); // NOI18N
        J.setForeground(new java.awt.Color(179, 179, 179));
        J.setText("J");
        J.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(179, 179, 179), 3));
        J.setContentAreaFilled(false);
        J.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JMouseReleased(evt);
            }
        });
        add(J, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 450, 80, 50));

        H.setFont(new java.awt.Font("OCR A Extended", 0, 36)); // NOI18N
        H.setForeground(new java.awt.Color(179, 179, 179));
        H.setText("H");
        H.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(179, 179, 179), 3));
        H.setContentAreaFilled(false);
        H.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                HMouseReleased(evt);
            }
        });
        add(H, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 450, 80, 50));

        G.setFont(new java.awt.Font("OCR A Extended", 0, 36)); // NOI18N
        G.setForeground(new java.awt.Color(179, 179, 179));
        G.setText("G");
        G.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(179, 179, 179), 3));
        G.setContentAreaFilled(false);
        G.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                GMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                GMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                GMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                GMouseReleased(evt);
            }
        });
        add(G, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 450, 80, 50));

        F.setFont(new java.awt.Font("OCR A Extended", 0, 36)); // NOI18N
        F.setForeground(new java.awt.Color(179, 179, 179));
        F.setText("F");
        F.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(179, 179, 179), 3));
        F.setContentAreaFilled(false);
        F.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                FMouseReleased(evt);
            }
        });
        add(F, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 450, 80, 50));

        D.setFont(new java.awt.Font("OCR A Extended", 0, 36)); // NOI18N
        D.setForeground(new java.awt.Color(179, 179, 179));
        D.setText("D");
        D.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(179, 179, 179), 3));
        D.setContentAreaFilled(false);
        D.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                DMouseReleased(evt);
            }
        });
        add(D, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 450, 80, 50));

        S.setFont(new java.awt.Font("OCR A Extended", 0, 36)); // NOI18N
        S.setForeground(new java.awt.Color(179, 179, 179));
        S.setText("S");
        S.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(179, 179, 179), 3));
        S.setContentAreaFilled(false);
        S.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                SMouseReleased(evt);
            }
        });
        add(S, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 450, 80, 50));

        A.setFont(new java.awt.Font("OCR A Extended", 0, 36)); // NOI18N
        A.setForeground(new java.awt.Color(179, 179, 179));
        A.setText("A");
        A.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(179, 179, 179), 3));
        A.setContentAreaFilled(false);
        A.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                AMouseReleased(evt);
            }
        });
        add(A, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, 80, 50));

        P.setFont(new java.awt.Font("OCR A Extended", 0, 36)); // NOI18N
        P.setForeground(new java.awt.Color(179, 179, 179));
        P.setText("P");
        P.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(179, 179, 179), 3));
        P.setContentAreaFilled(false);
        P.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                PMouseReleased(evt);
            }
        });
        add(P, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 380, 80, 50));

        O.setFont(new java.awt.Font("OCR A Extended", 0, 36)); // NOI18N
        O.setForeground(new java.awt.Color(179, 179, 179));
        O.setText("O");
        O.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(179, 179, 179), 3));
        O.setContentAreaFilled(false);
        O.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                OMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                OMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                OMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                OMouseReleased(evt);
            }
        });
        add(O, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 380, 80, 50));

        I.setFont(new java.awt.Font("OCR A Extended", 0, 36)); // NOI18N
        I.setForeground(new java.awt.Color(179, 179, 179));
        I.setText("I");
        I.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(179, 179, 179), 3));
        I.setContentAreaFilled(false);
        I.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                IMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                IMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                IMouseReleased(evt);
            }
        });
        add(I, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 380, 80, 50));

        U.setFont(new java.awt.Font("OCR A Extended", 0, 36)); // NOI18N
        U.setForeground(new java.awt.Color(179, 179, 179));
        U.setText("U");
        U.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(179, 179, 179), 3));
        U.setContentAreaFilled(false);
        U.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                UMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                UMouseReleased(evt);
            }
        });
        add(U, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 380, 80, 50));

        Y.setFont(new java.awt.Font("OCR A Extended", 0, 36)); // NOI18N
        Y.setForeground(new java.awt.Color(179, 179, 179));
        Y.setText("Y");
        Y.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(179, 179, 179), 3));
        Y.setContentAreaFilled(false);
        Y.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                YMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                YMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                YMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                YMouseReleased(evt);
            }
        });
        add(Y, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 380, 80, 50));

        T.setFont(new java.awt.Font("OCR A Extended", 0, 36)); // NOI18N
        T.setForeground(new java.awt.Color(179, 179, 179));
        T.setText("T");
        T.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(179, 179, 179), 3));
        T.setContentAreaFilled(false);
        T.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                TMouseReleased(evt);
            }
        });
        add(T, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 380, 80, 50));

        R.setFont(new java.awt.Font("OCR A Extended", 0, 36)); // NOI18N
        R.setForeground(new java.awt.Color(179, 179, 179));
        R.setText("R");
        R.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(179, 179, 179), 3));
        R.setContentAreaFilled(false);
        R.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                RMouseReleased(evt);
            }
        });
        add(R, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, 80, 50));

        E.setFont(new java.awt.Font("OCR A Extended", 0, 36)); // NOI18N
        E.setForeground(new java.awt.Color(179, 179, 179));
        E.setText("E");
        E.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(179, 179, 179), 3));
        E.setContentAreaFilled(false);
        E.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                EMouseReleased(evt);
            }
        });
        add(E, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 380, 80, 50));

        W.setFont(new java.awt.Font("OCR A Extended", 0, 36)); // NOI18N
        W.setForeground(new java.awt.Color(179, 179, 179));
        W.setText("W");
        W.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(179, 179, 179), 3));
        W.setContentAreaFilled(false);
        W.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                WMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                WMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                WMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                WMouseReleased(evt);
            }
        });
        add(W, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, 80, 50));

        Q.setFont(new java.awt.Font("OCR A Extended", 0, 36)); // NOI18N
        Q.setForeground(new java.awt.Color(179, 179, 179));
        Q.setText("Q");
        Q.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(179, 179, 179), 3));
        Q.setContentAreaFilled(false);
        Q.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                QMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                QMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                QMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                QMouseReleased(evt);
            }
        });
        add(Q, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 80, 50));

        backButton.setFont(new java.awt.Font("OCR A Extended", 1, 24)); // NOI18N
        backButton.setForeground(new java.awt.Color(242, 243, 244));
        backButton.setText("Back");
        backButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                backButtonMouseReleased(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 650, -1, -1));

        backgroundOpacity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Background50Opacity 1280x720.png"))); // NOI18N
        add(backgroundOpacity, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        backgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/EnigmaBackground 1280x720.png"))); // NOI18N
        add(backgroundImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void QMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QMouseEntered
        Q.setForeground(new java.awt.Color(242, 243, 244));
    }//GEN-LAST:event_QMouseEntered

    private void QMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QMouseExited
        Q.setForeground(new java.awt.Color(179, 179, 179));
    }//GEN-LAST:event_QMouseExited

    private void QMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QMousePressed
        Q.setForeground(new java.awt.Color(69, 69, 71));
    }//GEN-LAST:event_QMousePressed

    private void QMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QMouseReleased
        Q.setForeground(new java.awt.Color(179, 179, 179));
        originalText.setText(originalText.getText() + "Q");
        codedText.setText(codedText.getText() + coder.code('Q'));
    }//GEN-LAST:event_QMouseReleased

    private void MMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MMouseEntered
        M.setForeground(new java.awt.Color(242, 243, 244));
    }//GEN-LAST:event_MMouseEntered

    private void MMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MMouseExited
        M.setForeground(new java.awt.Color(179, 179, 179));
    }//GEN-LAST:event_MMouseExited

    private void MMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MMousePressed
        M.setForeground(new java.awt.Color(69, 69, 71));
    }//GEN-LAST:event_MMousePressed

    private void MMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MMouseReleased
        M.setForeground(new java.awt.Color(179, 179, 179));
        originalText.setText(originalText.getText() + "M");
        codedText.setText(codedText.getText() + coder.code('M'));
    }//GEN-LAST:event_MMouseReleased

    private void NMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NMouseEntered
        N.setForeground(new java.awt.Color(242, 243, 244));
    }//GEN-LAST:event_NMouseEntered

    private void NMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NMouseExited
        N.setForeground(new java.awt.Color(179, 179, 179));
    }//GEN-LAST:event_NMouseExited

    private void NMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NMousePressed
        N.setForeground(new java.awt.Color(69, 69, 71));
    }//GEN-LAST:event_NMousePressed

    private void NMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NMouseReleased
        N.setForeground(new java.awt.Color(179, 179, 179));
        originalText.setText(originalText.getText() + "N");
        codedText.setText(codedText.getText() + coder.code('N'));
    }//GEN-LAST:event_NMouseReleased

    private void BMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BMouseEntered
        B.setForeground(new java.awt.Color(242, 243, 244));
    }//GEN-LAST:event_BMouseEntered

    private void BMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BMouseExited
        B.setForeground(new java.awt.Color(179, 179, 179));
    }//GEN-LAST:event_BMouseExited

    private void BMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BMousePressed
        B.setForeground(new java.awt.Color(69, 69, 71));
    }//GEN-LAST:event_BMousePressed

    private void BMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BMouseReleased
        B.setForeground(new java.awt.Color(179, 179, 179));
        originalText.setText(originalText.getText() + "B");
        codedText.setText(codedText.getText() + coder.code('B'));
    }//GEN-LAST:event_BMouseReleased

    private void VMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VMouseEntered
        V.setForeground(new java.awt.Color(242, 243, 244));
    }//GEN-LAST:event_VMouseEntered

    private void VMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VMouseExited
        M.setForeground(new java.awt.Color(179, 179, 179));
    }//GEN-LAST:event_VMouseExited

    private void VMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VMousePressed
        V.setForeground(new java.awt.Color(69, 69, 71));
    }//GEN-LAST:event_VMousePressed

    private void VMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VMouseReleased
        M.setForeground(new java.awt.Color(179, 179, 179));
        originalText.setText(originalText.getText() + "V");
        codedText.setText(codedText.getText() + coder.code('V'));
    }//GEN-LAST:event_VMouseReleased

    private void CMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CMouseEntered
        C.setForeground(new java.awt.Color(242, 243, 244));
    }//GEN-LAST:event_CMouseEntered

    private void CMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CMouseExited
        C.setForeground(new java.awt.Color(179, 179, 179));
    }//GEN-LAST:event_CMouseExited

    private void CMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CMousePressed
        C.setForeground(new java.awt.Color(69, 69, 71));
    }//GEN-LAST:event_CMousePressed

    private void CMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CMouseReleased
        C.setForeground(new java.awt.Color(179, 179, 179));
        originalText.setText(originalText.getText() + "C");
        codedText.setText(codedText.getText() + coder.code('C'));
    }//GEN-LAST:event_CMouseReleased

    private void XMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XMouseEntered
        X.setForeground(new java.awt.Color(242, 243, 244));
    }//GEN-LAST:event_XMouseEntered

    private void XMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XMouseExited
        X.setForeground(new java.awt.Color(179, 179, 179));
    }//GEN-LAST:event_XMouseExited

    private void XMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XMousePressed
        X.setForeground(new java.awt.Color(69, 69, 71));
    }//GEN-LAST:event_XMousePressed

    private void XMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XMouseReleased
        X.setForeground(new java.awt.Color(179, 179, 179));
        originalText.setText(originalText.getText() + "X");
        codedText.setText(codedText.getText() + coder.code('X'));
    }//GEN-LAST:event_XMouseReleased

    private void ZMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ZMouseEntered
        Z.setForeground(new java.awt.Color(242, 243, 244));
    }//GEN-LAST:event_ZMouseEntered

    private void ZMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ZMouseExited
        Z.setForeground(new java.awt.Color(179, 179, 179));
    }//GEN-LAST:event_ZMouseExited

    private void ZMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ZMousePressed
        Z.setForeground(new java.awt.Color(69, 69, 71));
    }//GEN-LAST:event_ZMousePressed

    private void ZMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ZMouseReleased
        Z.setForeground(new java.awt.Color(179, 179, 179));
        originalText.setText(originalText.getText() + "Z");
        codedText.setText(codedText.getText() + coder.code('Z'));
    }//GEN-LAST:event_ZMouseReleased

    private void LMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LMouseEntered
        L.setForeground(new java.awt.Color(242, 243, 244));
    }//GEN-LAST:event_LMouseEntered

    private void LMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LMouseExited
        L.setForeground(new java.awt.Color(179, 179, 179));
    }//GEN-LAST:event_LMouseExited

    private void LMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LMousePressed
        L.setForeground(new java.awt.Color(69, 69, 71));
    }//GEN-LAST:event_LMousePressed

    private void LMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LMouseReleased
        L.setForeground(new java.awt.Color(179, 179, 179));
        originalText.setText(originalText.getText() + "L");
        codedText.setText(codedText.getText() + coder.code('L'));
    }//GEN-LAST:event_LMouseReleased

    private void KMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KMouseEntered
        K.setForeground(new java.awt.Color(242, 243, 244));
    }//GEN-LAST:event_KMouseEntered

    private void KMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KMouseExited
        K.setForeground(new java.awt.Color(179, 179, 179));
    }//GEN-LAST:event_KMouseExited

    private void KMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KMousePressed
        K.setForeground(new java.awt.Color(69, 69, 71));
    }//GEN-LAST:event_KMousePressed

    private void KMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KMouseReleased
        K.setForeground(new java.awt.Color(179, 179, 179));
        originalText.setText(originalText.getText() + "K");
        codedText.setText(codedText.getText() + coder.code('K'));
    }//GEN-LAST:event_KMouseReleased

    private void JMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMouseEntered
        J.setForeground(new java.awt.Color(242, 243, 244));
    }//GEN-LAST:event_JMouseEntered

    private void JMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMouseExited
        J.setForeground(new java.awt.Color(179, 179, 179));
    }//GEN-LAST:event_JMouseExited

    private void JMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMousePressed
        J.setForeground(new java.awt.Color(69, 69, 71));
    }//GEN-LAST:event_JMousePressed

    private void JMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMouseReleased
        J.setForeground(new java.awt.Color(179, 179, 179));
        originalText.setText(originalText.getText() + "J");
        codedText.setText(codedText.getText() + coder.code('J'));
    }//GEN-LAST:event_JMouseReleased

    private void HMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HMouseEntered
        H.setForeground(new java.awt.Color(242, 243, 244));
    }//GEN-LAST:event_HMouseEntered

    private void HMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HMouseExited
        H.setForeground(new java.awt.Color(179, 179, 179));
    }//GEN-LAST:event_HMouseExited

    private void HMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HMousePressed
        H.setForeground(new java.awt.Color(69, 69, 71));
    }//GEN-LAST:event_HMousePressed

    private void HMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HMouseReleased
        H.setForeground(new java.awt.Color(179, 179, 179));
        originalText.setText(originalText.getText() + "H");
        codedText.setText(codedText.getText() + coder.code('H'));
    }//GEN-LAST:event_HMouseReleased

    private void GMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GMouseEntered
        G.setForeground(new java.awt.Color(242, 243, 244));
    }//GEN-LAST:event_GMouseEntered

    private void GMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GMouseExited
        G.setForeground(new java.awt.Color(179, 179, 179));
    }//GEN-LAST:event_GMouseExited

    private void GMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GMousePressed
        G.setForeground(new java.awt.Color(69, 69, 71));
    }//GEN-LAST:event_GMousePressed

    private void GMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GMouseReleased
        G.setForeground(new java.awt.Color(179, 179, 179));
        originalText.setText(originalText.getText() + "G");
        codedText.setText(codedText.getText() + coder.code('G'));
    }//GEN-LAST:event_GMouseReleased

    private void FMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FMouseEntered
        F.setForeground(new java.awt.Color(242, 243, 244));
    }//GEN-LAST:event_FMouseEntered

    private void FMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FMouseExited
        F.setForeground(new java.awt.Color(179, 179, 179));
    }//GEN-LAST:event_FMouseExited

    private void FMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FMousePressed
        F.setForeground(new java.awt.Color(69, 69, 71));
    }//GEN-LAST:event_FMousePressed

    private void FMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FMouseReleased
        F.setForeground(new java.awt.Color(179, 179, 179));
        originalText.setText(originalText.getText() + "F");
        codedText.setText(codedText.getText() + coder.code('F'));
    }//GEN-LAST:event_FMouseReleased

    private void DMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DMouseEntered
        D.setForeground(new java.awt.Color(242, 243, 244));
    }//GEN-LAST:event_DMouseEntered

    private void DMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DMouseExited
        D.setForeground(new java.awt.Color(179, 179, 179));
    }//GEN-LAST:event_DMouseExited

    private void DMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DMousePressed
        D.setForeground(new java.awt.Color(69, 69, 71));
    }//GEN-LAST:event_DMousePressed

    private void DMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DMouseReleased
        D.setForeground(new java.awt.Color(179, 179, 179));
        originalText.setText(originalText.getText() + "D");
        codedText.setText(codedText.getText() + coder.code('D'));
    }//GEN-LAST:event_DMouseReleased

    private void SMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SMouseEntered
        S.setForeground(new java.awt.Color(242, 243, 244));
    }//GEN-LAST:event_SMouseEntered

    private void SMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SMouseExited
        S.setForeground(new java.awt.Color(179, 179, 179));
    }//GEN-LAST:event_SMouseExited

    private void SMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SMousePressed
        S.setForeground(new java.awt.Color(69, 69, 71));
    }//GEN-LAST:event_SMousePressed

    private void SMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SMouseReleased
        S.setForeground(new java.awt.Color(179, 179, 179));
        originalText.setText(originalText.getText() + "S");
        codedText.setText(codedText.getText() + coder.code('S'));
    }//GEN-LAST:event_SMouseReleased

    private void AMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AMouseEntered
        A.setForeground(new java.awt.Color(242, 243, 244));
    }//GEN-LAST:event_AMouseEntered

    private void AMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AMouseExited
        A.setForeground(new java.awt.Color(179, 179, 179));
    }//GEN-LAST:event_AMouseExited

    private void AMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AMousePressed
        A.setForeground(new java.awt.Color(69, 69, 71));
    }//GEN-LAST:event_AMousePressed

    private void AMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AMouseReleased
        A.setForeground(new java.awt.Color(179, 179, 179));
        originalText.setText(originalText.getText() + "A");
        codedText.setText(codedText.getText() + coder.code('A'));
    }//GEN-LAST:event_AMouseReleased

    private void PMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PMouseEntered
        P.setForeground(new java.awt.Color(242, 243, 244));
    }//GEN-LAST:event_PMouseEntered

    private void PMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PMouseExited
        P.setForeground(new java.awt.Color(179, 179, 179));
    }//GEN-LAST:event_PMouseExited

    private void PMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PMousePressed
        P.setForeground(new java.awt.Color(69, 69, 71));
    }//GEN-LAST:event_PMousePressed

    private void PMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PMouseReleased
        P.setForeground(new java.awt.Color(179, 179, 179));
        originalText.setText(originalText.getText() + "P");
        codedText.setText(codedText.getText() + coder.code('P'));
    }//GEN-LAST:event_PMouseReleased

    private void OMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OMouseEntered
        O.setForeground(new java.awt.Color(242, 243, 244));
    }//GEN-LAST:event_OMouseEntered

    private void OMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OMouseExited
        O.setForeground(new java.awt.Color(179, 179, 179));
    }//GEN-LAST:event_OMouseExited

    private void OMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OMousePressed
        O.setForeground(new java.awt.Color(69, 69, 71));
    }//GEN-LAST:event_OMousePressed

    private void OMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OMouseReleased
        O.setForeground(new java.awt.Color(179, 179, 179));
        originalText.setText(originalText.getText() + "O");
        codedText.setText(codedText.getText() + coder.code('O'));
    }//GEN-LAST:event_OMouseReleased

    private void IMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IMouseEntered
        I.setForeground(new java.awt.Color(242, 243, 244));
    }//GEN-LAST:event_IMouseEntered

    private void IMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IMouseExited
        I.setForeground(new java.awt.Color(179, 179, 179));
    }//GEN-LAST:event_IMouseExited

    private void IMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IMousePressed
        I.setForeground(new java.awt.Color(69, 69, 71));
    }//GEN-LAST:event_IMousePressed

    private void IMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IMouseReleased
        I.setForeground(new java.awt.Color(179, 179, 179));
        originalText.setText(originalText.getText() + "I");
        codedText.setText(codedText.getText() + coder.code('I'));
    }//GEN-LAST:event_IMouseReleased

    private void UMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UMouseEntered
        U.setForeground(new java.awt.Color(242, 243, 244));
    }//GEN-LAST:event_UMouseEntered

    private void UMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UMouseExited
        U.setForeground(new java.awt.Color(179, 179, 179));
    }//GEN-LAST:event_UMouseExited

    private void UMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UMousePressed
        U.setForeground(new java.awt.Color(69, 69, 71));
    }//GEN-LAST:event_UMousePressed

    private void UMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UMouseReleased
        U.setForeground(new java.awt.Color(179, 179, 179));
        originalText.setText(originalText.getText() + "U");
        codedText.setText(codedText.getText() + coder.code('U'));
    }//GEN-LAST:event_UMouseReleased

    private void YMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_YMouseEntered
        Y.setForeground(new java.awt.Color(242, 243, 244));
    }//GEN-LAST:event_YMouseEntered

    private void YMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_YMouseExited
        Y.setForeground(new java.awt.Color(179, 179, 179));
    }//GEN-LAST:event_YMouseExited

    private void YMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_YMousePressed
        Y.setForeground(new java.awt.Color(69, 69, 71));
    }//GEN-LAST:event_YMousePressed

    private void YMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_YMouseReleased
        Y.setForeground(new java.awt.Color(179, 179, 179));
        originalText.setText(originalText.getText() + "Y");
        codedText.setText(codedText.getText() + coder.code('Y'));
    }//GEN-LAST:event_YMouseReleased

    private void TMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TMouseEntered
        T.setForeground(new java.awt.Color(242, 243, 244));
    }//GEN-LAST:event_TMouseEntered

    private void TMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TMouseExited
        T.setForeground(new java.awt.Color(179, 179, 179));
    }//GEN-LAST:event_TMouseExited

    private void TMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TMousePressed
        T.setForeground(new java.awt.Color(69, 69, 71));
    }//GEN-LAST:event_TMousePressed

    private void TMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TMouseReleased
        T.setForeground(new java.awt.Color(179, 179, 179));
        originalText.setText(originalText.getText() + "T");
        codedText.setText(codedText.getText() + coder.code('T'));
    }//GEN-LAST:event_TMouseReleased

    private void RMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RMouseEntered
        R.setForeground(new java.awt.Color(242, 243, 244));
    }//GEN-LAST:event_RMouseEntered

    private void RMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RMouseExited
        R.setForeground(new java.awt.Color(179, 179, 179));
    }//GEN-LAST:event_RMouseExited

    private void RMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RMousePressed
        R.setForeground(new java.awt.Color(69, 69, 71));
    }//GEN-LAST:event_RMousePressed

    private void RMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RMouseReleased
        R.setForeground(new java.awt.Color(179, 179, 179));
        originalText.setText(originalText.getText() + "R");
        codedText.setText(codedText.getText() + coder.code('R'));
    }//GEN-LAST:event_RMouseReleased

    private void EMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EMouseEntered
        E.setForeground(new java.awt.Color(242, 243, 244));
    }//GEN-LAST:event_EMouseEntered

    private void EMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EMouseExited
        E.setForeground(new java.awt.Color(179, 179, 179));
    }//GEN-LAST:event_EMouseExited

    private void EMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EMousePressed
        E.setForeground(new java.awt.Color(69, 69, 71));
    }//GEN-LAST:event_EMousePressed

    private void EMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EMouseReleased
        E.setForeground(new java.awt.Color(179, 179, 179));
        originalText.setText(originalText.getText() + "E");
        codedText.setText(codedText.getText() + coder.code('E'));
    }//GEN-LAST:event_EMouseReleased

    private void WMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WMouseEntered
        W.setForeground(new java.awt.Color(242, 243, 244));
    }//GEN-LAST:event_WMouseEntered

    private void WMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WMouseExited
        W.setForeground(new java.awt.Color(179, 179, 179));
    }//GEN-LAST:event_WMouseExited

    private void WMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WMousePressed
        W.setForeground(new java.awt.Color(69, 69, 71));
    }//GEN-LAST:event_WMousePressed

    private void WMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WMouseReleased
        W.setForeground(new java.awt.Color(179, 179, 179));
        originalText.setText(originalText.getText() + "W");
        codedText.setText(codedText.getText() + coder.code('W'));
    }//GEN-LAST:event_WMouseReleased

    private void SPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SPMouseEntered
        SP.setForeground(new java.awt.Color(242, 243, 244));
    }//GEN-LAST:event_SPMouseEntered

    private void SPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SPMouseExited
        SP.setForeground(new java.awt.Color(179, 179, 179));
    }//GEN-LAST:event_SPMouseExited

    private void SPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SPMousePressed
        SP.setForeground(new java.awt.Color(69, 69, 71));
    }//GEN-LAST:event_SPMousePressed

    private void SPMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SPMouseReleased
        SP.setForeground(new java.awt.Color(179, 179, 179));
        originalText.setText(originalText.getText() + " ");
        codedText.setText(codedText.getText() + " ");
    }//GEN-LAST:event_SPMouseReleased

    private void RSMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RSMouseEntered
        RS.setForeground(new java.awt.Color(242, 243, 244));
    }//GEN-LAST:event_RSMouseEntered

    private void RSMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RSMouseExited
        RS.setForeground(new java.awt.Color(179, 179, 179));
    }//GEN-LAST:event_RSMouseExited

    private void RSMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RSMousePressed
        RS.setForeground(new java.awt.Color(69, 69, 71));
    }//GEN-LAST:event_RSMousePressed

    private void RSMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RSMouseReleased
        RS.setForeground(new java.awt.Color(179, 179, 179));
        originalText.setText("ORIGINAL TEXT: ");
        codedText.setText("Click here to enable keyboard");

        coder = factory.createCoder();
    }//GEN-LAST:event_RSMouseReleased

    private void codedTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codedTextKeyPressed

        if (!flag) {

            int i = evt.getKeyCode();
            char ch = ' ';

            if (i == prevCh) {
                flag = true;
            }

            switch (i) {
                case 65 -> {
                    ch = 'A';
                    found = true;
                }
                case 66 -> {
                    ch = 'B';
                    found = true;
                }

                case 67 -> {
                    ch = 'C';
                    found = true;
                }

                case 68 -> {
                    ch = 'D';
                    found = true;
                }

                case 69 -> {
                    ch = 'E';
                    found = true;
                }

                case 70 -> {
                    ch = 'F';
                    found = true;
                }
                case 71 -> {
                    ch = 'G';
                    found = true;
                }
                case 72 -> {
                    ch = 'H';
                    found = true;
                }
                case 73 -> {
                    ch = 'I';
                    found = true;
                }
                case 74 -> {
                    ch = 'J';
                    found = true;
                }
                case 75 -> {
                    ch = 'K';
                    found = true;
                }
                case 76 -> {
                    ch = 'L';
                    found = true;
                }
                case 77 -> {
                    ch = 'M';
                    found = true;
                }
                case 78 -> {
                    ch = 'N';
                    found = true;
                }
                case 79 -> {
                    ch = 'O';
                    found = true;
                }
                case 80 -> {
                    ch = 'P';
                    found = true;
                }
                case 81 -> {
                    ch = 'Q';
                    found = true;
                }
                case 82 -> {
                    ch = 'R';
                    found = true;
                }
                case 83 -> {
                    ch = 'S';
                    found = true;
                }
                case 84 -> {
                    ch = 'T';
                    found = true;
                }
                case 85 -> {
                    ch = 'U';
                    found = true;
                }
                case 86 -> {
                    ch = 'V';
                    found = true;
                }
                case 87 -> {
                    ch = 'W';
                    found = true;
                }
                case 88 -> {
                    ch = 'X';
                    found = true;
                }
                case 89 -> {
                    ch = 'Y';
                    found = true;
                }
                case 90 -> {
                    ch = 'Z';
                    found = true;
                }
                case 32 -> {
                    originalText.setText(originalText.getText() + " ");
                    codedText.setText(codedText.getText() + " ");
                }

            }

            if (found) {
                originalText.setText(originalText.getText() + ch);
                if(codedText.getText().equals("Click here to enable keyboard")){
                    codedText.setText(""+coder.code(ch));
                } else{
                    codedText.setText(codedText.getText() + coder.code(ch));
                }
            }

            found = false;
            prevCh = i;
        }
    }//GEN-LAST:event_codedTextKeyPressed

    private void codedTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codedTextKeyReleased
        if (flag) {
            flag = false;
        }
    }//GEN-LAST:event_codedTextKeyReleased

    private void backButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseEntered
        backButton.setForeground(new java.awt.Color(179, 179, 179));
    }//GEN-LAST:event_backButtonMouseEntered

    private void backButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseExited
        backButton.setForeground(new java.awt.Color(242, 243, 244));
    }//GEN-LAST:event_backButtonMouseExited

    private void backButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMousePressed
        backButton.setForeground(new java.awt.Color(69, 69, 71));
    }//GEN-LAST:event_backButtonMousePressed

    private void backButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseReleased
        backButton.setForeground(new java.awt.Color(242, 243, 244));
        main.PanelSwapper.getInstance().showMainPanel();

    }//GEN-LAST:event_backButtonMouseReleased

    public void setHeader(String text) {
        headText.setText(text);
        if (text.equals("Encode Message")) {
            factory = new EncodeFactory();
            coder = factory.createCoder();
        } else {
            factory = new DecodeFactory();
            coder = factory.createCoder();
        }
    }

    private CoderFactory factory;
    private Coder coder;

    private int prevCh;
    private boolean found = false, flag = false;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A;
    private javax.swing.JButton B;
    private javax.swing.JButton C;
    private javax.swing.JButton D;
    private javax.swing.JButton E;
    private javax.swing.JButton F;
    private javax.swing.JButton G;
    private javax.swing.JButton H;
    private javax.swing.JButton I;
    private javax.swing.JButton J;
    private javax.swing.JButton K;
    private javax.swing.JButton L;
    private javax.swing.JButton M;
    private javax.swing.JButton N;
    private javax.swing.JButton O;
    private javax.swing.JButton P;
    private javax.swing.JButton Q;
    private javax.swing.JButton R;
    private javax.swing.JButton RS;
    private javax.swing.JButton S;
    private javax.swing.JButton SP;
    private javax.swing.JButton T;
    private javax.swing.JButton U;
    private javax.swing.JButton V;
    private javax.swing.JButton W;
    private javax.swing.JButton X;
    private javax.swing.JButton Y;
    private javax.swing.JButton Z;
    private javax.swing.JLabel backButton;
    private javax.swing.JLabel backgroundImage;
    private javax.swing.JLabel backgroundOpacity;
    private javax.swing.JTextField codedText;
    private javax.swing.JLabel headText;
    private javax.swing.JLabel line1;
    private javax.swing.JLabel line2;
    private javax.swing.JTextField originalText;
    // End of variables declaration//GEN-END:variables
}
