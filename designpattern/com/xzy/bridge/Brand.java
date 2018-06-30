package com.xzy.bridge;


public interface Brand {
    void sale();
}

class Intel implements Brand{

    @Override
    public void sale() {
        System.out.println("联想");
    }
}

class Dell implements Brand{

    @Override
    public void sale() {
        System.out.println("戴尔");
    }
}
