/*���һ������S����������еĺϷ���i,����S[i + 1] = S[i] + d, �����dҲ�����Ǹ�������,���Ǿͳ�����SΪ�Ȳ����С�
С��������һ������Ϊn������x,С�����x��Ϊһ���Ȳ����С�С����������������������������λ�õ���ֵ�Ĳ���,���ҽ���������������Ρ�
������Щ����ͨ���������ǲ��ܱ�ɵȲ�����,С����Ҫ�б�һ�������Ƿ���ͨ������������ɵȲ�����*/


/*���룺��������,��һ�а�������n(2 �� n �� 50),�����еĳ��ȡ�
�ڶ���n��Ԫ��x[i](0 �� x[i] �� 1000),�������е�ÿ��������
������Ա�ɵȲ��������"Possible",�������"Impossible"��*/

import java.util.*;
public class ����λ�óɵȲ����� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int sum =0 ;
            for(int i = 0;i < n; i++){
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
            //����Array.sort(arr)�����ϸ��
            Arrays.sort(arr);
            int d = arr[1] - arr[0];
            //���õȲ�������͹�ʽ����
            int idealSum = n * arr[0] + (n*(n-1))/2 * d;
            if(sum == idealSum){
                System.out.println("Possible");
            }else{
                System.out.println("Impossible");
            }
        }
    }
}
