package com.cowork.service;

import com.cowork.dao.BookingDAO;
import com.cowork.dao.BillDAO;
import com.cowork.bean.Booking;
import com.cowork.bean.Bill;
import com.cowork.util.SlotAlreadyBookedException;
import com.cowork.util.ValidationException;
import com.cowork.util.ActiveBillingException;

public class BookingService {

    BookingDAO bookingDAO = new BookingDAO();
    BillDAO billDAO = new BillDAO();

    public void bookDesk(int bookingId, int memberId, String date, int hours) throws Exception {

        if (hours <= 0) {
            throw new ValidationException("Hours must be greater than 0");
        }

        if (bookingDAO.isSlotBooked(date)) {
            throw new SlotAlreadyBookedException("Slot already booked for this date!");
        }

        Booking booking = new Booking();
        booking.setBookingId(bookingId);
        booking.setMemberId(memberId);
        booking.setDate(date);
        booking.setHours(hours);

        bookingDAO.createBooking(booking);

        double amount = hours * 100;

        Bill bill = new Bill();
        bill.setBookingId(bookingId);
        bill.setAmount(amount);

        billDAO.generateBill(bill);
    }
}