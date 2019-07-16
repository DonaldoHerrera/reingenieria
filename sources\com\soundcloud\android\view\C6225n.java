package com.soundcloud.android.view;

import android.util.Property;

/* renamed from: com.soundcloud.android.view.n reason: case insensitive filesystem */
/* compiled from: CircularProgressDrawable */
class C6225n extends Property<C6227p, Float> {
    final /* synthetic */ C6227p a;

    C6225n(C6227p pVar, Class cls, String str) {
        this.a = pVar;
        super(cls, str);
    }

    /* renamed from: a */
    public Float get(C6227p pVar) {
        return Float.valueOf(pVar.b());
    }

    /* renamed from: a */
    public void set(C6227p pVar, Float f) {
        pVar.b(f.floatValue());
    }
}
