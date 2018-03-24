package com.gusto.serviceinfosystem.dao;

import java.util.List;

import com.gusto.serviceinfosystem.bean.ServiceInfoSystemBean;

public interface ServiceInfoSystemDao {
	
	public void saveOrUpdate(ServiceInfoSystemBean sisb);
	public ServiceInfoSystemBean loginValidate(ServiceInfoSystemBean sisb);
	
}
