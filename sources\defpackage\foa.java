package defpackage;

import android.view.View;

/* renamed from: foa reason: default package */
/* compiled from: ScrollXHelper */
public class foa extends doa {
    public foa(int i, int i2) {
        super(i, i2);
    }

    public Zna a(View view, float f) {
        return new eoa(view, a(f), (float) a());
    }

    public void b(View view, float f) {
        view.setScrollX((int) f);
    }
}
