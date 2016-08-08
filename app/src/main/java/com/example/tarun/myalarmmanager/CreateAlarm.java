package com.example.tarun.myalarmmanager;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class CreateAlarm extends AppCompatActivity {

    private TextView alarmTimeTV;
    private final static String TIME_PATTERN = "h:mm a";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_alarm);

        setTitle(getString(R.string.set_alarm));

        init();
    }

    /**
     *  Initialize UI components
     */
    private void init() {
        alarmTimeTV = (TextView) findViewById(R.id.alarm_time);

    }

    private void setCurrentTime() {
       /* Calendar calendar = Calendar.getInstance();
        calendar.get(C)*/
    }
}
