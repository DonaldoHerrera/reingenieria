package defpackage;

import java.util.Map;

/* renamed from: Ojb reason: default package */
/* compiled from: predefinedEnhancementInfo.kt */
public final class Ojb {
    /* access modifiers changed from: private */
    public static final C6592hjb a;
    /* access modifiers changed from: private */
    public static final C6592hjb b;
    /* access modifiers changed from: private */
    public static final C6592hjb c;
    private static final Map<String, Pjb> d;

    static {
        C6592hjb hjb = new C6592hjb(C6796kjb.NULLABLE, null, false, false, 8, null);
        a = hjb;
        C6592hjb hjb2 = new C6592hjb(C6796kjb.NOT_NULL, null, false, false, 8, null);
        b = hjb2;
        C6592hjb hjb3 = new C6592hjb(C6796kjb.NOT_NULL, null, true, false, 8, null);
        c = hjb3;
        Lkb lkb = Lkb.a;
        String b2 = lkb.b("Object");
        String a2 = lkb.a("Predicate");
        String a3 = lkb.a("Function");
        String a4 = lkb.a("Consumer");
        String a5 = lkb.a("BiFunction");
        String a6 = lkb.a("BiConsumer");
        String a7 = lkb.a("UnaryOperator");
        String c2 = lkb.c("stream/Stream");
        String c3 = lkb.c("Optional");
        C5589akb akb = new C5589akb();
        Lkb lkb2 = lkb;
        String str = a4;
        String str2 = a2;
        String str3 = a2;
        C7621wjb wjb = r8;
        String str4 = c2;
        String str5 = a4;
        a aVar = new a(akb, lkb.c("Iterator"));
        String str6 = a7;
        String str7 = a7;
        C5589akb akb2 = akb;
        String str8 = a6;
        String str9 = c3;
        String str10 = b2;
        String str11 = a5;
        String str12 = a3;
        String str13 = str9;
        C7621wjb wjb2 = new C7621wjb(lkb2, str, str2, str4, str6, str8, str10, str11, str12, str13);
        aVar.a("forEachRemaining", wjb);
        a aVar2 = new a(akb2, lkb.b("Iterable"));
        String str14 = str5;
        String str15 = str3;
        String str16 = str7;
        Gjb gjb = new Gjb(lkb2, str14, str15, str4, str16, str8, str10, str11, str12, str13);
        aVar2.a("spliterator", gjb);
        a aVar3 = new a(akb2, lkb.c("Collection"));
        Hjb hjb4 = new Hjb(lkb2, str14, str15, str4, str16, str8, str10, str11, str12, str13);
        aVar3.a("removeIf", hjb4);
        Ijb ijb = new Ijb(lkb2, str14, str15, str4, str16, str8, str10, str11, str12, str13);
        aVar3.a("stream", ijb);
        Jjb jjb = new Jjb(lkb2, str14, str15, str4, str16, str8, str10, str11, str12, str13);
        aVar3.a("parallelStream", jjb);
        a aVar4 = new a(akb2, lkb.c("List"));
        Kjb kjb = new Kjb(lkb2, str14, str15, str4, str16, str8, str10, str11, str12, str13);
        String str17 = "replaceAll";
        aVar4.a(str17, kjb);
        a aVar5 = new a(akb2, lkb.c("Map"));
        C5589akb akb3 = akb2;
        String str18 = str17;
        String str19 = b2;
        Ljb ljb = new Ljb(lkb2, str14, str15, str4, str16, str8, str19, str11, str12, str13);
        aVar5.a("forEach", ljb);
        Mjb mjb = new Mjb(lkb2, str14, str15, str4, str16, str8, str19, str11, str12, str13);
        aVar5.a("putIfAbsent", mjb);
        Njb njb = new Njb(lkb2, str14, str15, str4, str16, str8, str19, str11, str12, str13);
        String str20 = "replace";
        aVar5.a(str20, njb);
        String str21 = str18;
        String str22 = str20;
        String str23 = b2;
        C6932mjb mjb2 = new C6932mjb(lkb2, str14, str15, str4, str16, str8, str23, str11, str12, str13);
        aVar5.a(str22, mjb2);
        C7000njb njb2 = new C7000njb(lkb2, str14, str15, str4, str16, str8, str23, str11, str12, str13);
        aVar5.a(str21, njb2);
        C7069ojb ojb = new C7069ojb(lkb2, str14, str15, str4, str16, str8, str23, str11, str12, str13);
        aVar5.a("compute", ojb);
        C7138pjb pjb = new C7138pjb(lkb2, str14, str15, str4, str16, str8, str23, str11, str12, str13);
        aVar5.a("computeIfAbsent", pjb);
        C7207qjb qjb = new C7207qjb(lkb2, str14, str15, str4, str16, str8, str23, str11, str12, str13);
        aVar5.a("computeIfPresent", qjb);
        C7276rjb rjb = new C7276rjb(lkb2, str14, str15, str4, str16, str8, str23, str11, str12, str13);
        aVar5.a("merge", rjb);
        String str24 = str9;
        a aVar6 = new a(akb3, str24);
        C7345sjb sjb = r8;
        String str25 = b2;
        String str26 = str24;
        C7345sjb sjb2 = new C7345sjb(lkb2, str14, str15, str4, str16, str8, str25, str11, str12, str26);
        aVar6.a("empty", sjb);
        C7414tjb tjb = new C7414tjb(lkb2, str14, str15, str4, str16, str8, str25, str11, str12, str26);
        aVar6.a("of", tjb);
        C7483ujb ujb = new C7483ujb(lkb2, str14, str15, str4, str16, str8, str25, str11, str12, str26);
        aVar6.a("ofNullable", ujb);
        C7552vjb vjb = new C7552vjb(lkb2, str14, str15, str4, str16, str8, str25, str11, str12, str26);
        String str27 = "get";
        aVar6.a(str27, vjb);
        String str28 = str27;
        C7690xjb xjb = new C7690xjb(lkb2, str14, str15, str4, str16, str8, b2, str11, str12, str26);
        aVar6.a("ifPresent", xjb);
        C5589akb akb4 = akb3;
        a aVar7 = new a(akb4, lkb.b("ref/Reference"));
        String str29 = a6;
        C5589akb akb5 = akb4;
        C7759yjb yjb = new C7759yjb(lkb2, str14, str15, str4, str16, str8, b2, str11, str12, str26);
        String str30 = str28;
        aVar7.a(str30, yjb);
        String str31 = str3;
        a aVar8 = new a(akb5, str31);
        String str32 = str31;
        C7828zjb zjb = r8;
        String str33 = str29;
        String str34 = str30;
        C7828zjb zjb2 = new C7828zjb(lkb2, str14, str32, str4, str16, str33, b2, str11, str12, str26);
        String str35 = "test";
        aVar8.a(str35, zjb);
        a aVar9 = new a(akb5, lkb.a("BiPredicate"));
        String str36 = str3;
        Lkb lkb3 = lkb;
        String str37 = str35;
        String str38 = b2;
        Ajb ajb = new Ajb(lkb2, str14, str36, str4, str16, str33, str38, str11, str12, str26);
        aVar9.a(str37, ajb);
        String str39 = str5;
        a aVar10 = new a(akb5, str39);
        Lkb lkb4 = lkb3;
        String str40 = str39;
        Bjb bjb = new Bjb(lkb4, str40, str36, str4, str16, str33, str38, str11, str12, str26);
        String str41 = "accept";
        aVar10.a(str41, bjb);
        String str42 = str29;
        a aVar11 = new a(akb5, str42);
        Cjb cjb = r8;
        String str43 = str42;
        String str44 = str41;
        String str45 = b2;
        Cjb cjb2 = new Cjb(lkb4, str40, str36, str4, str16, str43, str45, str11, str12, str26);
        aVar11.a(str44, cjb);
        a aVar12 = new a(akb5, a3);
        String str46 = str5;
        String str47 = str29;
        Djb djb = new Djb(lkb4, str46, str36, str4, str16, str47, str45, str11, str12, str26);
        String str48 = "apply";
        aVar12.a(str48, djb);
        a aVar13 = new a(akb5, a5);
        Ejb ejb = new Ejb(lkb4, str46, str36, str4, str16, str47, str45, str11, str12, str26);
        aVar13.a(str48, ejb);
        Lkb lkb5 = lkb3;
        a aVar14 = new a(akb5, lkb5.a("Supplier"));
        Fjb fjb = new Fjb(lkb5, str46, str36, str4, str16, str47, str45, str11, str12, str26);
        aVar14.a(str34, fjb);
        d = akb5.a();
    }

    public static final Map<String, Pjb> d() {
        return d;
    }
}
