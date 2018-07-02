package com.javajdk.io;

import java.io.*;

/**
 * Created by xzy on 18/6/28  .
 */

public class javaInputStreamReader {
    private static final String SEPARATOR = File.separator;

    public void testInputStreamReader() throws Exception {


        File file = new File("e:" + SEPARATOR + "io" + SEPARATOR + "test.txt");
        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        // 备注上面这个初始化过程就是多次使用包装来完成的,不推荐这么写,会让新手看不懂。

        //1、获得子节输入流
        FileInputStream fileInputStream = new FileInputStream(file);
        //2、构造转换流(是继承Reader的)
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        //3、 构造缓冲字符流
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);


        //备注1、2两步骤体现出了适配器模式
        //2步骤体现了InputStreamReader类具有将子节输入流转换为字符输入流的功能
        //2、3两步骤体现了装饰模式(wrapper包装模式)

//        io中的适配器模式
//        由于InputStream是字节流不能享受到字符流读取字符那么便捷的功能，因此借助
//        InputStreamReader将其转为Reader子类，因此可以拥有便捷操作文本文件方法。
//        OutputStream同理。

//        io中的装饰(包装)模式
//        将InputStream字节流包装为BufferedReader过程就装饰的过程。一开始
//        InputStream只有read一个字节的方法，包装为Reader之后拥有read一个字符的功
//        能，在包装成BufferedReader之后就拥有read一行字符串功能。OutputStream同理

    }
}

