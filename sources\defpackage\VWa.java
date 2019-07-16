package defpackage;

import java.util.Iterator;
import java.util.List;

/* renamed from: VWa reason: default package */
/* compiled from: SlidingWindow.kt */
public final class VWa {
    public static final void a(int i, int i2) {
        String str;
        if (!(i > 0 && i2 > 0)) {
            String str2 = " must be greater than zero.";
            if (i != i2) {
                StringBuilder sb = new StringBuilder();
                sb.append("Both size ");
                sb.append(i);
                sb.append(" and step ");
                sb.append(i2);
                sb.append(str2);
                str = sb.toString();
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("size ");
                sb2.append(i);
                sb2.append(str2);
                str = sb2.toString();
            }
            throw new IllegalArgumentException(str.toString());
        }
    }

    public static final <T> Iterator<List<T>> a(Iterator<? extends T> it, int i, int i2, boolean z, boolean z2) {
        C7471uYa.b(it, "iterator");
        if (!it.hasNext()) {
            return C7745yWa.a;
        }
        UWa uWa = new UWa(i2, i, it, z2, z, null);
        return Mwb.a(uWa);
    }
}
