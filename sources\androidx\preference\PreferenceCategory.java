package androidx.preference;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;

public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public boolean N() {
        return false;
    }

    public void a(C c) {
        super.a(c);
        if (VERSION.SDK_INT >= 28) {
            c.itemView.setAccessibilityHeading(true);
        }
    }

    public boolean aa() {
        return !super.N();
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0286Za.a(context, D.preferenceCategoryStyle, 16842892));
    }

    public PreferenceCategory(Context context) {
        this(context, null);
    }

    public void a(Mc mc) {
        super.a(mc);
        if (VERSION.SDK_INT < 28) {
            c e = mc.e();
            if (e != null) {
                mc.b((Object) c.a(e.c(), e.d(), e.a(), e.b(), true, e.e()));
            }
        }
    }
}
