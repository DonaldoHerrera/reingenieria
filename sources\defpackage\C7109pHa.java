package defpackage;

import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.soundcloud.android.view.customfontviews.CustomFontButton;

/* renamed from: pHa reason: default package and case insensitive filesystem */
/* compiled from: EditTextUtils.kt */
final class C7109pHa implements OnEditorActionListener {
    final /* synthetic */ CustomFontButton a;
    final /* synthetic */ PXa b;

    C7109pHa(CustomFontButton customFontButton, PXa pXa) {
        this.a = customFontButton;
        this.b = pXa;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        boolean z = true;
        boolean z2 = i == 6;
        boolean z3 = keyEvent != null && keyEvent.getKeyCode() == 66;
        boolean z4 = keyEvent != null && keyEvent.getAction() == 0;
        if (!z3 || !z4) {
            z = false;
        }
        if (this.a.isEnabled() && (z2 || z)) {
            return this.a.performClick();
        }
        if (this.a.isEnabled()) {
            return false;
        }
        if (!z2 && !z) {
            return false;
        }
        PXa pXa = this.b;
        if (pXa == null) {
            return false;
        }
        pXa.d();
        return false;
    }
}
