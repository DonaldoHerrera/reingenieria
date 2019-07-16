package com.soundcloud.android.activities;

import com.soundcloud.android.comments.Y;
import com.soundcloud.android.foundation.events.C3710l;
import com.soundcloud.android.foundation.events.C3710l.a;

/* compiled from: ActivitiesPresenter.kt */
final class n<T, R> implements C7118pQa<T, R> {
    public static final n a = new n();

    n() {
    }

    /* renamed from: a */
    public final C4621nja apply(B b) {
        C7471uYa.b(b, "it");
        if (b.d() != G.TRACK_COMMENT) {
            return C4621nja.c(b.f());
        }
        C3508cda a2 = b.a();
        if (a2 != null) {
            Y y = new Y(a2, 0, null, false, 14, null);
            return C4621nja.b(y, a.a(C3710l.a, Yca.ACTIVITIES, false, 2, (Object) null));
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
