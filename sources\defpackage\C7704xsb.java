package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: xsb reason: default package and case insensitive filesystem */
/* compiled from: DeserializedMemberScope.kt */
public abstract class C7704xsb extends Fqb {
    static final /* synthetic */ DZa[] a = {HYa.a((DYa) new EYa(HYa.a(C7704xsb.class), "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;")), HYa.a((DYa) new EYa(HYa.a(C7704xsb.class), "variableNamesLazy", "getVariableNamesLazy()Ljava/util/Set;")), HYa.a((DYa) new EYa(HYa.a(C7704xsb.class), "classNames", "getClassNames$deserialization()Ljava/util/Set;"))};
    /* access modifiers changed from: private */
    public final Map<C7694xnb, byte[]> b;
    /* access modifiers changed from: private */
    public final Map<C7694xnb, byte[]> c;
    private final Map<C7694xnb, byte[]> d;
    private final Msb<C7694xnb, Collection<C7684xdb>> e;
    private final Msb<C7694xnb, Collection<C7408tdb>> f;
    private final Nsb<C7694xnb, C4874Edb> g;
    private final Psb h;
    private final Psb i;
    private final Psb j;
    /* access modifiers changed from: private */
    public final C6875lrb k;

    protected C7704xsb(C6875lrb lrb, Collection<Blb> collection, Collection<Olb> collection2, Collection<C5727cmb> collection3, PXa<? extends Collection<C7694xnb>> pXa) {
        Map<C7694xnb, byte[]> map;
        C7471uYa.b(lrb, "c");
        C7471uYa.b(collection, "functionList");
        C7471uYa.b(collection2, "propertyList");
        C7471uYa.b(collection3, "typeAliasList");
        C7471uYa.b(pXa, "classNames");
        this.k = lrb;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next : collection) {
            C7694xnb b2 = Drb.b(this.k.e(), ((Blb) next).o());
            Object obj = linkedHashMap.get(b2);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(b2, obj);
            }
            ((List) obj).add(next);
        }
        this.b = a((Map<C7694xnb, ? extends Collection<? extends Bnb>>) linkedHashMap);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object next2 : collection2) {
            C7694xnb b3 = Drb.b(this.k.e(), ((Olb) next2).o());
            Object obj2 = linkedHashMap2.get(b3);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap2.put(b3, obj2);
            }
            ((List) obj2).add(next2);
        }
        this.c = a((Map<C7694xnb, ? extends Collection<? extends Bnb>>) linkedHashMap2);
        if (this.k.a().e().a()) {
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (Object next3 : collection3) {
                C7694xnb b4 = Drb.b(this.k.e(), ((C5727cmb) next3).r());
                Object obj3 = linkedHashMap3.get(b4);
                if (obj3 == null) {
                    obj3 = new ArrayList();
                    linkedHashMap3.put(b4, obj3);
                }
                ((List) obj3).add(next3);
            }
            map = a((Map<C7694xnb, ? extends Collection<? extends Bnb>>) linkedHashMap3);
        } else {
            map = LWa.a();
        }
        this.d = map;
        this.e = this.k.f().b((_Xa<? super K, ? extends V>) new C7428tsb<Object,Object>(this));
        this.f = this.k.f().b((_Xa<? super K, ? extends V>) new C7497usb<Object,Object>(this));
        this.g = this.k.f().a((_Xa<? super K, ? extends V>) new C7566vsb<Object,Object>(this));
        this.h = this.k.f().a((PXa<? extends T>) new C7359ssb<Object>(this));
        this.i = this.k.f().a((PXa<? extends T>) new C7635wsb<Object>(this));
        this.j = this.k.f().a((PXa<? extends T>) new C7152psb<Object>(pXa));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0023, code lost:
        if (r0 != null) goto L_0x002a;
     */
    public final Collection<C7408tdb> d(C7694xnb xnb) {
        List<Olb> list;
        Map<C7694xnb, byte[]> map = this.c;
        Ynb<Olb> ynb = Olb.d;
        C7471uYa.a((Object) ynb, "ProtoBuf.Property.PARSER");
        byte[] bArr = (byte[]) map.get(xnb);
        if (bArr != null) {
            list = Ywb.g(Twb.a((PXa<? extends T>) new C7290rsb<Object>(new ByteArrayInputStream(bArr), this, ynb)));
        }
        list = C6918mWa.a();
        ArrayList arrayList = new ArrayList();
        for (Olb olb : list) {
            Crb d2 = this.k.d();
            C7471uYa.a((Object) olb, "it");
            arrayList.add(d2.a(olb));
        }
        b(xnb, (Collection<C7408tdb>) arrayList);
        return C7089ovb.a(arrayList);
    }

    /* access modifiers changed from: private */
    public final C4874Edb e(C7694xnb xnb) {
        byte[] bArr = (byte[]) this.d.get(xnb);
        if (bArr != null) {
            C5727cmb a2 = C5727cmb.a((InputStream) new ByteArrayInputStream(bArr), this.k.a().h());
            if (a2 != null) {
                return this.k.d().a(a2);
            }
        }
        return null;
    }

    private final C5029Jcb f(C7694xnb xnb) {
        return this.k.a().a(a(xnb));
    }

    private final Set<C7694xnb> g() {
        return (Set) Rsb.a(this.h, (Object) this, a[0]);
    }

    private final Set<C7694xnb> h() {
        return this.d.keySet();
    }

    private final Set<C7694xnb> i() {
        return (Set) Rsb.a(this.i, (Object) this, a[1]);
    }

    /* access modifiers changed from: protected */
    public abstract C7280rnb a(C7694xnb xnb);

    /* access modifiers changed from: protected */
    public abstract void a(Collection<C5272Rcb> collection, _Xa<? super C7694xnb, Boolean> _xa);

    /* access modifiers changed from: protected */
    public void a(C7694xnb xnb, Collection<C7684xdb> collection) {
        C7471uYa.b(xnb, "name");
        C7471uYa.b(collection, "functions");
    }

    /* access modifiers changed from: protected */
    public void b(C7694xnb xnb, Collection<C7408tdb> collection) {
        C7471uYa.b(xnb, "name");
        C7471uYa.b(collection, "descriptors");
    }

    public final Set<C7694xnb> d() {
        return (Set) Rsb.a(this.j, (Object) this, a[2]);
    }

    /* access modifiers changed from: protected */
    public abstract Set<C7694xnb> e();

    /* access modifiers changed from: protected */
    public abstract Set<C7694xnb> f();

    public Set<C7694xnb> a() {
        return g();
    }

    public Set<C7694xnb> b() {
        return i();
    }

    /* access modifiers changed from: protected */
    public final C6875lrb c() {
        return this.k;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0023, code lost:
        if (r0 != null) goto L_0x002a;
     */
    public final Collection<C7684xdb> c(C7694xnb xnb) {
        List<Blb> list;
        Map<C7694xnb, byte[]> map = this.b;
        Ynb<Blb> ynb = Blb.d;
        C7471uYa.a((Object) ynb, "ProtoBuf.Function.PARSER");
        byte[] bArr = (byte[]) map.get(xnb);
        if (bArr != null) {
            list = Ywb.g(Twb.a((PXa<? extends T>) new C7221qsb<Object>(new ByteArrayInputStream(bArr), this, ynb)));
        }
        list = C6918mWa.a();
        ArrayList arrayList = new ArrayList();
        for (Blb blb : list) {
            Crb d2 = this.k.d();
            C7471uYa.a((Object) blb, "it");
            arrayList.add(d2.a(blb));
        }
        a(xnb, (Collection<C7684xdb>) arrayList);
        return C7089ovb.a(arrayList);
    }

    public Collection<C7684xdb> a(C7694xnb xnb, Dfb dfb) {
        C7471uYa.b(xnb, "name");
        C7471uYa.b(dfb, "location");
        if (!a().contains(xnb)) {
            return C6918mWa.a();
        }
        return (Collection) this.e.invoke(xnb);
    }

    public C5122Mcb b(C7694xnb xnb, Dfb dfb) {
        C7471uYa.b(xnb, "name");
        C7471uYa.b(dfb, "location");
        if (b(xnb)) {
            return f(xnb);
        }
        if (h().contains(xnb)) {
            return (C5122Mcb) this.g.invoke(xnb);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final Collection<C5272Rcb> a(C7700xqb xqb, _Xa<? super C7694xnb, Boolean> _xa, Dfb dfb) {
        C7471uYa.b(xqb, "kindFilter");
        C7471uYa.b(_xa, "nameFilter");
        C7471uYa.b(dfb, "location");
        ArrayList arrayList = new ArrayList(0);
        if (xqb.a(C7700xqb.x.f())) {
            a((Collection<C5272Rcb>) arrayList, _xa);
        }
        a(arrayList, xqb, _xa, dfb);
        if (xqb.a(C7700xqb.x.b())) {
            for (C7694xnb xnb : d()) {
                if (((Boolean) _xa.invoke(xnb)).booleanValue()) {
                    C7089ovb.a(arrayList, f(xnb));
                }
            }
        }
        if (xqb.a(C7700xqb.x.g())) {
            for (C7694xnb xnb2 : h()) {
                if (((Boolean) _xa.invoke(xnb2)).booleanValue()) {
                    C7089ovb.a(arrayList, this.g.invoke(xnb2));
                }
            }
        }
        return C7089ovb.a(arrayList);
    }

    /* access modifiers changed from: protected */
    public boolean b(C7694xnb xnb) {
        C7471uYa.b(xnb, "name");
        return d().contains(xnb);
    }

    public Collection<C7408tdb> c(C7694xnb xnb, Dfb dfb) {
        C7471uYa.b(xnb, "name");
        C7471uYa.b(dfb, "location");
        if (!b().contains(xnb)) {
            return C6918mWa.a();
        }
        return (Collection) this.f.invoke(xnb);
    }

    private final void a(Collection<C5272Rcb> collection, C7700xqb xqb, _Xa<? super C7694xnb, Boolean> _xa, Dfb dfb) {
        String str = "MemberComparator.NameAnd…MemberComparator.INSTANCE";
        if (xqb.a(C7700xqb.x.h())) {
            Set<C7694xnb> b2 = b();
            ArrayList arrayList = new ArrayList();
            for (C7694xnb xnb : b2) {
                if (((Boolean) _xa.invoke(xnb)).booleanValue()) {
                    arrayList.addAll(c(xnb, dfb));
                }
            }
            C6735jpb jpb = C6735jpb.a;
            C7471uYa.a((Object) jpb, str);
            C7262rWa.a(arrayList, jpb);
            collection.addAll(arrayList);
        }
        if (xqb.a(C7700xqb.x.c())) {
            Set<C7694xnb> a2 = a();
            ArrayList arrayList2 = new ArrayList();
            for (C7694xnb xnb2 : a2) {
                if (((Boolean) _xa.invoke(xnb2)).booleanValue()) {
                    arrayList2.addAll(a(xnb2, dfb));
                }
            }
            C6735jpb jpb2 = C6735jpb.a;
            C7471uYa.a((Object) jpb2, str);
            C7262rWa.a(arrayList2, jpb2);
            collection.addAll(arrayList2);
        }
    }

    private final Map<C7694xnb, byte[]> a(Map<C7694xnb, ? extends Collection<? extends Bnb>> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(LWa.a(map.size()));
        for (Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Iterable<Bnb> iterable = (Iterable) entry.getValue();
            ArrayList arrayList = new ArrayList(C6986nWa.a(iterable, 10));
            for (Bnb a2 : iterable) {
                a2.a(byteArrayOutputStream);
                arrayList.add(RVa.a);
            }
            linkedHashMap.put(key, byteArrayOutputStream.toByteArray());
        }
        return linkedHashMap;
    }
}
