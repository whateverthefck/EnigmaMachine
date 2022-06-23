package main.coder;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author
 */
public class Encoder extends Coder {

    public Encoder() {

        setPlugboard();
        setRotors();
        setReflector();
        setKeys();
    }

    @Override
    public char code(char ch) {

        if (RII.charAt(0) == notchII && RIII.charAt(0) == notchIII) {
            RI = rotate(RI);
            RII = rotate(RII);
            RIII = rotate(RIII);

        } else if (RII.charAt(0) == notchII) {
            RI = rotate(RI);
            RII = rotate(RII);
            RIII = rotate(RIII);

        } else if (RIII.charAt(0) == notchIII) {
            RII = rotate(RII);
            RIII = rotate(RIII);

        } else {
            RIII = rotate(RIII);

        }

        int signal;

        signal = kbForward(ch);
        signal = pbForward(signal);
        signal = RIIIForward(signal);
        signal = RIIForward(signal);
        signal = RIForward(signal);
        signal = reflect(signal);
        signal = RIBackward(signal);
        signal = RIIBackward(signal);
        signal = RIIIBackward(signal);
        signal = pbBackward(signal);
        char letter = kbBackward(signal);

        return letter;
    }

    public int kbForward(char letter) {
        int signal = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(letter);
        return signal;
    }

    public char kbBackward(int signal) {
        char letter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(signal);
        return letter;
    }

    public int pbForward(int signal) {
        char letter = plugboard.charAt(signal);
        int returnSignal = alphabets.indexOf(letter);
        return returnSignal;
    }

    public int pbBackward(int signal) {
        char letter = alphabets.charAt(signal);
        int returnSignal = plugboard.indexOf(letter);
        return returnSignal;
    }

    public int RIForward(int signal) {
        char letter = RI.charAt(signal);
        int returnSignal = alphabets.indexOf(letter);
        return returnSignal;
    }

    public int RIBackward(int signal) {
        char letter = alphabets.charAt(signal);
        int returnSignal = RI.indexOf(letter);
        return returnSignal;
    }

    public int RIIForward(int signal) {
        char letter = RII.charAt(signal);
        int returnSignal = alphabets.indexOf(letter);
        return returnSignal;
    }

    public int RIIBackward(int signal) {
        char letter = alphabets.charAt(signal);
        int returnSignal = RII.indexOf(letter);
        return returnSignal;
    }

    public int RIIIForward(int signal) {
        char letter = RIII.charAt(signal);
        int returnSignal = alphabets.indexOf(letter);
        return returnSignal;
    }

    public int RIIIBackward(int signal) {
        char letter = alphabets.charAt(signal);
        int returnSignal = RIII.indexOf(letter);
        return returnSignal;
    }

    public int reflect(int signal) {
        char letter = reflector.charAt(signal);
        int returnSignal = alphabets.indexOf(letter);
        return returnSignal;
    }

    public String rotate(String rotor, int n) {
        for (int i = 0; i < n; i++) {
            rotor = rotor.substring(1) + rotor.charAt(0);
        }
        return rotor;
    }

    public String rotate(String rotor) {
        rotor = rotor.substring(1) + rotor.charAt(0);
        return rotor;
    }

    public final void setReflector() {
        try {
            Connection con = connectionprovider.SQLconnection.connect();

            PreparedStatement pst = con.prepareStatement("SELECT * FROM [Reflector] WHERE username=? AND settings=?;");
            pst.setString(1, main.settings.Settings.getInstance().getUser());
            pst.setString(2, main.settings.Settings.getInstance().getSettings());

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                reflector = rs.getString("reflector");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Encoder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public final void setRotors() {

        try {
            Connection con = connectionprovider.SQLconnection.connect();

            PreparedStatement pst = con.prepareStatement("SELECT * FROM [RI] WHERE username=? AND settings=?;");
            pst.setString(1, main.settings.Settings.getInstance().getUser());
            pst.setString(2, main.settings.Settings.getInstance().getSettings());

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                RI = rs.getString("rotor");
                notchI = rs.getString("notch").charAt(0);
            }

            pst = con.prepareStatement("SELECT * FROM [RII] WHERE username=? AND settings=?;");
            pst.setString(1, main.settings.Settings.getInstance().getUser());
            pst.setString(2, main.settings.Settings.getInstance().getSettings());

            rs = pst.executeQuery();

            if (rs.next()) {
                RII = rs.getString("rotor");
                notchII = rs.getString("notch").charAt(0);
            }

            pst = con.prepareStatement("SELECT * FROM [RIII] WHERE username=? AND settings=?;");
            pst.setString(1, main.settings.Settings.getInstance().getUser());
            pst.setString(2, main.settings.Settings.getInstance().getSettings());

            rs = pst.executeQuery();

            if (rs.next()) {
                RIII = rs.getString("rotor");
                notchII = rs.getString("notch").charAt(0);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Encoder.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public final void setKeys() {

        try {
            Connection con = connectionprovider.SQLconnection.connect();
            PreparedStatement pst = con.prepareStatement("SELECT * FROM [Keys] WHERE username=? AND settings=?;");
            pst.setString(1, main.settings.Settings.getInstance().getUser());
            pst.setString(2, main.settings.Settings.getInstance().getSettings());

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                key1 = rs.getString("key1").charAt(0);
                key2 = rs.getString("key2").charAt(0);
                key3 = rs.getString("key3").charAt(0);

                RI = rotate(RI, alphabets.indexOf(key1));
                RII = rotate(RII, alphabets.indexOf(key2));
                RIII = rotate(RIII, alphabets.indexOf(key3));

            }

        } catch (SQLException ex) {
            Logger.getLogger(Encoder.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public final void setPlugboard() {

        try {
            Connection con = connectionprovider.SQLconnection.connect();
            PreparedStatement pst = con.prepareStatement("SELECT * FROM [plugboard] WHERE username=? AND settings=? AND pb1 IS NOT NULL;");
            pst.setString(1, main.settings.Settings.getInstance().getUser());
            pst.setString(2, main.settings.Settings.getInstance().getSettings());

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                char pb1 = rs.getString("pb1").charAt(0);
                char pb2 = rs.getString("pb2").charAt(0);

                int pos1 = plugboard.indexOf(pb1);
                int pos2 = plugboard.indexOf(pb2);

                plugboard = plugboard.substring(0, pos1) + pb2 + plugboard.substring(pos1 + 1);
                plugboard = plugboard.substring(0, pos2) + pb1 + plugboard.substring(pos2 + 1);

            }

        } catch (SQLException ex) {
            Logger.getLogger(Encoder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    String plugboard = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    String RI, RII, RIII;
    char notchI, notchII, notchIII;

    char key1, key2, key3;

    String reflector;
}
