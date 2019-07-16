package defpackage;

import java.util.List;
import java.util.Map;

/* renamed from: kFa reason: default package and case insensitive filesystem */
/* compiled from: DefaultUserRepository.kt */
final class C6765kFa<T, R> implements C7118pQa<T, MPa<? extends R>> {
    final /* synthetic */ C7728yFa a;
    final /* synthetic */ List b;
    final /* synthetic */ C2074HO c;

    C6765kFa(C7728yFa yfa, List list, C2074HO ho) {
        this.a = yfa;
        this.b = list;
        this.c = ho;
    }

    /* renamed from: a */
    public final IPa<Map<C3508cda, C3784hea>> apply(Map<C3508cda, C3784hea> map) {
        C7471uYa.b(map, "foundUsers");
        return this.a.a(map, this.b, this.c);
    }
}
