package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

/* renamed from: os reason: default package and case insensitive filesystem */
final class C1584os extends ConstantState {
    int a;
    int b;

    C1584os(C1584os osVar) {
        if (osVar != null) {
            this.a = osVar.a;
            this.b = osVar.b;
        }
    }

    public final int getChangingConfigurations() {
        return this.a;
    }

    public final Drawable newDrawable() {
        return new C1460ks(this);
    }
}
