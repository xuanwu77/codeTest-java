/*把一个字符串的大写字母放到字符串的后面，各个字符的相对位置不变，且不能申请额外的空间。
*/

import java.util.*;
public class 把大写字母移位到后面 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String str1 = sc.nextLine();
			/*注意：replaceAll方法中正则表达式用双引号包起来*/
			System.out.println(str1.replaceAll("[A-Z]", "") + str1.replaceAll("[a-z]", ""));
		}
	}
}
	
