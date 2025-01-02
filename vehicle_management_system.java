import java.util.Scanner;
public class vehicle_management_system{
    public static void main(String[] args){
            vehicle_rental_system rental= new vehicle_rental_system();
            vehicle car = new car("001", 20, 35);
            vehicle truck = new truck("002", 50, 10);
            vehicle bike= new bike("003", 10, 40);
            rental.addvehicle(car);
            rental.addvehicle(truck);
            rental.addvehicle(bike);
            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println("1--> Display the Vehicle");
                System.out.println("2--> Get vehicle for Rent");
                System.out.println("3--> Return the vehicle");
                System.out.println("4--> Get vehicle by Mileage");
                System.out.println("5--> Total cost of rental ");
                System.out.println("6--> Quit");
                System.out.print("Enter the Choice : ");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        rental.display();
                        break;
                    case 2:
                        System.out.println("Enter the vehicle Id to rent : ");
                        String id = sc.next();
                        System.out.println("Enter the Number of days : ");
                        int days = sc.nextInt();
                    case 3:
                        System.out.print("Enter the vehicle Id to retrun : ");
                        String vehicleId = sc.next();
                        rental.returnvehicle(vehicleId);
                        break;
                    case 4 :
                        System.out.println("enter minmilege " );
                        double minmilege=sc.nextInt();
                        System.out.println("enter maxmilege " );
                        double maxmilege=sc.nextInt();
                        rental.searchvehicle(minmilege,maxmilege);
                        break;
                    case 5 :
                        System.out.println("====================UNDER DEVELOPMENT=====================");
                        break;
                    case 6:
                        System.out.println("Thanks for Renting Vehicle!!!!!!!!!");
                        return;
                    default:
                    System.out.println("Enter the valid choice:");

                }
            }
    }
}