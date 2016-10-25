package com.softfactory.core.util;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * 获取下一个编号值得工具类
 * */
public class ErpUtils {

	/**
	 * 格式化数值对象
	 * */
	public static String goString(long str) {
		NumberFormat n = new DecimalFormat("0000");
		return n.format(str);
	}

	/**
	 * @param prefix 不同对象对于的前缀
	 * @param num为查询相应对象的max(编号值)
	 * @return 新的编号值
	 * */
	public static String getNumber(String num) {
		if(null!=num&&!"".equals(num)){
				long l = Long.parseLong(num) + 1;
				return goString(l);
		}else{
			return goString(1);
		}
		
	}
	public static String getNumber1(String num) {
		if(null!=num&&!"".equals(num)){
				long l = Long.parseLong(num.substring(1, 5)) + 1;
				return "S"+goString(l);
		}else{
			return "S"+goString(1);
		}
		
	}

}
