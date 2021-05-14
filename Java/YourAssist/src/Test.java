import java.awt.*;
import javax.swing.*;
import java.net.URL;

public class Test{
    public Test(){}
}

class LoadFont {
    public static void main(String[] args) throws Exception {
        // This font is < 35Kb.
        URL fontUrl = new URL("http://www.webpagepublicity.com/" +
                "free-fonts/a/Airacobra%20Condensed.ttf");
        Font font = Font.createFont(Font.TRUETYPE_FONT, fontUrl.openStream());
        GraphicsEnvironment ge =
                GraphicsEnvironment.getLocalGraphicsEnvironment();
        ge.registerFont(font);
        JList fonts = new JList( ge.getAvailableFontFamilyNames() );
        JOptionPane.showMessageDialog(null, new JScrollPane(fonts));
    }
}
class DisplayFont {
    public static void main(String[] args) throws Exception {
        URL fontUrl = new URL("https://github.com/shrate/shrate/raw/main/css/fonts/Rubik-SemiBold.ttf");
        Font font = Font.createFont(Font.TRUETYPE_FONT, fontUrl.openStream());
        font = font.deriveFont(Font.PLAIN,20);
        GraphicsEnvironment ge =
                GraphicsEnvironment.getLocalGraphicsEnvironment();
        ge.registerFont(font);

        JLabel l = new JLabel(
                "The quick brown fox jumps over the lazy dog. 0123456789");
        l.setFont(font);
        JOptionPane.showMessageDialog(null, l);
    }
}