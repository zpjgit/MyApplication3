package com.zpj.myapplication3;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import java.util.ArrayList;
import java.util.List;

public class ActivityCollector {

    public static List<Activity> activities = new ArrayList<>(); //使用List暂存活动

    public static void addActivty(Activity activity) {      //该方法用于向List中添加活动
        activities.add(activity);
    }

    public static void removeActivity(Activity activity) {  //该方法用于从List中移除活动
        activities.remove(activity);
    }

    public static void finishAll() {  //该方法用于将List中的活动全部销毁掉
        for (Activity activity : activities) {
            if (!activity.isFinishing()) {
                activity.finish();
            }
        }
        activities.clear();
    }
}
