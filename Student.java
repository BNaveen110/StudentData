import java.util.Random;

class NitStudent {
	int rollNo;
	String name;
	int maths;
	int sci;
	int eng;

	int paid;
	int attd;

	public NitStudent(int rollNo, String name, int maths, int sci, int eng, int paid, int attd) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.maths = maths;
		this.sci = sci;
		this.eng = eng;
		this.paid = paid;
		this.attd = attd;
	}

	@Override
	public String toString() {
		return "NitStudent [rollNo=" + rollNo + ", name=" + name + ", maths=" + maths + ", sci=" + sci + ", eng=" + eng
				+ ", fee=" + paid + ", attd=" + attd + "]";
	}

}

public class Student {

	static int getRandomNo(int max, int min) {

		int range = max - min + 1;

		return (int) (Math.random() * range) + min;

	}

	public static void main(String[] args) {

		int max = 350;

		NitStudent[] allStus = new NitStudent[max];

		for (int i = 0; i < max; i++) {
			allStus[i] = new NitStudent(getRandomNo(1000, 500), "Stu" + getRandomNo(0, 100), getRandomNo(60, 90),
					getRandomNo(0, 80), getRandomNo(50, 100), getRandomNo(20000, 200000), getRandomNo(30, 69));

		}

		System.out.println("All Student Passed List and who paid fee less than 100000....");
		System.out.println("----------------------");
		
		
		getAllPassedStudentList(allStus);
		System.out.println("----------------------");
		
		
		
		
		
		
	}

		private static void getAllPassedStudentList(NitStudent[] allStus) {

		NitStudent eachStu;
		for (int i = 0; i < allStus.length; i++) {
			eachStu = allStus[i];
			if ((eachStu.maths > 35) && 
					(eachStu.sci > 35) && 
					(eachStu.eng > 35) &&(eachStu.paid<100000)
				) {
				
				System.out.println(eachStu);

			}
		}

	}

}