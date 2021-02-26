package softdev.Lab_session.Lab_3.Stack_Brackettester.view.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import softdev.Lab_session.Lab_3.Stack_Brackettester.application.BracketParser;
import softdev.Lab_session.Lab_3.Stack_Brackettester.application.BracketParserIntf;

public class BracketsViewController {
    @FXML
    private TextField expression;

    @FXML
    private Button check;

    private BracketParserIntf parser;

    private boolean firstStroke = false;

    @FXML
    private void initialize() {
        expression.setOnKeyPressed(event -> clearBG(event));
        check.setOnAction(event -> handleTestAction(event));
    }

    @FXML
    public void handleTestAction(ActionEvent e) {
        //System.out.println(expression.getText());
        parser = new BracketParser();
        if (parser.checkBrackets(expression.getText())) {
            expression.setStyle("-fx-control-inner-background: green");
        } else {
            expression.setStyle("-fx-control-inner-background: red");
        }
        firstStroke = true;
    }

    @FXML
    public void clearBG(KeyEvent e) {
        if (!e.getCharacter().equals("\n") && firstStroke) {
            expression.setStyle("-fx-control-inner-background: white");
            firstStroke = false;
        }
        firstStroke = false;
    }
}
