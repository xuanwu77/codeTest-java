/*��һ���ַ����Ĵ�д��ĸ�ŵ��ַ����ĺ��棬�����ַ������λ�ò��䣬�Ҳ����������Ŀռ䡣
*/

import java.util.*;
public class �Ѵ�д��ĸ��λ������ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String str1 = sc.nextLine();
			/*ע�⣺replaceAll������������ʽ��˫���Ű�����*/
			System.out.println(str1.replaceAll("[A-Z]", "") + str1.replaceAll("[a-z]", ""));
		}
	}
}
	
