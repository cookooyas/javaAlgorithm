package kiseok;

public class algorithm002 {
	public static void main(String[] args) {
		long a1 = 1, a2 = 1;
		long tmp;
		System.out.print(a1+" "+a2+" ");
		for (int i = 0; i<50;i++) {
			tmp=a2; a2+=a1; a1=tmp;
			System.out.print(a2+" ");
		}
	}
}
