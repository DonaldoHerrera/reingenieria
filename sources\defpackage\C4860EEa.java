package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: EEa reason: default package and case insensitive filesystem */
/* compiled from: EmptyAdapter.kt */
public final class C4860EEa {
    public static final void a(ViewGroup viewGroup, View view) {
        C7471uYa.b(viewGroup, "$this$setAsOnlyChild");
        C7471uYa.b(view, "view");
        if (viewGroup.getChildCount() != 1 || (!C7471uYa.a((Object) viewGroup.getChildAt(0), (Object) view))) {
            a(view);
            viewGroup.removeAllViews();
            viewGroup.addView(view);
        }
    }

    public static final void a(View view) {
        C7471uYa.b(view, "$this$removeFromParent");
        if (view.getParent() instanceof ViewGroup) {
            ViewParent parent = view.getParent();
            C7471uYa.a((Object) parent, "parent");
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Input ");
            sb.append(parent);
            sb.append(" not of type ");
            sb.append(ViewGroup.class.getSimpleName());
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
