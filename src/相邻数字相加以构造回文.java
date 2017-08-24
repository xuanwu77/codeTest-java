/*现在给出一个数字序列，允许使用一种转换操作：
选择任意两个相邻的数，然后从序列移除这两个数，并用这两个数字的和插入到这两个数之前的位置(只插入一个和)。
现在对于所给序列要求出最少需要多少次操作可以将其变成回文序列。

输入为两行，第一行为序列长度n ( 1 ≤ n ≤ 50)
第二行为序列中的n个整数item[i]  (1 ≤ iteam[i] ≤ 1000)，以空格分隔。
*/

/*使用双端队列deque数据结构进行求解。双端队列deque数据结构支持高效地首尾两端元素的插入和删除。(提交运行时间小于1ms) 
  本题思路为：判断队首和队尾元素。若二者相等，则将这两个元素都弹出队列，将队列规模缩小2个，再对该问题进行判断；若二者不相等，则选择其中较小的一个，
  将该元素和与其相邻的元素都弹出队列，再将其和插入队列，从而将队列规模缩小1个，再对该问题进行判断。*/

import java.util.*;
public class 相邻数字相加以构造回文 {
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
