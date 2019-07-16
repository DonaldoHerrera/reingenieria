package com.google.firebase.components;

import java.util.Map.Entry;

/* compiled from: com.google.firebase:firebase-common@@17.0.0 */
final /* synthetic */ class t implements Runnable {
    private final Entry a;
    private final C2178NE b;

    private t(Entry entry, C2178NE ne) {
        this.a = entry;
        this.b = ne;
    }

    public static Runnable a(Entry entry, C2178NE ne) {
        return new t(entry, ne);
    }

    public void run() {
        ((C2197OE) this.a.getKey()).a(this.b);
    }
}
