package defpackage;

import java.util.Iterator;

/* renamed from: gxb reason: default package and case insensitive filesystem */
/* compiled from: Strings.kt */
final class C6547gxb implements Iwb<C6785kZa> {
    /* access modifiers changed from: private */
    public final CharSequence a;
    /* access modifiers changed from: private */
    public final int b;
    /* access modifiers changed from: private */
    public final int c;
    /* access modifiers changed from: private */
    public final C6308dYa<CharSequence, Integer, HVa<Integer, Integer>> d;

    public C6547gxb(CharSequence charSequence, int i, int i2, C6308dYa<? super CharSequence, ? super Integer, HVa<Integer, Integer>> dya) {
        C7471uYa.b(charSequence, "input");
        C7471uYa.b(dya, "getNextMatch");
        this.a = charSequence;
        this.b = i;
        this.c = i2;
        this.d = dya;
    }

    public Iterator<C6785kZa> iterator() {
        return new C6479fxb(this);
    }
}
