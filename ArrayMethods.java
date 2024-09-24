import java.util.Arrays;

public class ArrayMethods {
	//we can store only similar datatypes
	//memory wastage is high
	//compile time memory allocation
	
	//support duplicates
	public static void usingTostring() {
		// TODO Auto-generated method stub
		int arr[][]= {{11,22},{55,99},{101,120}};
	//	String string = Arrays.toString(arr);
		System.out.println("USING TOSTRING method"+Arrays.toString(arr));
	}
	public void nagativeSize() {
		//datatype varaiablename[]=new datatype[rowsize][columnsize];
		int num1[]=new int[-4];
		System.out.println(num1);
		/*Exception in thread "main" java.lang.NegativeArraySizeException: -4
		at ArrayMethods.nagativeSize(ArrayMethods.java:9)
		at ArrayMethods.main(ArrayMethods.java:57)
*/

	}
	public static void iterateLoop() {
		//iterate one dimensional array
		String color[]= {"red","blue","green"};//one dimensional
		Integer num2[][]= new Integer[3][2];//2dimensional order of printing values [0,0 0,1 1,0 1,1 2,0 2,1]
		 num2[0][0]=110;
		 num2[0][1]=220;
		
		 num2[1][0]=880;
		 num2[1][1]=330;
		
		 num2[2][0]=440;
		 num2[2][1]=880;
		
		for(int i=0;i<=color.length-1;i++) {
			System.out.println("one dimentional array values are   "+color[i]);
		}
		
		//two dimensional array iteration
		 System.out.println("two dimensinal");
			for (int i = 0; i<num2.length; i++){
			     for (int j = 0; j<num2[i].length; j++){
			    	
			    System.out.println(num2[i][j]);
			     //

			}
			     
		}
			System.out.println("************** ");
	}
	
	public  void overwriteAnValue() {
		// overwrite the values only it will take last one  previous value erased
		int num1[]= {11,22,33,44,55};
		num1[3]=66;
		System.out.println(num1);//this line of code not give the output
		System.out.println("******************");
		System.out.println(Arrays.toString(num1));//if u want to print the Array using this Arrays. ??

	}
	public static void main(String[] args) {
		ArrayMethods arr=new ArrayMethods();
		arr.overwriteAnValue();
		ArrayMethods.iterateLoop();
		//arr.nagativeSize();
		ArrayMethods.usingTostring();
		
		String s[]=new String[5];
		System.out.println("String default value------------"+s[0]);//default value return as null
		int num[]=new int[6];
		System.out.println("integer default value------------"+num[0]);//default value return as 0
		Boolean b[]= new Boolean[3];
		System.out.println("boolean default value------------"+b[0]);//default value return as null
		Character c[]=new Character[5];
		System.out.println("character default value------------"+c[3]);//default value return as null
		Float f[]=new Float[5];
		System.out.println("float default value------------"+f[0]);//default value return as null
		
	}
	
	

}
