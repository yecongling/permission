package com.ycl.soft.utils.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author wonderland 
 */
public class DateUtils {

    /**
     * 日期转换成字符串
     * @param date 日期
     * @param pattern 格式
     * @return
     */
    public static String date2String(Date date, String pattern) {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        String format = sdf.format(date);
        return format;
    }

    /**
     * 字符串转换成日期
     * @param str 字符串
     * @param pattern 格式
     * @return /
     * @throws ParseException 格式化异常
     */
    public static Date string2Date(String str, String pattern) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        Date parse = sdf.parse(str);
        return parse;
    }
}
