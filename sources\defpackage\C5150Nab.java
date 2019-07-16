package defpackage;

/* renamed from: Nab reason: default package and case insensitive filesystem */
/* compiled from: KTypeParameterImpl.kt */
final class C5150Nab extends C7540vYa implements PXa {
    final /* synthetic */ C5180Oab a;

    C5150Nab(C5180Oab oab) {
        this.a = oab;
        super(0);
    }

    public final Void d() {
        StringBuilder sb = new StringBuilder();
        sb.append("Java type is not yet supported for type parameters: ");
        sb.append(this.a.a.b());
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("An operation is not implemented: ");
        sb3.append(sb2);
        throw new GVa(sb3.toString());
    }
}
