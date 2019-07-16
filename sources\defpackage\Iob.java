package defpackage;

/* renamed from: Iob reason: default package */
/* compiled from: DescriptorRendererImpl.kt */
final class Iob extends C7540vYa implements PXa<Eob> {
    final /* synthetic */ Eob a;

    Iob(Eob eob) {
        this.a = eob;
        super(0);
    }

    public final Eob d() {
        Cob a2 = this.a.a((_Xa<? super Pob, RVa>) Hob.a);
        if (a2 != null) {
            return (Eob) a2;
        }
        throw new OVa("null cannot be cast to non-null type org.jetbrains.kotlin.renderer.DescriptorRendererImpl");
    }
}
