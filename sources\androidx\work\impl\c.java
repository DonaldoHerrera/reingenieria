package androidx.work.impl;

import android.content.Context;
import androidx.work.b;
import androidx.work.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* compiled from: Processor */
public class c implements a {
    private static final String a = i.a("Processor");
    private Context b;
    private b c;
    private C1811wf d;
    private WorkDatabase e;
    private Map<String, p> f = new HashMap();
    private List<d> g;
    private Set<String> h;
    private final List<a> i;
    private final Object j;

    /* compiled from: Processor */
    private static class a implements Runnable {
        private a a;
        private String b;
        private C3347xE<Boolean> c;

        a(a aVar, String str, C3347xE<Boolean> xEVar) {
            this.a = aVar;
            this.b = str;
            this.c = xEVar;
        }

        public void run() {
            boolean z;
            try {
                z = ((Boolean) this.c.get()).booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z = true;
            }
            this.a.a(this.b, z);
        }
    }

    public c(Context context, b bVar, C1811wf wfVar, WorkDatabase workDatabase, List<d> list) {
        this.b = context;
        this.c = bVar;
        this.d = wfVar;
        this.e = workDatabase;
        this.g = list;
        this.h = new HashSet();
        this.i = new ArrayList();
        this.j = new Object();
    }

    public boolean a(String str, androidx.work.WorkerParameters.a aVar) {
        synchronized (this.j) {
            if (this.f.containsKey(str)) {
                i.a().a(a, String.format("Work %s is already enqueued for processing", new Object[]{str}), new Throwable[0]);
                return false;
            }
            androidx.work.impl.p.a aVar2 = new androidx.work.impl.p.a(this.b, this.c, this.d, this.e, str);
            aVar2.a(this.g);
            aVar2.a(aVar);
            p a2 = aVar2.a();
            C3347xE a3 = a2.a();
            a3.a(new a(this, str, a3), this.d.a());
            this.f.put(str, a2);
            this.d.b().execute(a2);
            i.a().a(a, String.format("%s: processing %s", new Object[]{c.class.getSimpleName(), str}), new Throwable[0]);
            return true;
        }
    }

    public boolean b(String str) {
        boolean containsKey;
        synchronized (this.j) {
            containsKey = this.f.containsKey(str);
        }
        return containsKey;
    }

    public boolean c(String str) {
        return a(str, (androidx.work.WorkerParameters.a) null);
    }

    public boolean d(String str) {
        synchronized (this.j) {
            i.a().a(a, String.format("Processor cancelling %s", new Object[]{str}), new Throwable[0]);
            this.h.add(str);
            p pVar = (p) this.f.remove(str);
            if (pVar != null) {
                pVar.a(true);
                i.a().a(a, String.format("WorkerWrapper cancelled for %s", new Object[]{str}), new Throwable[0]);
                return true;
            }
            i.a().a(a, String.format("WorkerWrapper could not be found for %s", new Object[]{str}), new Throwable[0]);
            return false;
        }
    }

    public boolean e(String str) {
        synchronized (this.j) {
            i.a().a(a, String.format("Processor stopping %s", new Object[]{str}), new Throwable[0]);
            p pVar = (p) this.f.remove(str);
            if (pVar != null) {
                pVar.a(false);
                i.a().a(a, String.format("WorkerWrapper stopped for %s", new Object[]{str}), new Throwable[0]);
                return true;
            }
            i.a().a(a, String.format("WorkerWrapper could not be found for %s", new Object[]{str}), new Throwable[0]);
            return false;
        }
    }

    public void b(a aVar) {
        synchronized (this.j) {
            this.i.remove(aVar);
        }
    }

    public boolean a(String str) {
        boolean contains;
        synchronized (this.j) {
            contains = this.h.contains(str);
        }
        return contains;
    }

    public void a(a aVar) {
        synchronized (this.j) {
            this.i.add(aVar);
        }
    }

    public void a(String str, boolean z) {
        synchronized (this.j) {
            this.f.remove(str);
            i.a().a(a, String.format("%s %s executed; reschedule = %s", new Object[]{getClass().getSimpleName(), str, Boolean.valueOf(z)}), new Throwable[0]);
            for (a a2 : this.i) {
                a2.a(str, z);
            }
        }
    }
}
