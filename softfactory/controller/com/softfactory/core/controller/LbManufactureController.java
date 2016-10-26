package com.softfactory.core.controller;

import java.io.PrintWriter;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;
import net.sf.json.JsonConfig;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.softfactory.core.service.LbManufactureService;
import com.softfactory.core.util.JsonDateValueProcessor;
import com.softfactory.core.util.Pager;
import com.softfactory.pojo.Manufacture;

@Controller
public class LbManufactureController {

	@Resource(name = "lbManufactureService")
	private LbManufactureService lbManufactureService;

	@RequestMapping("/lbManufactureController")
	public void worklist(
			@RequestParam(required = true, value = "page") Integer page,
			@RequestParam(required = true, value = "rows") Integer rows,
			@RequestParam(required = true, value = "sort") String sort,
			@RequestParam(required = true, value = "order") String order,
			HttpServletResponse response) {
		int pageno = (page - 1) * rows; // 开始页
	    int pagesize = page * rows; // 结束页
		Pager<Manufacture> pager = lbManufactureService.findPager(pageno, pagesize, sort, order);
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.registerJsonValueProcessor(Date.class,new JsonDateValueProcessor());
		try {
			PrintWriter out = response.getWriter();
			JSONObject json = (JSONObject) JSONSerializer.toJSON(pager,
					jsonConfig);
			out.println(json.toString());
			out.flush();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@RequestMapping("/lbManufactureController_detail")
	public String detail(
			@RequestParam(required = true, value = "manufactureid") String manufactureid,
			ModelMap modelMap) {
		manufactureid = "030500201610260001";
		Manufacture manufacture = lbManufactureService
				.findById("030500201610260001");
		System.out.println(manufacture.getManufactureid());
		modelMap.put("manufacture", manufacture);
		return "lbproducts";
	}

}
