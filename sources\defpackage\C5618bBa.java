package defpackage;

import com.soundcloud.android.accounts.E;
import com.soundcloud.android.accounts.H;
import java.util.concurrent.Callable;

/* renamed from: bBa reason: default package and case insensitive filesystem */
/* compiled from: MeSyncer */
public class C5618bBa implements Callable<Boolean> {
    private final C5327TLa a;
    private final dfa b;
    private final H c;

    public C5618bBa(dfa dfa, C5327TLa tLa, H h) {
        this.b = dfa;
        this.a = tLa;
        this.c = h;
    }

    private E a() throws Exception {
        return (E) this.b.a(hfa.b(C2226PO.ME.a()).c().b(), (C4990IKa<ResourceType>) new C5550aBa<ResourceType>(this));
    }

    public Boolean call() throws Exception {
        E a2 = a();
        this.c.a(a2);
        a(a2);
        return Boolean.valueOf(true);
    }

    private void a(E e) {
        this.a.c(C3876taa.r, C3498bba.a(C3775gda.a(e.b())));
    }
}
