import java.util.*;
class compositebw
 {
 static Scanner input = new Scanner(System.in);
 public static void main(String[] args)
{
 try
 {
 System.out.print("enter the starting number:");
 int start = input.nextInt()+1;
 System.out.print("enter the ending number:");
 int end = input.nextInt();
 if(start<=0 || end<=0)
 System.out.print("Enter the value correctly");
 if(start>end)
 System.out.print("Enter the value correctly");
 while(start<=end)
 {
 int count = 0;
 int j = 2;
 while(j<start){
 if(start%j==0)
 count++;
 j++;
 }

 if(count>0)
 System.out.println(start);
 start++;
 }
 }
 catch(Exception e)
 {
 System.out.println("Enter only numbers");
 }
}
}
