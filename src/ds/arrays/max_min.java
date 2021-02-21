package ds.arrays;

public class max_min {

	public static void main(String[] args) {
		
		int ar[]= {10,280,30,490,50,60,230,800,110,100};
		//max
		int max =0;
		int position=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>max) {
				max=ar[i];
				position=i+1;
				}
		}
		System.out.println(max);
		System.out.println(position);
		

	}

}
