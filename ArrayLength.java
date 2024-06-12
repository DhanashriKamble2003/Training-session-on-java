package Demo;

public class ArrayLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] source= {100,200,300};//create and initialize the array of integers
		
		int[] dest= new int[3];//create an integer array with 3 elements
		
		System.arraycopy(source,0,dest,0,source.length);//copy an element from source to destination array
		
		for(int i=0; i< dest.length; i++)
		{
			System.out.println("Elements at index" +i+ ":" +dest[i]);
		}

	}

}
