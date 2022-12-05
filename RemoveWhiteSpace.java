class RemoveWhiteSpace{

public static void main(String[]args){
	//Scanner sc = new Scanner(System.in);
	//String str = sc.next();
	
String str = "Remove white spaces";
str = str.replaceAll("\\s+","");
System.out.println(str);

}

}