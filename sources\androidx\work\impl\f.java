package androidx.work.impl;

import android.text.TextUtils;
import androidx.work.g;
import androidx.work.i;
import androidx.work.impl.utils.d;
import androidx.work.m;
import androidx.work.p;
import androidx.work.s;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: WorkContinuationImpl */
public class f extends p {
    private static final String a = i.a("WorkContinuationImpl");
    private final m b;
    private final String c;
    private final g d;
    private final List<? extends s> e;
    private final List<String> f;
    private final List<String> g;
    private final List<f> h;
    private boolean i;
    private m j;

    f(m mVar, List<? extends s> list) {
        this(mVar, null, g.KEEP, list, null);
    }

    public m a() {
        if (!this.i) {
            d dVar = new d(this);
            this.b.h().a(dVar);
            this.j = dVar.b();
        } else {
            i.a().e(a, String.format("Already enqueued work ids (%s)", new Object[]{TextUtils.join(", ", this.f)}), new Throwable[0]);
        }
        return this.j;
    }

    public g b() {
        return this.d;
    }

    public List<String> c() {
        return this.f;
    }

    public String d() {
        return this.c;
    }

    public List<f> e() {
        return this.h;
    }

    public List<? extends s> f() {
        return this.e;
    }

    public m g() {
        return this.b;
    }

    public boolean h() {
        return a(this, new HashSet());
    }

    public boolean i() {
        return this.i;
    }

    public void j() {
        this.i = true;
    }

    f(m mVar, String str, g gVar, List<? extends s> list) {
        this(mVar, str, gVar, list, null);
    }

    f(m mVar, String str, g gVar, List<? extends s> list, List<f> list2) {
        this.b = mVar;
        this.c = str;
        this.d = gVar;
        this.e = list;
        this.h = list2;
        this.f = new ArrayList(this.e.size());
        this.g = new ArrayList();
        if (list2 != null) {
            for (f fVar : list2) {
                this.g.addAll(fVar.g);
            }
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            String a2 = ((s) list.get(i2)).a();
            this.f.add(a2);
            this.g.add(a2);
        }
    }

    private static boolean a(f fVar, Set<String> set) {
        set.addAll(fVar.c());
        Set a2 = a(fVar);
        for (String contains : set) {
            if (a2.contains(contains)) {
                return true;
            }
        }
        List<f> e2 = fVar.e();
        if (e2 != null && !e2.isEmpty()) {
            for (f a3 : e2) {
                if (a(a3, set)) {
                    return true;
                }
            }
        }
        set.removeAll(fVar.c());
        return false;
    }

    public static Set<String> a(f fVar) {
        HashSet hashSet = new HashSet();
        List<f> e2 = fVar.e();
        if (e2 != null && !e2.isEmpty()) {
            for (f c2 : e2) {
                hashSet.addAll(c2.c());
            }
        }
        return hashSet;
    }
}
