package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: Bmb reason: default package */
/* compiled from: BinaryVersion.kt */
public abstract class Bmb {
    public static final a a = new a(null);
    private final int b;
    private final int c;
    private final int d;
    private final List<Integer> e;
    private final int[] f;

    /* renamed from: Bmb$a */
    /* compiled from: BinaryVersion.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public Bmb(int... iArr) {
        C7471uYa.b(iArr, "numbers");
        this.f = iArr;
        Integer b2 = C6578hWa.b(this.f, 0);
        int i = -1;
        this.b = b2 != null ? b2.intValue() : -1;
        Integer b3 = C6578hWa.b(this.f, 1);
        this.c = b3 != null ? b3.intValue() : -1;
        Integer b4 = C6578hWa.b(this.f, 2);
        if (b4 != null) {
            i = b4.intValue();
        }
        this.d = i;
        int[] iArr2 = this.f;
        this.e = iArr2.length > 3 ? C7676xWa.q(C6374eWa.a(iArr2).subList(3, this.f.length)) : C6918mWa.a();
    }

    public final int a() {
        return this.b;
    }

    public final int b() {
        return this.c;
    }

    public final int[] c() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (obj != null && C7471uYa.a((Object) getClass(), (Object) obj.getClass())) {
            Bmb bmb = (Bmb) obj;
            if (this.b == bmb.b && this.c == bmb.c && this.d == bmb.d && C7471uYa.a((Object) this.e, (Object) bmb.e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.b;
        int i2 = i + (i * 31) + this.c;
        int i3 = i2 + (i2 * 31) + this.d;
        return i3 + (i3 * 31) + this.e.hashCode();
    }

    public String toString() {
        int[] c2 = c();
        ArrayList arrayList = new ArrayList();
        int length = c2.length;
        for (int i = 0; i < length; i++) {
            int i2 = c2[i];
            if (!(i2 != -1)) {
                break;
            }
            arrayList.add(Integer.valueOf(i2));
        }
        return arrayList.isEmpty() ? "unknown" : C7676xWa.a(arrayList, ".", null, null, 0, null, null, 62, null);
    }

    public final boolean a(Bmb bmb) {
        C7471uYa.b(bmb, "version");
        return a(bmb.b, bmb.c, bmb.d);
    }

    /* access modifiers changed from: protected */
    public final boolean b(Bmb bmb) {
        C7471uYa.b(bmb, "ourVersion");
        int i = this.b;
        if (i == 0) {
            if (bmb.b == 0 && this.c == bmb.c) {
                return true;
            }
        } else if (i == bmb.b && this.c <= bmb.c) {
            return true;
        }
        return false;
    }

    public final boolean a(int i, int i2, int i3) {
        int i4 = this.b;
        boolean z = true;
        if (i4 > i) {
            return true;
        }
        if (i4 < i) {
            return false;
        }
        int i5 = this.c;
        if (i5 > i2) {
            return true;
        }
        if (i5 < i2) {
            return false;
        }
        if (this.d < i3) {
            z = false;
        }
        return z;
    }
}
