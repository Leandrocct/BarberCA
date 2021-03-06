package views.loginsComponents;

import javax.swing.*;
import java.awt.*;

public class LoginPanel extends JPanel {

    private final JPanel northSubPanel;
    private final LoginFormSubPanel middleSubPanel;
    private final JPanel southSubPanel;


    public LoginPanel(){

        this.setLayout(new BorderLayout());

        // Initializing variables
        this.northSubPanel = new JPanel();
        this.middleSubPanel = new LoginFormSubPanel();
        this.southSubPanel = new JPanel();



        // Adding the variables to this Login Panel
        this.add(this.northSubPanel, BorderLayout.NORTH);
        this.add(this.middleSubPanel, BorderLayout.CENTER);
        this.add(this.southSubPanel, BorderLayout.SOUTH);

        // Creating labels for each Panel
        JLabel northSubPanelLabel = new JLabel("Login");
        JLabel southSubPanelLabel = new JLabel("Amilcar CA");

        // Adding the northSubPanelLabel to the northSubPanel
        this.northSubPanel.add(northSubPanelLabel);
        this.southSubPanel.add(southSubPanelLabel);


    }
//getter and setter for my buttons 
    public JButton getSignupButton(){
        return middleSubPanel.getSignupButton();
    }

    public JButton getSigninButton(){
        return middleSubPanel.getSigninButton();
    }

    public String getEmail(){
        return middleSubPanel.getEmail();
    }

    public String getPassword(){
        return middleSubPanel.getPassword();
    }
}
