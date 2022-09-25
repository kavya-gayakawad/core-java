class TeaStallTester{

public static void main(String args[]){
	TeaStall.setTeaStallId(5678);
	TeaStall.setContactNo(7337665941L);
	TeaStall.setName("Beereshwara Cha Angadi");
	TeaStall.setAddress("Malleshwaram");

//TeaStall.teaStallId = 5678;
//TeaStall.name = "Beereshwara Cha Angadi";
//TeaStall.address = "Malleshwaram";
//TeaStall.contactNo = 7337665941L;

System.out.println(TeaStall.getTeastallId());
System.out.println(TeaStall.getContactNo());
System.out.println(TeaStall.getName());
System.out.println(TeaStall.getAddress());
}

}