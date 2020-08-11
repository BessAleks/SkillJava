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
        try {
            String[] components = data.split("\\s+");
            if(components.length != 4){
                throw new ArrayIndexOutOfBoundsException("Wrong length!");
            }
            else if(!components[0].matches("[а-яА-Я-]+")){
                throw new IllegalArgumentException("Wrong name!");
            }
            else if(!components[1].matches("[а-яА-Я-]+")){
                throw new IllegalArgumentException("Wrong surname!");
            }
            else if(!components[2].matches("^([a-z0-9_\\.-]+)@([\\da-z\\.-]+)\\.([a-z\\.]{2,6})$")){
                throw new IllegalArgumentException("Wrong eMail!");
            }
            else if(!components[3].matches("^[0-9-]+$")){
                throw new MyException("Wrong phone!");
            }
            else {
                String name = components[0] + " " + components[1];
                storage.put(name, new Customer(name, components[3], components[2]));
            }
        } catch (Exception e){
            System.out.println(e);
        }
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