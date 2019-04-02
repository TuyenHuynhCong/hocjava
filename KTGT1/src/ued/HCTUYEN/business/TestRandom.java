package ued.HCTUYEN.business;

import java.util.ArrayList;
import java.util.Random;

public class TestRandom {
	public static void main(String[] args) {
		int max = 50;
		int min = 10;
		ArrayList<Integer> v = new ArrayList<>();
		Random r = new Random();
		int iNew = 0;
		for (int i = 0; i < 3;) {
			iNew = r.nextInt((max - min) + 1) + min;
			if (!v.contains(iNew)) {
				i++;
				v.add(iNew);
				System.out.println(iNew);
			}
		}
	}
}
