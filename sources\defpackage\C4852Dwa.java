package defpackage;

/* renamed from: Dwa reason: default package and case insensitive filesystem */
/* compiled from: SuggestionsAdapter */
public class C4852Dwa extends C5407WEa<C7780ywa> {
    private final C7847zva g;
    private final C4914Fwa h;
    private final C4976Hwa i;
    private final C7021nwa j;

    C4852Dwa(C7847zva zva, C4914Fwa fwa, C4976Hwa hwa, C7021nwa nwa) {
        super((C5693cFa<? extends T>[]) new C5693cFa[]{new C5693cFa(b.AutocompletionItem.ordinal(), zva), new C5693cFa(b.TrackItem.ordinal(), fwa), new C5693cFa(b.UserItem.ordinal(), hwa), new C5693cFa(b.PlaylistItem.ordinal(), nwa)});
        this.g = zva;
        this.h = fwa;
        this.i = hwa;
        this.j = nwa;
    }

    public int f(int i2) {
        return ((C7780ywa) g(i2)).f().ordinal();
    }

    public APa<C7433tva> j() {
        return this.g.a();
    }

    public APa<C7433tva> k() {
        return this.g.b();
    }

    public APa<C7849zwa> l() {
        return APa.a((EPa<? extends T>) this.h.b(), (EPa<? extends T>) this.i.b(), (EPa<? extends T>) this.j.b());
    }
}
