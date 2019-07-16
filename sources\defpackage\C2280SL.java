package defpackage;

import com.soundcloud.android.foundation.events.E;
import com.soundcloud.android.foundation.events.F;
import com.soundcloud.android.foundation.events.J;

/* renamed from: SL reason: default package and case insensitive filesystem */
/* compiled from: DefaultScreenProvider */
public class C2280SL implements F {
    @a
    private C2350WH<J> a;
    private String b;

    public C2280SL(@a C2350WH<J> wh) {
        this.a = wh;
    }

    static /* synthetic */ boolean a(J j) throws Exception {
        return j instanceof E;
    }

    public Yca b() {
        return Yca.a(this.b);
    }

    public void c() {
        this.a.a((C7256rQa<? super T>) C2070HK.a).a(E.class).f((C6776kQa<? super T>) new C2050GK<Object>(this));
    }

    public /* synthetic */ void a(E e) throws Exception {
        this.b = e.k();
    }

    public String a() {
        return this.b;
    }
}
