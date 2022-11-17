package com.xworkz.tin;

import com.xworkz.tinapp.CocaCola;
import com.xworkz.tinapp.RedBull;
import com.xworkz.tinapp.Tin;

public class TinTester {
	
	public static void main(String[]args) {
		
		Tin tin = new CocaCola();
		tin.toStoreLiquid();
		
		Tin tin1 = new RedBull();
		tin1.toStoreLiquid();
	}

}
