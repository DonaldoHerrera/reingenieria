package defpackage;

/* renamed from: Gja reason: default package */
/* compiled from: NotificationChannelDsl.kt */
public final class Gja {
    private final Qja a;
    private final C4542dka b;

    public Gja(Qja qja, C4542dka dka) {
        C7471uYa.b(qja, "channels");
        C7471uYa.b(dka, "groupProvider");
        this.a = qja;
        this.b = dka;
    }

    public final Qja a() {
        return this.a;
    }

    public final C4542dka b() {
        return this.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.b, (java.lang.Object) r3.b) != false) goto L_0x001f;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Gja) {
                Gja gja = (Gja) obj;
                if (C7471uYa.a((Object) this.a, (Object) gja.a)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Qja qja = this.a;
        int i = 0;
        int hashCode = (qja != null ? qja.hashCode() : 0) * 31;
        C4542dka dka = this.b;
        if (dka != null) {
            i = dka.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChannelGroup(channels=");
        sb.append(this.a);
        sb.append(", groupProvider=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
