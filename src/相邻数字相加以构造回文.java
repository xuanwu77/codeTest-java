/*���ڸ���һ���������У�����ʹ��һ��ת��������
ѡ�������������ڵ�����Ȼ��������Ƴ������������������������ֵĺͲ��뵽��������֮ǰ��λ��(ֻ����һ����)��
���ڶ�����������Ҫ���������Ҫ���ٴβ������Խ����ɻ������С�

����Ϊ���У���һ��Ϊ���г���n ( 1 �� n �� 50)
�ڶ���Ϊ�����е�n������item[i]  (1 �� iteam[i] �� 1000)���Կո�ָ���
*/

/*ʹ��˫�˶���deque���ݽṹ������⡣˫�˶���deque���ݽṹ֧�ָ�Ч����β����Ԫ�صĲ����ɾ����(�ύ����ʱ��С��1ms) 
  ����˼·Ϊ���ж϶��׺Ͷ�βԪ�ء���������ȣ���������Ԫ�ض��������У������й�ģ��С2�����ٶԸ���������жϣ������߲���ȣ���ѡ�����н�С��һ����
  ����Ԫ�غ��������ڵ�Ԫ�ض��������У��ٽ���Ͳ�����У��Ӷ������й�ģ��С1�����ٶԸ���������жϡ�*/

import java.util.*;
public class ������������Թ������ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i = 0;i < n;i++){
				arr[i] = sc.nextInt();
			}
			int head = 0;
			int tail = n-1;
			int left = arr[head];
			int right = arr[tail];
			int times = 0;
			while(head < tail){
				if(left < right){
					head++;
					left += arr[head];
					times++;
				}else if(left > right){
					tail--;
					right += arr[tail];
					times++;
				}else{
					head++;
					tail--;
					left = arr[head];
					right = arr[tail];
				}
			}
			System.out.println(times);
		}
	}
}
