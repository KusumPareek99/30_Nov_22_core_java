
public class ArrayDemo1 {
	
	
	public static void main(String[] args) {
		//array is called first class object
		int arr[] = {1,2,3,4,5};
		int[] barr = new int[4];
		int[] carr;
		//carr = {10,20,30}; //not allowed
		carr = new int[] {10,20,30};
		
		display(arr);
		display(arr);
		//display(carr);
		System.out.println("Avg: "+average(new int[] {2,7,1}));
		
	}
	
	public static void display(int[] arr) {
		for(int a : arr) {
			System.out.print(a+" ");
		}
		System.out.println();
	}
	
	public static void display1(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void acceptValue(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			arr[i] = i*100;
		}
	}
	
	public static double average(int[] arr) {
		int sum = 0;
		
		for(int a:arr) {
			sum+=a;
		}
		return (double)sum/arr.length;	
	}

}
