package com.soundcloud.android.features.record;

import java.util.Iterator;

/* renamed from: com.soundcloud.android.features.record.t reason: case insensitive filesystem */
/* compiled from: AmplitudeData */
class C3667t implements Iterator<Float> {
    int a;
    final /* synthetic */ AmplitudeData b;

    C3667t(AmplitudeData amplitudeData) {
        this.b = amplitudeData;
    }

    public boolean hasNext() {
        return this.a < this.b.c;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

    public Float next() {
        float[] b2 = this.b.b;
        int i = this.a;
        this.a = i + 1;
        return Float.valueOf(b2[i]);
    }
}
