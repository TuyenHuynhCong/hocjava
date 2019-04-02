package ued.HCTUYEN.view;

import ued.HCTUYEN.business.XuLyFraction;
import ued.HCTUYEN.model.Fraction;

public class TestFraction {

	public static void main(String[] args) {
		Fraction a = new Fraction(10,5);
		Fraction b = new Fraction(3,5);
		System.out.println("tru 2 phan so:"+XuLyFraction.TruPS( a, b));
		
	
	}

}
