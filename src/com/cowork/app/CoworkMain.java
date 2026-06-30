package com.cowork.app;

import java.util.Scanner;
import com.cowork.service.BookingService;

public class CoworkMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BookingService service = new BookingService();

        try {
            System.out.println("Enter Booking ID:");
            int bookingId = sc.nextInt();

            System.out.println("Enter Member ID:");
            int memberId = sc.nextInt();

            System.out.println("Enter Booking Date (YYYY-MM-DD):");
            String date = sc.next();

            System.out.println("Enter Hours:");
            int hours = sc.nextInt();

            service.bookDesk(bookingId, memberId, date, hours);

            System.out.println("Booking & Billing Completed Successfully!");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}