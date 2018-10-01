import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalculatorController
{
	private String rawData;
	
	@FXML public Button buttonNum0;
	@FXML public Button buttonNum1;
	@FXML public Button buttonNum2;
	@FXML public Button buttonNum3;
	@FXML public Button buttonNum4;
	@FXML public Button buttonNum5;
	@FXML public Button buttonNum6;
	@FXML public Button buttonNum7;
	@FXML public Button buttonNum8;
	@FXML public Button buttonNum9;
	
	@FXML public Button buttonOpeAdd;
	@FXML public Button buttonOpeSub;
	@FXML public Button buttonOpeMul;
	@FXML public Button buttonOpeQuo;
	
	@FXML public Button buttonEqual;
	
	@FXML public Button buttonClean;
	
	@FXML public TextField textFSol;
	
	//when number button is clicked
	public void btnNumOnClick(ActionEvent btnNum)
	{
		Button btnObj = (Button)btnNum.getSource();
		String btnStr = btnObj.getText();
		textFSol.appendText(btnStr);
	}
	
	//when operator button is clicked
	public void btnOpeOnClick(ActionEvent btnOpe)
	{
		Button btnObj = (Button)btnOpe.getSource();
		String btnStr = btnObj.getText();
		
		switch (btnStr)
		{
			case "+":
				textFSol.appendText("+");
				break;
				
			case "-":
				textFSol.appendText("-");
				break;
				
			case "×":
				textFSol.appendText("×");
				break;
				
			case "÷":
				textFSol.appendText("÷");
				break;
		}
	}
	
	
	//when equal button is clicked
	public void btnEqualOnClick()
	{
		CalculatorModel result = new CalculatorModel();
		String numDisplay = result.result(rawData);
		textFSol.setText(numDisplay);
	}
	
	//when CE button is clicked
	public void btnCEOnClick()
	{
		CalculatorModel result = new CalculatorModel();
		result.result("Clear!");
		textFSol.setText(null);
	}
}
