package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: VG reason: default package and case insensitive filesystem */
public class C2331VG {
    private static C2331VG a = new C2331VG();
    private final ArrayList<C2218PG> b = new ArrayList<>();
    private final ArrayList<C2218PG> c = new ArrayList<>();

    private C2331VG() {
    }

    public static C2331VG a() {
        return a;
    }

    public void a(C2218PG pg) {
        this.b.add(pg);
    }

    public Collection<C2218PG> b() {
        return Collections.unmodifiableCollection(this.b);
    }

    public void b(C2218PG pg) {
        boolean d = d();
        this.c.add(pg);
        if (!d) {
            C2442aH.a().b();
        }
    }

    public Collection<C2218PG> c() {
        return Collections.unmodifiableCollection(this.c);
    }

    public void c(C2218PG pg) {
        boolean d = d();
        this.b.remove(pg);
        this.c.remove(pg);
        if (d && !d()) {
            C2442aH.a().c();
        }
    }

    public boolean d() {
        return this.c.size() > 0;
    }
}
