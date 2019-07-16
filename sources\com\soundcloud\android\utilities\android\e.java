package com.soundcloud.android.utilities.android;

import androidx.constraintlayout.widget.Group;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs;

/* compiled from: ConstraintLayoutExtensions.kt */
public final class e {
    public static final void a(Group group, PXa<RVa> pXa) {
        C7471uYa.b(group, "$this$setOnClickListenerOnMembers");
        C7471uYa.b(pXa, CastExtraArgs.LISTENER);
        int[] referencedIds = group.getReferencedIds();
        C7471uYa.a((Object) referencedIds, "referencedIds");
        for (int findViewById : referencedIds) {
            group.getRootView().findViewById(findViewById).setOnClickListener(new d(group, pXa));
        }
    }
}
