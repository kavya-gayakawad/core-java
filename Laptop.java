class Laptop{
static String brand;
static String color;
static double price;
static int minVolume;
static int maxVolume = 8;
static int currentVolume;
static boolean isConnected;

public static boolean onOrOff(){
System.out.println("inside onOrOff()");
 if (isConnected == false){
	 isConnected = true;
 System.out.println("Laptop is turned on");

}

System.out.println("end of onOrOff()");
  if (isConnected == true){
	 isConnected = false;
 System.out.println("Laptop is turned off");

}

 System.out.println("end of onOrOff()");
 return isConnected ;


}

public static void increaseVolume(){
System.out.println("inside increaseVolume()");
// false == true
if(isConnected == true){
if(currentVolume < maxVolume){
     currentVolume = currentVolume + 1 ;
	 System.out.println("The currentVolume is :" + currentVolume);
}
else {
	System.out.println("Max Volume reached...");
}

System.out.println("end of increaseVolume");
}
	else{
	System.out.println("Gube.. First turn on the Laptop");
	
}	

}	

public static void decreaseVolume(){
 System.out.println("inside decreaseVolume()");
 
 if(isConnected == true){
 if(currentVolume > minVolume){
	 currentVolume = currentVolume - 1 ;
	 System.out.println("The currentVolume is :" + currentVolume);
 }	 
 else{
	 System.out.println("min Volume reached...");
 }
 System.out.println("end of decreaseVolume");
 }

else{
	System.out.println("Gube First turn on the Laptop");
}	 
}	









}