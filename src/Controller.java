import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable {
    String txtRes;
    @FXML private Label lblResultado;
    @FXML private Label lblOperaciones;

    @FXML
    private void onClickBtn0(){
        txtRes+=("0");
        lblResultado.setText(txtRes);
    }
    @FXML
    private void onClickBtn1(){
        txtRes+=("1");
        lblResultado.setText(txtRes);
    }
    @FXML
    private void onClickBtn2(){
        txtRes+=("2");
        lblResultado.setText(txtRes);
    }
    @FXML
    private void onClickBtn3(){
        txtRes+=("3");
        lblResultado.setText(txtRes);
    }
    @FXML
    private void onClickBtn4(){
        txtRes+=("4");
        lblResultado.setText(txtRes);
    }

    @FXML
    private void onClickBtn5(){
        txtRes+=("5");
        lblResultado.setText(txtRes);
    }

    @FXML
    private void onClickBtn6(){
        txtRes+=("6");
        lblResultado.setText(txtRes);
    }

    @FXML
    private void onClickBtn7(){
        txtRes+=("7");
        lblResultado.setText(txtRes);
    }

    @FXML
    private void onClickBtn8(){
        txtRes+=("8");
        lblResultado.setText(txtRes);
    }

    @FXML
    private void onClickBtn9(){
        txtRes+=("9");
        lblResultado.setText(txtRes);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.txtRes = new String("");
    }
}
