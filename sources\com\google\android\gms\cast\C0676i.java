package com.google.android.gms.cast;

import com.google.android.gms.common.internal.Objects;
import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.cast.i reason: case insensitive filesystem */
public class C0676i {
    private MediaInfo a;
    private C0678k b;
    private Boolean c;
    private long d;
    private double e;
    private long[] f;
    private JSONObject g;
    private String h;
    private String i;

    /* renamed from: com.google.android.gms.cast.i$a */
    public static class a {
        private MediaInfo a;
        private C0678k b;
        private Boolean c = Boolean.valueOf(true);
        private long d = -1;
        private double e = 1.0d;
        private long[] f = null;
        private JSONObject g = null;
        private String h = null;
        private String i = null;

        public a a(MediaInfo mediaInfo) {
            this.a = mediaInfo;
            return this;
        }

        public a b(String str) {
            this.i = str;
            return this;
        }

        public a a(Boolean bool) {
            this.c = bool;
            return this;
        }

        public a a(long j) {
            this.d = j;
            return this;
        }

        public a a(double d2) {
            if (Double.compare(d2, 2.0d) > 0 || Double.compare(d2, 0.5d) < 0) {
                throw new IllegalArgumentException("playbackRate must be between PLAYBACK_RATE_MIN and PLAYBACK_RATE_MAX");
            }
            this.e = d2;
            return this;
        }

        public a a(long[] jArr) {
            this.f = jArr;
            return this;
        }

        public a a(JSONObject jSONObject) {
            this.g = jSONObject;
            return this;
        }

        public a a(String str) {
            this.h = str;
            return this;
        }

        public C0676i a() {
            C0676i iVar = new C0676i(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
            return iVar;
        }
    }

    private C0676i(MediaInfo mediaInfo, C0678k kVar, Boolean bool, long j, double d2, long[] jArr, JSONObject jSONObject, String str, String str2) {
        this.a = mediaInfo;
        this.b = kVar;
        this.c = bool;
        this.d = j;
        this.e = d2;
        this.f = jArr;
        this.g = jSONObject;
        this.h = str;
        this.i = str2;
    }

    public long[] a() {
        return this.f;
    }

    public Boolean b() {
        return this.c;
    }

    public String c() {
        return this.h;
    }

    public String d() {
        return this.i;
    }

    public long e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0676i)) {
            return false;
        }
        C0676i iVar = (C0676i) obj;
        return Objects.equal(this.a, iVar.a) && Objects.equal(this.b, iVar.b) && Objects.equal(this.c, iVar.c) && this.d == iVar.d && this.e == iVar.e && Arrays.equals(this.f, iVar.f) && Objects.equal(this.g, iVar.g) && Objects.equal(this.h, iVar.h) && Objects.equal(this.i, iVar.i);
    }

    public JSONObject f() {
        return this.g;
    }

    public MediaInfo g() {
        return this.a;
    }

    public double h() {
        return this.e;
    }

    public int hashCode() {
        return Objects.hashCode(this.a, this.b, this.c, Long.valueOf(this.d), Double.valueOf(this.e), this.f, this.g, this.h, this.i);
    }

    public C0678k i() {
        return this.b;
    }
}
