package com.ryz.cn;

public enum Color {
RED("红色",1),GREEN("绿色",2),YELLO("黄色",3);
	private Color(String name,int index){
		this.name= name;
		this.index = index;
		
	};
	private String name;
	private int index;
/*	public String getName(int index){
		for(Color c : Color.values()){
			if(c.getIndex()== index){
				return c.getName();
			}
				
			
		}
		return "";
	}*/
	 public String getName() {  
	        return name;  
	    }  
	    public void setName(String name) {  
	        this.name = name;  
	    }  
	    public int getIndex() {  
	        return index;  
	    }  
	    public void setIndex(int index) {  
	        this.index = index;  
	    }  
}
