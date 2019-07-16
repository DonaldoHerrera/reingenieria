package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.util.TypedValue;
import android.view.View;
import androidx.core.content.a;

/* renamed from: yxa reason: default package and case insensitive filesystem */
/* compiled from: ViewExtensions.kt */
public final class C7782yxa {
    public static /* synthetic */ void a(View view, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = e.snow;
        }
        a(view, i, i2);
    }

    public static final void a(View view, int i, int i2) {
        C7471uYa.b(view, "$this$applyBackgroundWithHitstate");
        if (VERSION.SDK_INT >= 23) {
            a(view, i);
        } else {
            view.setBackground(new RippleDrawable(ColorStateList.valueOf(a.a(view.getContext(), i2)), a.c(view.getContext(), i), null));
        }
    }

    private static final void a(View view, int i) {
        TypedValue typedValue = new TypedValue();
        view.setBackgroundColor(a.a(view.getContext(), i));
        Context context = view.getContext();
        C7471uYa.a((Object) context, "context");
        context.getTheme().resolveAttribute(16843534, typedValue, true);
        view.setForeground(view.getContext().getDrawable(typedValue.resourceId));
    }
}
