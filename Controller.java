package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {

    @FXML private Button calculate;
    @FXML private TextField payRate, hoursWorked, profitShare;
    @FXML private Text rate, pro;

    TimeWorked timeWorked;
    ProfitShare ps;

    @FXML protected void handleButtonPress(ActionEvent event){

        timeWorked = new TimeWorked(Integer.parseInt(payRate.getText()), Integer.parseInt(hoursWorked.getText()));
        ps = new ProfitShare(Integer.parseInt(profitShare.getText()), timeWorked);

        rate.setText("You made $" + timeWorked.getPay());
        pro.setText("Your Profit Share is $" + ps.getProfits());



    }
}
