package defpackage;

import android.annotation.SuppressLint;
import com.soundcloud.android.foundation.events.C;
import com.soundcloud.android.foundation.events.C.a;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: OR reason: default package and case insensitive filesystem */
/* compiled from: RepostsStateProvider */
public class C2210OR implements C1937AR {
    private final C2172MR a;
    private final C6713jVa<C2057GR> b = C6713jVa.s();
    private final C5327TLa c;
    private final HPa d;
    private Set<C3508cda> e = new HashSet();
    @SuppressLint({"sc.MissingCompositeDisposableRecycle"})
    private final UPa f = new UPa();

    public C2210OR(C2172MR mr, C5327TLa tLa, HPa hPa) {
        this.a = mr;
        this.c = tLa;
        this.d = hPa;
    }

    private void d() {
        this.b.a(C2057GR.a(Collections.unmodifiableSet(this.e)));
    }

    public /* synthetic */ void a(List list) throws Exception {
        b(list);
        d();
    }

    /* access modifiers changed from: 0000 */
    public void b(List<C3508cda> list) {
        this.e = new HashSet(list);
    }

    public void c() {
        d();
        this.f.a(this.a.b().b(this.d).a(RPa.a()).d((C6776kQa<? super T>) new C2490cR<Object>(this)), this.c.a(C3876taa.s).f((C6776kQa<? super T>) new C2471bR<Object>(this)));
    }

    /* access modifiers changed from: 0000 */
    public void b(C c2) {
        for (Entry entry : c2.a().entrySet()) {
            if (((a) entry.getValue()).c()) {
                this.e.add(entry.getKey());
            } else {
                this.e.remove(entry.getKey());
            }
        }
    }

    public /* synthetic */ void a(C c2) throws Exception {
        b(c2);
        d();
    }

    public C2057GR a() {
        return (C2057GR) this.b.t();
    }

    public APa<C2057GR> b() {
        return this.b;
    }
}
