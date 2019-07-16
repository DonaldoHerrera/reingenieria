package defpackage;

import android.os.Build.VERSION;
import android.view.ViewGroup;

/* renamed from: xc reason: default package and case insensitive filesystem */
/* compiled from: ViewGroupCompat */
public final class C1838xc {
    public static boolean a(ViewGroup viewGroup) {
        if (VERSION.SDK_INT >= 21) {
            return viewGroup.isTransitionGroup();
        }
        Boolean bool = (Boolean) viewGroup.getTag(C0230Ma.tag_transition_group);
        return ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && C1778vc.r(viewGroup) == null) ? false : true;
    }
}
