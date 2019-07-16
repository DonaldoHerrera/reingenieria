package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.ia reason: case insensitive filesystem */
public final class C0976ia implements C1000ma {
    static final Map<Uri, C0976ia> a = new T();
    private static final String[] b = {"key", "value"};
    private final ContentResolver c;
    private final Uri d;
    private final Object e = new Object();
    private volatile Map<String, String> f;
    private final List<C1006na> g = new ArrayList();

    private C0976ia(ContentResolver contentResolver, Uri uri) {
        this.c = contentResolver;
        this.d = uri;
        this.c.registerContentObserver(uri, false, new C0988ka(this, null));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|(5:5|6|7|8|9)|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0018 */
    public static C0976ia a(ContentResolver contentResolver, Uri uri) {
        C0976ia iaVar;
        synchronized (C0976ia.class) {
            iaVar = (C0976ia) a.get(uri);
            if (iaVar == null) {
                C0976ia iaVar2 = new C0976ia(contentResolver, uri);
                try {
                    a.put(uri, iaVar2);
                } catch (SecurityException unused) {
                }
                iaVar = iaVar2;
            }
        }
        return iaVar;
    }

    private final Map<String, String> d() {
        try {
            return (Map) C1018pa.a(new C0994la(this));
        } catch (SQLiteException | IllegalStateException | SecurityException unused) {
            Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
            return null;
        }
    }

    public final void b() {
        synchronized (this.e) {
            this.f = null;
            C1047ua.b();
        }
        synchronized (this) {
            for (C1006na a2 : this.g) {
                a2.a();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ Map c() {
        Map map;
        Cursor query = this.c.query(this.d, b, null, null, null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            if (count <= 256) {
                map = new T(count);
            } else {
                map = new HashMap(count, 1.0f);
            }
            while (query.moveToNext()) {
                map.put(query.getString(0), query.getString(1));
            }
            query.close();
            return map;
        } finally {
            query.close();
        }
    }

    public final Map<String, String> a() {
        Map<String, String> map = this.f;
        if (map == null) {
            synchronized (this.e) {
                map = this.f;
                if (map == null) {
                    map = d();
                    this.f = map;
                }
            }
        }
        if (map != null) {
            return map;
        }
        return Collections.emptyMap();
    }

    public final /* synthetic */ Object a(String str) {
        return (String) a().get(str);
    }
}
