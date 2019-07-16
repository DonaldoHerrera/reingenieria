package defpackage;

/* renamed from: QD reason: default package and case insensitive filesystem */
/* compiled from: Multimaps */
public final class C2234QD {
    static boolean a(C2215PD<?, ?> pd, Object obj) {
        if (obj == pd) {
            return true;
        }
        if (!(obj instanceof C2215PD)) {
            return false;
        }
        return pd.a().equals(((C2215PD) obj).a());
    }
}
