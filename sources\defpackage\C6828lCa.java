package defpackage;

/* renamed from: lCa reason: default package and case insensitive filesystem */
/* compiled from: PostsSyncModule */
public abstract class C6828lCa {
    static C6556hCa a(C5500ZKa zKa) {
        return new C6556hCa(zKa, 1);
    }

    static C6556hCa b(C5500ZKa zKa) {
        return new C6556hCa(zKa, 0);
    }

    static C6352eCa a(dfa dfa) {
        return (C6352eCa) new C6352eCa(dfa).a(C2226PO.MY_PLAYLIST_POSTS);
    }

    static C6352eCa b(dfa dfa) {
        return (C6352eCa) new C6352eCa(dfa).a(C2226PO.MY_TRACK_POSTS);
    }

    static C7309sCa a(C6556hCa hca, C6352eCa eca, C7516vCa vca, C7378tCa tca, C6416fAa faa, Hda hda, C5327TLa tLa) {
        hda.getClass();
        C7309sCa sca = new C7309sCa(hca, eca, vca, tca, faa, new C5375VBa(hda), tLa);
        return sca;
    }

    static C7309sCa a(C6556hCa hca, C6352eCa eca, C7516vCa vca, C7378tCa tca, C6620iAa iaa, C3768fea fea, C5327TLa tLa) {
        fea.getClass();
        C7309sCa sca = new C7309sCa(hca, eca, vca, tca, iaa, new C5404WBa(fea), tLa);
        return sca;
    }
}
