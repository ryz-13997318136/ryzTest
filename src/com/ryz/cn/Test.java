package com.ryz.cn;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Test {

	public static void main(String[] args) throws Exception {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("name", "ryz");
		map.put("age", 23);
		map.put("sex", "man");
		map.put("birthday", new Date());
		
		Map<String,Object> amap = new HashMap<String,Object>();
		amap.put("name", "ryz1");
		amap.put("age", 22);
		amap.put("sex", "man1");
		
		//User user1 = (User)mapToObject(amap,User.class);
		
		map.put("auser", amap);
		ObjectMapper mapper = new ObjectMapper();
		//User user = (User)mapToObject(map,User.class);
		User user = (User)mapper.convertValue(map, User.class);
		System.out.println(user.toString());
		System.out.println(mapper.writeValueAsString(user));
	}
	
	@SuppressWarnings("static-access")
	public static Object mapToObject(Map<String,Object> map,Class<?> clazz) throws Exception{
		if(map == null){
			return null;
		}
		BeanUtils beanUtils = new BeanUtils();
		Object obj = clazz.newInstance();
		 beanUtils.populate(obj, map);
		return obj;
	}

}



