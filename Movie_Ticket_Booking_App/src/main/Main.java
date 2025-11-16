package main;

import java.util.Scanner;

import admin.AdminInfo;
import admin.MoviesUpdate;
import customer.CustomerInfo;
import customer.MovieBooking;

public class Main {

    static MoviesUpdate movie = new MoviesUpdate();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n--- Movie Booking System ---");
            System.out.println("1. Admin Login");
            System.out.println("2. Add Movie");
            System.out.println("3. Customer Registration");
            System.out.println("4. Book Ticket");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

            case 1:
                System.out.print("Enter Admin ID: ");
                String id = sc.nextLine();
                System.out.print("Enter PassKey: ");
                String key = sc.nextLine();

                AdminInfo admin = new AdminInfo(id, key);
                System.out.println("Admin Logged in: " + admin.getAdminId());
                break;

            case 2:
                System.out.print("Enter Movie Name: ");
                movie.movieName = sc.nextLine();
                System.out.print("Enter Movie Id: ");
                movie.movieId = sc.nextLine();
                System.out.print("Enter Show Time: ");
                movie.showTime = sc.nextLine();

                movie.movieAdd();
                break;

            case 3:
                System.out.print("Enter Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Mobile: ");
                long mobile = sc.nextLong();
                sc.nextLine();
                System.out.print("Enter Email: ");
                String email = sc.nextLine();

                CustomerInfo c = new CustomerInfo(name, mobile, email);
                System.out.println("Registration Completed for " + c.getName());
                break;

            case 4:
                if (movie.movieName == null) {
                    System.out.println("No movie added. Admin must add movie first.");
                    break;
                }

                MovieBooking mb = new MovieBooking();
                mb.movieName = movie.movieName;

                System.out.print("Enter Booking Id: ");
                mb.bookingId = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Seat No: ");
                mb.seatNo = sc.nextLine();

                mb.MovieBooking();
                break;

            case 5:
                System.out.println("Thank you.");
                sc.close();
                return;

            default:
                System.out.println("Invalid choice");
            }
        }
    }
}
