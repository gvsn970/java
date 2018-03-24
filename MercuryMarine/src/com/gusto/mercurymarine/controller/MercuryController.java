package com.gusto.mercurymarine.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gusto.mercurymarine.bean.MercuryBean;
import com.gusto.mercurymarine.dao.MercuryDao;

@Controller
public class MercuryController {
	@Autowired
	MercuryDao dao;// will inject dao from xml file

	/* It provides list of engines in model object */
	@RequestMapping("/index")
	public ModelAndView viewengine(ModelAndView model) {
		List<MercuryBean> list = dao.getEngine();
		List<MercuryBean> list1 = dao.getSubEngine();

		model.addObject("list", list);
		model.addObject("list1", list1);
		model.setViewName("index");
		return model;

	}

	/*
	 * It displays object data into form for the given id. The @PathVariable
	 * puts URL data into variable.
	 */
	@RequestMapping(value = "/manuals/{se_id}")
	public ModelAndView viewmanual(@PathVariable String se_id) {
		// Emp emp=dao.getEmpById(id);
		ModelAndView model = new ModelAndView();
		List<MercuryBean> list = dao.getEngine();
		List<MercuryBean> list1 = dao.getSubEngine();
		List<MercuryBean> getManuals=dao.getManual(se_id);

		model.addObject("list", list);
		model.addObject("list1", list1);
		model.addObject("getManuals",getManuals);
		
		model.setViewName("manuals");
		return model;
		
	}
	
	@RequestMapping(value = "/products/{e_id}")
	public ModelAndView viewproduct(@PathVariable String e_id) {
		
		MercuryBean mercurybean=new MercuryBean();
		ModelAndView model = new ModelAndView();
		List<MercuryBean> list = dao.getEngine();
		List<MercuryBean> list1 = dao.getSubEngine();
		List<MercuryBean> getengineDatiales=dao.getEngineId(e_id);
		model.addObject("list", list);
		model.addObject("list1", list1);
		model.addObject("getengineDatiales",getengineDatiales);
		List<MercuryBean> getEngine=dao.getEngine(e_id);
	
		model.addObject("bean",getEngine);
	
		model.setViewName("products");
		return model;
		
	}
	@RequestMapping(value = "/product_details/{m_id}")
	public ModelAndView viewproductDeatiles(@PathVariable String m_id) {
		
		MercuryBean mercurybean=new MercuryBean();
		ModelAndView model = new ModelAndView();
		List<MercuryBean> list = dao.getEngine();
		List<MercuryBean> list1 = dao.getSubEngine();
		List<MercuryBean> getManualDeatiles = dao.getManualDeatiles(m_id);
		
		model.addObject("list", list);
		model.addObject("list1", list1);
		model.addObject("getManualDeatiles", getManualDeatiles);
		
		model.setViewName("product_details");
		return model;
		
	}
	
	@RequestMapping(value = "/product_summary/")
	public ModelAndView viewproductsummary() {
		
		MercuryBean mercurybean=new MercuryBean();
		ModelAndView model = new ModelAndView();
		List<MercuryBean> list = dao.getEngine();
		List<MercuryBean> list1 = dao.getSubEngine();
		
		
		model.addObject("list", list);
		model.addObject("list1", list1);
		
		
		model.setViewName("product_summary");
		return model;
		
	}
	

}
