import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by Àlex on 10/3/2017.
 */
public class MinionGUI {
    private JPanel panel;
    private JButton femaleButton;
    private JButton foodButton;
    private JButton gadgetButton;
    private JButton sportButton;
    private JButton houseButton;
    private JButton minionSmurfButton;
    private JTextField textField1;
    static int switchMS; //switch mode between minion and smurf; 0 = minion, 1 = smurf;
    static String output;

    public MinionGUI() {
        minionSmurfButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (switchMS == 1) {
                    switchMS = 0;
                    output = "Now you control a MINION!";
                }
                else {
                    switchMS = 1;
                    output = "Now you control a SMURF!";

                }
            }
        });
        femaleButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                if (switchMS == 0) { //MINION case
                    MinionFactory minionFactory = new MinionFactory();
                    MinionFemale mf = (MinionFemale) minionFactory.createFemale();
                    output = mf.brushHair();
                }

                else {  //SMURF case
                    SmurfFactory smurfFactory = new SmurfFactory();
                    SmurfFemale sf = (SmurfFemale) smurfFactory.createFemale();
                    output = sf.brushHair();

                }


            }
        });
        foodButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                if (switchMS == 0) { //MINION case
                    MinionFactory minionFactory = new MinionFactory();
                    MinionFood mf = (MinionFood) minionFactory.createFood();
                    output = mf.cook();
                }

                else {  //SMURF case
                    SmurfFactory smurfFactory = new SmurfFactory();
                    SmurfFood sf = (SmurfFood) smurfFactory.createFood();
                    output = sf.cook();

                }
            }
        });
        gadgetButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (switchMS == 0) { //MINION case
                    MinionFactory minionFactory = new MinionFactory();
                    MinionGadget mf = (MinionGadget) minionFactory.createGadget();
                    output = mf.createGadget();
                }

                else {  //SMURF case
                    SmurfFactory smurfFactory = new SmurfFactory();
                    SmurfGadget sf = (SmurfGadget) smurfFactory.createGadget();
                    output = sf.createGadget();

                }
            }
        });
        sportButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                if (switchMS == 0) { //MINION case
                    MinionFactory minionFactory = new MinionFactory();
                    MinionSportFigure mf = (MinionSportFigure) minionFactory.createSportFigure();
                    output = mf.jump();
                }

                else {  //SMURF case
                    SmurfFactory smurfFactory = new SmurfFactory();
                    SmurfSportFigure sf = (SmurfSportFigure) smurfFactory.createSportFigure();
                    output = sf.jump();

                }
            }
        });
        houseButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                if (switchMS == 0) { //MINION case
                    MinionFactory minionFactory = new MinionFactory();
                    MinionHouse mf = (MinionHouse) minionFactory.createHouse();
                    output = mf.build();
                }

                else {  //SMURF case
                    SmurfFactory smurfFactory = new SmurfFactory();
                    SmurfHouse sf = (SmurfHouse) smurfFactory.createHouse();
                    output = sf.build();

                }
            }
        });
    }

    public static void main(String[] args) {

        MinionGUI gui = new MinionGUI();
        gui.init();
    }

    public void init() {


        JFrame jf = new JFrame("Minion Game");
        jf.setContentPane(panel);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jf.pack();
        jf.setVisible(true);
        switchMS = 0;   //start being Minion by default
        output = "Nothing right now.";

        while (true) {

            textField1.setText(" " + output);

        }


    }

}
