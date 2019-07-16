package com.soundcloud.android.collections.data;

import androidx.room.t;

/* compiled from: LikeDao_Impl */
class C extends androidx.room.C {
    final /* synthetic */ H d;

    C(H h, t tVar) {
        this.d = h;
        super(tVar);
    }

    public String c() {
        return "DELETE FROM likes";
    }
}
