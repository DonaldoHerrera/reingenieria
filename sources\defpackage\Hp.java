package defpackage;

import android.text.Layout.Alignment;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: Hp reason: default package */
/* compiled from: WebvttCssStyle */
public final class Hp {
    private String a;
    private String b;
    private List<String> c;
    private String d;
    private String e;
    private int f;
    private boolean g;
    private int h;
    private boolean i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private float o;
    private Alignment p;

    public Hp() {
        l();
    }

    public void a(String[] strArr) {
        this.c = Arrays.asList(strArr);
    }

    public void b(String str) {
        this.a = str;
    }

    public void c(String str) {
        this.b = str;
    }

    public void d(String str) {
        this.d = str;
    }

    public int e() {
        return this.n;
    }

    public int f() {
        if (this.l == -1 && this.m == -1) {
            return -1;
        }
        int i2 = 0;
        int i3 = this.l == 1 ? 1 : 0;
        if (this.m == 1) {
            i2 = 2;
        }
        return i3 | i2;
    }

    public Alignment g() {
        return this.p;
    }

    public boolean h() {
        return this.i;
    }

    public boolean i() {
        return this.g;
    }

    public boolean j() {
        return this.j == 1;
    }

    public boolean k() {
        return this.k == 1;
    }

    public void l() {
        String str = "";
        this.a = str;
        this.b = str;
        this.c = Collections.emptyList();
        this.d = str;
        this.e = null;
        this.g = false;
        this.i = false;
        this.j = -1;
        this.k = -1;
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.p = null;
    }

    public int a(String str, String str2, String[] strArr, String str3) {
        if (this.a.isEmpty() && this.b.isEmpty() && this.c.isEmpty() && this.d.isEmpty()) {
            return str2.isEmpty() ? 1 : 0;
        }
        int a2 = a(a(a(0, this.a, str, 1073741824), this.b, str2, 2), this.d, str3, 4);
        if (a2 == -1 || !Arrays.asList(strArr).containsAll(this.c)) {
            return 0;
        }
        return a2 + (this.c.size() * 4);
    }

    public Hp b(boolean z) {
        this.m = z ? 1 : 0;
        return this;
    }

    public Hp c(boolean z) {
        this.k = z ? 1 : 0;
        return this;
    }

    public float d() {
        return this.o;
    }

    public int b() {
        if (this.g) {
            return this.f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public String c() {
        return this.e;
    }

    public Hp b(int i2) {
        this.f = i2;
        this.g = true;
        return this;
    }

    public Hp a(boolean z) {
        this.l = z ? 1 : 0;
        return this;
    }

    public Hp a(String str) {
        this.e = C0471ar.g(str);
        return this;
    }

    public int a() {
        if (this.i) {
            return this.h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public Hp a(int i2) {
        this.h = i2;
        this.i = true;
        return this;
    }

    private static int a(int i2, String str, String str2, int i3) {
        if (!str.isEmpty()) {
            int i4 = -1;
            if (i2 != -1) {
                if (str.equals(str2)) {
                    i4 = i2 + i3;
                }
                return i4;
            }
        }
        return i2;
    }
}
