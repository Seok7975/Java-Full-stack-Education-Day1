interface MyFunction5{
	int sumArr(int[] arr);
}

public class LambdaTest5 {

	public static void main(String[] args) {
		MyFunction5 f = new MyFunction5() {
			public int sumArr(int[] arr) {
				int sum = 0;
				for(int i : arr)
					sum += i;
				return sum;
			}
		};
		int num = f.sumArr(new int[] {1,2,3,4,5});	// 익명 객체의 메소드 호출
		System.out.println(num);
	}
}