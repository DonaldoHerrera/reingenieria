package defpackage;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: oOa reason: default package and case insensitive filesystem */
/* compiled from: EventsFilesManager */
public abstract class C7047oOa<T> {
    protected final Context a;
    protected final C6910mOa<T> b;
    protected final C7529vNa c;
    protected final C7116pOa d;
    private final int e;
    protected volatile long f;
    protected final List<C7185qOa> g = new CopyOnWriteArrayList();

    /* renamed from: oOa$a */
    /* compiled from: EventsFilesManager */
    static class a {
        final File a;
        final long b;

        public a(File file, long j) {
            this.a = file;
            this.b = j;
        }
    }

    public C7047oOa(Context context, C6910mOa<T> moa, C7529vNa vna, C7116pOa poa, int i) throws IOException {
        this.a = context.getApplicationContext();
        this.b = moa;
        this.d = poa;
        this.c = vna;
        this.f = this.c.a();
        this.e = i;
    }

    private void b(String str) {
        for (C7185qOa a2 : this.g) {
            try {
                a2.a(str);
            } catch (Exception e2) {
                C7391tNa.a(this.a, "One of the roll over listeners threw an exception", (Throwable) e2);
            }
        }
    }

    public void a(T t) throws IOException {
        byte[] a2 = this.b.a(t);
        a(a2.length);
        this.d.a(a2);
    }

    /* access modifiers changed from: protected */
    public abstract String c();

    public List<File> d() {
        return this.d.a(1);
    }

    /* access modifiers changed from: protected */
    public int e() {
        return 8000;
    }

    /* access modifiers changed from: protected */
    public int f() {
        return this.e;
    }

    public boolean g() throws IOException {
        String str;
        boolean z = true;
        if (!this.d.c()) {
            str = c();
            this.d.a(str);
            C7391tNa.a(this.a, 4, "Fabric", String.format(Locale.US, "generated new file %s", new Object[]{str}));
            this.f = this.c.a();
        } else {
            str = null;
            z = false;
        }
        b(str);
        return z;
    }

    public void a(C7185qOa qoa) {
        if (qoa != null) {
            this.g.add(qoa);
        }
    }

    public void b() {
        List<File> b2 = this.d.b();
        int f2 = f();
        if (b2.size() > f2) {
            int size = b2.size() - f2;
            C7391tNa.c(this.a, String.format(Locale.US, "Found %d files in  roll over directory, this is greater than %d, deleting %d oldest files", new Object[]{Integer.valueOf(b2.size()), Integer.valueOf(f2), Integer.valueOf(size)}));
            TreeSet treeSet = new TreeSet(new C6978nOa(this));
            for (File file : b2) {
                treeSet.add(new a(file, a(file.getName())));
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = treeSet.iterator();
            while (it.hasNext()) {
                arrayList.add(((a) it.next()).a);
                if (arrayList.size() == size) {
                    break;
                }
            }
            this.d.a((List<File>) arrayList);
        }
    }

    private void a(int i) throws IOException {
        if (!this.d.a(i, e())) {
            C7391tNa.a(this.a, 4, "Fabric", String.format(Locale.US, "session analytics events file is %d bytes, new event is %d bytes, this is over flush limit of %d, rolling it over", new Object[]{Integer.valueOf(this.d.a()), Integer.valueOf(i), Integer.valueOf(e())}));
            g();
        }
    }

    public void a(List<File> list) {
        this.d.a(list);
    }

    public void a() {
        C7116pOa poa = this.d;
        poa.a(poa.b());
        this.d.d();
    }

    public long a(String str) {
        String[] split = str.split("_");
        if (split.length != 3) {
            return 0;
        }
        try {
            return Long.valueOf(split[2]).longValue();
        } catch (NumberFormatException unused) {
            return 0;
        }
    }
}
