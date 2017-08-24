/*有n个数，两两组成二元组，差最小的有多少对呢？差最大呢？*/


/*思路：
 * 1.先排序
         特殊情况：如果排完序之后发现数组中所有数都相同，直接输出结果
             结果为：差最大个数 = 差最小个数 = （n * (n-1))/2;(两两组合)
    2.统计数组中每种数字的个数（这里用的map）
    3.计算差最小个数
        3.1.如果数组中没有重复数字，说明最小差不为0，最小差肯定是数组中相邻两个数的差
            因此，遍历一边数组，计算并统计最小差。
        3.2.如果数组中有重复数字，说明最小差是0，此时，遍历一边（map），数字个数不为0的
            数字会产生最小差0，利用公式计算即可
    4.计算差最大个数
        只有一种情况，最大值与最小值的两两组合，即最大值个数 * 最小值个数*/

import java.util.*;
public class 两两组成二元组求差最小的对数 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i = 0; i < n; i++){
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);
			/*如果数组中所有数都相同，直接输出结果*/
			if(arr[0] == arr[n-1]){
				int result =  n*(n-1)/2;
				System.out.println(result + " " + result);
				continue;
			}
			/*把每个数和出现的次数存起来放入map中*/
			TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
			for(int i = 0; i<n;i++){
				if(map.containsKey(arr[i])){
					map.put(arr[i], map.get(arr[i]) + 1);
				}else{
					map.put(arr[i], 1);
				}
			}
			/*minCount是差最小的对数,maxCount是差最大的对数*/
			int minCount,maxCount;
			minCount = maxCount =0;
			/*所有数都不重复*/
			if(map.size() == n){
				int minVal = arr[1]-arr[0];
				++minCount;
				for(int j = 1; j < n; j++){
					int temp = arr[j+1] - arr[j];
					if(temp ==  minVal){
						minCount++;
					}else if(temp < minVal){
						minVal  = temp;
						minCount = 1;
					}
				}
				maxCount = map.get(arr[0]) * map.get(arr[n-1]);
			}
			/*有数重复，最小差值为0*/
			else{
				for(Integer key : map.keySet()){
					int keyVal = map.get(key);
					if( keyVal >1){
						minCount += keyVal *(keyVal-1)/2;
					}
				}
				maxCount = map.get(arr[0]) * map.get(arr[n-1]);
			}
			System.out.println(minCount + " " + maxCount);
		}	
	}
}
