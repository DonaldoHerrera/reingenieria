package com.soundcloud.android.collections.data;

import androidx.room.C;
import androidx.room.t;

/* compiled from: LikeDao_Impl */
class B extends C {
    final /* synthetic */ H d;

    B(H h, t tVar) {
        this.d = h;
        super(tVar);
    }

    public String c() {
        return "UPDATE likes SET urn = ? WHERE urn = ? AND type IS ?";
    }
}
