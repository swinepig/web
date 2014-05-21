package com.zx.domain.action;

public class WildcardAction {
	
	public String save(){
		System.out.println("save");
		return "save";
	}
	
	public String update(){
		System.out.println("update");
		return "update";
	}
	
	public String delete(){
		System.out.println("delete");
		return "delete";
	}
	
	public String query(){
		System.out.println("query");
		return "query";
	}

}
