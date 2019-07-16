package defpackage;

import android.content.Context;
import androidx.work.i;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ue reason: default package and case insensitive filesystem */
/* compiled from: WorkConstraintsTracker */
public class C1750ue implements a {
    private static final String a = i.a("WorkConstraintsTracker");
    private final C1720te b;
    private final C1840xe<?>[] c;
    private final Object d = new Object();

    public C1750ue(Context context, C1811wf wfVar, C1720te teVar) {
        Context applicationContext = context.getApplicationContext();
        this.b = teVar;
        this.c = new C1840xe[]{new C1780ve(applicationContext, wfVar), new C1810we(applicationContext, wfVar), new Ce(applicationContext, wfVar), new C1870ye(applicationContext, wfVar), new Be(applicationContext, wfVar), new Ae(applicationContext, wfVar), new C1900ze(applicationContext, wfVar)};
    }

    public void a() {
        synchronized (this.d) {
            for (C1840xe<?> a2 : this.c) {
                a2.a();
            }
        }
    }

    public void b(List<String> list) {
        synchronized (this.d) {
            if (this.b != null) {
                this.b.a(list);
            }
        }
    }

    public void c(List<_e> list) {
        synchronized (this.d) {
            for (C1840xe<?> a2 : this.c) {
                a2.a((a) null);
            }
            for (C1840xe<?> a3 : this.c) {
                a3.a(list);
            }
            for (C1840xe<?> a4 : this.c) {
                a4.a((a) this);
            }
        }
    }

    public boolean a(String str) {
        C1840xe<?>[] xeVarArr;
        synchronized (this.d) {
            for (C1840xe<?> xeVar : this.c) {
                if (xeVar.a(str)) {
                    i.a().a(a, String.format("Work %s constrained by %s", new Object[]{str, xeVar.getClass().getSimpleName()}), new Throwable[0]);
                    return false;
                }
            }
            return true;
        }
    }

    public void a(List<String> list) {
        synchronized (this.d) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                if (a(str)) {
                    i.a().a(a, String.format("Constraints met for %s", new Object[]{str}), new Throwable[0]);
                    arrayList.add(str);
                }
            }
            if (this.b != null) {
                this.b.b(arrayList);
            }
        }
    }
}
