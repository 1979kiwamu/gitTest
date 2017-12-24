package pattern22.command;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Main extends JFrame implements ActionListener, MouseMotionListener, WindowListener {

    private MacroCommand history = new MacroCommand();

    private DrawCanvas canvas = new DrawCanvas(400, 400, history);

    private JButton clearButton = new JButton("clear");

    public Main(String title) {
        super(title);

        this.addWindowListener(this);
        canvas.addMouseMotionListener(this);
        clearButton.addActionListener(this);

        Box buttonBox = new Box(BoxLayout.X_AXIS);
        buttonBox.add(clearButton);
        Box mainBox = new Box(BoxLayout.Y_AXIS);
        mainBox.add(buttonBox);
        mainBox.add(canvas);
        getContentPane().add(mainBox);

        pack();
        show();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clearButton) {
            history.clear();
            canvas.repaint();
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Command cmd = new DrawCommand(canvas, e.getPoint());
        history.append(cmd);
        cmd.execute();

    }

    @Override
    public void mouseMoved(MouseEvent arg0) {
        // TODO 自動生成されたメソッド・スタブ

    }

    public static void main(String[] args) {
        new Main("Command Pattern Sample");
    }

    @Override
    public void windowActivated(WindowEvent arg0) {
        // TODO 自動生成されたメソッド・スタブ

    }

    @Override
    public void windowClosed(WindowEvent arg0) {
        // TODO 自動生成されたメソッド・スタブ

    }

    @Override
    public void windowClosing(WindowEvent arg0) {
        // TODO 自動生成されたメソッド・スタブ

    }

    @Override
    public void windowDeactivated(WindowEvent arg0) {
        // TODO 自動生成されたメソッド・スタブ

    }

    @Override
    public void windowDeiconified(WindowEvent arg0) {
        // TODO 自動生成されたメソッド・スタブ

    }

    @Override
    public void windowIconified(WindowEvent arg0) {
        // TODO 自動生成されたメソッド・スタブ

    }

    @Override
    public void windowOpened(WindowEvent arg0) {
        // TODO 自動生成されたメソッド・スタブ

    }


}
