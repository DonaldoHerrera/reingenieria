package androidx.lifecycle;

import android.util.Log;
import androidx.lifecycle.f.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;

/* compiled from: LifecycleRegistry */
public class j extends f {
    private I<g, a> a = new I<>();
    private b b;
    private final WeakReference<h> c;
    private int d = 0;
    private boolean e = false;
    private boolean f = false;
    private ArrayList<b> g = new ArrayList<>();

    /* compiled from: LifecycleRegistry */
    static class a {
        b a;
        e b;

        a(g gVar, b bVar) {
            this.b = l.a((Object) gVar);
            this.a = bVar;
        }

        /* access modifiers changed from: 0000 */
        public void a(h hVar, androidx.lifecycle.f.a aVar) {
            b a2 = j.a(aVar);
            this.a = j.a(this.a, a2);
            this.b.a(hVar, aVar);
            this.a = a2;
        }
    }

    public j(h hVar) {
        this.c = new WeakReference<>(hVar);
        this.b = b.INITIALIZED;
    }

    private void c(b bVar) {
        if (this.b != bVar) {
            this.b = bVar;
            if (this.e || this.d != 0) {
                this.f = true;
                return;
            }
            this.e = true;
            d();
            this.e = false;
        }
    }

    private void d(b bVar) {
        this.g.add(bVar);
    }

    private static androidx.lifecycle.f.a e(b bVar) {
        int i = i.b[bVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return androidx.lifecycle.f.a.ON_START;
            }
            if (i == 3) {
                return androidx.lifecycle.f.a.ON_RESUME;
            }
            if (i == 4) {
                throw new IllegalArgumentException();
            } else if (i != 5) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected state value ");
                sb.append(bVar);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return androidx.lifecycle.f.a.ON_CREATE;
    }

    public void a(b bVar) {
        c(bVar);
    }

    public void b(androidx.lifecycle.f.a aVar) {
        c(a(aVar));
    }

    private void d() {
        h hVar = (h) this.c.get();
        if (hVar == null) {
            Log.w("LifecycleRegistry", "LifecycleOwner is garbage collected, you shouldn't try dispatch new events from it.");
            return;
        }
        while (!b()) {
            this.f = false;
            if (this.b.compareTo(((a) this.a.f().getValue()).a) < 0) {
                a(hVar);
            }
            Entry h = this.a.h();
            if (!this.f && h != null && this.b.compareTo(((a) h.getValue()).a) > 0) {
                b(hVar);
            }
        }
        this.f = false;
    }

    public void a(g gVar) {
        b bVar = this.b;
        b bVar2 = b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = b.INITIALIZED;
        }
        a aVar = new a(gVar, bVar2);
        if (((a) this.a.b(gVar, aVar)) == null) {
            h hVar = (h) this.c.get();
            if (hVar != null) {
                boolean z = this.d != 0 || this.e;
                b c2 = c(gVar);
                this.d++;
                while (aVar.a.compareTo(c2) < 0 && this.a.contains(gVar)) {
                    d(aVar.a);
                    aVar.a(hVar, e(aVar.a));
                    c();
                    c2 = c(gVar);
                }
                if (!z) {
                    d();
                }
                this.d--;
            }
        }
    }

    private boolean b() {
        boolean z = true;
        if (this.a.size() == 0) {
            return true;
        }
        b bVar = ((a) this.a.f().getValue()).a;
        b bVar2 = ((a) this.a.h().getValue()).a;
        if (!(bVar == bVar2 && this.b == bVar2)) {
            z = false;
        }
        return z;
    }

    public void b(g gVar) {
        this.a.remove(gVar);
    }

    private static androidx.lifecycle.f.a b(b bVar) {
        int i = i.b[bVar.ordinal()];
        if (i == 1) {
            throw new IllegalArgumentException();
        } else if (i == 2) {
            return androidx.lifecycle.f.a.ON_DESTROY;
        } else {
            if (i == 3) {
                return androidx.lifecycle.f.a.ON_STOP;
            }
            if (i == 4) {
                return androidx.lifecycle.f.a.ON_PAUSE;
            }
            if (i != 5) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected state value ");
                sb.append(bVar);
                throw new IllegalArgumentException(sb.toString());
            }
            throw new IllegalArgumentException();
        }
    }

    private b c(g gVar) {
        Entry b2 = this.a.b(gVar);
        b bVar = null;
        b bVar2 = b2 != null ? ((a) b2.getValue()).a : null;
        if (!this.g.isEmpty()) {
            ArrayList<b> arrayList = this.g;
            bVar = (b) arrayList.get(arrayList.size() - 1);
        }
        return a(a(this.b, bVar2), bVar);
    }

    private void c() {
        ArrayList<b> arrayList = this.g;
        arrayList.remove(arrayList.size() - 1);
    }

    private void b(h hVar) {
        d g2 = this.a.g();
        while (g2.hasNext() && !this.f) {
            Entry entry = (Entry) g2.next();
            a aVar = (a) entry.getValue();
            while (aVar.a.compareTo(this.b) < 0 && !this.f && this.a.contains(entry.getKey())) {
                d(aVar.a);
                aVar.a(hVar, e(aVar.a));
                c();
            }
        }
    }

    public b a() {
        return this.b;
    }

    static b a(androidx.lifecycle.f.a aVar) {
        switch (i.a[aVar.ordinal()]) {
            case 1:
            case 2:
                return b.CREATED;
            case 3:
            case 4:
                return b.STARTED;
            case 5:
                return b.RESUMED;
            case 6:
                return b.DESTROYED;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected event value ");
                sb.append(aVar);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    private void a(h hVar) {
        Iterator descendingIterator = this.a.descendingIterator();
        while (descendingIterator.hasNext() && !this.f) {
            Entry entry = (Entry) descendingIterator.next();
            a aVar = (a) entry.getValue();
            while (aVar.a.compareTo(this.b) > 0 && !this.f && this.a.contains(entry.getKey())) {
                androidx.lifecycle.f.a b2 = b(aVar.a);
                d(a(b2));
                aVar.a(hVar, b2);
                c();
            }
        }
    }

    static b a(b bVar, b bVar2) {
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }
}
