package cn.itsite.adialog.dialog;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StyleRes;
import android.widget.TextView;

import cn.itsite.adialog.BaseViewHolder;
import cn.itsite.adialog.R;

/**
 * Author：leguang on 2017/4/12 0009 14:23
 * Email：langmanleguang@qq.com
 * <p>
 * 加载中loading。
 */
public class LoadingDialog extends BaseDialog {
    private TextView tvLoading;

    public LoadingDialog(@NonNull Context context) {
        super(context);
    }

    public LoadingDialog(@NonNull Context context, @StyleRes int themeResId) {
        super(context, themeResId);
    }

    protected LoadingDialog(@NonNull Context context, boolean cancelable, @Nullable OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
    }

    @Override
    public int getLayoutId() {
        return R.layout.loading;
    }

    @Override
    public void convertView(BaseViewHolder holder, BaseDialog dialog) {
        super.convertView(holder, dialog);
        tvLoading = holder.getView(R.id.tv_loading);
    }

    public LoadingDialog setText(String s) {
        if (tvLoading != null) {
            tvLoading.setText(s);
        }
        return this;
    }
}
