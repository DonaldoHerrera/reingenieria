package com.soundcloud.android.foundation.playqueue;

import com.soundcloud.android.foundation.ads.C3676c;
import com.soundcloud.android.foundation.playqueue.q.b;

/* compiled from: PlaylistQueueItem */
public class w extends t {

    /* compiled from: PlaylistQueueItem */
    public static class a extends com.soundcloud.android.foundation.playqueue.t.a<a> {
        public a(C3508cda cda) {
            super(cda);
        }

        /* access modifiers changed from: protected */
        public a a() {
            return this;
        }

        public w c() {
            w wVar = new w(this.a, this.b, this.g, this.d, this.e, this.f, this.h, this.i, this.c, this.j, this.k);
            return wVar;
        }
    }

    public w(C3508cda cda, C3508cda cda2, C3508cda cda3, String str, String str2, C4928GKa<C3676c> gKa, C3508cda cda4, C3508cda cda5, boolean z, v vVar, boolean z2) {
        super(cda, cda2, str, str2, cda5, cda3, z, cda4, gKa, vVar, z2);
    }

    public b b() {
        return b.PLAYLIST;
    }

    public String toString() {
        return C4804CKa.a((Object) this).a("urn", (Object) this.c).a("reposter", (Object) this.d).a("source", (Object) this.f).a("sourceVersion", (Object) this.g).a("queryUrn", (Object) this.i).a("relatedEntity", (Object) this.e).a("blocked", this.j).a("sourceUrn", (Object) this.h).a("adData", (Object) this.b).a("playbackContext", (Object) this.k).a("played", this.l).toString();
    }
}
