package exception;

 
	import java.util.Scanner;
	class Sort2{
		public static char maxOccuringChar(String str)
		{
			char maxChar=' ';
			int max=0;
			int charCount[]=new int[256];
			for(int i=0;i<str.length();i++)
			{
				charCount[str.charAt(i)]++;
			}
			for(int i=0;i<str.length();i++)
			{
				char ch=str.charAt(i);
				if(max<charCount[ch])
				{
					max=charCount[ch];
				    maxChar = ch;
				}
			}
			return maxChar;
			}
		
	 
	public static void main(String[] args) {
		 			Scanner sc=new Scanner(System.in);
			String str=sc.nextLine();
		 Sort2 so=new Sort2();
		 
			char c=maxOccuringChar(str);
			System.out.println(c);
		 sc.close();
			}
	}
