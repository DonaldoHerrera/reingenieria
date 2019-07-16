package defpackage;

import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: Bw reason: default package and case insensitive filesystem */
final class C0194Bw extends C0260Tv<Float> implements C0213Hw<Float>, C1769ux, RandomAccess {
    private static final C0194Bw b;
    private float[] c;
    private int d;

    static {
        C0194Bw bw = new C0194Bw(new float[0], 0);
        b = bw;
        bw.O();
    }

    C0194Bw() {
        this(new float[10], 0);
    }

    private final void c(int i) {
        if (i < 0 || i >= this.d) {
            throw new IndexOutOfBoundsException(m(i));
        }
    }

    private final String m(int i) {
        int i2 = this.d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final void a(float f) {
        a(this.d, f);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        a(i, ((Float) obj).floatValue());
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        c();
        C0209Gw.a(collection);
        if (!(collection instanceof C0194Bw)) {
            return super.addAll(collection);
        }
        C0194Bw bw = (C0194Bw) collection;
        int i = bw.d;
        if (i == 0) {
            return false;
        }
        int i2 = this.d;
        if (BaseClientBuilder.API_PRIORITY_OTHER - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.c;
            if (i3 > fArr.length) {
                this.c = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(bw.c, 0, this.c, this.d, bw.d);
            this.d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final /* synthetic */ C0213Hw b(int i) {
        if (i >= this.d) {
            return new C0194Bw(Arrays.copyOf(this.c, i), this.d);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0194Bw)) {
            return super.equals(obj);
        }
        C0194Bw bw = (C0194Bw) obj;
        if (this.d != bw.d) {
            return false;
        }
        float[] fArr = bw.c;
        for (int i = 0; i < this.d; i++) {
            if (Float.floatToIntBits(this.c[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        c(i);
        return Float.valueOf(this.c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.d; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.c[i2]);
        }
        return i;
    }

    public final boolean remove(Object obj) {
        c();
        for (int i = 0; i < this.d; i++) {
            if (obj.equals(Float.valueOf(this.c[i]))) {
                float[] fArr = this.c;
                System.arraycopy(fArr, i + 1, fArr, i, (this.d - i) - 1);
                this.d--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        c();
        if (i2 >= i) {
            float[] fArr = this.c;
            System.arraycopy(fArr, i2, fArr, i, this.d - i2);
            this.d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        c();
        c(i);
        float[] fArr = this.c;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    public final int size() {
        return this.d;
    }

    private C0194Bw(float[] fArr, int i) {
        this.c = fArr;
        this.d = i;
    }

    private final void a(int i, float f) {
        c();
        if (i >= 0) {
            int i2 = this.d;
            if (i <= i2) {
                float[] fArr = this.c;
                if (i2 < fArr.length) {
                    System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
                } else {
                    float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
                    System.arraycopy(fArr, 0, fArr2, 0, i);
                    System.arraycopy(this.c, i, fArr2, i + 1, this.d - i);
                    this.c = fArr2;
                }
                this.c[i] = f;
                this.d++;
                this.modCount++;
                return;
            }
        }
        throw new IndexOutOfBoundsException(m(i));
    }

    public final /* synthetic */ Object remove(int i) {
        c();
        c(i);
        float[] fArr = this.c;
        float f = fArr[i];
        int i2 = this.d;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.d--;
        this.modCount++;
        return Float.valueOf(f);
    }
}
