import java.util.Iterator;

public class DuplicateCh {

	
	
	public static void main(String[] args) {
		String str="Naveen";
		char[] charArray = str.toCharArray();
	int	count=0;
	for(int i=0;i<charArray.length;i++) {
		for(int j=i+1;j<charArray.length;j++) {
			if(charArray[i]==charArray[j]) {
				System.out.println("duplicate  character---"+charArray[j]);
				count++;
			}
		}
	}
		System.out.println("no of character "+count );
	}
}
