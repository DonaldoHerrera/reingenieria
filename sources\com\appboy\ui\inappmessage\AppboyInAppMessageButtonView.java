package com.appboy.ui.inappmessage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.Button;
import com.appboy.ui.R$styleable;

@SuppressLint({"AppCompatCustomView"})
public class AppboyInAppMessageButtonView extends Button {
    private static final String TAG = Hg.a(AppboyInAppMessageButtonView.class);

    public AppboyInAppMessageButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        try {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.com_appboy_ui_inappmessage_AppboyInAppMessageButtonView);
            for (int i = 0; i < obtainStyledAttributes.getIndexCount(); i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R$styleable.com_appboy_ui_inappmessage_AppboyInAppMessageButtonView_appboyInAppMessageCustomFontFile) {
                    String string = obtainStyledAttributes.getString(index);
                    try {
                        setTypeface(Typeface.createFromAsset(context.getAssets(), string));
                    } catch (Exception e) {
                        String str = TAG;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Error loading custom typeface from: ");
                        sb.append(string);
                        Hg.d(str, sb.toString(), e);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        } catch (Exception e2) {
            Hg.d(TAG, "Error while checking for custom typeface.", e2);
        }
    }
}
