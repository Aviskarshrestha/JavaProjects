import javax.sound.midi.SysexMessage;
import javax.swing.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static class HelloDisplayWindow extends JPanel{
        public void paintComponent(Graphics g){

            super.paintComponent(g);
            g.drawString("Hello world!",12,100);
        }
    }
    static class ButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        HelloDisplayWindow helloDisplay=new HelloDisplayWindow();
        JButton okButton=new JButton("OK");
        ButtonListener buttonEvent=new ButtonListener();
        okButton.addActionListener(buttonEvent);
        JPanel content=new JPanel();
        content.setLayout(new BorderLayout());
        content.add(helloDisplay,BorderLayout.CENTER);
        content.add(okButton,BorderLayout.SOUTH);

        JFrame window=new JFrame("GUI Window");
        window.setSize(500,500);
        window.setLocation(500,500);
        window.setVisible(true);
        window.setContentPane(content);
        boolean x=window.isVisible();
        System.out.println(x);
    }
}