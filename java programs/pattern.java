import java.awt.*;
import java.util.Scanner;
public class pattern {
public static void main(String[] args) {
// Write your code here
for (int i = 0; i < 5; i++) {
for(int j = 0 ; j<25;j++) {
if(i==0 )
{
if(j==3)
System.out.print("J");
else if(j==7 || j==21)
System.out.print("A");
else if(j==11 || j==17)
System.out.print("V");
else
System.out.print(" ");
}
else if(i==1) {
if(j==3)
System.out.print("J");
else if(j==6 || j==8 || j==19 || j==22)
System.out.print("A");
else if(j==12 || j==16)
System.out.print("V");
else
System.out.print(" ");
}
else if(i==2) {
if(j==3 || j==0)
System.out.print("J");
else if((j>=5 && j<=9) || (j>=18 && j<=23) )
System.out.print("A");
else if(j==13 || j==15)
System.out.print("V");
else
System.out.print(" ");
}
else if(i==3) {
if(j==2 || j==1)
System.out.print("J");
else if(j==4 || j==10 || j==17 || j==24)
System.out.print("A");
else if(j==14)
System.out.print("V");
else
System.out.print(" ");
}
else
System.out.print("");
}
System.out.println(" ");
}
}
}