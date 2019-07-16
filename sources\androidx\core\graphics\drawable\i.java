package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;

/* compiled from: WrappedDrawableState */
final class i extends ConstantState {
    int a;
    ConstantState b;
    ColorStateList c = null;
    Mode d = g.a;

    i(i iVar) {
        if (iVar != null) {
            this.a = iVar.a;
            this.b = iVar.b;
            this.c = iVar.c;
            this.d = iVar.d;
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean a() {
        return this.b != null;
    }

    public int getChangingConfigurations() {
        int i = this.a;
        ConstantState constantState = this.b;
        return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    public Drawable newDrawable() {
        return newDrawable(null);
    }

    public Drawable newDrawable(Resources resources) {
        if (VERSION.SDK_INT >= 21) {
            return new h(this, resources);
        }
        return new g(this, resources);
    }
}
