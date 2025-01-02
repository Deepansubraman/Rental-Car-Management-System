import java.util.ArrayList;
import java.util.List;
public class vehicle_rental_system {
    private List<vehicle>inventory;
    public vehicle_rental_system()
    {
        this.inventory=new ArrayList<>();
    }
    public void addvehicle(vehicle Vehicle)
    {
        inventory.add(Vehicle);
    }
    public void display()
    {
        System.out.println("Available vehicle: ");
        for(vehicle Vehicle:inventory)
        {
            if(Vehicle.isAvailable())
            {
                System.out.println("id:"+Vehicle.getId()+",Milege"+Vehicle.milege());
            }
        }
    }
    public void getrental(String Id,int days)
    {
        for(vehicle Vehicle:inventory)
        {
            if(Vehicle.getId().equals(Id) && Vehicle.isAvailable())
            {
                Vehicle.setAvailable(false);
                System.out.println("Vehicle: "+Id+" rental for "+days+" days. total cost: $"+Vehicle.rentalcost(days));
                return;
            }
        }
        System.out.println("vehicle not available");
    }
    public void returnvehicle(String Id)
        {
            for(vehicle Vehicle:inventory)
            {
                if(Vehicle.getId().equals(Id) && Vehicle.isAvailable())
                {
                    Vehicle.setAvailable(true);
                    System.out.println("vehicle "+Id+" returned.");
                    return;
                }
            }
            System.out.println("vehile not found already found");
        }
        public void searchvehicle(double minmilege,double maxmilege)
        {
            System.out.println("vehile within milege range: ");
            for(vehicle Vehicle:inventory)
            {
                if(Vehicle.milege()>=minmilege  && Vehicle.milege()<=maxmilege )
                {
                System.out.println("The id :"+Vehicle.getId());
                System.out.println("The Mileage :"+Vehicle.milege());
                }
            }
        }

    }


