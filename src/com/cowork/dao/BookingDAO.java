package com.cowork.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.cowork.bean.Booking;
import com.cowork.util.DBUtil;

public class BookingDAO {

    public boolean isSlotBooked(String date) throws Exception {
        Connection con = DBUtil.getConnection();

        String query = "SELECT COUNT(*) FROM booking WHERE booking_date=?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, date);

        ResultSet rs = ps.executeQuery();
        rs.next();

        return rs.getInt(1) > 0;
    }

    public void createBooking(Booking booking) throws Exception {
        Connection con = DBUtil.getConnection();

        String query = "INSERT INTO booking VALUES (?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(query);

        ps.setInt(1, booking.getBookingId());
        ps.setInt(2, booking.getMemberId());
        ps.setString(3, booking.getDate());
        ps.setInt(4, booking.getHours());

        ps.executeUpdate();
    }
}