package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class Aa implements C1000ma {
    static final Map<String, Aa> a = new HashMap();
    private final SharedPreferences b;
    private final OnSharedPreferenceChangeListener c = new Da(this);
    private final Object d = new Object();
    private volatile Map<String, ?> e;
    private final List<C1006na> f = new ArrayList();

    private Aa(SharedPreferences sharedPreferences) {
        this.b = sharedPreferences;
        this.b.registerOnSharedPreferenceChangeListener(this.c);
    }

    static Aa a(Context context, String str) {
        Aa aa;
        SharedPreferences sharedPreferences;
        if (!((!C0982ja.a() || str.startsWith("direct_boot:")) ? true : C0982ja.a(context))) {
            return null;
        }
        synchronized (Aa.class) {
            aa = (Aa) a.get(str);
            if (aa == null) {
                if (str.startsWith("direct_boot:")) {
                    if (C0982ja.a()) {
                        context = context.createDeviceProtectedStorageContext();
                    }
                    sharedPreferences = context.getSharedPreferences(str.substring(12), 0);
                } else {
                    sharedPreferences = context.getSharedPreferences(str, 0);
                }
                aa = new Aa(sharedPreferences);
                a.put(str, aa);
            }
        }
        return aa;
    }

    public final Object a(String str) {
        Map<String, ?> map = this.e;
        if (map == null) {
            synchronized (this.d) {
                map = this.e;
                if (map == null) {
                    map = this.b.getAll();
                    this.e = map;
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void a(SharedPreferences sharedPreferences, String str) {
        synchronized (this.d) {
            this.e = null;
            C1047ua.b();
        }
        synchronized (this) {
            for (C1006na a2 : this.f) {
                a2.a();
            }
        }
    }
}
