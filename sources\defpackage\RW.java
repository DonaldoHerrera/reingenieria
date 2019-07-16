package defpackage;

import java.util.List;

/* renamed from: RW reason: default package */
/* compiled from: VaultUserRepository.kt */
final class RW<T, R> implements C7118pQa<T, EPa<? extends R>> {
    public static final RW a = new RW();

    RW() {
    }

    /* renamed from: a */
    public final APa<C3784hea> apply(List<C3784hea> list) {
        C7471uYa.b(list, "it");
        if (!list.isEmpty()) {
            return APa.c(C7676xWa.f((List) list));
        }
        return APa.e();
    }
}
