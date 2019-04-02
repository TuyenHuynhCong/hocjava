package ued.HCTUYEN.business;

import ued.HCTUYEN.model.Fraction;

public class XuLyFraction {
    private static int ULCN(int a,int b)
    {
    	while(a*b!=0)
    	{
    		if(a>b) a=a%b;
    		else b=b%a;
    	}
    	return a+b;
    }
    public static Fraction TruPS(Fraction a,Fraction b)
    {
    	Fraction kq	=new Fraction(a.getTu()*b.getMau()-b.getTu()*a.getMau(),a.getMau()*b.getMau());
    return rutGonPS(kq);
    }
    public static Fraction rutGonPS(Fraction a)
    {
    	int k =ULCN(a.getMau(), a.getTu());
    	return new Fraction(a.getTu()/k,a.getMau()/k);
    }
}
