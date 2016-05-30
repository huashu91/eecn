package com.eecn;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queryGame qg = new queryGame();
		for(int i = 0; i < qg.element; i++) {
      		System.out.print("<td>" + qg.name.elementAt(i) + "</td>");
      		System.out.println("");
      	}
	}

}
