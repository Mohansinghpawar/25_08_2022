import java.util.Scanner;
public class IPaddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner input= new Scanner(System.in);
				System.out.println("Enter the IP address");
				String val=input.next();
				
				checkIp(val);
			}

			public static void checkIp(String val) {
				
				String array[]=val.split("[.]");
				
				int arr1[]=new int[array.length];
				int countIP=0;
				if(arr1.length==4)
				{
				for(int i=0;i<array.length;i++)
				{
					arr1[i]=Integer.parseInt(array[i]);
					if(arr1[i]<=255 && arr1[i]>=0)
					{
						
						countIP++;
					}
					
				}
				if(countIP==4)
				{
					System.out.println("The given ip address is valid");
				}
				else
					System.out.println("The given ip address is not valid");
				}
				else
					System.out.println("The given id is not valid");
			}
	}
