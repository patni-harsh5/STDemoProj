package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.beans.Tata;
import com.util.DBUtil;

public class TataOracle {
	
	public int makeCustomerBooking(Tata tata) {
		Connection con = null;
		
try {
			
			con  = DBUtil.getDBConnection();
			
			String query = "insert into TBL_Booking (BookingID,Customername,licenseNo,VehicleMake,ProposedDate) values (?,?,?,?,TO_DATE(?,'mm/dd/yyyy'))";
			
			PreparedStatement pstmt = con.prepareStatement(query);
			
			pstmt.setInt(1, tata.getBookingID());
			pstmt.setString(2, tata.getCustomerName());
			pstmt.setString(3, tata.getLicenseNo());
			pstmt.setString(4, tata.getVehicleMake());
			pstmt.setString(5, tata.getDate());
			
			
			pstmt.execute();
	
			
			
		} catch (SQLException e) {

			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				DBUtil.closeConnection(con);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		return 1;
	}
	
	public int cancelBooking(int bookingID) {
		Connection con = null;
		
		try {
			
			con  = DBUtil.getDBConnection();
			
			String query = "delete from TBL_BOOKING where BookingID = ?";
			
			PreparedStatement pstmt = con.prepareStatement(query);
			
			
			pstmt.setInt(1, bookingID);
			
			pstmt.execute();
	
			
			
		} catch (SQLException e) {

			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				DBUtil.closeConnection(con);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		return 1;
	}
	
	
	public List<Tata> searchBooking(String date) {
		List<Tata> tataList = new ArrayList<Tata>();
		Connection con = null;
		try {
			
			con  = DBUtil.getDBConnection();
			
			String query = "select * from TBL_BOOKING where ProposedDate = TO_DATE(?,'yyyy/mm/dd')";
			
			PreparedStatement pstmt = con.prepareStatement(query);
			
			pstmt.setString(1, date);
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Tata tata = null;
				int bookID = rs.getInt("BookingID");
				String custName = rs.getString("Customername");
				String licNo = rs.getString("licenseNo");
				String vehMake = rs.getString("VehicleMake");
				String date1 = rs.getString("ProposedDate");
				
				tata = new Tata(bookID, custName, licNo ,vehMake, date1);
				tataList.add(tata);
			}
			
		} catch (SQLException e) {

			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				DBUtil.closeConnection(con);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return tataList;
	}
}
