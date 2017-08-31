import java.io.*;
import java.util.*;
class Test {
}
public class test1
{
    public static void main(String args[])
    {
        Scanner cin = new Scanner(System.in);
        int a, b;
        while(cin.hasNextInt())
        {
            a = cin.nextInt();
            b = cin.nextInt();
           TreeSet<Integer> set =  new TreeSet<Integer>();
          for(int i =0;i<a;i++){
            set.add(cin.nextInt());
        }
          for(int i = 0;i<b;i++){
            set.add(cin.nextInt());
    }
          String str = "";
          for(Integer i : set){
           str = str + i + " ";
          }
              System.out.println(str.trim());
	}
    }
}
