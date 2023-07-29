
class Reverse{
	public static void main(String[] arg){
		String str="aron";
		String nstr="";
		char ch;
		System.out.println("the string:");
		for(int i=0; i<str.length(); i++)
		{
			ch=str.charAt(i);
			nstr=ch+nstr;	
		}	
		System.out.println("the reverse word:"+nstr);
	}
}




