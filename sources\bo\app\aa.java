package bo.app;

import android.app.Activity;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

public final class aa implements ab {
    private static final String a = Hg.a(aa.class);
    private final ConcurrentMap<Activity, ConcurrentMap<Class, CopyOnWriteArraySet<Yf>>> b = new ConcurrentHashMap();
    private final ConcurrentMap<Class, CopyOnWriteArraySet<Yf>> c = new ConcurrentHashMap();
    private final ConcurrentMap<Class, CopyOnWriteArraySet<Yf>> d = new ConcurrentHashMap();
    private final Executor e;
    private final Object f = new Object();
    private final Object g = new Object();
    private final Object h = new Object();

    public aa(Executor executor) {
        this.e = executor;
    }

    public <T> boolean b(Yf<T> yf, Class<T> cls) {
        boolean a2;
        synchronized (this.g) {
            a2 = a((CopyOnWriteArraySet) this.c.get(cls), yf);
        }
        return a2;
    }

    public <T> boolean a(Yf<T> yf, Class<T> cls) {
        boolean a2;
        synchronized (this.g) {
            a2 = a(yf, cls, this.c);
        }
        return a2;
    }

    private <T> boolean a(Yf<T> yf, Class<T> cls, ConcurrentMap<Class, CopyOnWriteArraySet<Yf>> concurrentMap) {
        if (yf == null) {
            String name = cls == null ? "null eventClass" : cls.getName();
            String str = a;
            StringBuilder sb = new StringBuilder();
            sb.append("Error: Attempted to add a null subscriber for eventClass ");
            sb.append(name);
            sb.append(". This subscriber is being ignored. Please check your calling code to ensure that all potential subscriptions are valid.");
            Hg.b(str, sb.toString());
            return false;
        }
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) concurrentMap.get(cls);
        if (copyOnWriteArraySet == null) {
            copyOnWriteArraySet = new CopyOnWriteArraySet();
            CopyOnWriteArraySet copyOnWriteArraySet2 = (CopyOnWriteArraySet) concurrentMap.putIfAbsent(cls, copyOnWriteArraySet);
            if (copyOnWriteArraySet2 != null) {
                copyOnWriteArraySet = copyOnWriteArraySet2;
            }
        }
        return copyOnWriteArraySet.add(yf);
    }

    private <T> boolean a(CopyOnWriteArraySet<Yf> copyOnWriteArraySet, Yf<T> yf) {
        return (copyOnWriteArraySet == null || yf == null || !copyOnWriteArraySet.remove(yf)) ? false : true;
    }

    public <T> void a(final T t, final Class<T> cls) {
        String str = a;
        StringBuilder sb = new StringBuilder();
        sb.append(cls.getName());
        sb.append(" fired: ");
        sb.append(t.toString());
        Hg.a(str, sb.toString());
        boolean z = false;
        for (Entry entry : this.b.entrySet()) {
            final CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) ((ConcurrentMap) entry.getValue()).get(cls);
            if (copyOnWriteArraySet != null && !copyOnWriteArraySet.isEmpty()) {
                ((Activity) entry.getKey()).runOnUiThread(new Runnable() {
                    public void run() {
                        aa aaVar = aa.this;
                        Class cls = cls;
                        CopyOnWriteArraySet copyOnWriteArraySet = copyOnWriteArraySet;
                        aaVar.a(cls, copyOnWriteArraySet);
                        Iterator it = copyOnWriteArraySet.iterator();
                        while (it.hasNext()) {
                            ((Yf) it.next()).trigger(t);
                        }
                    }
                });
                z = true;
            }
        }
        CopyOnWriteArraySet copyOnWriteArraySet2 = (CopyOnWriteArraySet) this.c.get(cls);
        if (copyOnWriteArraySet2 != null) {
            a(cls, copyOnWriteArraySet2);
            Iterator it = copyOnWriteArraySet2.iterator();
            while (it.hasNext()) {
                final Yf yf = (Yf) it.next();
                this.e.execute(new Runnable() {
                    public void run() {
                        yf.trigger(t);
                    }
                });
            }
            if (!copyOnWriteArraySet2.isEmpty()) {
                z = true;
            }
        }
        CopyOnWriteArraySet copyOnWriteArraySet3 = (CopyOnWriteArraySet) this.d.get(cls);
        if (copyOnWriteArraySet3 != null) {
            a(cls, copyOnWriteArraySet3);
            Iterator it2 = copyOnWriteArraySet3.iterator();
            while (it2.hasNext()) {
                ((Yf) it2.next()).trigger(t);
            }
            if (!copyOnWriteArraySet3.isEmpty()) {
                z = true;
            }
        }
        if (!z && cls.equals(Zf.class)) {
            String str2 = "***********************************************************************************************";
            Hg.c(a, str2);
            Hg.c(a, "**                                       !! WARNING !!                                       **");
            Hg.c(a, "**             InAppMessageEvent was published, but no subscribers were found.               **");
            Hg.c(a, "**  This is likely an integration error. Please ensure that the AppboyInAppMessageManager is **");
            Hg.c(a, "**               registered as early as possible. Additionally, be sure to call              **");
            Hg.c(a, "**       AppboyInAppMessageManager.ensureSubscribedToInAppMessageEvents(Context) in your     **");
            Hg.c(a, "**          Application onCreate() to avoid losing any in-app messages in the future.        **");
            Hg.c(a, str2);
        }
    }

    public void a() {
        synchronized (this.g) {
            this.c.clear();
        }
        synchronized (this.h) {
            this.d.clear();
        }
        synchronized (this.f) {
            this.b.clear();
        }
    }

    /* access modifiers changed from: private */
    public <T> CopyOnWriteArraySet<Yf<T>> a(Class<T> cls, CopyOnWriteArraySet<Yf> copyOnWriteArraySet) {
        String str = a;
        StringBuilder sb = new StringBuilder();
        sb.append("Triggering ");
        sb.append(cls.getName());
        sb.append(" on ");
        sb.append(copyOnWriteArraySet.size());
        sb.append(" subscribers.");
        Hg.a(str, sb.toString());
        return copyOnWriteArraySet;
    }
}
