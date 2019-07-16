package defpackage;

/* renamed from: Ph reason: default package */
/* compiled from: CompositeCreateReportSpiCall */
class Ph implements Ni {
    private final Qi a;
    private final C0525cj b;

    public Ph(Qi qi, C0525cj cjVar) {
        this.a = qi;
        this.b = cjVar;
    }

    public boolean a(Mi mi) {
        int i = Oh.a[mi.b.getType().ordinal()];
        if (i == 1) {
            this.a.a(mi);
            return true;
        } else if (i != 2) {
            return false;
        } else {
            this.b.a(mi);
            return true;
        }
    }
}
