package ued.HCTUYEN.view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import ued.HCTUYEN.model.Teacher;

public class TestTeacher {
	private static String getten(Teacher s) {
		String name = s.getName().substring(s.getName().lastIndexOf(" ") + 1);
		String firstName = s.getName().substring(0, s.getName().lastIndexOf(" "));
		return name + firstName;
	}

	public static void main(String[] args) {
		ArrayList<Teacher> s1 = new ArrayList<Teacher>();

		s1.add(new Teacher("Trần Quốc Chung", 63));
		s1.add(new Teacher("Lê Gia Vinh", 30));
		s1.add(new Teacher("Nguyễn Quốc Vinh", 42));
		Collections.sort(s1);

		System.out.println("Danh sách sau khi sắp xếp: ");
		for (int i = 0; i < s1.size(); i++) {
			// duyệt mảng
			System.out.print("Giáo viên thứ " + (i + 1) + ": " + s1.get(i));
			System.out.println();
		}

	}
}
