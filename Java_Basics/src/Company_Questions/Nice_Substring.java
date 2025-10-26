//11000111001111100011
package Company_Questions;

public class Nice_Substring {

	public static void main(String args[])
	{
		String s = "11000111001111100000011";
		int count =0;
		int result=0;
		int index=0;
	for(int i=0;i<s.length()-1;i++)	
	{

		if(s.charAt(i)==s.charAt(i+1))
		{

			count++;
			
		}
		else
		{
			

			if(count>result) 
			{
				result=count;
				index=i;
				for(int j=index;j>1;j--)
				{
					if(s.charAt(j)!=s.charAt(j-1))
					{
						index=j;
						break;
					}
				}
			}
			count=0;
		}
		
		}
		System.out.println("Largest count is "+(result+1)+" & index is "+index);
		
	}
}
