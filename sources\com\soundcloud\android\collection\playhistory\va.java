package com.soundcloud.android.collection.playhistory;

import com.soundcloud.android.collection.C2839u;
import com.soundcloud.android.collection.Fa.a;
import com.soundcloud.android.collection.playhistory.V.b;
import com.soundcloud.android.collection.playhistory.V.d;
import com.soundcloud.android.collection.playhistory.V.i;
import com.soundcloud.android.collection.playhistory.V.j;
import java.util.List;

/* compiled from: PlayHistoryStorage */
public class va {
    private static final C6772kMa<C3508cda> a = C2772d.a;
    private static final C6772kMa<ua> b = C2774e.a;
    private final C2839u c;

    public va(C2839u uVar) {
        this.c = uVar;
    }

    /* access modifiers changed from: 0000 */
    public List<ua> c() {
        return this.c.c((Xd) a.a.a(), b);
    }

    /* access modifiers changed from: 0000 */
    public List<ua> d() {
        return this.c.c((Xd) a.a.a(Boolean.valueOf(true)), b);
    }

    /* access modifiers changed from: 0000 */
    public IPa<List<C3508cda>> e() {
        return this.c.a((Xd) a.a.b(), a);
    }

    /* access modifiers changed from: 0000 */
    public List<ua> f() {
        return this.c.c((Xd) a.a.a(Boolean.valueOf(false)), b);
    }

    private void e(List<ua> list) {
        this.c.a((Runnable) new C2768b(this, list));
    }

    /* access modifiers changed from: 0000 */
    public APa<List<C3508cda>> a(int i) {
        return this.c.a(a, "PlayHistory", a.a.a((long) i));
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.soundcloud.android.collection.playhistory.ua>, for r7v0, types: [java.util.List, java.util.List<com.soundcloud.android.collection.playhistory.ua>] */
    public /* synthetic */ void c(List<ua> list) {
        b bVar = new b(this.c.a());
        for (ua uaVar : list) {
            bVar.a(uaVar.i().c(), uaVar.h());
            this.c.c("PlayHistory", (Yd) bVar);
        }
    }

    /* access modifiers changed from: 0000 */
    public void d(List<ua> list) {
        this.c.a((Runnable) new C2770c(this, list));
    }

    /* access modifiers changed from: 0000 */
    public void a(List<ua> list) {
        e(list);
    }

    public void a(ua uaVar) {
        j jVar = new j(this.c.a());
        jVar.a(uaVar.i().c(), uaVar.h());
        this.c.a("PlayHistory", (Yd) jVar);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.soundcloud.android.collection.playhistory.ua>, for r8v0, types: [java.util.List, java.util.List<com.soundcloud.android.collection.playhistory.ua>] */
    public /* synthetic */ void b(List<ua> list) {
        d dVar = new d(this.c.a());
        for (ua uaVar : list) {
            dVar.a(uaVar.i().c(), uaVar.h(), Boolean.valueOf(true));
            this.c.a("PlayHistory", (Yd) dVar);
        }
    }

    public void a() {
        this.c.a("PlayHistory");
    }

    /* access modifiers changed from: 0000 */
    public boolean b() {
        if (((Long) this.c.c((Xd) a.a.c(), a.a.d()).get(0)).longValue() > 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public void b(int i) {
        i iVar = new i(this.c.a());
        iVar.a((long) i);
        this.c.c("PlayHistory", (Yd) iVar);
    }
}
