/*���һ��01��������������λ�õ��ַ����ǲ�һ����,���Ǿͽ����01��Ϊ����01��������: "1","10101","0101010"���ǽ���01����
С��������һ��01��s,С�����ҳ�һ����������Ӵ�,��������Ӵ���һ������01����С����Ҫ����æ�������������Ӵ��ĳ����Ƕ��١�

���룺�����ַ���s,s�ĳ���length(1 �� length �� 50),�ַ�����ֻ����'0'��'1'��
�����һ������,��ʾ�������Ҫ����Ӵ����ȡ�

*/

/*ע�⣺��1������0���Ľ����1�� ��11������00���Ľ����1*/

import java.util.*;
public class ����01�� {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            //���жϿ���ֵ�е���Сֵ��Ϊ1
            int maxLen = 1, len = 1;
            for(int i= 1; i < str.length(); i++){
                if(str.charAt(i-1) != str.charAt(i)){
                    len++;
                    if(len > maxLen){
                        maxLen = len;
                    }
                }else{
                    len = 1;
                }
            }
            System.out.println(maxLen);
        }
    }
}
