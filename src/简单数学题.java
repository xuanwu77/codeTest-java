/*���⣬��ѧ�����
 * С��Ϊ�������ĸ�ĸ�������Ѿ����������,���������ȥ�Լ���סһ��ʱ�䡣һ����������������໨��: С��ÿ������һ��ˮ��������Ҫÿ��֧��xԪ�ķ������
��ǰС�������Ѿ���f��ˮ����dԪǮ,С��Ҳ��ȥ�̵깺��һЩˮ��,�̵�ÿ��ˮ������pԪ��
С��Ϊ�˱������������������,ϣ���ܶ��������ʱ��Խ��Խ��,С��ϣ��������������һ��������ܶ�����������졣 


�������һ��,�ĸ�����x, f, d, p(1 �� x,f,d,p �� 2 * 10^9),�Կո��
���һ������, ��ʾС������ܶ������������*/


import java.util.*;
public class ����ѧ�� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
            int x = sc.nextInt(),
                f = sc.nextInt(),
                d = sc.nextInt(),
                p = sc.nextInt();
            if(f > d/x){
                System.out.println(d/x);
            }else{
                System.out.println((d - x * f)/(p + x) + f);
            }
        }
    }
}