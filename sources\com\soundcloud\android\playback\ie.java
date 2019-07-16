package com.soundcloud.android.playback;

import com.google.common.base.Predicate;
import com.soundcloud.android.foundation.ads.ba;
import com.soundcloud.android.properties.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: VideoSourceProvider */
public class ie {
    private final C6699jHa a;
    private final Da b;
    private final C6834lGa c;
    private final j d;
    private C4928GKa<ba> e = C4928GKa.a();

    public ie(C6699jHa jha, Da da, C6834lGa lga, j jVar) {
        this.a = jha;
        this.b = da;
        this.c = lga;
        this.d = jVar;
    }

    private List<ba> b(List<ba> list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList, ba.a);
        return arrayList;
    }

    private Collection<ba> c(Collection<ba> collection) {
        return C3063jD.a(collection, (Predicate<? super E>) new C4349o<Object>(this));
    }

    public C4928GKa<ba> a() {
        return this.e;
    }

    public ba a(List<ba> list) {
        List b2 = b(list);
        Collection a2 = C3063jD.a((Collection<E>) b2, (Predicate<? super E>) C4429u.a);
        Collection a3 = C3063jD.a((Collection<E>) b2, (Predicate<? super E>) C4279a.a);
        C4928GKa b3 = C4928GKa.b(C1943BD.a((Iterable<? extends T>) a2, null));
        C4928GKa b4 = C4928GKa.b(b(a3));
        if (b3.c()) {
            b4 = b3;
        }
        this.e = b4;
        if (this.e.c()) {
            return (ba) this.e.b();
        }
        throw new IllegalArgumentException("VideoAdPlaybackItem has no supported video source formats");
    }

    private ba b(Collection<ba> collection) {
        Collection c2 = c(collection);
        if (c2.isEmpty()) {
            return (ba) C1943BD.a((Iterable<? extends T>) collection, null);
        }
        return a(c2);
    }

    private int c() {
        if (this.a.a(6)) {
            return 1080;
        }
        if (this.a.a(5)) {
            return 720;
        }
        if (this.a.a(4)) {
            return 480;
        }
        return this.b.a();
    }

    public /* synthetic */ boolean b(ba baVar) {
        return Math.min(baVar.b(), baVar.g()) <= c();
    }

    private int b() {
        int i = he.a[this.c.b().ordinal()];
        if (i == 1) {
            return 4000;
        }
        if (i != 2) {
            return i != 3 ? 250 : 750;
        }
        return 2000;
    }

    private ba a(Collection<ba> collection) {
        Collection a2 = C3063jD.a(collection, (Predicate<? super E>) new C4354p<Object>(this));
        if (a2.isEmpty()) {
            return (ba) C1943BD.a((Iterable<? extends T>) collection, null);
        }
        return (ba) C1943BD.a((Iterable<T>) a2);
    }

    public /* synthetic */ boolean a(ba baVar) {
        return baVar.a() <= b();
    }
}
