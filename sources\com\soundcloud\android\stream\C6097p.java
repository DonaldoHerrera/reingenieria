package com.soundcloud.android.stream;

import android.content.ContentValues;

/* renamed from: com.soundcloud.android.stream.p reason: case insensitive filesystem */
/* compiled from: MarkPromotedItemAsStaleCommand */
public class C6097p extends C1286fT<C3508cda, C6499gLa> {
    protected C6097p(C5500ZKa zKa) {
        super(zKa);
    }

    /* access modifiers changed from: protected */
    public C6499gLa a(C5500ZKa zKa, C3508cda cda) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("created_at", Long.valueOf(0));
        return zKa.a((C5116MLa) _ea.PromotedTracks, contentValues, C6907mLa.a().d("ad_urn", (Object) cda.b()));
    }
}
