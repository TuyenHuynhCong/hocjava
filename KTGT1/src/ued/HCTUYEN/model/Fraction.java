package ued.HCTUYEN.model;

import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class Fraction {
	private int tu;
	private int mau;

	public int getTu() {
		return tu;
	}

	public void setTu(int tu) {
		this.tu = tu;
	}

	public int getMau() {
		return mau;
	}

	public void setMau(int mau) {
		if(mau==0) this.mau=1;
		else 
		this.mau = mau;
	}
	
	public Fraction() {
		mau=1;
		
	}
	public Fraction(int tu, int mau) {
		super();
		this.tu = tu;
		setMau(mau);
	}

	@Override
	public String toString() {
		return tu+"/"+mau;
	}
 public void NhapPS()
 {
	 Scanner in=new Scanner(System.in);
	 System.out.println("nhap tu so: ");
	 tu=in.nextInt();
	 System.out.println("nhap mau so: ");
	int a=in.nextInt();
	//if(a!=0) mau=a;
	while(a==0)
	{
		System.out.println(" ban nhap mau = 0 ; vui long nhap lai!");
		System.out.println("nhap mau so: ");
		 a=in.nextInt();
	}
	if(a!=0) mau =a;
	 
 }

}
