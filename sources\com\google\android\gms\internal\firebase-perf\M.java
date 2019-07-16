package com.google.android.gms.internal.firebase-perf;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public final class M {
    private final URL a;

    public M(URL url) {
        this.a = url;
    }

    public final URLConnection a() throws IOException {
        return this.a.openConnection();
    }

    public final String toString() {
        return this.a.toString();
    }
}
