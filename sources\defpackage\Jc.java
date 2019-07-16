package defpackage;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: Jc reason: default package */
/* compiled from: AccessibilityClickableSpanCompat */
public final class Jc extends ClickableSpan {
    private final int a;
    private final Mc b;
    private final int c;

    public Jc(int i, Mc mc, int i2) {
        this.a = i;
        this.b = mc;
        this.c = i2;
    }

    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.a);
        this.b.a(this.c, bundle);
    }
}
