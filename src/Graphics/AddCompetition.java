package Graphics;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class AddCompetition extends JFrame implements ActionListener {
    private JLabel title;
    private JRadioButton courierTourRadioBox;
    private JComboBox competitionTypeComboBox;
    private JRadioButton regularTourRadioBox;
    private JButton okBtn;
    private JButton cancelButton;
    private JPanel addCompetitionPanel;
    private JTextField tourTextField;
    private JLabel tourName;

    public AddCompetition(){
        super("Add Competition");

        okBtn.addActionListener(this);
        cancelButton.addActionListener(this);



        competitionTypeComboBox.addItem("Water animals");
        competitionTypeComboBox.addItem("Air animals");
        competitionTypeComboBox.addItem("Terrestrial animals");


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(addCompetitionPanel);
        pack();
        setVisible(true);

    }



//    public static void main(String[] args) {
//        AddCompetition a = new AddCompetition();
//
//    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(cancelButton)){
            dispose();
        }

    }

    public JComboBox getCompetitionTypeComboBox() {
        return competitionTypeComboBox;
    }

    public JRadioButton getCourierTourRadioBox() {
        return courierTourRadioBox;
    }

    public JRadioButton getRegularTourRadioBox() {
        return regularTourRadioBox;
    }

    public JTextField getTextField1() {
        return tourTextField;
    }

    public JButton getOkBtn() {
        return okBtn;
    }

    //
}
