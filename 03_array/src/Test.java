
public class Test {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		System.out.println("a=" + a + "    b=" + b);
		/*
		 int temp = a; a = b; b = temp;
		 
		*/
		
		/*
		a = a * b;
		b = a / b;
		a = a / b;
		*/
		
		a = (a+b)-(b=a);
		System.out.println("a=" + a + "    b=" + b);

		Date d1 = new Date(1, 1, 2001);
		Date d2 = new Date(2, 2, 2002);

		System.out.print("d1= ");
		d1.display();
		System.out.print("d2= ");
		d2.display();

		System.out.println("after swaping: ");
		swap(d1, d2);

		System.out.print("d1= ");
		d1.display();
		System.out.print("d2= ");
		d2.display();

		System.out.println("__________________________________________");

		Date[] darr = new Date[] { d1, d2 };
		System.out.print("d1= ");
		darr[0].display();
		System.out.print("d2= ");
		darr[1].display();

		swap(darr);
		System.out.println("after swaping: ");
		System.out.print("d1= ");
		darr[0].display();
		System.out.print("d2= ");
		darr[1].display();

	}

	public static void swap(Date[] dateArr) {
		Date temp = dateArr[0];
		dateArr[0] = dateArr[1];
		dateArr[1] = temp;
	}

	public static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}

	public static void swap(Date a, Date b) {
		int temp;
		temp = a.dd;
		a.dd = b.dd;
		b.dd = temp;

		temp = a.mm;
		a.mm = b.mm;
		b.mm = temp;

		temp = a.yy;
		a.yy = b.yy;
		b.yy = temp;
	}

}
