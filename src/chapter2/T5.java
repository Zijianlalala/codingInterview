package chapter2;

import java.util.Arrays;

/**
 * 替换字符串中的空格
 * @author wuzijian
 *
 */
public class T5 {
	public static String replaceSpace(StringBuffer str) {
		//原数组
		char[] s = str.toString().toCharArray();
		int orignalLength = s.length;
		int blankNumber = 0;
		for(int i = 0; i < orignalLength; i++) {
			if(s[i] == ' ')
				blankNumber++;
		}
		int newLength = orignalLength + blankNumber*2;
		char[] newStr = new char[newLength];
		System.arraycopy(s, 0, newStr, 0, orignalLength);
		int j = newLength-1;
		int i = orignalLength-1;
		while(i >= 0 && j > i) {
			if(newStr[i] == ' ') {
				newStr[j--] = '0';
				newStr[j--] = '2';
				newStr[j--] = '%';
			} else {
				newStr[j--] = newStr[i];
			}
			i--;
		}	
		return String.valueOf(newStr).trim();
    }
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer(" ");
		String s = replaceSpace(str);
		System.out.println(s);
	}
}
