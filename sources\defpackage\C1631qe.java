package defpackage;

import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextUtils;
import androidx.work.i;
import androidx.work.impl.a;
import androidx.work.impl.d;
import androidx.work.impl.m;
import androidx.work.q;
import java.util.ArrayList;
import java.util.List;

/* renamed from: qe reason: default package and case insensitive filesystem */
/* compiled from: GreedyScheduler */
public class C1631qe implements d, C1720te, a {
    private static final String a = i.a("GreedyScheduler");
    private m b;
    private C1750ue c;
    private List<_e> d = new ArrayList();
    private boolean e;
    private final Object f;

    public C1631qe(Context context, C1811wf wfVar, m mVar) {
        this.b = mVar;
        this.c = new C1750ue(context, wfVar, this);
        this.f = new Object();
    }

    public void a(_e... _eVarArr) {
        a();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (_e _eVar : _eVarArr) {
            if (_eVar.d == q.a.ENQUEUED && !_eVar.d() && _eVar.i == 0 && !_eVar.c()) {
                if (!_eVar.b()) {
                    i.a().a(a, String.format("Starting work for %s", new Object[]{_eVar.c}), new Throwable[0]);
                    this.b.d(_eVar.c);
                } else if (VERSION.SDK_INT < 24 || !_eVar.l.e()) {
                    arrayList.add(_eVar);
                    arrayList2.add(_eVar.c);
                }
            }
        }
        synchronized (this.f) {
            if (!arrayList.isEmpty()) {
                i.a().a(a, String.format("Starting tracking for [%s]", new Object[]{TextUtils.join(",", arrayList2)}), new Throwable[0]);
                this.d.addAll(arrayList);
                this.c.c(this.d);
            }
        }
    }

    public void b(List<String> list) {
        for (String str : list) {
            i.a().a(a, String.format("Constraints met: Scheduling work ID %s", new Object[]{str}), new Throwable[0]);
            this.b.d(str);
        }
    }

    private void b(String str) {
        synchronized (this.f) {
            int size = this.d.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                } else if (((_e) this.d.get(i)).c.equals(str)) {
                    i.a().a(a, String.format("Stopping tracking for %s", new Object[]{str}), new Throwable[0]);
                    this.d.remove(i);
                    this.c.c(this.d);
                    break;
                } else {
                    i++;
                }
            }
        }
    }

    public void a(String str) {
        a();
        i.a().a(a, String.format("Cancelling work ID %s", new Object[]{str}), new Throwable[0]);
        this.b.e(str);
    }

    public void a(List<String> list) {
        for (String str : list) {
            i.a().a(a, String.format("Constraints not met: Cancelling work ID %s", new Object[]{str}), new Throwable[0]);
            this.b.e(str);
        }
    }

    public void a(String str, boolean z) {
        b(str);
    }

    private void a() {
        if (!this.e) {
            this.b.e().a((a) this);
            this.e = true;
        }
    }
}
