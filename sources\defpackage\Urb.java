package defpackage;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: Urb reason: default package */
/* compiled from: BuiltInsLoaderImpl.kt */
public final class Urb implements C5028Jbb {
    private final Wrb a = new Wrb();

    public C6858ldb a(Ssb ssb, C6450fdb fdb, Iterable<? extends C7547veb> iterable, C7616web web, C7478ueb ueb) {
        C7471uYa.b(ssb, "storageManager");
        C7471uYa.b(fdb, "builtInsModule");
        C7471uYa.b(iterable, "classDescriptorFactories");
        C7471uYa.b(web, "platformDependentDeclarationFilter");
        C7471uYa.b(ueb, "additionalClassPartsProvider");
        Set<C7349snb> set = C5301Sbb.g;
        C7471uYa.a((Object) set, "KotlinBuiltIns.BUILT_INS_PACKAGE_FQ_NAMES");
        return a(ssb, fdb, set, iterable, web, ueb, new Trb(this.a));
    }

    public final C6858ldb a(Ssb ssb, C6450fdb fdb, Set<C7349snb> set, Iterable<? extends C7547veb> iterable, C7616web web, C7478ueb ueb, _Xa<? super String, ? extends InputStream> _xa) {
        Ssb ssb2 = ssb;
        C6450fdb fdb2 = fdb;
        Set<C7349snb> set2 = set;
        _Xa<? super String, ? extends InputStream> _xa2 = _xa;
        C7471uYa.b(ssb2, "storageManager");
        C7471uYa.b(fdb2, "module");
        C7471uYa.b(set2, "packageFqNames");
        C7471uYa.b(iterable, "classDescriptorFactories");
        C7471uYa.b(web, "platformDependentDeclarationFilter");
        C7471uYa.b(ueb, "additionalClassPartsProvider");
        C7471uYa.b(_xa2, "loadResource");
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) set2, 10));
        for (C7349snb snb : set) {
            String b = Srb.n.b(snb);
            InputStream inputStream = (InputStream) _xa2.invoke(b);
            if (inputStream != null) {
                arrayList.add(Vrb.m.a(snb, ssb2, fdb2, inputStream));
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Resource not found in classpath: ");
                sb.append(b);
                throw new IllegalStateException(sb.toString());
            }
        }
        C7063odb odb = r10;
        C7063odb odb2 = new C7063odb(arrayList);
        C6586hdb hdb = r7;
        C6586hdb hdb2 = new C6586hdb(ssb2, fdb2);
        a aVar = a.a;
        C6943mrb mrb = r5;
        C6943mrb mrb2 = new C6943mrb(odb2);
        C5599arb arb = r8;
        C5599arb arb2 = new C5599arb(fdb2, hdb2, Srb.n);
        a aVar2 = a.a;
        C7357srb srb = C7357srb.a;
        C7357srb srb2 = srb;
        C7471uYa.a((Object) srb, "ErrorReporter.DO_NOTHING");
        C6739jrb jrb = r0;
        C7063odb odb3 = odb2;
        ArrayList<Vrb> arrayList2 = arrayList;
        C6739jrb jrb2 = jrb;
        C6739jrb jrb3 = new C6739jrb(ssb, fdb, aVar, mrb, arb, odb, aVar2, srb2, a.a, a.a, iterable, hdb, C6671irb.a.a(), ueb, web, Srb.n.e());
        for (Vrb a2 : arrayList2) {
            a2.a(jrb2);
        }
        return odb3;
    }
}
