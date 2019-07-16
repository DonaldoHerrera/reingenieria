package com.soundcloud.android.ui.visualplayer;

import com.google.common.base.Predicate;
import com.soundcloud.android.foundation.playqueue.q;

/* compiled from: VisualPlayerPresenter.kt */
final class r<T> implements Predicate<q> {
    public static final r a = new r();

    r() {
    }

    /* renamed from: a */
    public final boolean apply(q qVar) {
        return qVar != null && (qVar.j() || qVar.e());
    }
}
