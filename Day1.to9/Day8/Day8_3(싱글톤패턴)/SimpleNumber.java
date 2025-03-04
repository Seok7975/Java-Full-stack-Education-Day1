//싱글턴 패턴 -> 객체갯수를 한개로 제한
SimpleNumber.java
/*
class SimpleNumber
{
	private static SimpleNumber inst;
	int num=0;
	private SimpleNumber() {}	// 생성자 private
	public  void addNum(int n) { num += n; }
	public  void showNum() 
	{ 
		System.out.println(num); 
	}
	
	public static SimpleNumber getSimpleNumberInst()
	{
		if(inst==null)
			inst = new SimpleNumber();
		return inst;
	}
}

class OnlyOneINstance
{
	public static void main(String[] args)
	{
		SimpleNumber num1 = SimpleNumber.getSimpleNumberInst();
		num1.addNum(20);
		
		SimpleNumber num2 = SimpleNumber.getSimpleNumberInst();
		num2.addNum(30);
	
		num1.showNum();
		num2.showNum();
	}
}
*/

class SimpleNumber
{
	private static SimpleNumber inst = new SimpleNumber();
	int num=0;
	private SimpleNumber() {}	// 생성자 private
	public  void addNum(int n) { num += n; }
	public  void showNum() 
	{ 
		System.out.println(num); 
	}
	
	public static SimpleNumber getSimpleNumberInst()
	{
		return inst;
	}
}

class OnlyOneINstance
{
	public static void main(String[] args)
	{
		SimpleNumber num1 = SimpleNumber.getSimpleNumberInst();
		num1.addNum(20);
		
		SimpleNumber num2 = SimpleNumber.getSimpleNumberInst();
		num2.addNum(30);
	
		num1.showNum();
		num2.showNum();
	}
}