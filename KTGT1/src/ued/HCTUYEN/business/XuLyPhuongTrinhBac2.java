package ued.HCTUYEN.business;

import javax.swing.JOptionPane;

import ued.HCTUYEN.model.PhuongTrinhBac2;

public class XuLyPhuongTrinhBac2 {
	public static void cal(PhuongTrinhBac2 t) {
		double x, y, z, delta, root, x1, x2;
		x = t.getA();
		y = t.getB();
		z = t.getC();
		delta = y * y - 4 * x * z;
		if (delta < 0) {
			// JOptionPane.showMessageDialog(null, "Vo nghiem");
			System.out.println(" phuong trinh vo nghiem");
		} else if (delta == 0) {
			x1 = x2 = (-y / 2 * x);
			System.out.println("phuong trinh co nghiem duy nhat:" + x1);
			System.out.println();
		} else {
			root = Math.sqrt(delta);
			x1 = (-y + root) / (2 * x);
			x2 = (-y - root) / (2 * x);
			// JOptionPane.showMessageDialog(null, "x1 = "+x1+", x2 = "+x2);
			System.out.println();
		}
	}
}
