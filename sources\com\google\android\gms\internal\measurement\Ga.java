package com.google.android.gms.internal.measurement;

final class Ga<T> extends Ea<T> {
    private final T a;

    Ga(T t) {
        this.a = t;
    }

    public final T a() {
        return this.a;
    }

    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Ga)) {
            return false;
        }
        return this.a.equals(((Ga) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + 1502476572;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
        sb.append("Optional.of(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
