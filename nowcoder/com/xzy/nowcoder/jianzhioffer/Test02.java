package com.xzy.nowcoder.jianzhioffer;
// created by xzy on 2019-05-06

/*        请实现一个函数，将一个字符串中的每个空格替换成“%20”。

        例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */

// 替换空格
public class Test02 {

    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("We Are Happy");
        String s = replaceSpace(str);
        System.out.println(s);
    }

    public static String replaceSpace(StringBuffer str) {
        String s = str.toString();
        String result = s.replaceAll(" ", "%20");
        return result;

/*
    // 不用replaceAll方法
        if(str==null){
            return null;
        }
        StringBuilder newStr = new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                newStr.append('%');
                newStr.append('2');
                newStr.append('0');
            }else{
                newStr.append(str.charAt(i));
            }
        }
        return newStr.toString();*/
    }

}
