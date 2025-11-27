public class Main {

    public static void main(String[] args) throws InterruptedException {

        Subject redMI = new Subject("Red MI Mobile", 10000, "Out Of Stock");

        Observer user1 = new Observer("Anurag");
        user1.subscribe(redMI);

        Observer user2 = new Observer("Pranaya");
        user2.subscribe(redMI);

        Observer user3 = new Observer("Priyanka");
        user3.subscribe(redMI);

        Thread.sleep(1000);

        System.out.println("\nRed MI Mobile current state : " + redMI.getAvailability());
        System.out.println();

        Thread.sleep(1000);

        user3.unsubscribe(redMI);

        Thread.sleep(1000);

        redMI.setAvailability("Available");

    }

}
