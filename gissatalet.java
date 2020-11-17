import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class gissatalet {

    public static void main(String[] args) {

        int tries = 1;
        int spelarsvar;
        int min = 1;
        int max = 100;
        int randomnummer;
        boolean aaa = false;

        randomnummer = (int) (Math.random() * (max - min + 1) + min);

        spelarsvar = Integer.parseInt(JOptionPane.showInputDialog("Välj ett nummer mellan 1 och 100"));

        while (!aaa) {

            if(spelarsvar == randomnummer) {
                if(tries > 5)
                    JOptionPane.showMessageDialog(null, "yikes du vann tillslut, det tog " + tries + " försök.");
                if(tries == 1)
                    JOptionPane.showMessageDialog(null, "Gudn 0 deaths");
                if(tries != 1) {
                    if(tries < 5)
                        JOptionPane.showMessageDialog(null, "grattis du är inte helt sämst, det tog " + tries + " försök.");
                }
                aaa = true;
                continue;

            }

            if (spelarsvar > randomnummer) {
                spelarsvar = Integer.parseInt(JOptionPane.showInputDialog("det är mindre än " + spelarsvar + ", ge ett nytt nummer"));
                tries = tries + 1;
            }

            if (spelarsvar < randomnummer) {
                spelarsvar = Integer.parseInt(JOptionPane.showInputDialog("det är mer än " + spelarsvar + ", ge ett nytt nummer"));
                tries = tries + 1;
            }
        }
    }
}
