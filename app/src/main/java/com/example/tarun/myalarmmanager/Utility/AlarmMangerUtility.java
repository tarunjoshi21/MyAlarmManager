package com.example.tarun.myalarmmanager.Utility;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by tarun on 8/8/16.
 */
public class AlarmMangerUtility {
    private static AlarmMangerUtility alarmMangerUtility;

    private AlarmMangerUtility() {

    }

    public static AlarmMangerUtility getInstance() {
        if (alarmMangerUtility == null) {
            alarmMangerUtility = new AlarmMangerUtility();
        }
        return alarmMangerUtility;
    }

    public String getFormatedTime(Date date, String pattern) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, Locale.US);
        return simpleDateFormat.format(date);
    }
}
