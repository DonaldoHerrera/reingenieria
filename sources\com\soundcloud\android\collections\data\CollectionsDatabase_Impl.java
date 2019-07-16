package com.soundcloud.android.collections.data;

import androidx.room.C0432a;
import androidx.room.h;
import androidx.room.v;
import java.util.HashMap;

public final class CollectionsDatabase_Impl extends CollectionsDatabase {
    private volatile C2863t l;

    public C2863t n() {
        C2863t tVar;
        if (this.l != null) {
            return this.l;
        }
        synchronized (this) {
            if (this.l == null) {
                this.l = new H(this);
            }
            tVar = this.l;
        }
        return tVar;
    }

    /* access modifiers changed from: protected */
    public h d() {
        return new h(this, new HashMap(0), new HashMap(0), "likes");
    }

    /* access modifiers changed from: protected */
    public Vd a(C0432a aVar) {
        v vVar = new v(aVar, new C2859o(this, 1), "2d36cfe39ee4357f85e1f4028a7ab8dc", "6f0552222ef29e9e369b39a3702858e6");
        a a = b.a(aVar.b);
        a.a(aVar.c);
        a.a((a) vVar);
        return aVar.a.a(a.a());
    }
}
