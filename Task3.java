import java.util.Scanner;

public class Task3 {
	
	public static Scanner scanner = new Scanner(System.in);
	
    public static void main(String[] args) {
	double celsius;
	   System.out.println("Enter the temperature in degrees Celsius:");
       celsius = inputDouble();
       
       System.out.println("Select the converter: Kelvin (value K), Fahrenheit (value F): ");
	    char key = getChar();
	    
	    if(key == 'k'){
	        System.out.println("Temperature in Kelvin = " + BaseConverter.convertToK(celsius) + " K");
	    }
	    
	    if(key == 'f'){
	        System.out.println("Temperature in Fahrenheit = " + BaseConverter.convertToF(celsius) + " F");
	    }
}
	
	public static double inputDouble(){
        double num;
		
		if(scanner.hasNextDouble()){
            num = scanner.nextDouble();
        }else{
            System.out.println("Input error, please repeat...");
            scanner.next();
            num = inputDouble();
            num = inputDouble();
        }
        return num;
}	

    public static char getChar() {
		char temp = scanner.next().toLowerCase().charAt(0);
		 if(temp == 'k' || temp == 'f'){
			return temp;
		 }else{
			 System.out.println("Select the converter: Kelvin (type K), Fahrenheit (type F): ");
			 return getChar();
		 }
}
	
}

class BaseConverter {
	  public static double convertToK(double celsius){
	      return celsius + 273.15;
	  }
	  
	  public static double convertToF(double celsius){
	      return (celsius * 9.0 / 5.0) + 32.0 ;
	  }
}


