package defpackage;

import java.util.Map;

/* renamed from: enb reason: default package and case insensitive filesystem */
/* compiled from: ClassMapperLite.kt */
final class C6392enb extends C7540vYa implements C6308dYa<String, String, RVa> {
    final /* synthetic */ Map a;

    C6392enb(Map map) {
        this.a = map;
        super(2);
    }

    public final void a(String str, String str2) {
        C7471uYa.b(str, "kotlinSimpleName");
        C7471uYa.b(str2, "javaInternalName");
        Map map = this.a;
        StringBuilder sb = new StringBuilder();
        sb.append("kotlin/");
        sb.append(str);
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append('L');
        sb3.append(str2);
        sb3.append(';');
        map.put(sb2, sb3.toString());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((String) obj, (String) obj2);
        return RVa.a;
    }
}
