package defpackage;

/* renamed from: LAb reason: default package */
/* compiled from: AlreadySelectedException */
public class LAb extends WAb {
    private TAb a;
    private SAb b;

    public LAb(String str) {
        super(str);
    }

    public LAb(TAb tAb, SAb sAb) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("The option '");
        stringBuffer.append(sAb.l());
        stringBuffer.append("' was specified but an option from this group ");
        stringBuffer.append("has already been selected: '");
        stringBuffer.append(tAb.b());
        stringBuffer.append("'");
        this(stringBuffer.toString());
        this.a = tAb;
        this.b = sAb;
    }
}
