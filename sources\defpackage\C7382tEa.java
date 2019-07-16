package defpackage;

/* renamed from: tEa reason: default package and case insensitive filesystem */
/* compiled from: PagedTransformingPresenter.kt */
final class C7382tEa extends C7540vYa implements C6308dYa<DomainModel, DomainModel, DomainModel> {
    final /* synthetic */ C7037oEa a;

    C7382tEa(C7037oEa oea) {
        this.a = oea;
        super(2);
    }

    public final DomainModel invoke(DomainModel domainmodel, DomainModel domainmodel2) {
        C7471uYa.b(domainmodel, "currentPage");
        C7471uYa.b(domainmodel2, "nextPage");
        return this.a.a(domainmodel, domainmodel2);
    }
}
