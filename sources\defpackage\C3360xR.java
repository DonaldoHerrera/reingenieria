package defpackage;

import android.annotation.SuppressLint;
import com.soundcloud.android.sync.T;
import com.soundcloud.android.sync.la;
import com.soundcloud.android.sync.na;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: xR reason: default package and case insensitive filesystem */
/* compiled from: FollowingStateProvider.kt */
public class C3360xR {
    /* access modifiers changed from: private */
    public final C6713jVa<C3400zR> a;
    private Set<C3508cda> b = new HashSet();
    @SuppressLint({"sc.MissingCompositeDisposableRecycle"})
    private final UPa c = new UPa();
    private final Cba d;
    private final C5327TLa e;
    private final HPa f;
    private final la g;
    private final T h;

    public C3360xR(Cba cba, C5327TLa tLa, HPa hPa, la laVar, T t) {
        C7471uYa.b(cba, "followingStorage");
        C7471uYa.b(tLa, "eventBus");
        C7471uYa.b(hPa, "scheduler");
        C7471uYa.b(laVar, "syncStateStorage");
        C7471uYa.b(t, "syncInitiator");
        this.d = cba;
        this.e = tLa;
        this.f = hPa;
        this.g = laVar;
        this.h = t;
        C6713jVa<C3400zR> s = C6713jVa.s();
        C7471uYa.a((Object) s, "BehaviorSubject.create<FollowingStatuses>()");
        this.a = s;
    }

    /* access modifiers changed from: private */
    public void c() {
        this.a.a(C3400zR.a(Collections.unmodifiableSet(this.b)));
    }

    public void b() {
        c();
        UPa uPa = this.c;
        C5327TLa tLa = this.e;
        C5443XLa<C3900waa> xLa = C3876taa.t;
        C7471uYa.a((Object) xLa, "EventQueue.FOLLOWING_CHANGED");
        uPa.a(this.d.b().e(C3300uR.a).b(this.f).a(RPa.a()).d((C6776kQa<? super T>) new C3320vR<Object>(this)), tLa.a(xLa).f((C6776kQa<? super T>) new C3340wR<Object>(this)));
    }

    /* access modifiers changed from: private */
    public void a(List<C3508cda> list) {
        this.b = new HashSet(list);
    }

    /* access modifiers changed from: private */
    public void a(C3900waa waa) {
        HashSet hashSet;
        if (waa.b()) {
            hashSet = new HashSet(TWa.b((Set) this.b, (Object) waa.c()));
        } else {
            hashSet = new HashSet(TWa.a((Set) this.b, (Object) waa.c()));
        }
        this.b = hashSet;
    }

    public APa<C3400zR> a() {
        APa aPa;
        if (!this.g.c(na.MY_FOLLOWINGS)) {
            aPa = this.h.a(na.MY_FOLLOWINGS).d((C7118pQa<? super T, ? extends EPa<? extends R>>) new C3280tR<Object,Object>(this)).c((EPa<? extends T>) this.a);
        } else {
            aPa = this.a;
        }
        APa<C3400zR> d2 = aPa.d();
        C7471uYa.a((Object) d2, "if (!syncStateStorage.ha… }.distinctUntilChanged()");
        return d2;
    }
}
