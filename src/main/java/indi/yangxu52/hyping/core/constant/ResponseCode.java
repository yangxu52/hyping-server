package indi.yangxu52.hyping.core.constant;

/**
 * @author yangxu52
 * @Date 2023/11/17
 */
public class ResponseCode {

    /*
     * 操作成功
     */
    public static final Integer SUCCESS = 200;
    /**
     * 系统内部错误
     */
    public static final Integer ERROR = 500;
    /**
     * 未授权
     */
    public static final Integer UNAUTHORIZED = 401;
    /**
     * 访问受限，授权过期
     */
    public static final Integer FORBIDDEN = 403;
}
