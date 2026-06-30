package com.cowork.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.cowork.bean.Member;
import com.cowork.util.DBUtil;

public class MemberDAO {

    public boolean isMemberExists(int memberId) throws Exception {
        Connection con = DBUtil.getConnection();

        String query = "SELECT COUNT(*) FROM member WHERE member_id=?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, memberId);

        ResultSet rs = ps.executeQuery();
        rs.next();

        return rs.getInt(1) > 0;
    }
}