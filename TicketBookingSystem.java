class TicketBooking implements Runnable {
    private static int availableSeats = 5;
    private int seatsNeeded;
    private String name;

    TicketBooking(String name, int seatsNeeded) {
        this.name = name;
        this.seatsNeeded = seatsNeeded;
    }

    public void run() {
        synchronized (this.getClass()) {
            if (availableSeats >= seatsNeeded) {
                System.out.println(name + " booked " + seatsNeeded + " seats.");
                availableSeats -= seatsNeeded;
            } else {
                System.out.println("Not enough seats available for " + name);
            }
        }
    }
    public class Main {
    public static void main(String[] args){
    Thread t1 = new Thread(new TicketBooking("User1", 3));
        Thread t2 = new Thread(new TicketBooking("VIP User", 2));
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
    }
}