package defpackage;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: mnb reason: default package and case insensitive filesystem */
/* compiled from: JvmProtoBufUtil.kt */
public final class C6936mnb {
    private static final Inb a;
    public static final C6936mnb b = new C6936mnb();

    static {
        Inb b2 = Inb.b();
        Xmb.a(b2);
        C7471uYa.a((Object) b2, "ExtensionRegistryLite.ne…f::registerAllExtensions)");
        a = b2;
    }

    private C6936mnb() {
    }

    @NXa
    public static final HVa<C6800knb, Ilb> b(byte[] bArr, String[] strArr) {
        C7471uYa.b(bArr, "bytes");
        C7471uYa.b(strArr, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        return new HVa<>(b.a((InputStream) byteArrayInputStream, strArr), Ilb.a((InputStream) byteArrayInputStream, a));
    }

    @NXa
    public static final HVa<C6800knb, Ilb> c(String[] strArr, String[] strArr2) {
        C7471uYa.b(strArr, "data");
        C7471uYa.b(strArr2, "strings");
        byte[] a2 = C6324dnb.a(strArr);
        C7471uYa.a((Object) a2, "BitEncoding.decodeBytes(data)");
        return b(a2, strArr2);
    }

    public final Inb a() {
        return a;
    }

    @NXa
    public static final HVa<C6800knb, C6458flb> a(String[] strArr, String[] strArr2) {
        C7471uYa.b(strArr, "data");
        C7471uYa.b(strArr2, "strings");
        byte[] a2 = C6324dnb.a(strArr);
        C7471uYa.a((Object) a2, "BitEncoding.decodeBytes(data)");
        return a(a2, strArr2);
    }

    @NXa
    public static final HVa<C6800knb, C6458flb> a(byte[] bArr, String[] strArr) {
        C7471uYa.b(bArr, "bytes");
        C7471uYa.b(strArr, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        return new HVa<>(b.a((InputStream) byteArrayInputStream, strArr), C6458flb.a((InputStream) byteArrayInputStream, a));
    }

    @NXa
    public static final HVa<C6800knb, Blb> b(String[] strArr, String[] strArr2) {
        C7471uYa.b(strArr, "data");
        C7471uYa.b(strArr2, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(C6324dnb.a(strArr));
        return new HVa<>(b.a((InputStream) byteArrayInputStream, strArr2), Blb.a((InputStream) byteArrayInputStream, a));
    }

    private final C6800knb a(InputStream inputStream, String[] strArr) {
        g a2 = g.a(inputStream, a);
        C7471uYa.a((Object) a2, "JvmProtoBuf.StringTableT…this, EXTENSION_REGISTRY)");
        return new C6800knb(a2, strArr);
    }

    public final b a(Blb blb, Emb emb, Jmb jmb) {
        String str;
        Blb blb2 = blb;
        Emb emb2 = emb;
        Jmb jmb2 = jmb;
        C7471uYa.b(blb2, "proto");
        C7471uYa.b(emb2, "nameResolver");
        C7471uYa.b(jmb2, "typeTable");
        f<Blb, c> fVar = Xmb.b;
        C7471uYa.a((Object) fVar, "JvmProtoBuf.methodSignature");
        c cVar = (c) Hmb.a(blb2, fVar);
        int o = (cVar == null || !cVar.m()) ? blb.o() : cVar.k();
        if (cVar == null || !cVar.l()) {
            List b2 = C6918mWa.b(Imb.a(blb2, jmb2));
            List<C7003nmb> y = blb.y();
            C7471uYa.a((Object) y, "proto.valueParameterList");
            ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) y, 10));
            for (C7003nmb nmb : y) {
                C7471uYa.a((Object) nmb, "it");
                arrayList.add(Imb.a(nmb, jmb2));
            }
            List<_lb> c = C7676xWa.c((Collection<? extends T>) b2, (Iterable<? extends T>) arrayList);
            ArrayList arrayList2 = new ArrayList(C6986nWa.a((Iterable<? extends T>) c, 10));
            for (_lb a2 : c) {
                String a3 = b.a(a2, emb2);
                if (a3 == null) {
                    return null;
                }
                arrayList2.add(a3);
            }
            String a4 = a(Imb.b(blb2, jmb2), emb2);
            if (a4 == null) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(C7676xWa.a(arrayList2, "", "(", ")", 0, null, null, 56, null));
            sb.append(a4);
            str = sb.toString();
        } else {
            str = emb2.getString(cVar.j());
        }
        return new b(emb2.getString(o), str);
    }

    public final b a(C6730jlb jlb, Emb emb, Jmb jmb) {
        String str;
        C7471uYa.b(jlb, "proto");
        C7471uYa.b(emb, "nameResolver");
        C7471uYa.b(jmb, "typeTable");
        f<C6730jlb, c> fVar = Xmb.a;
        C7471uYa.a((Object) fVar, "JvmProtoBuf.constructorSignature");
        c cVar = (c) Hmb.a(jlb, fVar);
        String string = (cVar == null || !cVar.m()) ? "<init>" : emb.getString(cVar.k());
        if (cVar == null || !cVar.l()) {
            List<C7003nmb> o = jlb.o();
            C7471uYa.a((Object) o, "proto.valueParameterList");
            ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) o, 10));
            for (C7003nmb nmb : o) {
                C6936mnb mnb = b;
                C7471uYa.a((Object) nmb, "it");
                String a2 = mnb.a(Imb.a(nmb, jmb), emb);
                if (a2 == null) {
                    return null;
                }
                arrayList.add(a2);
            }
            str = C7676xWa.a(arrayList, "", "(", ")V", 0, null, null, 56, null);
        } else {
            str = emb.getString(cVar.j());
        }
        return new b(string, str);
    }

    public static /* synthetic */ a a(C6936mnb mnb, Olb olb, Emb emb, Jmb jmb, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = true;
        }
        return mnb.a(olb, emb, jmb, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005a, code lost:
        if (r4 != null) goto L_0x005c;
     */
    public final a a(Olb olb, Emb emb, Jmb jmb, boolean z) {
        String str;
        C7471uYa.b(olb, "proto");
        C7471uYa.b(emb, "nameResolver");
        C7471uYa.b(jmb, "typeTable");
        f<Olb, e> fVar = Xmb.d;
        C7471uYa.a((Object) fVar, "JvmProtoBuf.propertySignature");
        e eVar = (e) Hmb.a(olb, fVar);
        if (eVar != null) {
            a j = eVar.n() ? eVar.j() : null;
            if (j == null && z) {
                return null;
            }
            int o = (j == null || !j.m()) ? olb.o() : j.k();
            if (j == null || !j.l()) {
                str = a(Imb.b(olb, jmb), emb);
            } else {
                str = emb.getString(j.j());
            }
            return new a(emb.getString(o), str);
        }
        return null;
    }

    private final String a(_lb _lb, Emb emb) {
        if (_lb.D()) {
            return C6460fnb.a(emb.b(_lb.p()));
        }
        return null;
    }

    @NXa
    public static final boolean a(Olb olb) {
        C7471uYa.b(olb, "proto");
        a a2 = C6596hnb.b.a();
        Object a3 = olb.a(Xmb.e);
        C7471uYa.a(a3, "proto.getExtension(JvmProtoBuf.flags)");
        Boolean a4 = a2.a(((Number) a3).intValue());
        C7471uYa.a((Object) a4, "JvmFlags.IS_MOVED_FROM_I…nsion(JvmProtoBuf.flags))");
        return a4.booleanValue();
    }
}
