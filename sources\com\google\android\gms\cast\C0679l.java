package com.google.android.gms.cast;

import com.google.android.gms.common.internal.Objects;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.cast.l reason: case insensitive filesystem */
public class C0679l {
    private final long a;
    private final int b;
    private final boolean c;
    private final JSONObject d;

    /* renamed from: com.google.android.gms.cast.l$a */
    public static class a {
        private long a;
        private int b = 0;
        private boolean c;
        private JSONObject d;

        public a a(long j) {
            this.a = j;
            return this;
        }

        public a a(int i) {
            this.b = i;
            return this;
        }

        public a a(boolean z) {
            this.c = z;
            return this;
        }

        public a a(JSONObject jSONObject) {
            this.d = jSONObject;
            return this;
        }

        public C0679l a() {
            C0679l lVar = new C0679l(this.a, this.b, this.c, this.d);
            return lVar;
        }
    }

    private C0679l(long j, int i, boolean z, JSONObject jSONObject) {
        this.a = j;
        this.b = i;
        this.c = z;
        this.d = jSONObject;
    }

    public JSONObject a() {
        return this.d;
    }

    public long b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    public boolean d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0679l)) {
            return false;
        }
        C0679l lVar = (C0679l) obj;
        return this.a == lVar.a && this.b == lVar.b && this.c == lVar.c && Objects.equal(this.d, lVar.d);
    }

    public int hashCode() {
        return Objects.hashCode(Long.valueOf(this.a), Integer.valueOf(this.b), Boolean.valueOf(this.c), this.d);
    }
}
