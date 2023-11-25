package indi.yangxu52.hyping.core.util;

import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

/**
 * @author yangxu52
 */
@Slf4j
public class ServletUtil {

    public static void writeString(HttpServletResponse response, String str) {
        try {
            response.setStatus(200);
            response.setContentType("application/json");
            response.setCharacterEncoding("utf-8");
            response.getWriter().print(str);
        } catch (IOException e) {
            log.error(e.getMessage(), e);
        }
    }

    public static void writeString(HttpServletResponse response, Object obj) {
        writeString(response, JsonUtil.toJsonString(obj));
    }
}
