package com.soundcloud.android.view.customfontviews;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs;

@EVa(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/soundcloud/android/view/customfontviews/CustomFontEditText;", "Landroidx/appcompat/widget/AppCompatEditText;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "onImeBackListener", "Lcom/soundcloud/android/view/customfontviews/EditTextImeBackListener;", "onKeyPreIme", "", "keyCode", "event", "Landroid/view/KeyEvent;", "setOnEditTextImeBackListener", "", "listener", "shared-ui_release"}, mv = {1, 1, 15})
/* compiled from: CustomFontEditText.kt */
public class CustomFontEditText extends AppCompatEditText {
    private c c;

    public CustomFontEditText(Context context) {
        C7471uYa.b(context, "context");
        super(context);
    }

    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        C7471uYa.b(keyEvent, "event");
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
            c cVar = this.c;
            if (cVar != null) {
                cVar.a();
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public void setOnEditTextImeBackListener(c cVar) {
        C7471uYa.b(cVar, CastExtraArgs.LISTENER);
        this.c = cVar;
    }

    public CustomFontEditText(Context context, AttributeSet attributeSet) {
        C7471uYa.b(context, "context");
        C7471uYa.b(attributeSet, "attrs");
        super(context, attributeSet);
        a.a((TextView) this, attributeSet);
    }

    public CustomFontEditText(Context context, AttributeSet attributeSet, int i) {
        C7471uYa.b(context, "context");
        C7471uYa.b(attributeSet, "attrs");
        super(context, attributeSet, i);
        a.a((TextView) this, attributeSet);
    }
}
