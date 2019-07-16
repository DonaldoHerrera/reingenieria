package com.soundcloud.android.cast;

import android.content.Context;
import com.soundcloud.android.cast.l.a;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.properties.j;

/* renamed from: com.soundcloud.android.cast.d reason: case insensitive filesystem */
/* compiled from: CastConfigStorage */
public class C2730d {
    private final Context a;
    private final C7648wza<String> b;
    private final j c;

    C2730d(Context context, j jVar, @a C7648wza<String> wza) {
        this.a = context;
        this.b = wza;
        this.c = jVar;
    }

    private String c() {
        return this.a.getString(p.cast_v3_receiver_app_id);
    }

    public String a() {
        if (this.c.l()) {
            return c();
        }
        String str = (String) this.b.getValue();
        if (str != null) {
            return str;
        }
        return c();
    }

    public void b() {
        this.b.clear();
    }

    public void a(String str) {
        this.b.setValue(str);
    }
}
