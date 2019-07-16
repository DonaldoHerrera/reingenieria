package com.soundcloud.android.view.customfontviews;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;

@EVa(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/soundcloud/android/view/customfontviews/CustomFontButton;", "Landroidx/appcompat/widget/AppCompatButton;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "shared-ui_release"}, mv = {1, 1, 15})
/* compiled from: CustomFontButton.kt */
public class CustomFontButton extends AppCompatButton {
    public CustomFontButton(Context context) {
        C7471uYa.b(context, "context");
        super(context);
    }

    public CustomFontButton(Context context, AttributeSet attributeSet) {
        C7471uYa.b(context, "context");
        super(context, attributeSet);
        if (attributeSet != null) {
            a.a((TextView) this, attributeSet);
        }
    }

    public CustomFontButton(Context context, AttributeSet attributeSet, int i) {
        C7471uYa.b(context, "context");
        super(context, attributeSet, i);
        if (attributeSet != null) {
            a.a((TextView) this, attributeSet);
        }
    }
}
