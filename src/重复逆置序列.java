import java.util.Scanner;

/*С����һ������Ϊn����������,a_1,...,a_n��Ȼ������һ��������b�Ͻ���n�����²���:
1����a_i����b���е�ĩβ
2������b����
С����Ҫ������������n��֮���b���С� 
��������:

�����������,��һ�а���һ������n(2 �� n �� 2*10^5),�����еĳ��ȡ�
�ڶ��а���n������a_i(1 �� a_i �� 10^9),������a�е�ÿ������,�Կո�ָ


�������:

��һ�����������n��֮���b����,�Կո�ָ�,��ĩ�޿ո�
ʾ��1
����

4
1 2 3 4
���

4 2 1 3*/


/*���ⲻ�ܰ��ռȶ�����������Ȼ�Ḵ�Ӷȹ��ߡ��ҹ��ɣ����Ի��ˣ���ʵ����Ҫ����ֱ�ӴӺ���ǰ���һ�������Ȼ��û�������˳���������*/


public class �ظ��������� {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0;i < n;i++){
                arr[i] = sc.nextInt();
            }
            if(n%2 == 0){
                for(int i = n-1;i >= 0;i-= 2){
                	//����ʹ��System.out.println�����ǻ��еģ��ַ���һ��
                    System.out.print(arr[i]+" ");
                }
                System.out.print(arr[0]);
                for(int i = 2;i < n-1;i+= 2){
                    System.out.print(" " + arr[i]);
                }   
            }else{
                for(int i = n-1;i >= 0;i-= 2){
                    System.out.print(arr[i]+" ");
                }
                System.out.print(arr[1]);
                for(int i = 3;i < n-1;i+= 2){
                    System.out.print(" " + arr[i]);
                }   
            }
        }
    }
}
