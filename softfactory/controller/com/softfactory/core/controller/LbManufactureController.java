package com.softfactory.core.controller;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;
import net.sf.json.JsonConfig;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.softfactory.core.util.JsonDateValueProcessor;
import com.softfactory.core.util.Pager;
import com.softfactory.pojo.Manufacture;

@Controller
public class LbManufactureController {
	
	@RequestMapping("/lbManufactureController")
	public void worklist(HttpServletResponse response){
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.registerJsonValueProcessor(Date.class, new JsonDateValueProcessor());
		Manufacture manufacture=new Manufacture();
		manufacture.setManufactureid("030500201610260001");
		manufacture.setProductid("200200200");
		manufacture.setProductname("MENU");
		manufacture.setAmount(10);
		manufacture.setApplyIdGroup("1212121212");
		manufacture.setRegisterTime(new Date());
		List<Manufacture>list=new ArrayList<Manufacture>();
		list.add(manufacture);
		Pager<Manufacture>pager=new Pager<Manufacture>();
		pager.setRows(list);
	    try {
	      PrintWriter out = response.getWriter();
	      JSONObject json = (JSONObject) JSONSerializer.toJSON(pager, jsonConfig);
	      out.println(json.toString());
	      out.flush();
	      out.close();
	    } catch (Exception e) {
	      e.printStackTrace();
	    }
	}

}
