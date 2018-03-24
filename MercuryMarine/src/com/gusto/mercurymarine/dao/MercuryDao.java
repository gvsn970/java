package com.gusto.mercurymarine.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.gusto.mercurymarine.bean.MercuryBean;



public class MercuryDao {
	
	JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	//=================Get Engine Detailes==================================
	
	public List<MercuryBean> getEngine(){
		return template.query("select * from engine",new RowMapper<MercuryBean>(){
			public MercuryBean mapRow(ResultSet rs, int row) throws SQLException {
				MercuryBean mecuryBean=new MercuryBean();
				mecuryBean.setE_id(rs.getString(1));
				mecuryBean.setE_name(rs.getString(2));
				mecuryBean.setPhoto_path(rs.getString(3));
				return mecuryBean;
			}
		});
	}
	
	//======================Get Sun Engine Detailes==========================
	
	public List<MercuryBean> getSubEngine(){
		return template.query("select se.se_id,se.SE_NAME,e.E_ID from SUB_ENGINE se, engine e where se.E_ID = e.E_ID",new RowMapper<MercuryBean>(){
			public MercuryBean mapRow(ResultSet rs, int row) throws SQLException {
				MercuryBean mecuryBean=new MercuryBean();
				mecuryBean.setSe_id(rs.getString(1));
				mecuryBean.setSe_name(rs.getString(2));
				mecuryBean.setE_id(rs.getString(3));
				//mecuryBean.set(rs.getString(4));
				return mecuryBean;
			}
		});
	}
	
	public List<MercuryBean> getEngineId(String e_id){
		
		return template.query("select se.se_id,se.se_name,e.e_id,e.e_name,e.photo_path from  SUB_ENGINE se,engine e where se.E_ID = e.E_ID and e.E_ID=?",new RowMapper<MercuryBean>(){
			
			
			public MercuryBean mapRow(ResultSet rs, int row) throws SQLException {
				MercuryBean mecuryBean=new MercuryBean();
				
				mecuryBean.setSe_id(rs.getString(1));
				mecuryBean.setSe_name(rs.getString(2));
				mecuryBean.setE_id(rs.getString(3));
				mecuryBean.setE_name(rs.getString(4));
				mecuryBean.setPhoto_path(rs.getString(5));
				return mecuryBean;
			}},e_id);
		
		//return template.queryForObject(sql, new Object[]{e_id},new BeanPropertyRowMapper<MercuryBean>(MercuryBean.class));
	}
	public List<MercuryBean> getEngine(String e_id){
		
		return template.query("select e_name,photo_path from engine where e_id=?",new RowMapper<MercuryBean>(){
			
			
			public MercuryBean mapRow(ResultSet rs, int row) throws SQLException {
				MercuryBean mecuryBean=new MercuryBean();
				
				mecuryBean.setE_name(rs.getString(1));
				mecuryBean.setPhoto_path(rs.getString(2));
				return mecuryBean;
			}},e_id);
		
		//return template.queryForObject(sql, new Object[]{e_id},new BeanPropertyRowMapper<MercuryBean>(MercuryBean.class));
	}
	
	public List<MercuryBean> getManual(String se_id){
		
		return template.query("select m.M_ID,m.M_NAME,m.M_PHOTO_PATH,m.PRICE,se.SE_ID,se.SE_NAME from sub_engine se,MANUAL m where se.SE_ID = m.SE_ID and se.se_id=?",new RowMapper<MercuryBean>(){
			
			
			public MercuryBean mapRow(ResultSet rs, int row) throws SQLException {
				MercuryBean mecuryBean=new MercuryBean();
				
				mecuryBean.setM_id(rs.getString(1));
				mecuryBean.setM_name(rs.getString(2));
				mecuryBean.setM_photo_path(rs.getString(3));
				mecuryBean.setPrice(rs.getInt(4));
				mecuryBean.setSe_id(rs.getString(5));
				mecuryBean.setSe_name(rs.getString(6));
				
				return mecuryBean;
			}},se_id);
		
		//return template.queryForObject(sql, new Object[]{e_id},new BeanPropertyRowMapper<MercuryBean>(MercuryBean.class));
	}
	
	public List<MercuryBean> getManualDeatiles(String m_id){
		
		return template.query("select * from manual where m_id=?",new RowMapper<MercuryBean>(){
			
			
			public MercuryBean mapRow(ResultSet rs, int row) throws SQLException {
				MercuryBean mecuryBean=new MercuryBean();
				
				mecuryBean.setM_id(rs.getString(1));
				mecuryBean.setM_name(rs.getString(2));
				mecuryBean.setM_photo_path(rs.getString(3));
				mecuryBean.setPrice(rs.getInt(4));
				
				return mecuryBean;
			}},m_id);
		
		//return template.queryForObject(sql, new Object[]{e_id},new BeanPropertyRowMapper<MercuryBean>(MercuryBean.class));
	}
	
	
	

}
