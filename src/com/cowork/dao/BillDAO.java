package com.cowork.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.cowork.bean.Bill;
import com.cowork.util.DBUtil;
import com.cowork.util.ActiveBillingException;

public class BillDAO {

    public boolean isBillExists(int bookingId) throws Exception {
        Connection con = DBUtil.getConnection();

        String query = "SELECT COUNT(*) FROM bill WHERE booking_id=?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, bookingId);

        ResultSet rs = ps.executeQuery();
        rs.next();

        return rs.getInt(1) > 0;
    }

    public void generateBill(Bill bill) throws Exception {

        if (isBillExists(bill.getBookingId())) {
            throw new ActiveBillingException("Bill already generated for this booking!");
        }

        Connection con = DBUtil.getConnection();

        String query = "INSERT INTO bill VALUES (?, ?)";
        PreparedStatement ps = con.prepareStatement(query);

        ps.setInt(1, bill.getBookingId());
        ps.setDouble(2, bill.getAmount());

        ps.executeUpdate();
    }
}