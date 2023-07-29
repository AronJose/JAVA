
class palindrome{
	public static void main(String arg[]){
		String str="Hellow",rstr="";
		char[] ch=new char[str.length()];
		for(int i=0;i<str.length();i++){
			ch[i]=str.charAt(i);
			rstr=ch[i]+rstr;
		}
	System.out.println("reverse of the strig" +rstr);
		if(str==rstr){
			System.out.println("palindrom");
		}
		else{
			System.out.println("not a palindrom");
		}
		
	}
}