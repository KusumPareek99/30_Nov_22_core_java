
public class Array2Demo {
	
	public static void main(String[] args) {
		int[][] arr= {{10,20},{20,30,40},{40,50,60,70}};
		int[][] barr = new int[3][2];
		
		display(arr);
		display1(barr);
	}
	
	public static void display(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("____________________________");
	}
	
	public static void display1(int[][] arr) {
		for(int[] ar :arr) {
			for(int a :ar) {
				System.out.print(a+" ");
			}
			System.out.println();
		}
		System.out.println("____________________________");
	}
	
	public void foo() {
		int[][] arr= new int[2][3];  //y
		int[][] barr= new int[2][];  //y
		//int[][] carr = new int[][3];  //n
		//int[][] darr = new int[][];  //n
	}

}
