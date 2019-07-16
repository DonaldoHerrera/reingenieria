package com.google.android.gms.internal.measurement;

final class Ca<T> extends Ea<T> {
    static final Ca<Object> a = new Ca<>();

    private Ca() {
    }

    public final T a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
