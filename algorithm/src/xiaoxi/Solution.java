package xiaoxi;

import java.util.*;

public class Solution {
    public String replaceSpace(String str) {
        String str1 = str.toString();
        if (str1.equals(""))
            return str1;
        char[] strArray = str1.toCharArray();
        int i = 0;
        int lengthSpace = 0;
        while (i < strArray.length) {
            if (strArray[i] == ' ')
                lengthSpace++;// 计算空格数目
            i++;
        }
        int newStrLength = strArray.length + lengthSpace * 2;//计算替换后的字符串长度
        char[] newStr = new char[newStrLength];
        int j = newStrLength - 1;
        i = strArray.length - 1;
        while (i >= 0) {
            if (strArray[i] != ' ') //如果没碰见空格，直接复制，并向前移动
            {
                newStr[j--] = strArray[i--];
            } else {                //如果碰见空格了，新字符串前加三个字符%20
                newStr[j--] = '0';//然后新字符串往前移动3格，老字符串移动一格。
                newStr[j--] = '2';
                newStr[j--] = '%';
                i--;
            }
        }
        return new String(newStr);
    }
}