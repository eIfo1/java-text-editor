package app;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Avery
 */
public class mainPanel extends JPanel {

    public mainPanel() {
        // only added because my jtextarea wouldn't fill the entire screen
        setLayout(new BorderLayout());

        //JLabel label = new JLabel("Edit below");
        //add(label);
        JTextArea area = new JTextArea(5, 50);
        Font font = new Font("Consolas", Font.PLAIN, 20);
        area.setFont(font);
        area.setLineWrap(true);
        area.setWrapStyleWord(true);
        area.setSize(area.getPreferredSize());
        JScrollPane scrollPane = new JScrollPane(area);
        
        add(scrollPane);
    }
}
