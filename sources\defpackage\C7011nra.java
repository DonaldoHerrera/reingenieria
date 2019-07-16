package defpackage;

/* renamed from: nra reason: default package and case insensitive filesystem */
/* compiled from: PlaylistDetailsPresenter.kt */
final class C7011nra<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ C3508cda a;

    C7011nra(C3508cda cda) {
        this.a = cda;
    }

    /* renamed from: a */
    public final C3508cda apply(Jaa<Object> jaa) {
        C7471uYa.b(jaa, "it");
        if (jaa instanceof Kaa) {
            Object obj = ((Kaa) jaa).a().get(this.a);
            if (obj != null) {
                return ((Eda) obj).v();
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Input ");
        sb.append(jaa);
        sb.append(" not of type ");
        sb.append(Kaa.class.getSimpleName());
        throw new IllegalArgumentException(sb.toString());
    }
}
