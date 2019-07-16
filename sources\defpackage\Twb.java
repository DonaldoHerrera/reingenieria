package defpackage;

import java.util.Iterator;

/* renamed from: Twb reason: default package */
/* compiled from: Sequences.kt */
class Twb extends Nwb {
    public static <T> Iwb<T> a(Iterator<? extends T> it) {
        C7471uYa.b(it, "$this$asSequence");
        return a((Iwb<? extends T>) new Owb<Object>(it));
    }

    public static final <T> Iwb<T> b(Iwb<? extends Iwb<? extends T>> iwb) {
        C7471uYa.b(iwb, "$this$flatten");
        return a(iwb, (_Xa<? super T, ? extends Iterator<? extends R>>) Pwb.a);
    }

    public static final <T> Iwb<T> a(T... tArr) {
        C7471uYa.b(tArr, "elements");
        return tArr.length == 0 ? a() : C6578hWa.c(tArr);
    }

    public static <T> Iwb<T> a() {
        return Bwb.a;
    }

    private static final <T, R> Iwb<R> a(Iwb<? extends T> iwb, _Xa<? super T, ? extends Iterator<? extends R>> _xa) {
        if (iwb instanceof C5679bxb) {
            return ((C5679bxb) iwb).a(_xa);
        }
        return new Fwb(iwb, Qwb.a, _xa);
    }

    public static final <T> Iwb<T> a(Iwb<? extends T> iwb) {
        C7471uYa.b(iwb, "$this$constrainOnce");
        return iwb instanceof C7712xwb ? iwb : new C7712xwb(iwb);
    }

    public static <T> Iwb<T> a(PXa<? extends T> pXa) {
        C7471uYa.b(pXa, "nextFunction");
        return a((Iwb<? extends T>) new Hwb<Object>(pXa, new Rwb(pXa)));
    }

    public static <T> Iwb<T> a(T t, _Xa<? super T, ? extends T> _xa) {
        C7471uYa.b(_xa, "nextFunction");
        if (t == null) {
            return Bwb.a;
        }
        return new Hwb(new Swb(t), _xa);
    }
}
