package com.google.common.base;

import java.util.Collections;
import java.util.Set;

final class Present<T> extends Optional<T> {
    private static final long serialVersionUID = 0;
    private final T reference;

    Present(T t) {
        this.reference = t;
    }

    public Set<T> asSet() {
        return Collections.singleton(this.reference);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Present)) {
            return false;
        }
        return this.reference.equals(((Present) obj).reference);
    }

    public T get() {
        return this.reference;
    }

    public int hashCode() {
        return this.reference.hashCode() + 1502476572;
    }

    public boolean isPresent() {
        return true;
    }

    public T or(T t) {
        Preconditions.checkNotNull(t, "use Optional.orNull() instead of Optional.or(null)");
        return this.reference;
    }

    public T orNull() {
        return this.reference;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Optional.of(");
        sb.append(this.reference);
        sb.append(")");
        return sb.toString();
    }

    public <V> Optional<V> transform(Function<? super T, V> function) {
        Object apply = function.apply(this.reference);
        Preconditions.checkNotNull(apply, "the Function passed to Optional.transform() must not return null.");
        return new Present(apply);
    }

    public Optional<T> or(Optional<? extends T> optional) {
        Preconditions.checkNotNull(optional);
        return this;
    }

    public T or(Supplier<? extends T> supplier) {
        Preconditions.checkNotNull(supplier);
        return this.reference;
    }
}
