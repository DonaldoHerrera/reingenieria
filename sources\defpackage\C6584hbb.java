package defpackage;

import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: hbb reason: default package and case insensitive filesystem */
/* compiled from: AnnotationConstructorCaller.kt */
final class C6584hbb extends C7540vYa implements PXa<Integer> {
    final /* synthetic */ Map a;

    C6584hbb(Map map) {
        this.a = map;
        super(0);
    }

    public final int d() {
        int i;
        int i2 = 0;
        for (Entry entry : this.a.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof boolean[]) {
                i = Arrays.hashCode((boolean[]) value);
            } else if (value instanceof char[]) {
                i = Arrays.hashCode((char[]) value);
            } else if (value instanceof byte[]) {
                i = Arrays.hashCode((byte[]) value);
            } else if (value instanceof short[]) {
                i = Arrays.hashCode((short[]) value);
            } else if (value instanceof int[]) {
                i = Arrays.hashCode((int[]) value);
            } else if (value instanceof float[]) {
                i = Arrays.hashCode((float[]) value);
            } else if (value instanceof long[]) {
                i = Arrays.hashCode((long[]) value);
            } else if (value instanceof double[]) {
                i = Arrays.hashCode((double[]) value);
            } else if (value instanceof Object[]) {
                i = Arrays.hashCode((Object[]) value);
            } else {
                i = value.hashCode();
            }
            i2 += i ^ (str.hashCode() * 127);
        }
        return i2;
    }
}
