package jp.co.aforce.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jp.co.aforce.bean.Members;

public class MembersDAO extends DAO {
	public Members search(String login, String password)
		throws Exception {
		Members members=null;

		Connection con=getConnection();

		PreparedStatement st;
		st=con.prepareStatement(
			"select * from Members where login=? and password=?");
		st.setString(1, login);
		st.setString(2, password);
		ResultSet rs=st.executeQuery();

		while (rs.next()) {
			members=new Members();
			members.setId(rs.getInt("id"));
			members.setLogin(rs.getString("login"));
			members.setPassword(rs.getString("password"));
		}

		st.close();
		con.close();
		return members;
	}
}
