import javax.swing.*;

public class gissatalet {

    public static void main(String[] args) {

        int antalfel = 0;
        int spelarsvar;
        int min = 1;
        int max = 100;
        int randomnummer;
        boolean aaa = false;

        randomnummer = (int) (Math.random() * (max - min + 1) + min);

        spelarsvar = Integer.parseInt(JOptionPane.showInputDialog("Välj ett nummer mellan 1 och 100"));

        while (!aaa) {

            if(spelarsvar == randomnummer) {
                JOptionPane.showMessageDialog(null, "yikes du vann, du tog " + antalfel);
                aaa = true;
                continue;
            }

                if (spelarsvar > randomnummer) {
                    spelarsvar = Integer.parseInt(JOptionPane.showInputDialog("det är mindre än " + spelarsvar + " ge ett nytt nummer"));
                    antalfel = antalfel + 1;
                }

                if (spelarsvar < randomnummer) {
                    spelarsvar = Integer.parseInt(JOptionPane.showInputDialog("det är mer än " + spelarsvar + " ge ett nytt nummer"));
                    antalfel = antalfel + 1;
                }
        }
    }
}