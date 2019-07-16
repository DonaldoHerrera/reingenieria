package defpackage;

/* renamed from: Lvb reason: default package */
/* compiled from: IntTree */
final class Lvb<V> {
    static final Lvb<Object> a = new Lvb<>();
    private final long b;
    private final V c;
    private final Lvb<V> d;
    private final Lvb<V> e;
    private final int f;

    private Lvb() {
        this.f = 0;
        this.b = 0;
        this.c = null;
        this.d = null;
        this.e = null;
    }

    private Lvb<V> b(long j) {
        if (this.f == 0 || j == this.b) {
            return this;
        }
        Lvb lvb = new Lvb(j, this.c, this.d, this.e);
        return lvb;
    }

    /* access modifiers changed from: 0000 */
    public V a(long j) {
        if (this.f == 0) {
            return null;
        }
        long j2 = this.b;
        if (j < j2) {
            return this.d.a(j - j2);
        }
        if (j > j2) {
            return this.e.a(j - j2);
        }
        return this.c;
    }

    /* access modifiers changed from: 0000 */
    public Lvb<V> a(long j, V v) {
        if (this.f == 0) {
            Lvb lvb = new Lvb(j, v, this, this);
            return lvb;
        }
        long j2 = this.b;
        if (j < j2) {
            return a(this.d.a(j - j2, v), this.e);
        }
        if (j > j2) {
            return a(this.d, this.e.a(j - j2, v));
        }
        if (v == this.c) {
            return this;
        }
        Lvb lvb2 = new Lvb(j, v, this.d, this.e);
        return lvb2;
    }

    private Lvb(long j, V v, Lvb<V> lvb, Lvb<V> lvb2) {
        this.b = j;
        this.c = v;
        this.d = lvb;
        this.e = lvb2;
        this.f = lvb.f + 1 + lvb2.f;
    }

    private Lvb<V> a(Lvb<V> lvb, Lvb<V> lvb2) {
        if (lvb == this.d && lvb2 == this.e) {
            return this;
        }
        return a(this.b, this.c, lvb, lvb2);
    }

    private static <V> Lvb<V> a(long j, V v, Lvb<V> lvb, Lvb<V> lvb2) {
        Lvb<V> lvb3 = lvb;
        Lvb<V> lvb4 = lvb2;
        int i = lvb3.f;
        int i2 = lvb4.f;
        if (i + i2 > 1) {
            if (i >= i2 * 5) {
                Lvb<V> lvb5 = lvb3.d;
                Lvb<V> lvb6 = lvb3.e;
                if (lvb6.f < lvb5.f * 2) {
                    long j2 = lvb3.b;
                    long j3 = j2 + j;
                    V v2 = lvb3.c;
                    Lvb lvb7 = new Lvb(-j2, v, lvb6.b(lvb6.b + j2), lvb2);
                    Lvb lvb8 = new Lvb(j3, v2, lvb5, lvb7);
                    return lvb8;
                }
                Lvb<V> lvb9 = lvb6.d;
                Lvb<V> lvb10 = lvb6.e;
                long j4 = lvb6.b;
                long j5 = lvb3.b + j4 + j;
                V v3 = lvb6.c;
                long j6 = -j4;
                V v4 = v3;
                Lvb lvb11 = new Lvb(j6, lvb3.c, lvb5, lvb9.b(lvb9.b + j4));
                long j7 = lvb3.b;
                long j8 = -j7;
                long j9 = lvb6.b;
                V v5 = v4;
                Lvb lvb12 = new Lvb(j8 - j9, v, lvb10.b(lvb10.b + j9 + j7), lvb2);
                Lvb lvb13 = new Lvb(j5, v5, lvb11, lvb12);
                return lvb13;
            } else if (i2 >= i * 5) {
                Lvb<V> lvb14 = lvb2;
                Lvb<V> lvb15 = lvb14.d;
                Lvb<V> lvb16 = lvb14.e;
                if (lvb15.f < lvb16.f * 2) {
                    long j10 = lvb14.b;
                    long j11 = j10 + j;
                    V v6 = lvb14.c;
                    Lvb lvb17 = new Lvb(-j10, v, lvb, lvb15.b(lvb15.b + j10));
                    Lvb lvb18 = new Lvb(j11, v6, lvb17, lvb16);
                    return lvb18;
                }
                Lvb<V> lvb19 = lvb15.d;
                Lvb<V> lvb20 = lvb15.e;
                long j12 = lvb15.b;
                long j13 = lvb14.b;
                long j14 = j12 + j13 + j;
                V v7 = lvb15.c;
                long j15 = j14;
                Lvb lvb21 = new Lvb((-j13) - j12, v, lvb, lvb19.b(lvb19.b + j12 + j13));
                long j16 = lvb15.b;
                Lvb lvb22 = new Lvb(-j16, lvb14.c, lvb20.b(lvb20.b + j16), lvb16);
                Lvb lvb23 = new Lvb(j15, v7, lvb21, lvb22);
                return lvb23;
            } else {
                Lvb<V> lvb24 = lvb2;
            }
        }
        Lvb lvb25 = new Lvb(j, v, lvb, lvb2);
        return lvb25;
    }
}
