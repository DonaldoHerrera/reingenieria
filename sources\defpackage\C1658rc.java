package defpackage;

import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.WindowInsets;

/* renamed from: rc reason: default package and case insensitive filesystem */
/* compiled from: ViewCompat */
class C1658rc implements OnApplyWindowInsetsListener {
    final /* synthetic */ C1506mc a;

    C1658rc(C1506mc mcVar) {
        this.a = mcVar;
    }

    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        return (WindowInsets) Ic.a(this.a.a(view, Ic.a((Object) windowInsets)));
    }
}
