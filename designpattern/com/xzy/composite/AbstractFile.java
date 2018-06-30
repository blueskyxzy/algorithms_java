package com.xzy.composite;

import java.util.ArrayList;
import java.util.List;

public interface AbstractFile {
    void killVirus();
}

class ImageFile implements AbstractFile{

    public ImageFile(String name) {
        this.name = name;
    }

    private String name;

    @Override
    public void killVirus() {
        System.out.println("图像文件" + name + "查杀");
    }
}

class TextFile implements AbstractFile{

    public TextFile(String name) {
        this.name = name;
    }

    private String name;

    @Override
    public void killVirus() {
        System.out.println("文本文件" + name + "查杀");
    }
}

class VideoFile implements AbstractFile{

    private String name;

    public VideoFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("视频文件" + name + "查杀");
    }
}

class Folder implements AbstractFile{

    public Folder(String name) {
        this.name = name;
    }

    private String name;

    private List<AbstractFile> abstractFileList = new ArrayList<>();

    @Override
    public void killVirus() {
        System.out.println("文件夹" + name + "查杀");
        if (!abstractFileList.isEmpty()){
            for(AbstractFile af:abstractFileList){
                af.killVirus();
            }
        }

    }

    void add(AbstractFile af){
        abstractFileList.add(af);
    }

    void remove(AbstractFile af){
        abstractFileList.remove(af);
    }

    AbstractFile getChild(int index){
        AbstractFile abstractFile = abstractFileList.get(index);
        return abstractFile;
    }
}