package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: hWa reason: default package and case insensitive filesystem */
/* compiled from: _Arrays.kt */
class C6578hWa extends C6374eWa {
    public static <T> boolean a(T[] tArr, T t) {
        C7471uYa.b(tArr, "$this$contains");
        return b(tArr, t) >= 0;
    }

    public static Integer b(int[] iArr, int i) {
        C7471uYa.b(iArr, "$this$getOrNull");
        if (i < 0 || i > c(iArr)) {
            return null;
        }
        return Integer.valueOf(iArr[i]);
    }

    public static final int c(int[] iArr, int i) {
        C7471uYa.b(iArr, "$this$indexOf");
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i == iArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    public static final int d(int[] iArr, int i) {
        C7471uYa.b(iArr, "$this$lastIndexOf");
        for (Number intValue : C7676xWa.l(b(iArr))) {
            int intValue2 = intValue.intValue();
            if (i == iArr[intValue2]) {
                return intValue2;
            }
        }
        return -1;
    }

    public static <T> T e(T[] tArr) {
        C7471uYa.b(tArr, "$this$first");
        if (!(tArr.length == 0)) {
            return tArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static <T> T f(T[] tArr) {
        C7471uYa.b(tArr, "$this$firstOrNull");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[0];
    }

    public static <T> int g(T[] tArr) {
        C7471uYa.b(tArr, "$this$lastIndex");
        return tArr.length - 1;
    }

    public static <T> T h(T[] tArr) {
        C7471uYa.b(tArr, "$this$last");
        if (!(tArr.length == 0)) {
            return tArr[g(tArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static <T> T i(T[] tArr) {
        C7471uYa.b(tArr, "$this$single");
        int length = tArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return tArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    public static <T> List<T> j(T[] tArr) {
        C7471uYa.b(tArr, "$this$toList");
        int length = tArr.length;
        if (length == 0) {
            return C6918mWa.a();
        }
        if (length != 1) {
            return k(tArr);
        }
        return C6850lWa.a(tArr[0]);
    }

    public static final <T> List<T> k(T[] tArr) {
        C7471uYa.b(tArr, "$this$toMutableList");
        return new ArrayList(C6918mWa.a(tArr));
    }

    public static <T> Set<T> l(T[] tArr) {
        C7471uYa.b(tArr, "$this$toSet");
        int length = tArr.length;
        if (length == 0) {
            return SWa.a();
        }
        if (length == 1) {
            return RWa.a(tArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(LWa.a(tArr.length));
        b(tArr, (C) linkedHashSet);
        return linkedHashSet;
    }

    public static <T> Iterable<CWa<T>> m(T[] tArr) {
        C7471uYa.b(tArr, "$this$withIndex");
        return new DWa(new C6510gWa(tArr));
    }

    public static final boolean a(int[] iArr, int i) {
        C7471uYa.b(iArr, "$this$contains");
        return c(iArr, i) >= 0;
    }

    public static <T> int b(T[] tArr, T t) {
        C7471uYa.b(tArr, "$this$indexOf");
        int i = 0;
        if (t == null) {
            int length = tArr.length;
            while (i < length) {
                if (tArr[i] == null) {
                    return i;
                }
                i++;
            }
        } else {
            int length2 = tArr.length;
            while (i < length2) {
                if (C7471uYa.a((Object) t, (Object) tArr[i])) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    public static char a(char[] cArr) {
        C7471uYa.b(cArr, "$this$single");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return cArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    public static <T> List<T> c(T[] tArr, Comparator<? super T> comparator) {
        C7471uYa.b(tArr, "$this$sortedWith");
        C7471uYa.b(comparator, "comparator");
        return C6374eWa.a((T[]) b(tArr, comparator));
    }

    public static final <T> List<T> d(T[] tArr) {
        C7471uYa.b(tArr, "$this$filterNotNull");
        ArrayList arrayList = new ArrayList();
        a(tArr, (C) arrayList);
        return arrayList;
    }

    public static final int c(int[] iArr) {
        C7471uYa.b(iArr, "$this$lastIndex");
        return iArr.length - 1;
    }

    public static List<Integer> d(int[] iArr) {
        C7471uYa.b(iArr, "$this$toList");
        int length = iArr.length;
        if (length == 0) {
            return C6918mWa.a();
        }
        if (length != 1) {
            return e(iArr);
        }
        return C6850lWa.a(Integer.valueOf(iArr[0]));
    }

    public static final List<Integer> e(int[] iArr) {
        C7471uYa.b(iArr, "$this$toMutableList");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int valueOf : iArr) {
            arrayList.add(Integer.valueOf(valueOf));
        }
        return arrayList;
    }

    public static final List<Character> c(char[] cArr) {
        C7471uYa.b(cArr, "$this$toMutableList");
        ArrayList arrayList = new ArrayList(cArr.length);
        for (char valueOf : cArr) {
            arrayList.add(Character.valueOf(valueOf));
        }
        return arrayList;
    }

    public static final <T> T[] b(T[] tArr, Comparator<? super T> comparator) {
        C7471uYa.b(tArr, "$this$sortedArrayWith");
        C7471uYa.b(comparator, "comparator");
        if (tArr.length == 0) {
            return tArr;
        }
        T[] copyOf = Arrays.copyOf(tArr, tArr.length);
        C7471uYa.a((Object) copyOf, "java.util.Arrays.copyOf(this, size)");
        C6374eWa.a(copyOf, comparator);
        return copyOf;
    }

    public static final <C extends Collection<? super T>, T> C a(T[] tArr, C c) {
        C7471uYa.b(tArr, "$this$filterNotNullTo");
        C7471uYa.b(c, "destination");
        for (T t : tArr) {
            if (t != null) {
                c.add(t);
            }
        }
        return c;
    }

    public static <T> Iwb<T> c(T[] tArr) {
        C7471uYa.b(tArr, "$this$asSequence");
        if (tArr.length == 0) {
            return Twb.a();
        }
        return new C6442fWa(tArr);
    }

    public static List<Byte> a(byte[] bArr) {
        C7471uYa.b(bArr, "$this$toList");
        int length = bArr.length;
        if (length == 0) {
            return C6918mWa.a();
        }
        if (length != 1) {
            return b(bArr);
        }
        return C6850lWa.a(Byte.valueOf(bArr[0]));
    }

    public static final C6785kZa b(int[] iArr) {
        C7471uYa.b(iArr, "$this$indices");
        return new C6785kZa(0, c(iArr));
    }

    public static final <T, C extends Collection<? super T>> C b(T[] tArr, C c) {
        C7471uYa.b(tArr, "$this$toCollection");
        C7471uYa.b(c, "destination");
        for (T add : tArr) {
            c.add(add);
        }
        return c;
    }

    public static List<Character> b(char[] cArr) {
        C7471uYa.b(cArr, "$this$toList");
        int length = cArr.length;
        if (length == 0) {
            return C6918mWa.a();
        }
        if (length != 1) {
            return c(cArr);
        }
        return C6850lWa.a(Character.valueOf(cArr[0]));
    }

    public static List<Short> a(short[] sArr) {
        C7471uYa.b(sArr, "$this$toList");
        int length = sArr.length;
        if (length == 0) {
            return C6918mWa.a();
        }
        if (length != 1) {
            return b(sArr);
        }
        return C6850lWa.a(Short.valueOf(sArr[0]));
    }

    public static final List<Byte> b(byte[] bArr) {
        C7471uYa.b(bArr, "$this$toMutableList");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte valueOf : bArr) {
            arrayList.add(Byte.valueOf(valueOf));
        }
        return arrayList;
    }

    public static List<Long> a(long[] jArr) {
        C7471uYa.b(jArr, "$this$toList");
        int length = jArr.length;
        if (length == 0) {
            return C6918mWa.a();
        }
        if (length != 1) {
            return b(jArr);
        }
        return C6850lWa.a(Long.valueOf(jArr[0]));
    }

    public static final List<Short> b(short[] sArr) {
        C7471uYa.b(sArr, "$this$toMutableList");
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short valueOf : sArr) {
            arrayList.add(Short.valueOf(valueOf));
        }
        return arrayList;
    }

    public static final List<Long> b(long[] jArr) {
        C7471uYa.b(jArr, "$this$toMutableList");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long valueOf : jArr) {
            arrayList.add(Long.valueOf(valueOf));
        }
        return arrayList;
    }

    public static List<Float> a(float[] fArr) {
        C7471uYa.b(fArr, "$this$toList");
        int length = fArr.length;
        if (length == 0) {
            return C6918mWa.a();
        }
        if (length != 1) {
            return b(fArr);
        }
        return C6850lWa.a(Float.valueOf(fArr[0]));
    }

    public static final List<Float> b(float[] fArr) {
        C7471uYa.b(fArr, "$this$toMutableList");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float valueOf : fArr) {
            arrayList.add(Float.valueOf(valueOf));
        }
        return arrayList;
    }

    public static final List<Double> b(double[] dArr) {
        C7471uYa.b(dArr, "$this$toMutableList");
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double valueOf : dArr) {
            arrayList.add(Double.valueOf(valueOf));
        }
        return arrayList;
    }

    public static List<Double> a(double[] dArr) {
        C7471uYa.b(dArr, "$this$toList");
        int length = dArr.length;
        if (length == 0) {
            return C6918mWa.a();
        }
        if (length != 1) {
            return b(dArr);
        }
        return C6850lWa.a(Double.valueOf(dArr[0]));
    }

    public static final List<Boolean> b(boolean[] zArr) {
        C7471uYa.b(zArr, "$this$toMutableList");
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean valueOf : zArr) {
            arrayList.add(Boolean.valueOf(valueOf));
        }
        return arrayList;
    }

    public static List<Boolean> a(boolean[] zArr) {
        C7471uYa.b(zArr, "$this$toList");
        int length = zArr.length;
        if (length == 0) {
            return C6918mWa.a();
        }
        if (length != 1) {
            return b(zArr);
        }
        return C6850lWa.a(Boolean.valueOf(zArr[0]));
    }

    public static <T, R> List<R> a(T[] tArr, _Xa<? super T, ? extends R> _xa) {
        C7471uYa.b(tArr, "$this$map");
        C7471uYa.b(_xa, "transform");
        ArrayList arrayList = new ArrayList(tArr.length);
        for (T invoke : tArr) {
            arrayList.add(_xa.invoke(invoke));
        }
        return arrayList;
    }

    public static final <T, A extends Appendable> A a(T[] tArr, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, _Xa<? super T, ? extends CharSequence> _xa) {
        C7471uYa.b(tArr, "$this$joinTo");
        C7471uYa.b(a, "buffer");
        C7471uYa.b(charSequence, "separator");
        C7471uYa.b(charSequence2, "prefix");
        C7471uYa.b(charSequence3, "postfix");
        C7471uYa.b(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (T t : tArr) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            C7852zxb.a(a, t, _xa);
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    public static /* synthetic */ String a(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, _Xa _xa, int i2, Object obj) {
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
        return a(objArr, charSequence, charSequence6, charSequence5, i3, charSequence7, _xa);
    }

    public static final <T> String a(T[] tArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, _Xa<? super T, ? extends CharSequence> _xa) {
        C7471uYa.b(tArr, "$this$joinToString");
        C7471uYa.b(charSequence, "separator");
        C7471uYa.b(charSequence2, "prefix");
        C7471uYa.b(charSequence3, "postfix");
        C7471uYa.b(charSequence4, "truncated");
        StringBuilder sb = new StringBuilder();
        a(tArr, sb, charSequence, charSequence2, charSequence3, i, charSequence4, _xa);
        String sb2 = sb.toString();
        C7471uYa.a((Object) sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    public static <T, R> List<HVa<T, R>> a(T[] tArr, R[] rArr) {
        C7471uYa.b(tArr, "$this$zip");
        C7471uYa.b(rArr, "other");
        int min = Math.min(tArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(NVa.a(tArr[i], rArr[i]));
        }
        return arrayList;
    }
}
