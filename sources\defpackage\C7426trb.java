package defpackage;

/* renamed from: trb reason: default package and case insensitive filesystem */
/* compiled from: FlexibleTypeDeserializer.kt */
public interface C7426trb {

    /* renamed from: trb$a */
    /* compiled from: FlexibleTypeDeserializer.kt */
    public static final class a implements C7426trb {
        public static final a a = new a();

        private a() {
        }

        public C7706xtb a(_lb _lb, String str, Etb etb, Etb etb2) {
            C7471uYa.b(_lb, "proto");
            C7471uYa.b(str, "flexibleId");
            C7471uYa.b(etb, "lowerBound");
            C7471uYa.b(etb2, "upperBound");
            throw new IllegalArgumentException("This method should not be used.");
        }
    }

    C7706xtb a(_lb _lb, String str, Etb etb, Etb etb2);
}
