package com.soundcloud.android.ads;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: AdStateProvider */
class Ga {
    private Map<String, a> a = new ConcurrentHashMap(3);

    Ga() {
    }

    public void a(String str, a aVar) {
        this.a.put(str, aVar);
    }

    public void b(String str) {
        this.a.remove(str);
    }

    public C4928GKa<a> a(String str) {
        return this.a.containsKey(str) ? C4928GKa.c(this.a.get(str)) : C4928GKa.a();
    }
}
