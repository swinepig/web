package com.zx.domain.action;

public class ResultAction {

	private int number;

	public void setNumber(int number) {
		this.number = number;
	}

	public String execute() {

		String result = null;
		if (number % 4 == 0)
			result = "dispater";
		else if (number % 4 == 1)
			result = "chain";
		else if (number % 4 == 2)
			result = "redirct";
		else
			return "redirectAction";
		return result;
	}

}
