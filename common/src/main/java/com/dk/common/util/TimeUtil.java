package com.dk.common.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description: TODO
 * @Author dk
 * @Date 2020/5/17 16:51
 **/
public class TimeUtil {

    public static String logNowTime(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return simpleDateFormat.format(new Date());
    }
}
