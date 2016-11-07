package com.federico;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Fede on 6/11/2016
 */
public class WaterfallSurvey extends JFrame {

    // Big block of declaration of variables

    private JPanel RootPanel;
    private JCheckBox DeadlineYes;
    private JCheckBox DeadlineNo;
    private JCheckBox LocationYes;
    private JCheckBox LocationNo;
    private JCheckBox QualityYes;
    private JCheckBox RequirementsYes;
    private JCheckBox RequirementsNo;
    private JCheckBox QualityNo;
    private JCheckBox CustomerYes;
    private JCheckBox CustomerNo;
    private JButton SurveyButton;
    private JTextField numberPeople;
    private JLabel NumberPeople;
    private JLabel DeadlineLabel;
    private JTextField ProjectName;
    private JLabel Name;
    private JLabel RequirementsLabel;
    private JLabel Location;
    private JLabel Quality;
    private JLabel Customer;
    private JLabel ResultLabel;
    private JButton quitButton;

    // a couple of counters I will use to determine the strategy to follow
    private int countwaterfall;
    private int countagile;

    protected WaterfallSurvey(){
        //standard constructor for the program
        super ("Waterfall or Agile Survey");
        setContentPane(RootPanel);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);



        /* Inside the Survey button I set all the conditionals to determine which counter
        will get increased and then proceed to show in the result box the final result. The code is really easy to follow but it's a lot of repetitive lines of code
         */
        SurveyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String projectname = ProjectName.getText();
                String NumberOfPeople = numberPeople.getText();
                int people =  Integer.parseInt(NumberOfPeople);
                if (people > 20){
                    countwaterfall = countwaterfall +1;
                }else{
                    countagile = countagile +1;
                }
                if (DeadlineYes.isSelected()){
                    countwaterfall = countwaterfall +1;
                }else if(DeadlineNo.isSelected()){
                    countagile = countagile +1;
                }
                if (LocationYes.isSelected()){
                    countwaterfall = countwaterfall +1;
                }else if(LocationNo.isSelected()){
                    countagile = countagile +1;
                }
                if (QualityYes.isSelected()){
                    countwaterfall = countwaterfall +1;
                }else if(QualityNo.isSelected()){
                    countagile = countagile +1;
                }
                if (RequirementsYes.isSelected()){
                    countwaterfall = countwaterfall +1;
                }else if(RequirementsNo.isSelected()){
                    countagile = countagile +1;
                }
                if (CustomerYes.isSelected()){
                    countwaterfall = countwaterfall +1;
                }else if(CustomerNo.isSelected()){
                    countagile = countagile +1;
                }

                if (countagile > countwaterfall){
                    String result = "The project " + projectname + " should use Agile";
                    ResultLabel.setText((result));
                }else {
                    String result = "The project " + projectname + " should use Waterfall";
                    ResultLabel.setText((result));
                }

            }

        });
        // Finally, the quit button
        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}

