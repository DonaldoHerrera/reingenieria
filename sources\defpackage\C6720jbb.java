package defpackage;

import java.util.Arrays;
import java.util.Map.Entry;

/* renamed from: jbb reason: default package and case insensitive filesystem */
/* compiled from: AnnotationConstructorCaller.kt */
final class C6720jbb extends C7540vYa implements _Xa<Entry<? extends String, ? extends Object>, String> {
    public static final C6720jbb a = new C6720jbb();

    C6720jbb() {
        super(1);
    }

    /* renamed from: a */
    public final String invoke(Entry<String, ? extends Object> entry) {
        String str;
        C7471uYa.b(entry, "entry");
        String str2 = (String) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof boolean[]) {
            str = Arrays.toString((boolean[]) value);
        } else if (value instanceof char[]) {
            str = Arrays.toString((char[]) value);
        } else if (value instanceof byte[]) {
            str = Arrays.toString((byte[]) value);
        } else if (value instanceof short[]) {
            str = Arrays.toString((short[]) value);
        } else if (value instanceof int[]) {
            str = Arrays.toString((int[]) value);
        } else if (value instanceof float[]) {
            str = Arrays.toString((float[]) value);
        } else if (value instanceof long[]) {
            str = Arrays.toString((long[]) value);
        } else if (value instanceof double[]) {
            str = Arrays.toString((double[]) value);
        } else if (value instanceof Object[]) {
            str = Arrays.toString((Object[]) value);
        } else {
            str = value.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append('=');
        sb.append(str);
        return sb.toString();
    }
}
