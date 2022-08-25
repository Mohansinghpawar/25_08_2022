public class CountOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		  String input = "hello everyone! welcome to clayfin!!!";
		  char find = '!';             // Character to search is '!'.
		  int count=0;
		  for(int i=0; i<input.length(); i++)
		  {
		      if(input.charAt(i) == find)
		      count++;
		  }
		  System.out.println("The Character '"+find+"' appears "+count+" times.");
		}
	}
