package com.soundcloud.android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import com.soundcloud.android.ia.h;

@EVa(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0014B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0006\u0010\u000e\u001a\u00020\fJ\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\fR\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/soundcloud/android/view/CustomFontAuthEditText;", "Landroidx/appcompat/widget/AppCompatEditText;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "isValid", "", "withCheckMarkFeedback", "checkIfValid", "drawCheckMark", "", "showCheckMarkFeedback", "validate", "state", "TextChangeListener", "base_release"}, mv = {1, 1, 15})
/* compiled from: CustomFontAuthEditText.kt */
public final class CustomFontAuthEditText extends AppCompatEditText {
    private boolean c;
    private boolean d;

    /* compiled from: CustomFontAuthEditText.kt */
    public interface a {
        void a();
    }

    public CustomFontAuthEditText(Context context) {
        super(context);
    }

    private final void c() {
        if (this.c) {
            setCompoundDrawablesWithIntrinsicBounds(null, null, getResources().getDrawable(h.ic_checkmark_orange), null);
        } else {
            setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
        }
    }

    public final boolean a() {
        return this.c;
    }

    public final void b() {
        this.d = true;
    }

    public CustomFontAuthEditText(Context context, AttributeSet attributeSet) {
        C7471uYa.b(context, "context");
        C7471uYa.b(attributeSet, "attrs");
        super(context, attributeSet);
        com.soundcloud.android.view.customfontviews.a.a((TextView) this, attributeSet);
    }

    public final void a(boolean z) {
        this.c = z;
        if (this.d) {
            c();
        }
    }

    public CustomFontAuthEditText(Context context, AttributeSet attributeSet, int i) {
        C7471uYa.b(context, "context");
        C7471uYa.b(attributeSet, "attrs");
        super(context, attributeSet, i);
        com.soundcloud.android.view.customfontviews.a.a((TextView) this, attributeSet);
    }
}
