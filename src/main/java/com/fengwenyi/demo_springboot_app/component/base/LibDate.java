package com.fengwenyi.demo_springboot_app.component.base;

import org.apache.commons.lang3.time.DateUtils;

import java.text.ParseException;
import java.util.Date;

/**
 * 基础组件，时间库
 * @author Erwin Feng
 * @since 2019/8/29 17:35
 */
public class LibDate extends DateUtils {

    private static String[] parsePatterns = {
            "yyyy-MM-dd"
            , "yyyy-MM-dd HH:mm:ss"
            , "yyyy-MM-dd HH:mm"
            , "yyyy/MM/dd"
            , "yyyy/MM/dd HH:mm:ss"
            , "yyyy/MM/dd HH:mm"
    };

    /**
     * 日期型字符串转化为日期 格式
     * { "yyyy-MM-dd", "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm",
     * "yyyy/MM/dd", "yyyy/MM/dd HH:mm:ss", "yyyy/MM/dd HH:mm" }
     */
    public static Date parseDate(Object str) {
        if (str == null) {
            return null;
        }
        try {
            return parseDate(str.toString(), parsePatterns);
        } catch (ParseException e) {
            return null;
        }
    }

}
