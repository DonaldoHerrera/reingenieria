package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: bLa reason: default package and case insensitive filesystem */
/* compiled from: QueryResult */
public class C5631bLa implements Iterable<C5326TKa> {
    /* access modifiers changed from: private */
    public final C5326TKa a;

    public C5631bLa(C5326TKa tKa) {
        this.a = tKa;
    }

    public <T> List<T> b(C6295dLa<T> dla) {
        ArrayList arrayList = new ArrayList(this.a.c());
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(dla.a((C5326TKa) it.next()));
        }
        return arrayList;
    }

    public int f() {
        return this.a.c();
    }

    public boolean isEmpty() {
        return this.a.c() == 0;
    }

    public Iterator<C5326TKa> iterator() {
        return new C5563aLa(this);
    }

    public <T> T a(C6295dLa<T> dla) {
        if (!isEmpty()) {
            try {
                this.a.a();
                return dla.a(this.a);
            } finally {
                this.a.b();
            }
        } else {
            throw new IllegalStateException("Attempting to read first element from empty query result");
        }
    }

    public <T> T a(C6295dLa<T> dla, T t) {
        if (!isEmpty()) {
            return a(dla);
        }
        a(t);
        return t;
    }

    public <T> T a(Class<T> cls, T t) {
        if (!isEmpty()) {
            return a(cls);
        }
        a(t);
        return t;
    }

    public <T> T a(Class<T> cls) {
        return a((C6295dLa<T>) new C6363eLa<T>(cls));
    }

    private <T> T a(T t) {
        this.a.b();
        return t;
    }
}
