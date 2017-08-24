
/*����һ���ַ���s������Դ���ɾ��һЩ�ַ���ʹ��ʣ�µĴ���һ�����Ĵ������ɾ������ʹ�û��Ĵ���أ�
�����Ҫɾ�����ַ�������*/

/*�Ƚϼ򵥵��뷨������ԭ�ַ������䷴������󹫹��Ӵ��ĳ��ȣ�Ȼ����ԭ�ַ����ĳ��ȼ�ȥ
�����󹫹��Ӵ��ĳ��Ⱦ͵õ�����С�༭���ȡ�*/
import java.util.*;
public class ɾ��һЩ�ַ��Թ������ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String str1 = sc.nextLine();
			/*�������ַ����ߵ�*/
			String str2 = new StringBuilder(str1).reverse().toString();
			char[] ch1 = str1.toCharArray();
			char[] ch2 = str2.toCharArray();
			int len1 = ch1.length;
			int len2 = ch2.length;
			int[][] dp = new int[len1][len2];
			dp[0][0] = ch1[0] == ch2[0] ? 1 : 0;
			/*��һ�е�ֵ*/
			for(int i = 1; i < len1; i++){
				dp[i][0] = Math.max(dp[i-1][0], ch1[i] == ch2[0] ? 1: 0);
			}
			/*��һ�е�ֵ*/
			for(int j = 1; j < len1; j++){
				dp[0][j] = Math.max(dp[0][j-1], ch1[0] == ch2[j] ? 1: 0);
			}
			/*����ֵ*/
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
