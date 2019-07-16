package defpackage;

/* renamed from: UVa reason: default package */
/* compiled from: AbstractCollection.kt */
final class UVa extends C7540vYa implements _Xa<E, CharSequence> {
    final /* synthetic */ VVa a;

    UVa(VVa vVa) {
        this.a = vVa;
        super(1);
    }

    public final CharSequence invoke(E e) {
        return e == this.a ? "(this Collection)" : String.valueOf(e);
    }
}
