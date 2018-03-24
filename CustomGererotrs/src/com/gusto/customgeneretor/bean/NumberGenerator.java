package com.gusto.customgeneretor.bean;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.hibernate.engine.SessionImplementor;
import org.hibernate.id.IdentityGenerator;

public class NumberGenerator extends IdentityGenerator {
	

	@Override
	public Serializable generate(SessionImplementor s, Object obj) {
	
		Connection con=s.connection();
		String name="student";
		try {
			Statement st= con.createStatement();
			
			ResultSet rs=st.executeQuery(" select reg.nextval from dual");
			if(rs.next()){
				name=name+rs.getString(1);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return name;
	}
	

}
