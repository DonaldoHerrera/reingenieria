package defpackage;

/* renamed from: Dza reason: default package and case insensitive filesystem */
/* compiled from: ActivitiesSyncer */
public class C4855Dza extends C5690cDa<C4948Gza> {

    /* renamed from: Dza$a */
    /* compiled from: ActivitiesSyncer */
    public static class a {
        private final dfa a;
        private final C5255Qza b;
        private final C5195Oza c;
        private final C5622bDa d;

        public a(dfa dfa, C5255Qza qza, C5195Oza oza, C5622bDa bda) {
            this.a = dfa;
            this.b = qza;
            this.c = oza;
            this.d = bda;
        }

        public C4855Dza a(String str) {
            C4855Dza dza = new C4855Dza(this.a, this.b, this.c, this.d, str);
            return dza;
        }
    }

    public C4855Dza(dfa dfa, C5255Qza qza, C5195Oza oza, C5622bDa bda, String str) {
        super(C2226PO.ACTIVITIES, com.soundcloud.android.storage.provider.a.ME_ACTIVITIES.q, dfa, qza, oza, bda, new C4824Cza(), str);
    }
}
