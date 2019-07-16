package defpackage;

import java.util.Set;

/* renamed from: Xfa reason: default package */
/* compiled from: Result.kt */
public final class Xfa {
    public static final <Key, Model> Wfa<Key, Model> a(Model model) {
        return new Yfa(model);
    }

    public static final <Key, Model> Wfa<Key, Model> a(Model model, Set<? extends Key> set) {
        C7471uYa.b(set, "missingKeys");
        Vfa vfa = new Vfa(model, set, null, 4, null);
        return vfa;
    }
}
