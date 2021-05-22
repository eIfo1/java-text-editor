package app;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Avery
 */
public class menuBar extends JMenuBar {

    public menuBar() {
        JMenu file = new JMenu("File");
        add(file);
        JMenuItem newfile = new JMenuItem("New File (CTRL + N)");
        file.add(newfile);
        JMenuItem open = new JMenuItem("Open File (CTRL + O)");
        file.add(open);
    }
}
