package app;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.WindowConstants;

/**
 *
 * @author Avery
 */
public class window {

    public static void init() {

        // Make the program look nicer overall.
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Code block to handle the hassle that is screen resolution.
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int scrWidth = screenSize.width;
        int scrHeight = screenSize.height;
        int appWidth = scrWidth / 2;
        int appHeight = scrHeight / 2;
        

        // Variable initialization 
        JFrame frame = new JFrame("Text Editor");

        // Window Properties (size, visibility, content, colors, etc.)
        frame.setBounds(0, 0, appWidth, appHeight);
        frame.add(new menuBar());
        frame.setJMenuBar(new menuBar());
        frame.add(new mainPanel());
        frame.setVisible(true);   

        /* This makes the process end whenever the user closes the program. Default operation
        makes the window hidden, but the process runs indefinitley, to close it you'd have to
        end it through task manager.
         */
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
