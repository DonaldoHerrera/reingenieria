package com.soundcloud.android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.soundcloud.android.view.customfontviews.CustomFontButton;

@EVa(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0015B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"Lcom/soundcloud/android/view/CustomFontAuthButton;", "Lcom/soundcloud/android/view/customfontviews/CustomFontButton;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "disabledClickListener", "Lcom/soundcloud/android/view/CustomFontAuthButton$DisabledClickListener;", "getDisabledClickListener", "()Lcom/soundcloud/android/view/CustomFontAuthButton$DisabledClickListener;", "setDisabledClickListener", "(Lcom/soundcloud/android/view/CustomFontAuthButton$DisabledClickListener;)V", "onTouchEvent", "", "event", "Landroid/view/MotionEvent;", "DisabledClickListener", "base_release"}, mv = {1, 1, 15})
/* compiled from: CustomFontAuthButton.kt */
public final class CustomFontAuthButton extends CustomFontButton {
    private a c;

    /* compiled from: CustomFontAuthButton.kt */
    public interface a {
        void b();
    }

    public CustomFontAuthButton(Context context) {
        C7471uYa.b(context, "context");
        super(context);
    }

    public final a getDisabledClickListener() {
        return this.c;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        Integer valueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
        if (valueOf != null && valueOf.intValue() == 0 && !isEnabled()) {
            a aVar = this.c;
            if (aVar != null) {
                aVar.b();
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setDisabledClickListener(a aVar) {
        this.c = aVar;
    }

    public CustomFontAuthButton(Context context, AttributeSet attributeSet) {
        C7471uYa.b(context, "context");
        C7471uYa.b(attributeSet, "attrs");
        super(context, attributeSet);
    }

    public CustomFontAuthButton(Context context, AttributeSet attributeSet, int i) {
        C7471uYa.b(context, "context");
        C7471uYa.b(attributeSet, "attrs");
        super(context, attributeSet, i);
    }
}
