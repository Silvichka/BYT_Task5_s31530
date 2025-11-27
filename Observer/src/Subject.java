import java.util.ArrayList;
import java.util.List;

public class Subject implements ISubject{

    private List<Observer> observers = new ArrayList<>();

    private String productName;
    private int productPrice;
    private String availability;

    public Subject(String productName, int productPrice, String availability) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.availability = availability;
    }

    public String getProductName() { return productName; }

    public void setProductName(String productName) { this.productName = productName; }

    public int getProductPrice() { return productPrice; }

    public void setProductPrice(int productPrice) { this.productPrice = productPrice; }

    public String getAvailability() { return availability; }

    public void setAvailability(String newAvailability) {
        System.out.println("Availability of " + productName + " changed from " + availability + " to " + newAvailability);
        this.availability = newAvailability;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        System.out.println("New Observer added: " + observer.getName());
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        System.out.println("Observer removed: " + observer.getName() + "\n");
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        String message = "\n-> Product Name: " + productName +
                         "\n-> Product Price: " + productPrice +
                         "\n-> is now Available in out store. \n";
        System.out.println(message);
        for(IObserver observer : observers){
            observer.update(message);
        }
    }
}
