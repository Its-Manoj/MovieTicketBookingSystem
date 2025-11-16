package admin;

import booking.MoviesAdd;

public class MoviesUpdate implements MoviesAdd {
    public String movieName;
    public String movieId;
    public String showTime;

    @Override
    public void movieAdd() {
        System.out.println(movieName + " added successfully with id " 
                + movieId + " and timing is " + showTime);
    }
}
