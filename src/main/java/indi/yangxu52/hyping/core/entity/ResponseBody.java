package indi.yangxu52.hyping.core.entity;

/**
 * @author yangxu52
 * @Date 2023/11/17
 */
public class ResponseBody<T> {
    private Integer code;
    private String msg;
    private T data;

    public ResponseBody(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
