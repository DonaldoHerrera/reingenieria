package defpackage;

/* renamed from: PZa reason: default package */
/* compiled from: KClassifiers.kt */
final class PZa extends C7540vYa implements PXa {
    final /* synthetic */ C7541vZa a;

    PZa(C7541vZa vza) {
        this.a = vza;
        super(0);
    }

    public final Void d() {
        StringBuilder sb = new StringBuilder();
        sb.append("Java type is not yet supported for types created with createType (classifier = ");
        sb.append(this.a);
        sb.append(')');
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("An operation is not implemented: ");
        sb3.append(sb2);
        throw new GVa(sb3.toString());
    }
}
