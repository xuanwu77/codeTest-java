/*����һ������X���������rev(X)Ϊ��X����λ��ת����������ȥ����ǰ��0������:
��� X = 123����rev(X) = 321;
��� X = 100����rev(X) = 1.
���ڸ�������x��y,Ҫ��rev(rev(x) + rev(y))Ϊ���٣� */

import java.util.*;
public class �����ְ���λ��ת������ȥ����ǰ��0 {
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
