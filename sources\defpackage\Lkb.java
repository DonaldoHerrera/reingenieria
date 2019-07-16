package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: Lkb reason: default package */
/* compiled from: methodSignatureBuilding.kt */
public final class Lkb {
    public static final Lkb a = new Lkb();

    private Lkb() {
    }

    /* access modifiers changed from: private */
    public final String d(String str) {
        if (str.length() <= 1) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('L');
        sb.append(str);
        sb.append(';');
        return sb.toString();
    }

    public final String b(String str) {
        C7471uYa.b(str, "name");
        StringBuilder sb = new StringBuilder();
        sb.append("java/lang/");
        sb.append(str);
        return sb.toString();
    }

    public final String c(String str) {
        C7471uYa.b(str, "name");
        StringBuilder sb = new StringBuilder();
        sb.append("java/util/");
        sb.append(str);
        return sb.toString();
    }

    public final String a(String str) {
        C7471uYa.b(str, "name");
        StringBuilder sb = new StringBuilder();
        sb.append("java/util/function/");
        sb.append(str);
        return sb.toString();
    }

    public final LinkedHashSet<String> b(String str, String... strArr) {
        C7471uYa.b(str, "name");
        C7471uYa.b(strArr, "signatures");
        return a(b(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final LinkedHashSet<String> c(String str, String... strArr) {
        C7471uYa.b(str, "name");
        C7471uYa.b(strArr, "signatures");
        return a(c(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final LinkedHashSet<String> a(String str, String... strArr) {
        C7471uYa.b(str, "internalName");
        C7471uYa.b(strArr, "signatures");
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        for (String str2 : strArr) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(".");
            sb.append(str2);
            linkedHashSet.add(sb.toString());
        }
        return linkedHashSet;
    }

    public final String a(C5029Jcb jcb, String str) {
        C7471uYa.b(jcb, "classDescriptor");
        C7471uYa.b(str, "jvmDescriptor");
        return a(Hkb.a(jcb), str);
    }

    public final String a(String str, String str2) {
        C7471uYa.b(str, "internalName");
        C7471uYa.b(str2, "jvmDescriptor");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".");
        sb.append(str2);
        return sb.toString();
    }

    public final String a(String str, List<String> list, String str2) {
        C7471uYa.b(str, "name");
        C7471uYa.b(list, "parameters");
        C7471uYa.b(str2, "ret");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('(');
        List<String> list2 = list;
        sb.append(C7676xWa.a(list2, "", null, null, 0, null, Kkb.a, 30, null));
        sb.append(')');
        sb.append(d(str2));
        return sb.toString();
    }

    public final String[] a(String... strArr) {
        C7471uYa.b(strArr, "signatures");
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            StringBuilder sb = new StringBuilder();
            sb.append("<init>(");
            sb.append(str);
            sb.append(")V");
            arrayList.add(sb.toString());
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new OVa("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
