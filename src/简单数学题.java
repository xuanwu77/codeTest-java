/*简单题，数学题而已
 * 小易为了向他的父母表现他已经长大独立了,他决定搬出去自己居住一段时间。一个人生活增加了许多花费: 小易每天必须吃一个水果并且需要每天支付x元的房屋租金。
当前小易手中已经有f个水果和d元钱,小易也能去商店购买一些水果,商店每个水果售卖p元。
小易为了表现他独立生活的能力,希望能独立生活的时间越长越好,小易希望你来帮他计算一下他最多能独立生活多少天。 


输入包括一行,四个整数x, f, d, p(1 ≤ x,f,d,p ≤ 2 * 10^9),以空格分
输出一个整数, 表示小易最多能独立生活多少天*/


import java.util.*;
public class 简单数学题 {
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