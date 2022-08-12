import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int minute, hour;
        
        do{
            System.out.println("Input hour (0 to 12):");
            hour = inputInt();
        }
        while(hour < 0 || hour > 12);
        
        do{
            System.out.println("Input minute (0 to 60):");
            minute = inputInt();
        }
        while(minute < 0 || minute > 60);
        
        int angle = calculateAngle(hour, minute);
        
        System.out.println("The angle between the hands of the clock is " + angle);
    }
    
    public static int calculateAngle(int hour, int minute){
        int hourCircleSector = hour * 360 / 12;
        int minuteCircleSector = minute * 360 / 60;
        
        int angle = Math.abs(hourCircleSector - minuteCircleSector);

        if(angle > 180)
        {
            angle = 360 - angle;
        }
        return angle;
    }
    
    public static int inputInt(){
        Scanner scanner = new Scanner(System.in);
        int num;
        
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        }else{
            System.out.println("Input error, please repeat...");
            scanner.next();
            num = inputInt();
        }
        return num;
    }
}