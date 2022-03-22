import java.util.Scanner;

public class CarMainApp {
    public static void main(String[] args)  {


        Car car = new Car(4, true,0);
        System.out.println("Car is driving");

        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();

        //Unchecked exception: niet verplicht
        try {
            int radiStation = Integer.parseInt(input);
            car.setRadioStation(radiStation);
        }catch (NumberFormatException exception){
            car.setRadioStation(5);
            exception.printStackTrace();
        }finally {
            System.out.println("Run this code anyway");
            System.out.println("closing stuff");
            scanner.close();
        }


        try {
            car.setNumberOfWheels(5);
        } catch (Exception exception) {
            exception.printStackTrace();
        }


        //checked exception: WEL verplicht
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }


        System.out.println("Car is driving");

    }
}
