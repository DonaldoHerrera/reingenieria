package com.soundcloud.android.foundation.events;

import android.os.Bundle;

/* compiled from: MetricParams */
public class t {
    public static t a = new t();
    private final Bundle b = new Bundle();

    public static t a(s sVar, String str) {
        return new t().b(sVar, str);
    }

    public t b(s sVar, long j) {
        this.b.putLong(sVar.toString(), j);
        return this;
    }

    public static t a(s sVar, long j) {
        return new t().b(sVar, j);
    }

    public t b(s sVar, String str) {
        this.b.putString(sVar.toString(), str);
        return this;
    }
}
