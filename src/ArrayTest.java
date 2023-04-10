
public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = new int[10];
		
		int b[] = {10,20,30,40,50};//배열의 선언과 동시에 초기화
		
		int c[] = {321,321,3,13,1,31,32,13,13,1,31,5,6,4,897,9};
		
//		int c;
//		int d=10;
		a[5] = 100;
		int k = b[4];

		for(int i=0;i<5;i++) {
//			System.out.println(b[i]);
		}
		int count=0;
		
		for(int j=0;j<c.length;j++) {
//			System.out.println(c[j]);	
			count++;
		}
		System.out.println(count);
		
//		System.out.println(a[5]);
//		
		System.out.println(c.length);
//		System.out.println(b);

	}

}
