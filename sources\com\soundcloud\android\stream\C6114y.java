package com.soundcloud.android.stream;

import com.soundcloud.android.ads.C2617ra;
import com.soundcloud.android.ads.C2618rb;
import com.soundcloud.android.ads.id;
import com.soundcloud.android.stream.C6109va.b;
import com.soundcloud.android.upsell.e;
import com.soundcloud.android.upsell.l;
import java.util.ListIterator;

/* renamed from: com.soundcloud.android.stream.y reason: case insensitive filesystem */
/* compiled from: StreamAdapter */
public class C6114y extends C5407WEa<C6109va> {
    private final pb g;
    private final Aa h;
    private final e i;
    private final Cca j;
    private final C2618rb k;
    private final id l;

    public C6114y(pb pbVar, Aa aa, e eVar, C2618rb rbVar, Cca<C6109va> cca, id idVar) {
        super((C5693cFa<? extends T>[]) new C5693cFa[]{new C5693cFa(b.TRACK.ordinal(), pbVar), new C5693cFa(b.PLAYLIST.ordinal(), aa), new C5693cFa(b.STREAM_UPSELL.ordinal(), eVar), new C5693cFa(b.APP_INSTALL.ordinal(), rbVar), new C5693cFa(b.VIDEO_AD.ordinal(), idVar), new C5693cFa(b.STREAM_UPSELL_HEADER.ordinal(), cca)});
        this.g = pbVar;
        this.h = aa;
        this.i = eVar;
        this.k = rbVar;
        this.l = idVar;
        this.j = cca;
    }

    public void a(int i2, C6109va vaVar) {
        if (i2 < b()) {
            h().add(i2, vaVar);
            d(i2);
        }
    }

    public int f(int i2) {
        return ((C6109va) g(i2)).d().ordinal();
    }

    /* access modifiers changed from: 0000 */
    public APa<C2617ra> j() {
        return this.k.a();
    }

    public id k() {
        return this.l;
    }

    /* access modifiers changed from: 0000 */
    public APa<C6102s> l() {
        return this.h.a();
    }

    public void m() {
        ListIterator listIterator = h().listIterator();
        while (listIterator.hasNext()) {
            if (((C6109va) listIterator.next()).g()) {
                listIterator.remove();
            }
        }
        e();
    }

    /* access modifiers changed from: 0000 */
    public APa<tb> n() {
        return this.g.a();
    }

    /* access modifiers changed from: 0000 */
    public APa<RVa> o() {
        return this.j.a();
    }

    /* access modifiers changed from: 0000 */
    public APa<l> p() {
        return this.i.a();
    }

    /* access modifiers changed from: 0000 */
    public APa<C2617ra> q() {
        return this.l.a();
    }
}
