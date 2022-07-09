package com.dxh.hotfixdemo.util;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by XHD on 2022/07/09
 */
public class BugClass {
    static String str1 = "bug已修复，优秀！";    //修复后的代码
    static String str2 = "一个完美的bug";        //默认是带有bug的
    static String str3 = "bug已修复，优秀！3333";        //默认是带有bug的

    public static String Bug(Context context){
        Toast.makeText(context,str2,Toast.LENGTH_SHORT).show();
        return str2;
    }

}
