package defpackage;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: nnb reason: default package and case insensitive filesystem */
/* compiled from: ModuleMapping.kt */
public final class C7004nnb {
    public static final C7004nnb a = new C7004nnb(LWa.a(), new C5728cnb(C6918mWa.a()), "EMPTY");
    public static final C7004nnb b = new C7004nnb(LWa.a(), new C5728cnb(C6918mWa.a()), "CORRUPTED");
    public static final a c = new a(null);
    private final Map<String, C7142pnb> d;
    private final C5728cnb e;
    private final String f;

    /* renamed from: nnb$a */
    /* compiled from: ModuleMapping.kt */
    public static final class a {
        private a() {
        }

        public final C7004nnb a(byte[] bArr, String str, boolean z, boolean z2, _Xa<? super C6732jnb, RVa> _xa) {
            String str2;
            String str3;
            String str4;
            String str5;
            byte[] bArr2 = bArr;
            String str6 = str;
            _Xa<? super C6732jnb, RVa> _xa2 = _xa;
            C7471uYa.b(str6, "debugName");
            C7471uYa.b(_xa2, "reportIncompatibleVersionError");
            if (bArr2 == null) {
                return C7004nnb.a;
            }
            DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr2));
            try {
                int[] iArr = new int[dataInputStream.readInt()];
                int length = iArr.length;
                for (int i = 0; i < length; i++) {
                    iArr[i] = dataInputStream.readInt();
                }
                C6732jnb jnb = new C6732jnb(Arrays.copyOf(iArr, iArr.length));
                if (z || jnb.d()) {
                    C6732jnb jnb2 = new C6732jnb(iArr, ((Nmb.a(jnb) ? dataInputStream.readInt() : 0) & 1) != 0);
                    if (z || jnb2.d()) {
                        Qmb a = Qmb.a((InputStream) dataInputStream);
                        if (a == null) {
                            return C7004nnb.a;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        Iterator it = a.p().iterator();
                        while (true) {
                            str2 = "proto.shortClassNameList";
                            str3 = "proto";
                            if (!it.hasNext()) {
                                break;
                            }
                            Tmb tmb = (Tmb) it.next();
                            C7471uYa.a((Object) tmb, str3);
                            String o = tmb.o();
                            C7471uYa.a((Object) o, "packageFqName");
                            Object obj = linkedHashMap.get(o);
                            if (obj == null) {
                                obj = new C7142pnb(o);
                                linkedHashMap.put(o, obj);
                            }
                            C7142pnb pnb = (C7142pnb) obj;
                            Znb q = tmb.q();
                            C7471uYa.a((Object) q, str2);
                            Iterator it2 = q.iterator();
                            int i2 = 0;
                            while (true) {
                                str4 = "proto.multifileFacadeShortNameList";
                                str5 = "partShortName";
                                if (!it2.hasNext()) {
                                    break;
                                }
                                String str7 = (String) it2.next();
                                C7471uYa.a((Object) str7, str5);
                                String a2 = C7073onb.b(o, str7);
                                List m = tmb.m();
                                C7471uYa.a((Object) m, "proto.multifileFacadeShortNameIdList");
                                Znb n = tmb.n();
                                C7471uYa.a((Object) n, str4);
                                pnb.a(a2, a(m, n, i2, o));
                                i2++;
                            }
                            if (z2) {
                                Znb<String> k = tmb.k();
                                C7471uYa.a((Object) k, "proto.classWithJvmPackageNameShortNameList");
                                int i3 = 0;
                                for (String str8 : k) {
                                    List j = tmb.j();
                                    String str9 = "proto.classWithJvmPackageNamePackageIdList";
                                    C7471uYa.a((Object) j, str9);
                                    Integer num = (Integer) C7676xWa.d(j, i3);
                                    if (num == null) {
                                        List j2 = tmb.j();
                                        C7471uYa.a((Object) j2, str9);
                                        num = (Integer) C7676xWa.i(j2);
                                    }
                                    if (num != null) {
                                        int intValue = num.intValue();
                                        Znb l = a.l();
                                        C7471uYa.a((Object) l, "moduleProto.jvmPackageNameList");
                                        String str10 = (String) C7676xWa.d((List<? extends T>) l, intValue);
                                        if (str10 != null) {
                                            C7471uYa.a((Object) str8, str5);
                                            String a3 = C7073onb.b(str10, str8);
                                            List h = tmb.h();
                                            C7471uYa.a((Object) h, "proto.classWithJvmPackag…fileFacadeShortNameIdList");
                                            Znb n2 = tmb.n();
                                            C7471uYa.a((Object) n2, str4);
                                            pnb.a(a3, a(h, n2, i3, str10));
                                        }
                                    }
                                    i3++;
                                }
                            }
                        }
                        for (Tmb tmb2 : a.n()) {
                            C7471uYa.a((Object) tmb2, str3);
                            String o2 = tmb2.o();
                            String str11 = "proto.packageFqName";
                            C7471uYa.a((Object) o2, str11);
                            Object obj2 = linkedHashMap.get(o2);
                            if (obj2 == null) {
                                String o3 = tmb2.o();
                                C7471uYa.a((Object) o3, str11);
                                obj2 = new C7142pnb(o3);
                                linkedHashMap.put(o2, obj2);
                            }
                            C7142pnb pnb2 = (C7142pnb) obj2;
                            Znb<String> q2 = tmb2.q();
                            C7471uYa.a((Object) q2, str2);
                            for (String a4 : q2) {
                                pnb2.a(a4);
                            }
                        }
                        Wlb r = a.r();
                        C7471uYa.a((Object) r, "moduleProto.stringTable");
                        Rlb q3 = a.q();
                        C7471uYa.a((Object) q3, "moduleProto.qualifiedNameTable");
                        Gmb gmb = new Gmb(r, q3);
                        List<C5590alb> j3 = a.j();
                        C7471uYa.a((Object) j3, "moduleProto.annotationList");
                        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) j3, 10));
                        for (C5590alb alb : j3) {
                            C7471uYa.a((Object) alb, str3);
                            arrayList.add(gmb.b(alb.l()));
                        }
                        return new C7004nnb(linkedHashMap, new C5728cnb(arrayList), str6, null);
                    }
                    _xa2.invoke(jnb2);
                    return C7004nnb.a;
                }
                _xa2.invoke(jnb);
                return C7004nnb.a;
            } catch (IOException unused) {
                return C7004nnb.b;
            }
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }

        private final String a(List<Integer> list, List<String> list2, int i, String str) {
            Integer num = (Integer) C7676xWa.d(list, i);
            Integer valueOf = num != null ? Integer.valueOf(num.intValue() - 1) : null;
            String str2 = valueOf != null ? (String) C7676xWa.d(list2, valueOf.intValue()) : null;
            if (str2 != null) {
                return C7073onb.b(str, str2);
            }
            return null;
        }
    }

    private C7004nnb(Map<String, C7142pnb> map, C5728cnb cnb, String str) {
        this.d = map;
        this.e = cnb;
        this.f = str;
    }

    public final Map<String, C7142pnb> a() {
        return this.d;
    }

    public String toString() {
        return this.f;
    }

    public /* synthetic */ C7004nnb(Map map, C5728cnb cnb, String str, C7264rYa rya) {
        this(map, cnb, str);
    }
}
