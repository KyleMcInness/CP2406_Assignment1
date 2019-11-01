import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    Frame() {

        JMenuBar menu_bar = new JMenuBar();
        setJMenuBar(menu_bar);

        JMenu edit_mode = new JMenu("Edit Mode");
        JMenuItem create = new JMenuItem("Create");
        JMenuItem edit = new JMenuItem("Edit");
        JMenuItem load = new JMenuItem("Load");
        JMenuItem save = new JMenuItem("Save");
        edit_mode.add(create);
        edit_mode.add(edit);
        edit_mode.add(load);
        edit_mode.add(save);

        JMenu sim_mode = new JMenu("Simulation Mode");
        JMenuItem set_update_rate = new JMenuItem("Set Update Rate");
        JMenuItem run = new JMenuItem("Run");
        JMenuItem stop = new JMenuItem("Stop");
        JMenuItem set_spawn_rate = new JMenuItem("Set Spawn Rate");
        sim_mode.add(set_update_rate);
        sim_mode.add(run);
        sim_mode.add(stop);
        sim_mode.add(set_spawn_rate);

        menu_bar.add(edit_mode);
        menu_bar.add(sim_mode);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
    }

}
