package com.ears.pattern.prototype.deep;

public class DeepCloneTest {
    public static void main(String[] args) {
        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();
        try {
            QiTianDaSheng clone = (QiTianDaSheng) qiTianDaSheng.clone();
            System.out.println("深克隆："+ (qiTianDaSheng.jingGuBang == clone.jingGuBang));



        }catch (Exception e) {
            e.printStackTrace();
        }



        QiTianDaSheng q = new QiTianDaSheng();
        QiTianDaSheng n = q.shallowClone(q);
        System.out.println("浅克隆：" + (q.jingGuBang == n.jingGuBang));


    }
}
