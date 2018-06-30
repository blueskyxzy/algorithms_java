package com.xzy.composite;

/**
 * Created by xzy on 18/6/28  .
 */

public class Client {

    public static void main(String[] args){
        Folder f = new Folder("我的收藏");
        AbstractFile f1 = new ImageFile("大头像.jpg");
        AbstractFile f2 = new TextFile("Hello.txt");
        AbstractFile f3 = new VideoFile("哈利波特.avi");
        f.add(f1);
        f.add(f2);
        f.add(f3);
        f.remove(f2);

        f1.killVirus();
        f.killVirus();
        AbstractFile child = f.getChild(0);
        child.killVirus();

    }
}
