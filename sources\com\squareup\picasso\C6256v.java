package com.squareup.picasso;

import android.util.LruCache;

/* renamed from: com.squareup.picasso.v reason: case insensitive filesystem */
/* compiled from: LruCache */
class C6256v extends LruCache<String, a> {
    final /* synthetic */ C6257w a;

    C6256v(C6257w wVar, int i) {
        this.a = wVar;
        super(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int sizeOf(String str, a aVar) {
        return aVar.b;
    }
}
