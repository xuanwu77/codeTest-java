/*小易有一个圆心在坐标原点的圆，小易知道圆的半径的平方。小易认为在圆上的点而且横纵坐标都是整数的点是优雅的，小易现在想寻找一个算法计算出优雅的点的个数，请你来帮帮他。
例如：半径的平方如果为25
优雅的点就有：(+/-3, +/-4), (+/-4, +/-3), (0, +/-5) (+/-5, 0)，一共12个点。 */


import java.util.*;
public class 圆上横坐标为整数 {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			while(sc.hasNext()){
			int rSquare = sc.nextInt();
			double r = Math.sqrt(rSquare);
			int count = 0;
			for(int i = 1;i < r;i++){
				double j = Math.sqrt(rSquare-i * i);
				/*double转为int会变小，所以(int)j >= j 就表示 j为整数了*/
				if((int)j >= j){
					count++;
				}
			}
			/*半径为整数时*/
			if((int)r >= r ){
				System.out.println(count*4+4);
			}else{
				System.out.println(count*4);
			}
		}
	}
}

