package indi.yangxu52.hyping.core.entity;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * 响应数据
 *
 * @author yangxu52
 * @Date 2023/11/17
 */
@Schema(name = "响应Wrapper对象")
public class ResponseBody<T> {
    /**
     * 状态码
     */
    @Schema(description = "状态码")
    private Integer code;
    /**
     * 消息
     */
    @Schema(description = "消息")
    private String msg;
    /**
     * 数据
     */
    @Schema(description = "消息")
    private T data;

    public ResponseBody(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
