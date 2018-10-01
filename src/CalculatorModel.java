public class CalculatorModel
{

	private double num1 = 0.0;
	private double num2 = 0.0;
	private String operator = "";
	
	public String result(String rawData)
	{
		if (rawData.equals("Clear!"))
		{
			return null;
		}
		
		seperate(rawData);
		calculation();
		
		String answer = calculation();
		return answer;
	}
	
	public void seperate(String rawData)
	{
		int indexOpe = 0;
		for( int i = 0 ; i < rawData.length() - 1 ; i++)
		{
			String testStr = rawData.substring(i , i + 1);
			switch (testStr)
			{
				case "+":
					indexOpe = i;
					break;
				case "-":
					indexOpe = i;
					break;
				
				case "×":
					indexOpe = i;
					break;
				
				case "÷":
					indexOpe = i;
					break;
			}
		}
		String tempNum1 = rawData.substring(0 , indexOpe);
		String tempNum2 = rawData.substring(indexOpe + 1);
		operator = rawData.substring(indexOpe , indexOpe + 1);
		
		num1 = Double.parseDouble(tempNum1);
		num2 = Double.parseDouble(tempNum2);
	}
	
	public String calculation()
	{
		String numAns = "";
		switch (operator)
		{
			case "+":
				numAns = add();
				return numAns;
			
			case "-":
				numAns = subtract();
				return numAns;
			
			case "×":
				numAns = multiply();
				return numAns;
			
			case "÷":
				numAns = divide();
				return numAns;
		}
		return numAns;
	}
	
	private String add()
	{
		double temp = num1 + num2;
		return Double.toString(temp);
	}
	
	private String subtract()
	{
		double temp = num1 - num2;
		return Double.toString(temp);
	}
	
	private String multiply()
	{
		double temp = num1 * num2;
		return Double.toString(temp);
	}
	
	private String divide()
	{
		double temp = 0.0;
		
		if(num2 == 0)
		{
			return "No solution";
		}
		
		temp = num1 / num2;
		return Double.toString(temp);
	}
}