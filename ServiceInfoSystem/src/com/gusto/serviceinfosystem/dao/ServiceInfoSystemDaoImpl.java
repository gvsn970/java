package com.gusto.serviceinfosystem.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.gusto.serviceinfosystem.bean.ServiceInfoSystemBean;

public class ServiceInfoSystemDaoImpl implements ServiceInfoSystemDao {
	
	private JdbcTemplate jdbcTemplate;
	
	public ServiceInfoSystemDaoImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public void saveOrUpdate(ServiceInfoSystemBean sisb) {
	    if (sisb.getD_id() != null) {
	        // update
	        String sql = "UPDATE DELAR SET d_name=?, d_email=?, d_password=?  WHERE d_id=?";
	        jdbcTemplate.update(sql, sisb.getD_name(), sisb.getD_email(), sisb.getD_password());
	    } else {
	        // insert
	        String sql = "INSERT INTO DELAR (d_id,d_name, d_password,d_email) VALUES (seq_dealr.nextval,?, ?, ?)";
	        jdbcTemplate.update(sql,sisb.getD_name(), sisb.getD_password(), sisb.getD_email());
	    }
	 
	}

	@Override
	public ServiceInfoSystemBean loginValidate(ServiceInfoSystemBean sisb) {
			String sql="select * from DELAR where d_name='"+ sisb.getD_name()+"' and d_password='"+sisb.getD_password() +"'";
return jdbcTemplate.query(sql,new ResultSetExtractor<ServiceInfoSystemBean>(){

	@Override
	public ServiceInfoSystemBean extractData(ResultSet rs) throws SQLException, DataAccessException {

		if (rs.next()) {
			ServiceInfoSystemBean sisb = new ServiceInfoSystemBean();
			
			sisb.setD_id(rs.getString(1));
			sisb.setD_name(rs.getString(2));
			sisb.setD_password(rs.getString(3));
			sisb.setD_email(rs.getString(4));
			return sisb;
		}
		
		
		return null;
	}});
		
	}

}
