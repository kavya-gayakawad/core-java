class LargestElementArray{
public static void main(String[]args){

int arr[]=new int[]{75,23,666,17};
int max=arr[0];
for(int i=1; i<arr.length; i++){

if(arr[i]>max){
max=arr[i];
}
}
System.out.println("Largest Element in an Array " + max);
}

}