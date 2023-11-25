package indi.yangxu52.hyping.core.entity;

/**
 * 响应数据
 *
 * @author yangxu52
 * @Date 2023/11/17
 */
public class ResponseBody<T> {
    /**
     * 响应码
     */
    private Integer code;
    /**
     * 消息
     */
    private String msg;
    /**
     * 数据
     */
    private T data;

    public ResponseBody(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
