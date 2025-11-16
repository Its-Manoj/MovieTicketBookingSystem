package customer;

import booking.Booking;

public class MovieBooking implements Booking {
    public String movieName;
    public int bookingId;
    public String seatNo;

    @Override
    public void MovieBooking() {
        System.out.println("Ticket booked sucessfully for " + movieName 
                + " and your booking id is " + bookingId 
                + " and seat no is " + seatNo);
    }
}
