package com.soundcloud.android.foundation.playqueue;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.soundcloud.android.foundation.playqueue.v.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PlayQueue */
public abstract class o implements Iterable<q> {
    public static o a(List<C3508cda> list, PlaySessionSource playSessionSource, Map<C3508cda, Boolean> map) {
        return new E(b(list, playSessionSource, map));
    }

    private static List<q> b(List<C3508cda> list, PlaySessionSource playSessionSource, Map<C3508cda, Boolean> map) {
        return C2063HD.a((Iterable<? extends E>) C2063HD.a(list, (Function<? super F, ? extends T>) new C3714a<Object,Object>(playSessionSource, map)));
    }

    public static o g() {
        return new E(new ArrayList(0));
    }

    public abstract int a(C3508cda cda);

    public abstract int a(q qVar);

    public abstract List<C3508cda> a(int i, int i2);

    public abstract void a(int i, q qVar);

    public abstract void a(int i, List<q> list);

    public abstract void a(Iterable<q> iterable);

    public abstract boolean a(o oVar);

    public abstract Iterable<? extends q> b(C3508cda cda);

    public abstract void b(int i, int i2);

    public abstract void b(int i, List<q> list);

    public abstract q c(int i);

    public abstract void c(q qVar);

    public abstract o f();

    public abstract List<C3508cda> h();

    public abstract boolean i();

    public abstract boolean isEmpty();

    public abstract Iterator<q> iterator();

    public abstract boolean j();

    public abstract List<q> k();

    public abstract C3508cda m(int i);

    public abstract boolean n(int i);

    public abstract boolean o(int i);

    public abstract boolean p(int i);

    public abstract void q(int i);

    public abstract boolean r(int i);

    public abstract D s(int i);

    public abstract int size();

    public static o a(List<q> list) {
        return new E(list);
    }

    private static List<q> b(C3508cda cda, boolean z, Qca qca, PlaySessionSource playSessionSource) {
        v vVar;
        ArrayList arrayList = new ArrayList();
        Iterator it = qca.iterator();
        while (it.hasNext()) {
            Yda yda = (Yda) it.next();
            if (z) {
                vVar = v.a(a.AUTO_PLAY, C4928GKa.b(cda));
            } else {
                vVar = v.a(playSessionSource);
            }
            arrayList.add(((F.a) ((F.a) ((F.a) new F.a(yda.w()).a(cda)).a(m.RECOMMENDER.a(), qca.l())).a(vVar)).c());
        }
        return arrayList;
    }

    static /* synthetic */ q a(PlaySessionSource playSessionSource, Map map, C3508cda cda) {
        if (cda.x()) {
            return ((F.a) ((F.a) ((F.a) new F.a(cda).a(playSessionSource.f())).a(v.a(playSessionSource))).a(Boolean.TRUE.equals(map.get(cda)))).c();
        }
        if (cda.u()) {
            return ((w.a) ((w.a) new w.a(cda).a(playSessionSource.f())).a(v.a(playSessionSource))).c();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unrecognized playable sent for playback ");
        sb.append(cda);
        throw new IllegalArgumentException(sb.toString());
    }

    public static Predicate<q> b(q qVar) {
        return new C3715b(qVar);
    }

    public static o a(C3508cda cda, List<Tda> list, PlaySessionSource playSessionSource) {
        ArrayList arrayList = new ArrayList();
        for (Tda tda : list) {
            arrayList.add(((F.a) ((F.a) ((F.a) new F.a(tda.b()).a(cda)).a(playSessionSource.f(), "default", cda, tda.a())).a(v.a(playSessionSource))).c());
        }
        return new E(arrayList);
    }

    public static o a(C3508cda cda, boolean z, Qca qca, PlaySessionSource playSessionSource) {
        return new E(b(cda, z, qca, playSessionSource));
    }
}
