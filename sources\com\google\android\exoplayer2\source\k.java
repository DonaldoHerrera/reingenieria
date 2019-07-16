package com.google.android.exoplayer2.source;

import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.X;
import com.google.android.exoplayer2.source.r.b;
import com.google.android.exoplayer2.source.s.a;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: BaseMediaSource */
public abstract class k implements r {
    private final ArrayList<b> a = new ArrayList<>(1);
    private final a b = new a();
    private Looper c;
    private X d;
    private Object e;

    /* access modifiers changed from: protected */
    public final void a(X x, Object obj) {
        this.d = x;
        this.e = obj;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(this, x, obj);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a(C1702sq sqVar);

    /* access modifiers changed from: protected */
    public abstract void b();

    /* access modifiers changed from: protected */
    public final a a(r.a aVar) {
        return this.b.a(0, aVar, 0);
    }

    public final void a(Handler handler, s sVar) {
        this.b.a(handler, sVar);
    }

    public final void a(s sVar) {
        this.b.a(sVar);
    }

    public final void a(b bVar, C1702sq sqVar) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.c;
        C1852xq.a(looper == null || looper == myLooper);
        this.a.add(bVar);
        if (this.c == null) {
            this.c = myLooper;
            a(sqVar);
            return;
        }
        X x = this.d;
        if (x != null) {
            bVar.a(this, x, this.e);
        }
    }

    public final void a(b bVar) {
        this.a.remove(bVar);
        if (this.a.isEmpty()) {
            this.c = null;
            this.d = null;
            this.e = null;
            b();
        }
    }
}
