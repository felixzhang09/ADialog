package cn.itsite.adialog;

import android.content.Context;
import android.util.DisplayMetrics;

/**
 * Created by leguang on 2017/8/15 0015.
 * Email：langmanleguang@qq.com
 */

public class Utils {
    static int dp2px(Context context, float dipValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dipValue * scale + 0.5f);
    }

    static int getScreenWidth(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return displayMetrics.widthPixels;
    }
}
