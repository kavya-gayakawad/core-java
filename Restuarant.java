class Restuarant{
static void getFoodMenu(String[] foodMenu){
System.out.println("inside getFoodMenu method");
System.out.println("Food Menu size is " + foodMenu.length);
for(int index=0 ; index < foodMenu.length ; index++){
System.out.println(foodMenu[index]);
}
System.out.println("end of getFoodMenu method");

}

 static void getName(String name){
  System.out.println("Restuarant Name is " + name); 
 }

}