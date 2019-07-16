package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.z.b;

public final class PreferenceScreen extends PreferenceGroup {
    private boolean X = true;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C0286Za.a(context, D.preferenceScreenStyle, 16842891));
    }

    /* access modifiers changed from: protected */
    public void U() {
        if (f() == null && e() == null && ea() != 0) {
            b c = x().c();
            if (c != null) {
                c.onNavigateToScreen(this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean fa() {
        return false;
    }

    public boolean ia() {
        return this.X;
    }
}
