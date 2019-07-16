package defpackage;

/* renamed from: rZa reason: default package and case insensitive filesystem */
/* compiled from: _Ranges.kt */
class C7265rZa extends C7196qZa {
    public static int a(int i, int i2) {
        return i < i2 ? i2 : i;
    }

    public static long a(long j, long j2) {
        return j < j2 ? j2 : j;
    }

    public static C6649iZa a(C6649iZa iza, int i) {
        C7471uYa.b(iza, "$this$step");
        C7196qZa.a(i > 0, Integer.valueOf(i));
        a aVar = C6649iZa.a;
        int first = iza.getFirst();
        int last = iza.getLast();
        if (iza.h() <= 0) {
            i = -i;
        }
        return aVar.a(first, last, i);
    }

    public static int b(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    public static C6649iZa c(int i, int i2) {
        return C6649iZa.a.a(i, i2, -1);
    }

    public static C6785kZa d(int i, int i2) {
        if (i2 <= Integer.MIN_VALUE) {
            return C6785kZa.f.a();
        }
        return new C6785kZa(i, i2 - 1);
    }

    public static int a(int i, int i2, int i3) {
        if (i2 > i3) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot coerce value to an empty range: maximum ");
            sb.append(i3);
            sb.append(" is less than minimum ");
            sb.append(i2);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString());
        } else if (i < i2) {
            return i2;
        } else {
            return i > i3 ? i3 : i;
        }
    }
}
