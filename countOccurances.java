import java.util.Scanner;  //Did not used "*" because all the library included
public class CouOccurPara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
				String paragraph="A paragraph is a series of sentences that are organized and coherent, and are all related to a single topic. Almost every piece of writing you do that is longer than a few sentences should be organized into paragraphs.";
				
				Scanner input= new Scanner(System.in);
				System.out.println("Enter the word to find occurances!! ");
				String search=input.next();
				
				int rem=numOfOccur(paragraph, search);
				if(rem>0)
				System.out.println("The number of time word counted is "+rem);
				
			}
			
			public  static int numOfOccur(String para, String find)
			{
				String array[]=para.split(" ");
				int countAppear=0;
				
				for(int i=0;i<array.length;i++)
				{
					if(find.equals(array[i]))
					{
						countAppear++;
					}
					
				}
				if(countAppear==0)
				{
					System.out.println("The given word is not in this para");
				}
				
				   return countAppear;
				
			}
	}

