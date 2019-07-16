package defpackage;

/* renamed from: KTa reason: default package */
/* compiled from: SingleInternalHelper */
public final class KTa {

    /* renamed from: KTa$a */
    /* compiled from: SingleInternalHelper */
    enum a implements C7118pQa<MPa, _Ab> {
        INSTANCE;

        /* renamed from: a */
        public _Ab apply(MPa mPa) {
            return new UTa(mPa);
        }
    }

    public static <T> C7118pQa<MPa<? extends T>, _Ab<? extends T>> a() {
        return a.INSTANCE;
    }
}
