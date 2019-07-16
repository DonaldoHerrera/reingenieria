package com.appboy.ui.inappmessage.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PorterDuff.Mode;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.appboy.ui.R$color;
import com.appboy.ui.inappmessage.AppboyInAppMessageManager;
import com.appboy.ui.support.ViewUtils;
import java.util.List;

public class InAppMessageViewUtils {
    private static final String TAG = Hg.a(InAppMessageViewUtils.class);

    public static void closeInAppMessageOnKeycodeBack() {
        Hg.a(TAG, "Back button intercepted by in-app message view, closing in-app message.");
        AppboyInAppMessageManager.getInstance().hideCurrentlyDisplayingInAppMessage(true);
    }

    public static boolean isValidIcon(String str) {
        return str != null;
    }

    public static boolean isValidInAppMessageColor(int i) {
        return i != 0;
    }

    protected static void resetButtonSizesIfNecessary(List<View> list, List<C1541ng> list2) {
        if (list2 != null && list2.size() == 1) {
            ((View) list.get(0)).setLayoutParams(new LayoutParams(0, -2, 1.0f));
        }
    }

    protected static void resetMessageMarginsIfNecessary(TextView textView, TextView textView2) {
        if (textView2 == null && textView != null) {
            LayoutParams layoutParams = new LayoutParams(textView.getLayoutParams().width, textView.getLayoutParams().height);
            layoutParams.setMargins(0, 0, 0, 0);
            textView.setLayoutParams(layoutParams);
        }
    }

    public static void setButtons(List<View> list, View view, int i, List<C1541ng> list2) {
        if (list2 == null || list2.size() == 0) {
            ViewUtils.removeViewFromParent(view);
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (list2.size() <= i2) {
                ((View) list.get(i2)).setVisibility(8);
            } else if (list.get(i2) instanceof Button) {
                Button button = (Button) list.get(i2);
                C1541ng ngVar = (C1541ng) list2.get(i2);
                button.setText(ngVar.j());
                setTextViewColor(button, ngVar.k());
                setDrawableColor(button.getBackground(), ngVar.getBackgroundColor(), i);
            }
        }
    }

    public static void setDrawableColor(Drawable drawable, int i, int i2) {
        if (drawable instanceof GradientDrawable) {
            setDrawableColor((GradientDrawable) drawable, i, i2);
        } else if (isValidInAppMessageColor(i)) {
            drawable.setColorFilter(i, Mode.MULTIPLY);
        } else {
            drawable.setColorFilter(i2, Mode.MULTIPLY);
        }
    }

    public static void setFrameColor(View view, Integer num) {
        if (num != null) {
            view.setBackgroundColor(num.intValue());
        }
    }

    public static void setIcon(Context context, String str, int i, int i2, TextView textView) {
        if (isValidIcon(str)) {
            try {
                textView.setTypeface(Typeface.createFromAsset(context.getAssets(), "fontawesome-webfont.ttf"));
                textView.setText(str);
                setTextViewColor(textView, i);
                if (textView.getBackground() != null) {
                    setDrawableColor(textView.getBackground(), i2, context.getResources().getColor(R$color.com_appboy_inappmessage_icon_background));
                } else {
                    setViewBackgroundColor(textView, i2);
                }
            } catch (Exception e) {
                Hg.b(TAG, "Caught exception setting icon typeface. Not rendering icon.", e);
            }
        }
    }

    public static void setImage(Bitmap bitmap, ImageView imageView) {
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        }
    }

    public static void setTextAlignment(TextView textView, Wf wf) {
        if (wf.equals(Wf.START)) {
            textView.setGravity(8388611);
        } else if (wf.equals(Wf.END)) {
            textView.setGravity(8388613);
        } else if (wf.equals(Wf.CENTER)) {
            textView.setGravity(17);
        }
    }

    public static void setTextViewColor(TextView textView, int i) {
        if (isValidInAppMessageColor(i)) {
            textView.setTextColor(i);
        }
    }

    public static void setViewBackgroundColor(View view, int i) {
        if (isValidInAppMessageColor(i)) {
            view.setBackgroundColor(i);
        }
    }

    public static void setViewBackgroundColorFilter(View view, int i, int i2) {
        if (isValidInAppMessageColor(i)) {
            view.getBackground().setColorFilter(i, Mode.MULTIPLY);
        } else {
            view.getBackground().setColorFilter(i2, Mode.MULTIPLY);
        }
    }

    public static void setDrawableColor(GradientDrawable gradientDrawable, int i, int i2) {
        if (isValidInAppMessageColor(i)) {
            gradientDrawable.setColor(i);
        } else {
            gradientDrawable.setColor(i2);
        }
    }
}
