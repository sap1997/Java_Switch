package Basics;

public class Highestcombi {
	public static void main(String args[])
	{
		int n=32723623;
		char ch[] = String.valueOf(n).toCharArray();
		char temp;
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i;j<ch.length;j++)
			{
				if(ch[i]<ch[j])
				{
					temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		int result = Integer.parseInt(String.valueOf(ch));
		System.out.println(result);
	}

}
