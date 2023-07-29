
class countnumeric{
	public static void main(String[] args){
		String str="aron123";
		int count=0;
		for(int i=0;i<str.length();i++){
			if(Character.isDigit(str.charAt(i))){
				count++;
				System.out.print(str.charAt(i) +",");
			}
			
		}
		System.out.println(count);
		
	}

}



