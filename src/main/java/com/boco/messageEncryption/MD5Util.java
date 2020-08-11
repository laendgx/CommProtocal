package com.boco.messageEncryption;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Util {

    private static MD5Util singleton = null;

    /**
     * 静态工厂方法
     */
    public static MD5Util getInstance(){
        if (singleton == null){
            singleton = new MD5Util();
        }
        return singleton;
    }
    /**
     * 利用Java自带的MessageDigest类实现的最简单的MD5加密方法
     * @param str
     * @return 返回值为8位字符串
     */
    public String getMD5String(String str) {
        String result ="";
        try {
            // 生成一个MD5加密计算摘要
            MessageDigest md = MessageDigest.getInstance("MD5");
            // 计算md5函数
            md.update(str.getBytes());
            // digest()最后确定返回md5 hash值，返回值为8位字符串。因为md5 hash值是16位的hex值，实际上就是8位的字符
            // BigInteger函数则将8位的字符串转换成16位hex值，用字符串来表示；得到字符串形式的hash值
            //一个byte是八位二进制，也就是2位十六进制字符（2的8次方等于16的2次方）
            result=new BigInteger(1, md.digest()).toString(16);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return result;
    }

    /*
     * 1.一个运用基本类的实例
     * MessageDigest 对象开始被初始化。该对象通过使用 update 方法处理数据。
     * 任何时候都可以调用 reset 方法重置摘要。
     * 一旦所有需要更新的数据都已经被更新了，应该调用 digest 方法之一完成哈希计算。
     * 对于给定数量的更新数据，digest 方法只能被调用一次。
     * 在调用 digest 之后，MessageDigest 对象被重新设置成其初始状态。
     */
    public String encrypByMd5(String context) {
        String result ="";
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(context.getBytes());//update处理
            byte [] encryContext = md.digest();//调用该方法完成计算

            int i;
            StringBuffer buf = new StringBuffer("");
            for (int offset = 0; offset < encryContext.length; offset++) {//做相应的转化（十六进制）
                i = encryContext[offset];
                if (i < 0) i += 256;
                if (i < 16) buf.append("0");
                buf.append(Integer.toHexString(i));
            }
            //System.out.println("32result: " + buf.toString());// 32位的加密
            result=buf.toString().substring(8, 24);// 16位的加密
        } catch (NoSuchAlgorithmException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }
        return result;
    }

    /*
     * 2.使用开发的jar直接应用
     *  使用外部的jar包中的类：import org.apache.commons.codec.digest.DigestUtils;
     *  对上面内容的一个封装使用方便
     */
    public void encrypByMd5Jar(String context) {
//        String md5Str = DigestUtils.md5Hex(context);
//        System.out.println("32result: " + md5Str);
    }

}
