////[11-6] 다음의 코드는 성적평균의 범위별로 학생 수를 세기 위한 것이다. TreeSet이 학
////생들의 평균을 기준으로 정렬하도록 compare(Object o1, Object o2)와 평균점수의 범위를 
////주면 해당 범위에 속한 학생의 수를 반환하는 getGroupCount() 를 완성하라. 
////[Hint] TreeSet의 subSet(Object from, Object to)를 사용하라. 
//
////[실행결과 ] 
////이자바,1,4,70,90,70,230,76.7
////남궁성,1,2,90,70,80,240,80.0
////김자바,1,3,80,80,90,250,83.3
////홍길동,1,1,100,100,100,300,100.0
////[60~69] :0
////[70~79] :1
////[80~89] :2
////[90~100] :1
//
//
//import java.util.*;
//
//class Student implements Comparable<Student> {
//	String name;
//	int ban;
//	int no;
//	int kor;
//	int eng;
//	int math;
//	Student(String name, int ban, int no, int kor, int eng, int math) {
//		this.name = name;
//		this.ban = ban;
//		this.no = no;
//		this.kor = kor;
//		this.eng = eng;
//		this.math = math;
//	}
//	int getTotal() {
//		return kor+eng+math;
//	}
//	float getAverage() {
//		return (int)((getTotal()/ 3f)*10+0.5)/10f;
//	}
//	public String toString() {
//		return name
//				+","+ban
//				+","+no
//				+","+kor
//				+","+eng
//				+","+math
//				+","+getTotal()
//				+","+getAverage()
//				;
//	}
//	@Override
//	public int compareTo(Student o) {
//		return name.compareTo(o.name);
//	}
//	
//} // class Student
//
//class Exercise11_6 {
//	static int getGroupCount(TreeSet<Student> tset, int from, int to) {
//		Student stu1 = new Student(null, to, to, from, from, from);
//		Student stu2 = new Student(null, to, to, to, to, to);
//		return tset.subSet(stu1, stu2).size();
//	}
//	public static void main(String[] args) {
//		TreeSet<Student> set = new TreeSet<>(new Comparator<Student>() {
//			@Override
//			public int compare(Student o1, Student o2) {
//				return (int)(o1.getAverage() - o2.getAverage());
//			}
//		});
//		set.add(new Student("홍길동",1,1,100,100,100)); 
//		set.add(new Student("남궁성",1,2,90,70,80)); 
//		set.add(new Student("김자바",1,3,80,80,90)); 
//		set.add(new Student("이자바",1,4,70,90,70)); 
//		set.add(new Student("안자바",1,5,60,100,80)); 
//		Iterator<Student> it = set.iterator();
//		while(it.hasNext())
//			System.out.println(it.next());
//		System.out.println("[60~69] :"+getGroupCount(set,60,70));
//		System.out.println("[70~79] :"+getGroupCount(set,70,80));
//		System.out.println("[80~89] :"+getGroupCount(set,80,90));
//		System.out.println("[90~100] :"+getGroupCount(set,90,101));
//	}
//}