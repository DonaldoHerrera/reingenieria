package defpackage;

import com.soundcloud.android.sync.ca;
import com.soundcloud.android.sync.ia;
import com.soundcloud.android.sync.na;
import java.util.LinkedList;
import java.util.List;

/* renamed from: rY reason: default package and case insensitive filesystem */
/* compiled from: DiscoveryOperations */
public class C3858rY {
    private final ca a;
    private final C3874tY b;
    private final C3898wY c;
    private final C3760eea d;
    private final C3792iea e;
    private final HPa f;
    private Aca g;

    C3858rY(ca caVar, C3874tY tYVar, C3898wY wYVar, C3760eea eea, C3792iea iea, HPa hPa, Aca aca) {
        this.a = caVar;
        this.b = tYVar;
        this.c = wYVar;
        this.d = eea;
        this.e = iea;
        this.f = hPa;
        this.g = aca;
    }

    private C7531vPa<C4928GKa<c>> c() {
        return this.b.b().a((C7118pQa<? super T, ? extends C7669xPa<? extends R>>) new C3761fX<Object,Object>(this)).a((C7669xPa<? extends T>) C7531vPa.c(C4928GKa.a()));
    }

    public IPa<C3890vY> a() {
        return this.a.e(na.DISCOVERY_CARDS).a((C7118pQa<? super T, ? extends MPa<? extends R>>) new C3809lX<Object,Object>(this)).a((C7118pQa<? super T, ? extends MPa<? extends R>>) new C3817mX<Object,Object>(this)).b(this.f);
    }

    public IPa<C3890vY> b() {
        return this.a.c(na.DISCOVERY_CARDS).a((C7118pQa<? super T, ? extends MPa<? extends R>>) C3825nX.a).a((C7118pQa<? super T, ? extends MPa<? extends R>>) new C3809lX<Object,Object>(this)).b(this.f);
    }

    static /* synthetic */ MPa a(ia iaVar) throws Exception {
        return iaVar.a() ? IPa.b((Throwable) iaVar.f().b()) : IPa.a(iaVar);
    }

    /* access modifiers changed from: private */
    public IPa<C3890vY> b(ia iaVar) {
        return this.b.a().a((C7669xPa<? extends U>) c(), (C6504gQa<? super T, ? super U, ? extends R>) C3793jX.a).d(C2063HD.a((E[]) new C3503cY[]{new a(iaVar.f())})).e(new C3801kX(this)).e(new C3833oX(iaVar));
    }

    public void a(C3508cda cda) {
        this.c.a(cda);
    }

    static /* synthetic */ List a(List list, C4928GKa gKa) throws Exception {
        LinkedList linkedList = new LinkedList(list);
        gKa.a((C7733yKa<? super T>) new C3769gX<Object>(linkedList));
        return linkedList;
    }

    static /* synthetic */ C3890vY a(ia iaVar, List list) throws Exception {
        return new C3890vY(list, (Throwable) iaVar.f().d());
    }

    /* access modifiers changed from: private */
    public List<C3503cY> a(List<C3503cY> list) {
        if (this.g.a()) {
            list.add(0, new e());
        }
        return list;
    }

    private boolean b(List<C3503cY> list) {
        if (list.isEmpty()) {
            return true;
        }
        for (C3503cY cYVar : list) {
            if (cYVar instanceof a) {
                return true;
            }
        }
        return false;
    }

    public /* synthetic */ C7669xPa a(C3409BY by) throws Exception {
        boolean b2 = this.b.b(by.e());
        C7531vPa a2 = Nda.a(this.d.a(by.c(), a.SYNC_MISSING));
        if (by.b() == null) {
            return a2.f(new C3777hX(by, b2));
        }
        return a2.a((C7669xPa<? extends U>) this.e.b(by.b()), (C6504gQa<? super T, ? super U, ? extends R>) new C3785iX<Object,Object,Object>(by, b2));
    }

    /* access modifiers changed from: private */
    public IPa<C3890vY> a(C3890vY vYVar) {
        if (vYVar.b() != null || !b(vYVar.a())) {
            return IPa.a(vYVar);
        }
        return b();
    }
}
