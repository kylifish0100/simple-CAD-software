import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class PopUpMenu extends JPopupMenu implements ActionListener {
    ActionListener realLis;
    boolean flag = false;  //Mark whether polygon is done
    public PopUpMenu(ActionListener listener) {
        this.realLis = listener;

        JMenuItem item1 = new JMenuItem("Copy");
        item1.addActionListener(realLis);
        item1.setActionCommand("copy");
        this.add(item1);

        JMenuItem item5 = new JMenuItem("Paste");
        item5.addActionListener(realLis);
        item5.setActionCommand("paste");
        this.add(item5);

        JMenuItem item2 = new JMenuItem("Cut");
        item2.addActionListener(realLis);
        item2.setActionCommand("cut");
        this.add(item2);

        JMenuItem item3 = new JMenuItem("Fill Color");
        item3.addActionListener(realLis);
        item3.setActionCommand("fillcolor");
        this.add(item3);

        JMenuItem item4 = new JMenuItem("Fill with Image");
        item4.addActionListener(realLis);
        item4.setActionCommand("fillimage");
        this.add(item4);

        JMenuItem item6 = new JMenuItem("OK");
        item6.addActionListener(realLis);
        item6.setActionCommand("OK");
        this.add(item6);

        JMenuItem item7 = new JMenuItem("Cancel Select");
        item7.addActionListener(realLis);
        item7.setActionCommand("cancel");
        this.add(item7);


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        //((JPopupMenu)((JMenuItem)e.getSource()).getParent()).getInvoker();
        String command = e.getActionCommand();
        if (command.equals("copy")){

        }else if (command.equals("OK")){
            System.out.println("OK");
            flag = true;
        }

    }


}
