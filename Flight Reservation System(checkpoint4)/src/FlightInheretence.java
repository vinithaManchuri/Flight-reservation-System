 public class Ticket {
    String flight;
    int PnrNumber;
    String departure;
    String destinationLocation;
    int seatsBooked;
    int dateAndTime;
    String arrival;
    String passenger;
    int seatNumber;
    float price;
    String ticketStatus;
    public class TicketTypes extends TouristTicket{
        String hotelService;
        String touristLocation;

    }
    public class TicketTypes extends RegularTicket{
        String food;
        String water;
        String snacks;
    }
    public static void main(String args[]){
        Ticket T1 = new Ticket();
        System.out.println(T1.flight);

        Ticket T2 = new Ticket();
        System.out.println(T2.PnrNumber);

        Ticket T3 = new Ticket();
        System.out.println(T3.departure);

        Ticket T4 = new Ticket();
        System.out.println(T4.destinationLocation);

        Ticket T5 = new Ticket();
        System.out.println(T5.seatsBooked);

        Ticket T6 = new Ticket();
        System.out.println(T6.dateAndTime);

        Ticket T7 = new Ticket();
        System.out.println(T7.arrival);

        Ticket T8 = new Ticket();
        System.out.println(T8.passenger);

        Ticket T9 = new Ticket();
        System.out.println(T9.seatNumber);

        Ticket T10 = new Ticket();
        System.out.println(T10.price);

        Ticket T11 = new Ticket();
        System.out.println(T11.ticketStatus);


       TouristTicket T1 = new TouristTicket();
        System.out.println(T1.hotelService);

        TouristTicket T2 = new TouristTicket();
        System.out.println(T2.touristLocation);

        RegularTicket R1 = new RegularTicket ();
        System.out.println(R1.food);

        RegularTicket R2 = new RegularTicket ();
        System.out.println(R2.water);

        RegularTicket R3 = new RegularTicket ();
        System.out.println(R3.snacks);

    }
}
