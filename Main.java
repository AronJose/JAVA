
class reverse{
	public void RevString(){
		String str="Hellow",nstr="";
		char ch=0;
		System.out.print("Orginal String:" +str);
		for(int i=0;i<str.length();i++){
                  ch=str.charAt(i);
			nstr=ch+nstr;
		}
		System.out.print("reverse string:"+nstr);
	}
}
class Main{
	public static void main(String[] args){
		reverse rs=new reverse();
		rs.RevString();
	
	}
}