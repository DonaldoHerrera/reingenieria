package androidx.work.impl.utils;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.b;
import androidx.work.impl.d;
import androidx.work.impl.e;
import androidx.work.m;
import androidx.work.m.a.C0028a;
import androidx.work.q.a;
import java.util.LinkedList;

/* compiled from: CancelWorkRunnable */
public abstract class c implements Runnable {
    private final b a = new b();

    public m a() {
        return this.a;
    }

    /* access modifiers changed from: 0000 */
    public abstract void b();

    public void run() {
        try {
            b();
            this.a.a(m.a);
        } catch (Throwable th) {
            this.a.a(new C0028a(th));
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(androidx.work.impl.m mVar, String str) {
        a(mVar.g(), str);
        mVar.e().d(str);
        for (d a2 : mVar.f()) {
            a2.a(str);
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(androidx.work.impl.m mVar) {
        e.a(mVar.c(), mVar.g(), mVar.f());
    }

    private void a(WorkDatabase workDatabase, String str) {
        C0305af t = workDatabase.t();
        Ne n = workDatabase.n();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            a b = t.b(str2);
            if (!(b == a.SUCCEEDED || b == a.FAILED)) {
                t.a(a.CANCELLED, str2);
            }
            linkedList.addAll(n.a(str2));
        }
    }

    public static c a(String str, androidx.work.impl.m mVar) {
        return new a(mVar, str);
    }

    public static c a(String str, androidx.work.impl.m mVar, boolean z) {
        return new b(mVar, str, z);
    }
}
