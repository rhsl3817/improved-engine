package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.PreparedStatement;

import DB.DBConn;
import DTO.Number1DTO;

public class Number1DAO {
	public ArrayList<Number1DTO> list() {
		ArrayList<Number1DTO> list = new ArrayList<Number1DTO>();
		Connection con = DBConn.getInstance().getConnection();
		PreparedStatement pstmt = null;
		String sql = "SELECT * FROM Number1";
		
		try {
			pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				Number1DTO dto = new Number1DTO();
				dto.setNum1(rs.getInt("num1"));
				dto.setNum2(rs.getInt("num2"));
				dto.setNum3(rs.getInt("num3"));
				
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return list;
	}
}
