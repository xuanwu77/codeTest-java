
/*给定一个字符串s，你可以从中删除一些字符，使得剩下的串是一个回文串。如何删除才能使得回文串最长呢？
输出需要删除的字符个数。*/

/*比较简单的想法就是求原字符串和其反串的最大公共子串的长度，然后用原字符串的长度减去
这个最大公共子串的长度就得到了最小编辑长度。*/
import java.util.*;
public class 删除一些字符以构造回文 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String str1 = sc.nextLine();
			/*将给定字符串颠倒*/
			String str2 = new StringBuilder(str1).reverse().toString();
			char[] ch1 = str1.toCharArray();
			char[] ch2 = str2.toCharArray();
			int len1 = ch1.length;
			int len2 = ch2.length;
			int[][] dp = new int[len1][len2];
			dp[0][0] = ch1[0] == ch2[0] ? 1 : 0;
			/*第一列的值*/
			for(int i = 1; i < len1; i++){
				dp[i][0] = Math.max(dp[i-1][0], ch1[i] == ch2[0] ? 1: 0);
			}
			/*第一行的值*/
			for(int j = 1; j < len1; j++){
				dp[0][j] = Math.max(dp[0][j-1], ch1[0] == ch2[j] ? 1: 0);
			}
			/*其他值*/
			for(int i = 1; i < len1; i++){
				for(int j = 1; j < len2; j++){
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
					if(ch1[i] == ch2[j]){
						dp[i][j] = Math.max(dp[i][j],dp[i-1][j-1] +1);
					}
				}
			}
			System.out.println(len1-dp[len1-1][len2-1]);
		}
}
}
