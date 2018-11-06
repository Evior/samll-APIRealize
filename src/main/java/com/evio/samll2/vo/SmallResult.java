package com.evio.samll2.VO;

import java.io.Serializable;

public class SmallResult implements Serializable{

    private String msg;

    private int code;

    private Object object;

    public SmallResult() {
        this.msg="成功";
        this.code=200;
        this.object=null;
    }

    public SmallResult(Object obj){
        this.msg="成功";
        this.code=200;
        this.object=obj;
    }

    public SmallResult(String msg, int code, Object object) {
        this.msg = msg;
        this.code = code;
        this.object = object;
    }

    public static SmallResult ok(){
        return new SmallResult("");
    }

    public static SmallResult ok(Object object){
        return new SmallResult(object);
    }

    public static  SmallResult no(String msg,Object object){
        return new SmallResult(msg,500,object);
    }

    public static  SmallResult no(String msg){
        return new SmallResult(msg,500,null);
    }
}
