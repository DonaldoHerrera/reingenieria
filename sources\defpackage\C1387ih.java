package defpackage;

/* renamed from: ih reason: default package and case insensitive filesystem */
/* compiled from: CustomEvent */
public class C1387ih extends Tg<C1387ih> {
    private final String c;

    public C1387ih(String str) {
        if (str != null) {
            this.c = this.a.a(str);
            return;
        }
        throw new NullPointerException("eventName must not be null");
    }

    /* access modifiers changed from: 0000 */
    public String b() {
        return this.c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{eventName:\"");
        sb.append(this.c);
        sb.append('\"');
        sb.append(", customAttributes:");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
