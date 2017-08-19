package ru.highloadcup.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpStatus;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Serializable;

public class HttpUtil {

    public static final String BY_ID = "/{id}";
    public static final String NEW = "/new";
    private static final String UTF8 = "UTF-8";
    private static final String CONTENT_TYPE = "application/json;charset=" + UTF8;
    private static final byte[] EMPTY_BYTES = new byte[0];

    private static final ObjectMapper MAPPER = new ObjectMapper();

    static {
        MAPPER.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    }

    public static void createResponse(HttpStatus httpStatus, HttpServletResponse response) throws IOException {
        response.setContentLength(0);
        response.setStatus(httpStatus.value());
        try (ServletOutputStream outputStream = response.getOutputStream()) {
            outputStream.write(EMPTY_BYTES);
            outputStream.flush();
            outputStream.close();
        }
    }

    public static <T extends Serializable> void createResponse(T object, HttpStatus httpStatus, HttpServletResponse response) throws IOException {
        byte[] bytes = MAPPER.writeValueAsBytes(object);
        response.setContentLength(bytes.length);
        response.setCharacterEncoding(UTF8);
        response.setContentType(CONTENT_TYPE);
        response.setStatus(httpStatus.value());
        try (ServletOutputStream outputStream = response.getOutputStream()) {
            outputStream.write(bytes);
            outputStream.flush();
            outputStream.close();
        }
    }
}
