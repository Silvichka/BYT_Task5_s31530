public class Observer implements IObserver{

    private final String name;

    public Observer(String name) {
        this.name = name;
    }

    public String getName() { return name; }

    public void subscribe(Subject subject) {
        subject.registerObserver(this);
        System.out.println(name + " subscribed to " + subject.getProductName());
    }

    public void unsubscribe(Subject subject){
        subject.removeObserver(this);
        System.out.println(name + " unsubscribed from notifications from " + subject.getProductName());
    }

    @Override
    public void update(String message) {
        System.out.println("Customer " + name + " got notification: " + message);
    }
}
