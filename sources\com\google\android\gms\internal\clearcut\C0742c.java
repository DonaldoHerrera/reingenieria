package com.google.android.gms.internal.clearcut;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.clearcut.c reason: case insensitive filesystem */
public final class C0742c {
    private static final ConcurrentHashMap<Uri, C0742c> a = new ConcurrentHashMap<>();
    private static final String[] b = {"key", "value"};
    private final ContentResolver c;
    private final Uri d;
    private final ContentObserver e;
    private final Object f = new Object();
    private volatile Map<String, String> g;
    private final Object h = new Object();
    private final List<C0748e> i = new ArrayList();

    private C0742c(ContentResolver contentResolver, Uri uri) {
        this.c = contentResolver;
        this.d = uri;
        this.e = new C0745d(this, null);
    }

    public static C0742c a(ContentResolver contentResolver, Uri uri) {
        C0742c cVar = (C0742c) a.get(uri);
        if (cVar != null) {
            return cVar;
        }
        C0742c cVar2 = new C0742c(contentResolver, uri);
        C0742c cVar3 = (C0742c) a.putIfAbsent(uri, cVar2);
        if (cVar3 != null) {
            return cVar3;
        }
        cVar2.c.registerContentObserver(cVar2.d, false, cVar2.e);
        return cVar2;
    }

    private final Map<String, String> c() {
        Cursor query;
        try {
            HashMap hashMap = new HashMap();
            query = this.c.query(this.d, b, null, null, null);
            if (query != null) {
                while (query.moveToNext()) {
                    hashMap.put(query.getString(0), query.getString(1));
                }
                query.close();
            }
            return hashMap;
        } catch (SQLiteException | SecurityException unused) {
            Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
            return null;
        } catch (Throwable th) {
            query.close();
            throw th;
        }
    }

    /* access modifiers changed from: private */
    public final void d() {
        synchronized (this.h) {
            for (C0748e j : this.i) {
                j.j();
            }
        }
    }

    public final Map<String, String> a() {
        Map<String, String> c2 = C0751f.a("gms:phenotype:phenotype_flag:debug_disable_caching", false) ? c() : this.g;
        if (c2 == null) {
            synchronized (this.f) {
                Map<String, String> map = this.g;
                if (map == null) {
                    map = c();
                    this.g = map;
                }
            }
        }
        return c2 != null ? c2 : Collections.emptyMap();
    }

    public final void b() {
        synchronized (this.f) {
            this.g = null;
        }
    }
}
