//input="aabbcccaa" output="a-2, b-2, c-3,a-2" 
public class String_Count {
	public static void main(String args[])
	{
		String s = "aabbcccaa";
		StringBuffer sb = new StringBuffer();
		int count=1;
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)==s.charAt(i+1))
			{
				
				count++;
			}
			else
			{
				sb.append(s.charAt(i));
				sb.append(count);
				count=1;
			}
			
		}
		sb.append(s.charAt(s.length()-1));
			sb.append(count);
		System.out.println(sb.toString());
	}

}
