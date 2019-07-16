package com.facebook.internal;

import android.net.Uri;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.EnumSet;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: FetchedAppSettings */
public final class A {
    private boolean a;
    private String b;
    private boolean c;
    private boolean d;
    private int e;
    private EnumSet<ea> f;
    private Map<String, Map<String, a>> g;
    private boolean h;
    private C0559u i;
    private String j;
    private String k;
    private boolean l;
    private boolean m;
    private String n;
    private JSONArray o;
    private boolean p;

    /* compiled from: FetchedAppSettings */
    public static class a {
        private String a;
        private String b;
        private Uri c;
        private int[] d;

        private a(String str, String str2, Uri uri, int[] iArr) {
            this.a = str;
            this.b = str2;
            this.c = uri;
            this.d = iArr;
        }

        public static a a(JSONObject jSONObject) {
            String optString = jSONObject.optString("name");
            Uri uri = null;
            if (ia.b(optString)) {
                return null;
            }
            String[] split = optString.split("\\|");
            if (split.length != 2) {
                return null;
            }
            String str = split[0];
            String str2 = split[1];
            if (ia.b(str) || ia.b(str2)) {
                return null;
            }
            String optString2 = jSONObject.optString(ImagesContract.URL);
            if (!ia.b(optString2)) {
                uri = Uri.parse(optString2);
            }
            return new a(str, str2, uri, a(jSONObject.optJSONArray("versions")));
        }

        public String b() {
            return this.b;
        }

        private static int[] a(JSONArray jSONArray) {
            if (jSONArray == null) {
                return null;
            }
            int length = jSONArray.length();
            int[] iArr = new int[length];
            for (int i = 0; i < length; i++) {
                int i2 = -1;
                int optInt = jSONArray.optInt(i, -1);
                if (optInt == -1) {
                    String optString = jSONArray.optString(i);
                    if (!ia.b(optString)) {
                        try {
                            i2 = Integer.parseInt(optString);
                        } catch (NumberFormatException e) {
                            ia.a("FacebookSDK", (Exception) e);
                        }
                        iArr[i] = i2;
                    }
                }
                i2 = optInt;
                iArr[i] = i2;
            }
            return iArr;
        }

        public String a() {
            return this.a;
        }
    }

    public A(boolean z, String str, boolean z2, boolean z3, int i2, EnumSet<ea> enumSet, Map<String, Map<String, a>> map, boolean z4, C0559u uVar, String str2, String str3, boolean z5, boolean z6, JSONArray jSONArray, String str4, boolean z7) {
        this.a = z;
        this.b = str;
        this.c = z2;
        this.d = z3;
        this.g = map;
        this.i = uVar;
        this.e = i2;
        this.h = z4;
        this.f = enumSet;
        this.j = str2;
        this.k = str3;
        this.l = z5;
        this.m = z6;
        this.o = jSONArray;
        this.n = str4;
        this.p = z7;
    }

    public boolean a() {
        return this.h;
    }

    public boolean b() {
        return this.m;
    }

    public boolean c() {
        return this.d;
    }

    public C0559u d() {
        return this.i;
    }

    public JSONArray e() {
        return this.o;
    }

    public boolean f() {
        return this.l;
    }

    public String g() {
        return this.b;
    }

    public boolean h() {
        return this.c;
    }

    public String i() {
        return this.n;
    }

    public int j() {
        return this.e;
    }

    public EnumSet<ea> k() {
        return this.f;
    }

    public boolean l() {
        return this.a;
    }
}
