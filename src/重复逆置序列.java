import java.util.Scanner;

/*小易有一个长度为n的整数序列,a_1,...,a_n。然后考虑在一个空序列b上进行n次以下操作:
1、将a_i放入b序列的末尾
2、逆置b序列
小易需要你计算输出操作n次之后的b序列。 
输入描述:

输入包括两行,第一行包括一个整数n(2 ≤ n ≤ 2*10^5),即序列的长度。
第二行包括n个整数a_i(1 ≤ a_i ≤ 10^9),即序列a中的每个整数,以空格分割。


输出描述:

在一行中输出操作n次之后的b序列,以空格分割,行末无空格。
示例1
输入

4
1 2 3 4
输出

4 2 1 3*/


/*此题不能按照既定方法做，不然会复杂度过高。找规律，别被迷惑了，其实不需要逆序，直接从后向前间隔一个输出，然后没有输出的顺序输出即可*/


public class 重复逆置序列 {
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
                	//不能使用System.out.println，那是换行的，又犯错一次
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
