package indi.yangxu52.hyping.core.util;

import indi.yangxu52.hyping.core.constant.ResponseCode;
import indi.yangxu52.hyping.core.entity.ResponseBody;

/**
 * 想用工具类
 *
 * @author yangxu52
 * @Date 2023/11/17
 */
public class Re {

    public static <T> ResponseBody<T> response(Integer code, String msg, T data) {
        return new ResponseBody<>(code, msg, data);
    }

    public static <T> ResponseBody<T> success(String msg, T data) {
        return response(ResponseCode.SUCCESS, msg, data);
    }

    public static <T> ResponseBody<T> success(T data) {
        return response(ResponseCode.SUCCESS, "success", data);
    }

    public static <T> ResponseBody<T> success(String msg) {
        return response(ResponseCode.SUCCESS, msg, null);
    }

    public static <Void> ResponseBody<Void> success() {
        return response(ResponseCode.SUCCESS, "success", null);
    }

    public static <T> ResponseBody<T> error(String msg, T data) {
        return response(ResponseCode.ERROR, msg, data);
    }

    public static <T> ResponseBody<T> error(T data) {
        return response(ResponseCode.ERROR, "success", data);
    }

    public static <T> ResponseBody<T> error(String msg) {
        return response(ResponseCode.ERROR, msg, null);
    }

    public static <Void> ResponseBody<Void> error() {
        return response(ResponseCode.ERROR, "success", null);
    }

}
