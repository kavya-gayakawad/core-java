class TeaStall {

    static int teaStallId;
    static  String name;
    static String address;
    static long contactNo;	

//setter and getter
     static void setTeaStallId(int Id){
		 teaStallId = Id;
		 
	 }
	 static int getTeastallId(){
		 return teaStallId;
	 }
	 static void setContactNo(long cNo){
		 contactNo = cNo;
	 }
	 static long getContactNo(){
		return contactNo; 
		 
	}
	static void setName(String nm) {
		 name=nm;
	}
	static String getName(){
          return name;
		
	}
	static void setAddress(String add){
		address=add;
	}
	static String getAddress(){
		return address;
	}
}