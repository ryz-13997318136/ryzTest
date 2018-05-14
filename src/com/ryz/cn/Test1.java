package com.ryz.cn;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Test1 {

	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("zhangsan", "1");
		map.put("zhangsan", null);
		map.put(null, null);
		System.out.println(map);
		Hashtable table = new Hashtable();
		table.put("key3", "3");
		table.put(null, "");
		System.out.println(table);
	}

}

abstract class In{
	abstract void fun();
}
class U{
	In in;
	
	public U(String name,int age){
		this.name = name;
		this.age = age;
	}
	String name;
	int age;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	/*@Override
	public int hashCode(){
		return 1;
	}*/
	@Override
	public boolean equals(Object o){
		if (o == this)  return true;  
        if (!(o instanceof U))  return false;  
        U pn = (U)o;  
        return pn.name == name  
            && pn.age  == age  ;
	}
}


