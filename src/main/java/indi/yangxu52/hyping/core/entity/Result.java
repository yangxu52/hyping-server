package indi.yangxu52.hyping.core.entity;

import indi.yangxu52.hyping.core.constant.ResponseCode;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * 响应工具类
 *
 * @author yangxu52
 * @Date 2023/11/17
 */
@Data
@Schema(description = "响应实体")
public class Result<T> {
    /**
     * 状态码
     */
    @Schema(description = "状态码")
    private final Integer code;
    /**
     * 消息
     */
    @Schema(description = "消息")
    private final String msg;
    /**
     * 数据
     */
    @Schema(description = "消息")
    private final T data;

    public Result(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <T> Result<T> response(Integer code, String msg, T data) {
        return new Result<>(code, msg, data);
    }

    public static <T> Result<T> success(String msg, T data) {
        return new Result<>(ResponseCode.SUCCESS, msg, data);
    }

    public static <T> Result<T> success(T data) {
        return new Result<>(ResponseCode.SUCCESS, "success", data);
    }

    public static <T> Result<T> success(String msg) {
        return new Result<>(ResponseCode.SUCCESS, msg, null);
    }

    public static <Void> Result<Void> success() {
        return new Result<>(ResponseCode.SUCCESS, "success", null);
    }

    public static <T> Result<T> error(String msg, T data) {
        return new Result<>(ResponseCode.ERROR, msg, data);
    }

    public static <T> Result<T> error(T data) {
        return new Result<>(ResponseCode.ERROR, "success", data);
    }

    public static <T> Result<T> error(String msg) {
        return new Result<>(ResponseCode.ERROR, msg, null);
    }

    public static <Void> Result<Void> error() {
        return new Result<>(ResponseCode.ERROR, "success", null);
    }

}
