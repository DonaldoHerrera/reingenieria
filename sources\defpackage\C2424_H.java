package defpackage;

/* renamed from: _H reason: default package and case insensitive filesystem */
public final class C2424_H {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public boolean f = false;

    public final String toString() {
        StringBuilder sb = new StringBuilder("Krux Config [publisherUuid=");
        sb.append(this.a);
        sb.append(", pixel=");
        sb.append(this.b);
        sb.append(", event=");
        sb.append(this.c);
        sb.append(", site=");
        sb.append(this.d);
        sb.append(", userData=");
        sb.append(this.e);
        sb.append("]");
        return sb.toString();
    }
}
