package Demo;

public class Twodarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] x=new int[3][];	//initialize number of rows
		
		//Define the number of columns in each row
		
		x[0]=new int[2];
		x[1]=new int[2];
		x[2]=new int[2];
		
		//print array element
		for( int i=0; i<x.length; i++) {
			for( int j=0; j< x[i].length; j++) {
				x[i][j]=i;
				System.out.print(x[i] [j]);

	}
		System.out.println();
}
}

}