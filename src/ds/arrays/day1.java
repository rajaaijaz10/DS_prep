package ds.arrays;

public class day1 {

	public static void main(String[] args) {
		//Without array approach
		  int marks_1 = 56, marks_2 = 78, marks_3 = 88, marks_4 = 76, marks_5 = 56, marks_6 = 89;   
		    float avg = (marks_1 + marks_2 + marks_3 + marks_4 + marks_5 +marks_6) / 6 ;   
		    System.out.println(avg);
		    
		 //With array
		    System.out.println("--------------------    With Array -----------------------------------");
		   float aavg=0f;
		   int sum=0;
		 int[]  marks= {56,78,88,76,56,89}; // array def & intilization in same line
		 int leng =marks.length;
		 for(int i=0;i<leng;i++) {
			sum = sum + marks[i];
		 }
		 aavg=sum/leng;
		 System.out.println(sum);
		 System.out.println(avg);

	}

}
