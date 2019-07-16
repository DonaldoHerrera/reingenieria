package com.google.firebase.components;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@KeepForSdk
/* compiled from: com.google.firebase:firebase-common@@17.0.0 */
public final class e<T> {
    private final Set<Class<? super T>> a;
    private final Set<q> b;
    private final int c;
    private final int d;
    private final i<T> e;
    private final Set<Class<?>> f;

    @KeepForSdk
    /* compiled from: com.google.firebase:firebase-common@@17.0.0 */
    public static class a<T> {
        private final Set<Class<? super T>> a;
        private final Set<q> b;
        private int c;
        private int d;
        private i<T> e;
        private Set<Class<?>> f;

        /* access modifiers changed from: private */
        public a<T> d() {
            this.d = 1;
            return this;
        }

        @KeepForSdk
        public e<T> b() {
            Preconditions.checkState(this.e != null, "Missing required property: factory.");
            e eVar = new e(new HashSet(this.a), new HashSet(this.b), this.c, this.d, this.e, this.f);
            return eVar;
        }

        @KeepForSdk
        public a<T> c() {
            a(2);
            return this;
        }

        @SafeVarargs
        private a(Class<T> cls, Class<? super T>... clsArr) {
            this.a = new HashSet();
            this.b = new HashSet();
            this.c = 0;
            this.d = 0;
            this.f = new HashSet();
            String str = "Null interface";
            Preconditions.checkNotNull(cls, str);
            this.a.add(cls);
            for (Class<? super T> checkNotNull : clsArr) {
                Preconditions.checkNotNull(checkNotNull, str);
            }
            Collections.addAll(this.a, clsArr);
        }

        @KeepForSdk
        public a<T> a(q qVar) {
            Preconditions.checkNotNull(qVar, "Null dependency");
            a(qVar.a());
            this.b.add(qVar);
            return this;
        }

        @KeepForSdk
        public a<T> a() {
            a(1);
            return this;
        }

        private a<T> a(int i) {
            Preconditions.checkState(this.c == 0, "Instantiation type has already been set.");
            this.c = i;
            return this;
        }

        private void a(Class<?> cls) {
            Preconditions.checkArgument(!this.a.contains(cls), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        @KeepForSdk
        public a<T> a(i<T> iVar) {
            Preconditions.checkNotNull(iVar, "Null factory");
            this.e = iVar;
            return this;
        }
    }

    static /* synthetic */ Object a(Object obj, f fVar) {
        return obj;
    }

    static /* synthetic */ Object b(Object obj, f fVar) {
        return obj;
    }

    public Set<q> a() {
        return this.b;
    }

    public i<T> b() {
        return this.e;
    }

    public Set<Class<? super T>> c() {
        return this.a;
    }

    public Set<Class<?>> d() {
        return this.f;
    }

    public boolean e() {
        return this.c == 1;
    }

    public boolean f() {
        return this.c == 2;
    }

    public boolean g() {
        return this.d == 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Component<");
        sb.append(Arrays.toString(this.a.toArray()));
        sb.append(">{");
        sb.append(this.c);
        sb.append(", type=");
        sb.append(this.d);
        sb.append(", deps=");
        sb.append(Arrays.toString(this.b.toArray()));
        sb.append("}");
        return sb.toString();
    }

    private e(Set<Class<? super T>> set, Set<q> set2, int i, int i2, i<T> iVar, Set<Class<?>> set3) {
        this.a = Collections.unmodifiableSet(set);
        this.b = Collections.unmodifiableSet(set2);
        this.c = i;
        this.d = i2;
        this.e = iVar;
        this.f = Collections.unmodifiableSet(set3);
    }

    @KeepForSdk
    public static <T> a<T> a(Class<T> cls) {
        return new a<>(cls, new Class[0]);
    }

    @KeepForSdk
    public static <T> a<T> b(Class<T> cls) {
        a<T> a2 = a(cls);
        a2.d();
        return a2;
    }

    @KeepForSdk
    @SafeVarargs
    public static <T> a<T> a(Class<T> cls, Class<? super T>... clsArr) {
        return new a<>(cls, clsArr);
    }

    @KeepForSdk
    @SafeVarargs
    public static <T> e<T> a(T t, Class<T> cls, Class<? super T>... clsArr) {
        a a2 = a(cls, clsArr);
        a2.a(b.a(t));
        return a2.b();
    }

    @KeepForSdk
    public static <T> e<T> a(T t, Class<T> cls) {
        a b2 = b(cls);
        b2.a(c.a(t));
        return b2.b();
    }
}
