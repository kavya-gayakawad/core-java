class ArmStrong{
public static void main(String a[]){

int n = 153;
// int temp = n;
int r, sum=0;

while(n>0){
r = n%10;
n=n/10;
sum=sum+ r*r*r;

}
if(n==sum)
System.out.println("not an ArmStrong number");
else
System.out.println("it is an ArmStrong number");
}
}