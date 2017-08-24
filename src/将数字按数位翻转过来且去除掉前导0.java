/*对于一个整数X，定义操作rev(X)为将X按数位翻转过来，并且去除掉前导0。例如:
如果 X = 123，则rev(X) = 321;
如果 X = 100，则rev(X) = 1.
现在给出整数x和y,要求rev(rev(x) + rev(y))为多少？ */

import java.util.*;
public class 将数字按数位翻转过来且去除掉前导0 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int a =sc.nextInt();
			int b =sc.nextInt();
			System.out.println(rev(rev(a) + rev(b)));
		}
	}
	public static int rev(int m){
			int x = 0;
			while(m!=0){
				x=10*x+m%10;
				m/=10;
			}
		return x;
	}
}
