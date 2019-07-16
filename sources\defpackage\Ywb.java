package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: Ywb reason: default package */
/* compiled from: _Sequences.kt */
class Ywb extends Uwb {
    public static <T> boolean a(Iwb<? extends T> iwb, T t) {
        C7471uYa.b(iwb, "$this$contains");
        return b(iwb, t) >= 0;
    }

    public static final <T> int b(Iwb<? extends T> iwb, T t) {
        C7471uYa.b(iwb, "$this$indexOf");
        int i = 0;
        for (Object next : iwb) {
            if (i < 0) {
                C6782kWa.c();
                throw null;
            } else if (C7471uYa.a((Object) t, next)) {
                return i;
            } else {
                i++;
            }
        }
        return -1;
    }

    public static <T, R> Iwb<R> c(Iwb<? extends T> iwb, _Xa<? super T, ? extends Iwb<? extends R>> _xa) {
        C7471uYa.b(iwb, "$this$flatMap");
        C7471uYa.b(_xa, "transform");
        return new Fwb(iwb, _xa, Xwb.a);
    }

    public static <T, R> Iwb<R> d(Iwb<? extends T> iwb, _Xa<? super T, ? extends R> _xa) {
        C7471uYa.b(iwb, "$this$map");
        C7471uYa.b(_xa, "transform");
        return new C5679bxb(iwb, _xa);
    }

    public static <T> Iwb<T> e(Iwb<? extends T> iwb) {
        C7471uYa.b(iwb, "$this$filterNotNull");
        Iwb<T> b = b(iwb, (_Xa<? super T, Boolean>) Wwb.a);
        if (b != null) {
            return b;
        }
        throw new OVa("null cannot be cast to non-null type kotlin.sequences.Sequence<T>");
    }

    public static <T> T f(Iwb<? extends T> iwb) {
        C7471uYa.b(iwb, "$this$firstOrNull");
        Iterator it = iwb.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    public static <T> List<T> g(Iwb<? extends T> iwb) {
        C7471uYa.b(iwb, "$this$toList");
        return C6918mWa.b(h(iwb));
    }

    public static <T> List<T> h(Iwb<? extends T> iwb) {
        C7471uYa.b(iwb, "$this$toMutableList");
        ArrayList arrayList = new ArrayList();
        a(iwb, (C) arrayList);
        return arrayList;
    }

    public static <T> Iwb<T> a(Iwb<? extends T> iwb, int i) {
        C7471uYa.b(iwb, "$this$drop");
        if (!(i >= 0)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Requested element count ");
            sb.append(i);
            sb.append(" is less than zero.");
            throw new IllegalArgumentException(sb.toString().toString());
        } else if (i == 0) {
            return iwb;
        } else {
            if (iwb instanceof Awb) {
                return ((Awb) iwb).a(i);
            }
            return new C7850zwb(iwb, i);
        }
    }

    public static <T> Iwb<T> c(Iwb<? extends T> iwb, T t) {
        C7471uYa.b(iwb, "$this$plus");
        return Twb.b(Twb.a((T[]) new Iwb[]{iwb, Twb.a((T[]) new Object[]{t})}));
    }

    public static <T> int d(Iwb<? extends T> iwb) {
        C7471uYa.b(iwb, "$this$count");
        Iterator it = iwb.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                C6782kWa.b();
                throw null;
            }
        }
        return i;
    }

    public static <T, R> Iwb<R> e(Iwb<? extends T> iwb, _Xa<? super T, ? extends R> _xa) {
        C7471uYa.b(iwb, "$this$mapNotNull");
        C7471uYa.b(_xa, "transform");
        return e(new C5679bxb(iwb, _xa));
    }

    public static <T> Iterable<T> c(Iwb<? extends T> iwb) {
        C7471uYa.b(iwb, "$this$asIterable");
        return new Vwb(iwb);
    }

    public static <T> Iwb<T> b(Iwb<? extends T> iwb, _Xa<? super T, Boolean> _xa) {
        C7471uYa.b(iwb, "$this$filterNot");
        C7471uYa.b(_xa, "predicate");
        return new Dwb(iwb, false, _xa);
    }

    public static <T> Iwb<T> f(Iwb<? extends T> iwb, _Xa<? super T, Boolean> _xa) {
        C7471uYa.b(iwb, "$this$takeWhile");
        C7471uYa.b(_xa, "predicate");
        return new _wb(iwb, _xa);
    }

    public static <T> Iwb<T> a(Iwb<? extends T> iwb, _Xa<? super T, Boolean> _xa) {
        C7471uYa.b(iwb, "$this$filter");
        C7471uYa.b(_xa, "predicate");
        return new Dwb(iwb, true, _xa);
    }

    public static final <T, C extends Collection<? super T>> C a(Iwb<? extends T> iwb, C c) {
        C7471uYa.b(iwb, "$this$toCollection");
        C7471uYa.b(c, "destination");
        for (Object add : iwb) {
            c.add(add);
        }
        return c;
    }

    public static <T> Iwb<T> a(Iwb<? extends T> iwb, Iterable<? extends T> iterable) {
        C7471uYa.b(iwb, "$this$plus");
        C7471uYa.b(iterable, "elements");
        return Twb.b(Twb.a((T[]) new Iwb[]{iwb, C7676xWa.d(iterable)}));
    }

    public static final <T, A extends Appendable> A a(Iwb<? extends T> iwb, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, _Xa<? super T, ? extends CharSequence> _xa) {
        C7471uYa.b(iwb, "$this$joinTo");
        C7471uYa.b(a, "buffer");
        C7471uYa.b(charSequence, "separator");
        C7471uYa.b(charSequence2, "prefix");
        C7471uYa.b(charSequence3, "postfix");
        C7471uYa.b(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (Object next : iwb) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            C7852zxb.a(a, next, _xa);
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    public static /* synthetic */ String a(Iwb iwb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, _Xa _xa, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i2 & 2) != 0 ? charSequence5 : charSequence2;
        if ((i2 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        int i3 = (i2 & 8) != 0 ? -1 : i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            _xa = null;
        }
        return a(iwb, charSequence, charSequence6, charSequence5, i3, charSequence7, _xa);
    }

    public static final <T> String a(Iwb<? extends T> iwb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, _Xa<? super T, ? extends CharSequence> _xa) {
        C7471uYa.b(iwb, "$this$joinToString");
        C7471uYa.b(charSequence, "separator");
        C7471uYa.b(charSequence2, "prefix");
        C7471uYa.b(charSequence3, "postfix");
        C7471uYa.b(charSequence4, "truncated");
        StringBuilder sb = new StringBuilder();
        a(iwb, sb, charSequence, charSequence2, charSequence3, i, charSequence4, _xa);
        String sb2 = sb.toString();
        C7471uYa.a((Object) sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }
}
