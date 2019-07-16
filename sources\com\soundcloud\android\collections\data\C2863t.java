package com.soundcloud.android.collections.data;

import com.soundcloud.android.collections.data.C2853i.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.soundcloud.android.collections.data.t reason: case insensitive filesystem */
/* compiled from: LikeDao.kt */
public abstract class C2863t {
    public abstract int a(C3508cda cda, C3508cda cda2, ea eaVar);

    public abstract int a(C3508cda cda, ea eaVar);

    public abstract APa<List<I>> a(ea eaVar);

    public abstract IPa<List<I>> a(ea eaVar, long j, int i);

    public abstract IPa<List<I>> a(ea eaVar, long j, long j2);

    public abstract void a();

    public abstract void a(I i);

    public void a(Collection<C2853i> collection) {
        C7471uYa.b(collection, "changes");
        ArrayList<C2853i> arrayList = new ArrayList<>();
        for (Object next : collection) {
            C2853i iVar = (C2853i) next;
            if (iVar.a() == a.ADD || iVar.a() == a.UPDATE) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C6986nWa.a((Iterable) arrayList, 10));
        for (C2853i iVar2 : arrayList) {
            I i = r8;
            I i2 = new I(iVar2.b(), fa.a(iVar2.b()), iVar2.c().getTime(), null, null, 24, null);
            arrayList2.add(i);
        }
        b((List<I>) arrayList2);
        ArrayList<C2853i> arrayList3 = new ArrayList<>();
        for (Object next2 : collection) {
            if (((C2853i) next2).a() == a.REMOVE) {
                arrayList3.add(next2);
            }
        }
        ArrayList arrayList4 = new ArrayList(C6986nWa.a((Iterable) arrayList3, 10));
        for (C2853i b : arrayList3) {
            arrayList4.add(b.b());
        }
        a((List<C3508cda>) arrayList4);
    }

    public abstract void a(List<C3508cda> list);

    public abstract APa<List<C3508cda>> b();

    public abstract IPa<List<I>> b(ea eaVar);

    public abstract void b(I i);

    public abstract void b(List<I> list);

    public abstract IPa<List<I>> c(ea eaVar);

    public void c(I i) {
        C7471uYa.b(i, "likeEntity");
        if (a(i.e(), i.d()) == 0) {
            a(i);
        } else {
            b(i);
        }
    }

    public abstract IPa<List<I>> d(ea eaVar);
}
