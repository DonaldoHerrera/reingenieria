package defpackage;

import java.util.HashSet;
import java.util.Iterator;

/* renamed from: Da reason: default package and case insensitive filesystem */
/* compiled from: ResolutionNode */
public class C0198Da {
    HashSet<C0198Da> a = new HashSet<>(2);
    int b = 0;

    public void a(C0198Da da) {
        this.a.add(da);
    }

    public void b() {
        this.b = 0;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((C0198Da) it.next()).b();
        }
    }

    public boolean c() {
        return this.b == 1;
    }

    public void d() {
        this.b = 0;
        this.a.clear();
    }

    public void e() {
    }

    public void a() {
        this.b = 1;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((C0198Da) it.next()).e();
        }
    }
}
