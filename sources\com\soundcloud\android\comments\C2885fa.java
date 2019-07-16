package com.soundcloud.android.comments;

import com.soundcloud.android.comments.C2921y.a;
import java.util.List;
import java.util.ListIterator;

/* renamed from: com.soundcloud.android.comments.fa reason: case insensitive filesystem */
/* compiled from: CommentsPresenter.kt */
final class C2885fa<T> implements C6776kQa<T> {
    final /* synthetic */ Da a;

    C2885fa(Da da) {
        this.a = da;
    }

    /* renamed from: a */
    public final void accept(T t) {
        int i;
        boolean z;
        List a2 = t.a();
        ListIterator listIterator = a2.listIterator(a2.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                i = -1;
                break;
            }
            C2921y yVar = (C2921y) listIterator.previous();
            if (!(yVar instanceof a) || ((a) yVar).g() != t.d()) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (z) {
                i = listIterator.nextIndex();
                break;
            }
        }
        if (i > -1) {
            this.a.b(i);
        }
    }
}
