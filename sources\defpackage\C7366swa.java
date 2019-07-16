package defpackage;

/* renamed from: swa reason: default package and case insensitive filesystem */
/* compiled from: SearchSuggestionItem */
public abstract class C7366swa extends C7780ywa implements Vca, Wca {
    public static C7366swa a(C3508cda cda, C4928GKa<String> gKa, String str, C4928GKa<C7642wwa> gKa2, String str2, boolean z) {
        C7640wva wva = new C7640wva(cda, gKa, b.UserItem, str, gKa2, str2, z);
        return wva;
    }

    public static C7366swa b(C3508cda cda, C4928GKa<String> gKa, String str, C4928GKa<C7642wwa> gKa2, String str2) {
        C7640wva wva = new C7640wva(cda, gKa, b.TrackItem, str, gKa2, str2, false);
        return wva;
    }

    /* access modifiers changed from: 0000 */
    public abstract String h();

    /* access modifiers changed from: 0000 */
    public abstract boolean i();

    /* access modifiers changed from: 0000 */
    public abstract C4928GKa<C7642wwa> j();

    public static C7366swa a(C3508cda cda, C4928GKa<String> gKa, String str, C4928GKa<C7642wwa> gKa2, String str2) {
        C7640wva wva = new C7640wva(cda, gKa, b.PlaylistItem, str, gKa2, str2, false);
        return wva;
    }
}
