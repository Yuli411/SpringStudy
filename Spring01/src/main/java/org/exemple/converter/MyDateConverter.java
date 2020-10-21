package org.exemple.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Auther: Yhurri
 * @Date: 2020/7/7 17:05
 * @Description:
 */
public class MyDateConverter implements Converter<String,Date> {

    private String pattern;

    /**
     * s代表配置文件中的字符串 通过返回值注入给bean
     * @param s
     * @return date
     */

    public Date convert(String s) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Date date = null;
        try {
            date = simpleDateFormat.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }
}
