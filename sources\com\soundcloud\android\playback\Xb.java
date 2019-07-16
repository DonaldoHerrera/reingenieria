package com.soundcloud.android.playback;

import com.soundcloud.android.playback.core.b;
import com.soundcloud.android.playback.core.c;
import com.soundcloud.android.playback.core.m;
import com.soundcloud.android.properties.a;
import com.soundcloud.android.properties.m.n;
import java.util.Iterator;
import java.util.List;

/* compiled from: PlaybackKits.kt */
public class Xb implements c {
    private final List<Yla> a;
    private final m b;

    public Xb(Yla yla, a aVar) {
        C7471uYa.b(yla, "flipperKit");
        C7471uYa.b(aVar, "appFeatures");
        this.a = C6850lWa.a(yla);
        this.b = aVar.a((a) n.a) ? C3749dba.b : Mla.b;
    }

    public List<Yla> c() {
        return this.a;
    }

    public m d() {
        return this.b;
    }

    public Iterator<b> iterator() {
        return c.a.a(this);
    }
}
