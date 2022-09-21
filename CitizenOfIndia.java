class CitizenOfIndia{

public static showTheResponsibility(){
System.out.println("invoked showTheResponsibility");

  int age = 13 ;
  char gender ='F';
  if(age >= 10 && age < 16){
  System.out.println("Responsibility is School");
  return ;
  
  }
  
  if(age == 16){
  System.out.println("Responsibility is College");
  return ;
  
  }
   
  if(age == 21){
  System.out.println("Responsibility is voting");
  if(gender == 'F'){
	  System.out.println("Girl can leggally Marry");
  }
  else{
System.out.println("Boys can illliggally Marry");
}
  
  }
  System.out.println("end of showTheResponsibility");
  
  

}






}