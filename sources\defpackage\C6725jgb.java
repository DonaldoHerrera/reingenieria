package defpackage;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: jgb reason: default package and case insensitive filesystem */
/* compiled from: JvmAnnotationNames.kt */
public final class C6725jgb {
    private static final List<C7349snb> a;
    private static final C7349snb b = new C7349snb("javax.annotation.Nonnull");
    private static final C7349snb c;
    private static final List<C7349snb> d;
    private static final C7349snb e = new C7349snb("org.checkerframework.checker.nullness.compatqual.NullableDecl");
    private static final C7349snb f = new C7349snb("org.checkerframework.checker.nullness.compatqual.NonNullDecl");
    private static final C7349snb g = new C7349snb("androidx.annotation.RecentlyNullable");
    private static final C7349snb h = new C7349snb("androidx.annotation.RecentlyNonNull");
    private static final Set<C7349snb> i = TWa.b(TWa.b(TWa.b(TWa.b(TWa.b(TWa.b(TWa.b((Set<? extends T>) new LinkedHashSet<Object>(), (Iterable<? extends T>) a), b), (Iterable<? extends T>) d), e), f), g), h);
    private static final List<C7349snb> j = C6918mWa.b((T[]) new C7349snb[]{C6657igb.g, C6657igb.h});
    private static final List<C7349snb> k = C6918mWa.b((T[]) new C7349snb[]{C6657igb.f, C6657igb.i});

    static {
        String str = "androidx.annotation.Nullable";
        String str2 = "javax.annotation.CheckForNull";
        a = C6918mWa.b((T[]) new C7349snb[]{C6657igb.e, new C7349snb(str), new C7349snb(str), new C7349snb("android.annotation.Nullable"), new C7349snb("com.android.annotations.Nullable"), new C7349snb("org.eclipse.jdt.annotation.Nullable"), new C7349snb("org.checkerframework.checker.nullness.qual.Nullable"), new C7349snb("javax.annotation.Nullable"), new C7349snb(str2), new C7349snb("edu.umd.cs.findbugs.annotations.CheckForNull"), new C7349snb("edu.umd.cs.findbugs.annotations.Nullable"), new C7349snb("edu.umd.cs.findbugs.annotations.PossiblyNull"), new C7349snb("io.reactivex.annotations.Nullable")});
        c = new C7349snb(str2);
        String str3 = "androidx.annotation.NonNull";
        d = C6918mWa.b((T[]) new C7349snb[]{C6657igb.d, new C7349snb("edu.umd.cs.findbugs.annotations.NonNull"), new C7349snb(str3), new C7349snb(str3), new C7349snb("android.annotation.NonNull"), new C7349snb("com.android.annotations.NonNull"), new C7349snb("org.eclipse.jdt.annotation.NonNull"), new C7349snb("org.checkerframework.checker.nullness.qual.NonNull"), new C7349snb("lombok.NonNull"), new C7349snb("io.reactivex.annotations.NonNull")});
    }

    public static final C7349snb a() {
        return h;
    }

    public static final C7349snb b() {
        return g;
    }

    public static final C7349snb c() {
        return f;
    }

    public static final C7349snb d() {
        return e;
    }

    public static final C7349snb e() {
        return c;
    }

    public static final C7349snb f() {
        return b;
    }

    public static final List<C7349snb> g() {
        return k;
    }

    public static final List<C7349snb> h() {
        return d;
    }

    public static final List<C7349snb> i() {
        return a;
    }

    public static final List<C7349snb> j() {
        return j;
    }
}
