package com.xzy.decorator;

/**
 * Created by xzy on 18/6/28  .
 */
/*一个更易理解的实例：
装饰模式为已有类动态附加额外的功能就像LOL、王者荣耀等类Dota游戏中，英雄升级一样
每次英雄升级都会附加一个额外技能点学习技能。
具体的英雄就是ConcreteComponent，技能栏就是装饰器Decorator，每个技能就是ConcreteDecorator；*/
//客户端：召唤师
public class Player {
    public static void main(String[] args) {
        //选择英雄
        Hero hero = new BlindMonk("李青");

        Skills skills = new Skills(hero);
        Skills r = new Skill_R(skills,"猛龙摆尾");
        Skills e = new Skill_E(r,"天雷破/摧筋断骨");
        Skills w = new Skill_W(e,"金钟罩/铁布衫");
        Skills q = new Skill_Q(w,"天音波/回音击");
        //学习技能
        q.learnSkills();
    }
}
