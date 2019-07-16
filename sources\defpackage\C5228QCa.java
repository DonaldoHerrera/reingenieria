package defpackage;

/* renamed from: QCa reason: default package and case insensitive filesystem */
/* compiled from: SoundStreamSyncer */
public class C5228QCa extends C5690cDa<C2227PP> {

    /* renamed from: QCa$a */
    /* compiled from: SoundStreamSyncer */
    public static class a {
        private final dfa a;
        private final C5288SCa b;
        private final C4951HCa c;
        private final C5622bDa d;

        public a(dfa dfa, C5288SCa sCa, C4951HCa hCa, C5622bDa bda) {
            this.a = dfa;
            this.b = sCa;
            this.c = hCa;
            this.d = bda;
        }

        public C5228QCa a(String str) {
            C5228QCa qCa = new C5228QCa(this.a, this.b, this.c, this.d, str);
            return qCa;
        }
    }

    public C5228QCa(dfa dfa, C5288SCa sCa, C4951HCa hCa, C5622bDa bda, String str) {
        super(C2226PO.STREAM, com.soundcloud.android.storage.provider.a.ME_SOUND_STREAM.q, dfa, sCa, hCa, bda, new C5198PCa(), str);
    }
}
