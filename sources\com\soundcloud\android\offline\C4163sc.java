package com.soundcloud.android.offline;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.soundcloud.android.collections.data.C2862s;
import com.soundcloud.android.collections.data.K;
import com.soundcloud.android.settings.streamingquality.e;
import com.soundcloud.android.settings.streamingquality.e.b;
import com.soundcloud.android.settings.streamingquality.e.b.C0171b;
import com.soundcloud.android.settings.streamingquality.e.b.c;
import com.soundcloud.android.tracks.Ya;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: com.soundcloud.android.offline.sc reason: case insensitive filesystem */
/* compiled from: LoadExpectedContentCommand */
public class C4163sc extends C1255eT<Object, C4157rc> {
    private static final long a = TimeUnit.DAYS.toMillis(30);
    private final K b;
    private final Ya c;
    private final C5479Ypa d;
    private final C6332dsa e;
    private final Gd f;
    private final b g;

    /* renamed from: com.soundcloud.android.offline.sc$a */
    /* compiled from: LoadExpectedContentCommand */
    private static final class a implements Vca {
        /* access modifiers changed from: 0000 */
        public final C3508cda a;
        final long b;
        final String c;
        final boolean d;
        final boolean e;
        final long f;
        final Ue g;
        private final C4928GKa<String> h;

        private a(C3508cda cda, C4928GKa<String> gKa, C3508cda cda2, long j, String str, boolean z, boolean z2, long j2, boolean z3, boolean z4) {
            this.h = gKa;
            this.a = cda;
            this.b = j;
            this.c = str;
            this.d = z;
            this.e = z2;
            this.f = j2;
            this.g = new Ue(cda2, z3, z4);
        }

        public C3508cda a() {
            return this.a;
        }

        public C4928GKa<String> b() {
            return this.h;
        }

        static a a(C3508cda cda, C4928GKa<String> gKa, C3508cda cda2, long j, String str, boolean z, boolean z2, long j2) {
            a aVar = new a(cda, gKa, cda2, j, str, z, z2, j2, true, false);
            return aVar;
        }

        static a b(C3508cda cda, C4928GKa<String> gKa, C3508cda cda2, long j, String str, boolean z, boolean z2, long j2) {
            a aVar = new a(cda, gKa, cda2, j, str, z, z2, j2, false, true);
            return aVar;
        }
    }

    C4163sc(K k, Ya ya, C5479Ypa ypa, C6332dsa dsa, Gd gd, e eVar) {
        this.b = k;
        this.c = ya;
        this.d = ypa;
        this.e = dsa;
        this.f = gd;
        this.g = eVar.b();
    }

    static /* synthetic */ C3508cda a(C3508cda cda, List list) throws Exception {
        return cda;
    }

    static /* synthetic */ C3509cea a(C3509cea cea, C2862s sVar) {
        return cea;
    }

    private Collection<C3508cda> d() {
        return (Collection) this.f.b().a((C7118pQa<? super T, ? extends MPa<? extends R>>) new C4166t<Object,Object>(this)).b();
    }

    /* access modifiers changed from: private */
    public Collection<C3509cea> e(List<C3509cea> list) {
        return C3063jD.a((Collection<E>) list, (Predicate<? super E>) new C4188x<Object>(this));
    }

    private List<a> f() {
        return (List) this.b.a().a((C7118pQa<? super T, ? extends MPa<? extends R>>) new C4198z<Object,Object>(this)).e(new C4149q(this)).e(new C4125m(this)).b();
    }

    private long g() {
        return System.currentTimeMillis() - a;
    }

    private List<a> h() {
        if (e()) {
            return f();
        }
        return Collections.emptyList();
    }

    private List<a> i() {
        return (List) this.f.b().a((C7118pQa<? super T, ? extends MPa<? extends R>>) new C4137o<Object,Object>(this)).a((MPa<U>) this.b.e(), (C6504gQa<? super T, ? super U, ? extends R>) new C4183w<Object,Object,Object>(this)).a((C7118pQa<? super T, ? extends MPa<? extends R>>) new C4172u<Object,Object>(this)).b();
    }

    public /* synthetic */ MPa b(List list) throws Exception {
        return C5263RHa.a(list, this.c.c(C2063HD.a(list, (Function<? super F, ? extends T>) C4097hb.a)), C4131n.a);
    }

    public /* synthetic */ MPa c(List list) throws Exception {
        return APa.a((Iterable<? extends T>) list).a((C7118pQa<? super T, ? extends EPa<? extends R>>) new A<Object,Object>(this)).a((Callable<? extends U>) C4079eb.a, (C6436fQa<? super U, ? super T>) new C4119l<Object,Object>(this));
    }

    private boolean e() {
        return ((Boolean) this.f.c().b()).booleanValue();
    }

    public C4157rc a(Object obj) {
        List h = h();
        return new C4157rc(a(h, i()), d(), e(), C2063HD.a(h, (Function<? super F, ? extends T>) r.a));
    }

    public /* synthetic */ a b(C3509cea cea) {
        return a.a(cea.y(), C4928GKa.b(cea.k()), cea.g(), cea.i(), cea.z(), cea.B(), cea.s(), a(cea.i(), this.g));
    }

    public /* synthetic */ MPa d(List list) throws Exception {
        return this.e.b((Collection<C3508cda>) list).g();
    }

    public /* synthetic */ MPa a(List list) throws Exception {
        return APa.a((Iterable<? extends T>) list).f((C7118pQa<? super T, ? extends C7669xPa<? extends R>>) new C4193y<Object,Object>(this)).a((Callable<? extends U>) C4079eb.a, (C6436fQa<? super U, ? super T>) C4127mb.a);
    }

    /* access modifiers changed from: private */
    public List<Eda> b(List<Eda> list, List<C2862s> list2) {
        Map a2 = C7526vKa.a(list2, C4133nb.a);
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList, new C4143p(this, a2));
        return arrayList;
    }

    public /* synthetic */ C7669xPa a(C3508cda cda) throws Exception {
        return this.d.c(cda).a((C7256rQa<? super T>) C4085fb.a).f(new C4178v(cda));
    }

    private Collection<C4146pc> a(List<a> list, List<a> list2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(list.size() + list2.size());
        ArrayList<a> arrayList = new ArrayList<>(list.size() + list2.size());
        arrayList.addAll(list2);
        arrayList.addAll(list);
        for (a aVar : arrayList) {
            if (linkedHashMap.containsKey(aVar.a)) {
                ((C4146pc) linkedHashMap.get(aVar.a)).h().a(aVar.g);
            } else {
                C3508cda cda = aVar.a;
                linkedHashMap.put(cda, C4146pc.a(cda, aVar.b(), aVar.b, aVar.c, aVar.d, aVar.e, aVar.f, aVar.g));
            }
        }
        return linkedHashMap.values();
    }

    public /* synthetic */ List a(Collection collection) throws Exception {
        return C2063HD.a((List<F>) C2063HD.a((Iterable<? extends E>) collection), (Function<? super F, ? extends T>) new C4160s<Object,Object>(this));
    }

    public /* synthetic */ boolean a(C3509cea cea) {
        return cea != null && cea.x().b().getTime() > g();
    }

    /* access modifiers changed from: private */
    public void a(List<a> list, Collection<C3509cea> collection) {
        for (C3509cea cea : collection) {
            list.add(a.b(cea.y(), C4928GKa.b(cea.k()), cea.g(), cea.i(), cea.z(), cea.B(), cea.s(), a(cea.i(), this.g)));
        }
    }

    public static long a(long j, b bVar) {
        int i;
        if (bVar == C0171b.a) {
            i = 256;
        } else if (bVar == c.a) {
            i = 128;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected streaming quality: ");
            sb.append(bVar);
            throw new IllegalArgumentException(sb.toString());
        }
        return ((TimeUnit.MILLISECONDS.toSeconds(j) * ((long) i)) / 8) * PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
    }

    /* access modifiers changed from: private */
    public APa<Collection<C3509cea>> a(Eda eda) {
        return this.d.c(eda.v()).e(new C4149q(this)).j();
    }

    public /* synthetic */ int a(Map map, Eda eda, Eda eda2) {
        return a(eda2, map).compareTo(a(eda, map));
    }

    private Date a(Eda eda, Map<C3508cda, C2862s> map) {
        return map.containsKey(eda.v()) ? ((C2862s) map.get(eda.v())).b() : eda.b();
    }
}
