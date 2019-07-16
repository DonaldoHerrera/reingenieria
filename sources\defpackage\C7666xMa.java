package defpackage;

/* renamed from: xMa reason: default package and case insensitive filesystem */
/* compiled from: LoggerHelper */
class C7666xMa {
    private final C7597wMa a;

    C7666xMa(C7597wMa wma) {
        this.a = wma;
    }

    /* access modifiers changed from: 0000 */
    public void a(String str) {
        C7597wMa wma = this.a;
        StringBuilder sb = new StringBuilder();
        sb.append("Entry for ");
        sb.append(str);
        sb.append(" is in RAM.");
        wma.a(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    public void b(String str) {
        C7597wMa wma = this.a;
        StringBuilder sb = new StringBuilder();
        sb.append("Entry for ");
        sb.append(str);
        sb.append(" is not in RAM.");
        wma.a(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    public void c(String str) {
        C7597wMa wma = this.a;
        StringBuilder sb = new StringBuilder();
        sb.append("Entry for ");
        sb.append(str);
        sb.append(" is not on disk.");
        wma.a(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    public void d(String str) {
        C7597wMa wma = this.a;
        StringBuilder sb = new StringBuilder();
        sb.append("Entry for ");
        sb.append(str);
        sb.append(" is on disk.");
        wma.a(sb.toString());
    }
}
