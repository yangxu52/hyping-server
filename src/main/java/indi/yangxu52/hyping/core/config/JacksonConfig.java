package indi.yangxu52.hyping.core.config;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalTimeSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Jackson配置
 *
 * @author yangxu52
 * @Date 2023/11/25
 */
@Configuration
public class JacksonConfig {

    @Bean
    public ObjectMapper objectMapper() {

        JavaTimeModule timeModule = new JavaTimeModule();
        // LocalTime
        LocalTimeDeserializer localTimeDeserializer = new LocalTimeDeserializer(DateTimeFormatter.ofPattern("HH:mm:ss"));
        LocalTimeSerializer localTimeSerializer = new LocalTimeSerializer(DateTimeFormatter.ofPattern("HH:mm:ss"));
        timeModule.addDeserializer(LocalTime.class, localTimeDeserializer);
        timeModule.addSerializer(LocalTime.class, localTimeSerializer);
        // LocalDate
        LocalDateDeserializer localDateDeserializer = new LocalDateDeserializer(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDateSerializer localDateSerializer = new LocalDateSerializer(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        timeModule.addDeserializer(LocalDate.class, localDateDeserializer);
        timeModule.addSerializer(LocalDate.class, localDateSerializer);
        // LocalDateTime
        LocalDateTimeDeserializer localDateTimeDeserializer = new LocalDateTimeDeserializer(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        LocalDateTimeSerializer localDateTimeSerializer = new LocalDateTimeSerializer(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        timeModule.addDeserializer(LocalDateTime.class, localDateTimeDeserializer);
        timeModule.addSerializer(LocalDateTime.class, localDateTimeSerializer);

        return Jackson2ObjectMapperBuilder.json().modules(timeModule)
                                          .featuresToDisable(SerializationFeature.FAIL_ON_EMPTY_BEANS)
                                          .featuresToDisable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
                                          .featuresToDisable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS).build();
    }
}
