package com.xzy.composite;


public interface Conponent {

    void operation();

}


interface Leaf extends Conponent{

}

interface  Conposite extends Conponent{

    void add(Conponent c);

    void remove(Conponent c);

    Conponent getChild(int index);
}