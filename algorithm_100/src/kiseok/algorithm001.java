package kiseok;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
	String name, no;

	Student(String name, String no) {
		this.name = name;
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

}

public class algorithm001 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inp;
		ArrayList<Student> l1 = new ArrayList<>();
		l1.add(new Student("김", "1"));
		l1.add(new Student("나", "2"));
		l1.add(new Student("박", "3"));
		l1.add(new Student("이", "4"));
		
		while (true) {
			System.out.print("ㄲ? >>");
			inp = sc.next().toLowerCase();
			if (inp.equals("n")) {
				break;
			} else if (inp.equals("y")) {
				System.out.print("이름? >>");
				inp = sc.next();
				String tmp="없는 학생 이름";
				for (int i = 0; i < l1.size(); i++) {
					if(l1.get(i).getName().equals(inp))
						tmp=l1.get(i).getNo();
				}
				System.out.println(tmp);
			}
			else {System.out.println("똑바로 입력!");}

		}
		sc.close();
	}
}
