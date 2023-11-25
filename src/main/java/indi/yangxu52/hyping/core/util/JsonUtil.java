package indi.yangxu52.hyping.core.util;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.List;

/**
 * JSON工具类
 *
 * @author yangxu52
 */
public class JsonUtil {

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    static {
        // 允许pojo中有在json串中不存在的字段
        OBJECT_MAPPER.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        // 允许有注释
        OBJECT_MAPPER.configure(JsonParser.Feature.ALLOW_COMMENTS, true);
    }

    public static <T> T parseObject(InputStream inputStream, Class<T> tClass) {
        Reader reader = new InputStreamReader(inputStream);
        try {
            return OBJECT_MAPPER.readValue(reader, tClass);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> T parseObject(String json, Class<T> tClass) {
        try {
            return OBJECT_MAPPER.readValue(json, tClass);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String toJsonString(Object object) {
        try {
            return OBJECT_MAPPER.writeValueAsString(object);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> List<T> parseList(String json, Class<T> tClass) {
        JavaType javaType = OBJECT_MAPPER.getTypeFactory().constructParametricType(List.class, tClass);
        try {
            return OBJECT_MAPPER.readValue(json, javaType);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * @param outClass 外层对象
     * @param inClass  泛型
     */
    public static <T> T parseObject(String json, Class<T> outClass, Class<?> inClass) {
        JavaType javaType = OBJECT_MAPPER.getTypeFactory().constructParametricType(outClass, inClass);
        try {
            return OBJECT_MAPPER.readValue(json, javaType);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}