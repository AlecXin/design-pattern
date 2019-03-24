package com.ears.pattern.prototype.deep;

import java.io.*;
import java.util.Date;

public class QiTianDaSheng extends Monkey implements Cloneable, Serializable {
    public JingGuBang jingGuBang;

    public QiTianDaSheng() {
        this.birthday = new Date();
        this.jingGuBang = new JingGuBang();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this.deepClone();
    }

    public Object deepClone() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(this);

            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);

            QiTianDaSheng qiTianDaShengClone = (QiTianDaSheng) objectInputStream.readObject();
            qiTianDaShengClone.birthday = new Date();
            return  qiTianDaShengClone;


        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public QiTianDaSheng shallowClone(QiTianDaSheng target) {
        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();
        qiTianDaSheng.birthday = target.birthday;
        qiTianDaSheng.height = target.height;
        qiTianDaSheng.weight = target.weight;

        qiTianDaSheng.jingGuBang = target.jingGuBang;

        qiTianDaSheng.birthday = new Date();

        return qiTianDaSheng;
    }
}
