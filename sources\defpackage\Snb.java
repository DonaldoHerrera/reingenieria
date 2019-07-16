package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: Snb reason: default package */
/* compiled from: LazyStringArrayList */
public class Snb extends AbstractList<String> implements RandomAccess, Tnb {
    public static final Tnb a = new Snb().Q();
    private final List<Object> b;

    public Snb() {
        this.b = new ArrayList();
    }

    public List<?> P() {
        return Collections.unmodifiableList(this.b);
    }

    public Tnb Q() {
        return new C6665iob(this);
    }

    /* renamed from: a */
    public void add(int i, String str) {
        this.b.add(i, str);
        this.modCount++;
    }

    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    /* renamed from: b */
    public String set(int i, String str) {
        return b(this.b.set(i, str));
    }

    public void clear() {
        this.b.clear();
        this.modCount++;
    }

    public Fnb k(int i) {
        Object obj = this.b.get(i);
        Fnb a2 = a(obj);
        if (a2 != obj) {
            this.b.set(i, a2);
        }
        return a2;
    }

    public int size() {
        return this.b.size();
    }

    public boolean addAll(int i, Collection<? extends String> collection) {
        if (collection instanceof Tnb) {
            collection = ((Tnb) collection).P();
        }
        boolean addAll = this.b.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public String get(int i) {
        Object obj = this.b.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Fnb) {
            Fnb fnb = (Fnb) obj;
            String m = fnb.m();
            if (fnb.h()) {
                this.b.set(i, m);
            }
            return m;
        }
        byte[] bArr = (byte[]) obj;
        String b2 = Nnb.b(bArr);
        if (Nnb.a(bArr)) {
            this.b.set(i, b2);
        }
        return b2;
    }

    public String remove(int i) {
        Object remove = this.b.remove(i);
        this.modCount++;
        return b(remove);
    }

    public Snb(Tnb tnb) {
        this.b = new ArrayList(tnb.size());
        addAll(tnb);
    }

    private static String b(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Fnb) {
            return ((Fnb) obj).m();
        }
        return Nnb.b((byte[]) obj);
    }

    public void a(Fnb fnb) {
        this.b.add(fnb);
        this.modCount++;
    }

    private static Fnb a(Object obj) {
        if (obj instanceof Fnb) {
            return (Fnb) obj;
        }
        if (obj instanceof String) {
            return Fnb.a((String) obj);
        }
        return Fnb.a((byte[]) obj);
    }
}
