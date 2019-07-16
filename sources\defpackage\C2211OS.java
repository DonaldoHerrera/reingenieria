package defpackage;

/* renamed from: OS reason: default package and case insensitive filesystem */
/* compiled from: MyPlaylistsUniflowOperations.kt */
final class C2211OS<T> implements C7256rQa<C3490aba> {
    public static final C2211OS a = new C2211OS();

    C2211OS() {
    }

    /* renamed from: a */
    public final boolean test(C3490aba aba) {
        C7471uYa.b(aba, "it");
        return (aba.d() == a.ENTITY_CREATED || aba.d() == a.ENTITY_DELETED) && aba.c();
    }
}
