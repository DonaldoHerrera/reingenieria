package defpackage;

import java.io.InputStream;

/* renamed from: Vrb reason: default package */
/* compiled from: BuiltInsPackageFragmentImpl.kt */
public final class Vrb extends C7219qrb implements C5059Kbb {
    public static final a m = new a(null);

    /* renamed from: Vrb$a */
    /* compiled from: BuiltInsPackageFragmentImpl.kt */
    public static final class a {
        private a() {
        }

        public final Vrb a(C7349snb snb, Ssb ssb, C6450fdb fdb, InputStream inputStream) {
            Throwable th;
            C7471uYa.b(snb, "fqName");
            C7471uYa.b(ssb, "storageManager");
            C7471uYa.b(fdb, "module");
            C7471uYa.b(inputStream, "inputStream");
            try {
                C7831zmb a = C7831zmb.i.a(inputStream);
                if (a == null) {
                    C7471uYa.b("version");
                    throw null;
                } else if (a.d()) {
                    Klb a2 = Klb.a(inputStream, Srb.n.e());
                    BXa.a(inputStream, null);
                    C7471uYa.a((Object) a2, "proto");
                    Vrb vrb = new Vrb(snb, ssb, fdb, a2, a, null);
                    return vrb;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Kotlin built-in definition format version is not supported: ");
                    sb.append("expected ");
                    sb.append(C7831zmb.g);
                    sb.append(", actual ");
                    sb.append(a);
                    sb.append(". ");
                    sb.append("Please update Kotlin");
                    throw new UnsupportedOperationException(sb.toString());
                }
            } catch (Throwable th2) {
                BXa.a(inputStream, th);
                throw th2;
            }
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public /* synthetic */ Vrb(C7349snb snb, Ssb ssb, C6450fdb fdb, Klb klb, C7831zmb zmb, C7264rYa rya) {
        this(snb, ssb, fdb, klb, zmb);
    }

    private Vrb(C7349snb snb, Ssb ssb, C6450fdb fdb, Klb klb, C7831zmb zmb) {
        super(snb, ssb, fdb, klb, zmb, null);
    }
}
