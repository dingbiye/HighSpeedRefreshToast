package com.example.globaltoast;

import android.content.Context;
import android.widget.Toast;

/**
 * 可以高速更新消失的Toast
 *
 * @author 丁碧野
 * @date 2020年5月22日10:04:12
 */
public class HighSpeedRefreshToast {

    private static Toast myToast;

    /**
     * 可以展示Toast
     *
     * @param context 上下文环境
     * @param msg     需要展示的信息
     */
    public static void showToast(Context context, String msg) {

        showToast(context, msg, Toast.LENGTH_SHORT);


    }

    /**
     * 可以设定Toast时间长短的Toast
     *
     * @param context 上下文环境
     * @param msg     展示的信息
     * @param length  时间长短
     */
    public static void showToast(Context context, String msg, int length) {

        if (myToast == null) {
            myToast = Toast.makeText(context, msg, length);
        } else {
            myToast.cancel();
            myToast = null;
            myToast = Toast.makeText(context, msg, length);
        }
        myToast.show();


    }

    /**
     * 消失掉toast
     *
     * @param context 上下文环境
     */
    public static void missToast(Context context) {
        if (myToast != null) {
            myToast.cancel();//仅仅为隐藏，如果不调用下面myToast=null在同一界面使用出现首次点击Toast不能正常弹出的问题
            myToast = null;
        }
    }


}
