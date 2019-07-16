package androidx.work.impl.utils;

import androidx.work.impl.m;
import androidx.work.q;
import java.util.List;

/* compiled from: StatusRunnable */
class j extends k<List<q>> {
    final /* synthetic */ m b;
    final /* synthetic */ String c;

    j(m mVar, String str) {
        this.b = mVar;
        this.c = str;
    }

    /* access modifiers changed from: 0000 */
    public List<q> b() {
        return (List) _e.b.apply(this.b.g().t().h(this.c));
    }
}
