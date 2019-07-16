package defpackage;

import android.graphics.Typeface;
import android.text.TextPaint;

/* renamed from: Vz reason: default package */
/* compiled from: TextAppearance */
class Vz extends a {
    final /* synthetic */ TextPaint a;
    final /* synthetic */ a b;
    final /* synthetic */ Wz c;

    Vz(Wz wz, TextPaint textPaint, a aVar) {
        this.c = wz;
        this.a = textPaint;
        this.b = aVar;
    }

    public void a(Typeface typeface) {
        Wz wz = this.c;
        wz.o = Typeface.create(typeface, wz.e);
        this.c.a(this.a, typeface);
        this.c.n = true;
        this.b.a(typeface);
    }

    public void a(int i) {
        this.c.a();
        this.c.n = true;
        this.b.a(i);
    }
}
