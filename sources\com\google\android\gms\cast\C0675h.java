package com.google.android.gms.cast;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.cast.h reason: case insensitive filesystem */
public class C0675h {
    private boolean a;
    private long b;
    private double c;
    private long[] d;
    private JSONObject e;
    private String f;
    private String g;

    /* renamed from: com.google.android.gms.cast.h$a */
    public static class a {
        private boolean a = true;
        private long b = -1;
        private double c = 1.0d;
        private long[] d = null;
        private JSONObject e = null;
        private String f = null;
        private String g = null;

        public a a(boolean z) {
            this.a = z;
            return this;
        }

        public a a(long j) {
            this.b = j;
            return this;
        }

        public a a(JSONObject jSONObject) {
            this.e = jSONObject;
            return this;
        }

        public C0675h a() {
            C0675h hVar = new C0675h(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
            return hVar;
        }
    }

    private C0675h(boolean z, long j, double d2, long[] jArr, JSONObject jSONObject, String str, String str2) {
        this.a = z;
        this.b = j;
        this.c = d2;
        this.d = jArr;
        this.e = jSONObject;
        this.f = str;
        this.g = str2;
    }

    public long[] a() {
        return this.d;
    }

    public boolean b() {
        return this.a;
    }

    public String c() {
        return this.f;
    }

    public String d() {
        return this.g;
    }

    public JSONObject e() {
        return this.e;
    }

    public long f() {
        return this.b;
    }

    public double g() {
        return this.c;
    }
}
