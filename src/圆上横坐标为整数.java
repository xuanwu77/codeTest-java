/*С����һ��Բ��������ԭ���Բ��С��֪��Բ�İ뾶��ƽ����С����Ϊ��Բ�ϵĵ���Һ������궼�������ĵ������ŵģ�С��������Ѱ��һ���㷨��������ŵĵ�ĸ������������������
���磺�뾶��ƽ�����Ϊ25
���ŵĵ���У�(+/-3, +/-4), (+/-4, +/-3), (0, +/-5) (+/-5, 0)��һ��12���㡣 */


import java.util.*;
public class Բ�Ϻ�����Ϊ���� {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			while(sc.hasNext()){
			int rSquare = sc.nextInt();
			double r = Math.sqrt(rSquare);
			int count = 0;
			for(int i = 1;i < r;i++){
				double j = Math.sqrt(rSquare-i * i);
				/*doubleתΪint���С������(int)j >= j �ͱ�ʾ jΪ������*/
				if((int)j >= j){
					count++;
				}
			}
			/*�뾶Ϊ����ʱ*/
			if((int)r >= r ){
				System.out.println(count*4+4);
			}else{
				System.out.println(count*4);
			}
		}
	}
}

