import java.util.HashMap;

public class CustomerStorage
{
    private HashMap<String, Customer> storage;

    public CustomerStorage()
    {
        storage = new HashMap<>();
    }

    public void addCustomer(String data)
    {
        String[] components = data.split("\\s+");
        if (components.length != 4){
            throw new IllegalArgumentException("Wrong format! Right command:\n" + Main.getAddCommand());
        }
        else if ((components[1].matches("\\d +")) && (components[2].matches("\\d"))){
            throw new IllegalArgumentException("Error name!");
        }
        else if ((!components[3].contains("@") && (!components[3].contains(".")))){
        throw new IllegalArgumentException("Error email!");
        }
        String name = components[0] + " " + components[1];
        storage.put(name, new Customer(name, components[3], components[2]));
    }

    public void listCustomers()
    {
        storage.values().forEach(System.out::println);
    }

    public void removeCustomer(String name)
    {
        storage.remove(name);
    }

    public int getCount()
    {
        return storage.size();
    }
}