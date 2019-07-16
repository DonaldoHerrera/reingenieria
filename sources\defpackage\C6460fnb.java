package defpackage;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: fnb reason: default package and case insensitive filesystem */
/* compiled from: ClassMapperLite.kt */
public final class C6460fnb {
    private static final Map<String, String> a;
    public static final C6460fnb b = new C6460fnb();

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List b2 = C6918mWa.b((Object[]) new String[]{"Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D"});
        C6649iZa a2 = C7265rZa.a((C6649iZa) C6918mWa.a((Collection) b2), 2);
        int first = a2.getFirst();
        int last = a2.getLast();
        int h = a2.h();
        if (h < 0 ? first >= last : first <= last) {
            while (true) {
                StringBuilder sb = new StringBuilder();
                String str = "kotlin/";
                sb.append(str);
                sb.append((String) b2.get(first));
                int i = first + 1;
                linkedHashMap.put(sb.toString(), b2.get(i));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append((String) b2.get(first));
                sb2.append("Array");
                String sb3 = sb2.toString();
                StringBuilder sb4 = new StringBuilder();
                sb4.append('[');
                sb4.append((String) b2.get(i));
                linkedHashMap.put(sb3, sb4.toString());
                if (first == last) {
                    break;
                }
                first += h;
            }
        }
        linkedHashMap.put("kotlin/Unit", "V");
        C6392enb enb = new C6392enb(linkedHashMap);
        enb.a("Any", "java/lang/Object");
        enb.a("Nothing", "java/lang/Void");
        enb.a("Annotation", "java/lang/annotation/Annotation");
        for (String str2 : C6918mWa.b((Object[]) new String[]{"String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum"})) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("java/lang/");
            sb5.append(str2);
            enb.a(str2, sb5.toString());
        }
        for (String str3 : C6918mWa.b((Object[]) new String[]{"Iterator", "Collection", "List", "Set", "Map", "ListIterator"})) {
            StringBuilder sb6 = new StringBuilder();
            sb6.append("collections/");
            sb6.append(str3);
            String sb7 = sb6.toString();
            StringBuilder sb8 = new StringBuilder();
            String str4 = "java/util/";
            sb8.append(str4);
            sb8.append(str3);
            enb.a(sb7, sb8.toString());
            StringBuilder sb9 = new StringBuilder();
            sb9.append("collections/Mutable");
            sb9.append(str3);
            String sb10 = sb9.toString();
            StringBuilder sb11 = new StringBuilder();
            sb11.append(str4);
            sb11.append(str3);
            enb.a(sb10, sb11.toString());
        }
        String str5 = "java/lang/Iterable";
        enb.a("collections/Iterable", str5);
        enb.a("collections/MutableIterable", str5);
        String str6 = "java/util/Map$Entry";
        enb.a("collections/Map.Entry", str6);
        enb.a("collections/MutableMap.MutableEntry", str6);
        for (int i2 = 0; i2 <= 22; i2++) {
            StringBuilder sb12 = new StringBuilder();
            sb12.append("Function");
            sb12.append(i2);
            String sb13 = sb12.toString();
            StringBuilder sb14 = new StringBuilder();
            sb14.append("kotlin/jvm/functions/Function");
            sb14.append(i2);
            enb.a(sb13, sb14.toString());
            StringBuilder sb15 = new StringBuilder();
            sb15.append("reflect/KFunction");
            sb15.append(i2);
            enb.a(sb15.toString(), "kotlin/reflect/KFunction");
        }
        for (String str7 : C6918mWa.b((Object[]) new String[]{"Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum"})) {
            StringBuilder sb16 = new StringBuilder();
            sb16.append(str7);
            sb16.append(".Companion");
            String sb17 = sb16.toString();
            StringBuilder sb18 = new StringBuilder();
            sb18.append("kotlin/jvm/internal/");
            sb18.append(str7);
            sb18.append("CompanionObject");
            enb.a(sb17, sb18.toString());
        }
        a = linkedHashMap;
    }

    private C6460fnb() {
    }

    @NXa
    public static final String a(String str) {
        C7471uYa.b(str, "classId");
        String str2 = (String) a.get(str);
        if (str2 != null) {
            return str2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('L');
        sb.append(Cxb.a(str, '.', '$', false, 4, (Object) null));
        sb.append(';');
        return sb.toString();
    }
}
