package defpackage;

/* renamed from: QAb reason: default package */
/* compiled from: MissingArgumentException */
public class QAb extends WAb {
    private SAb a;

    public QAb(String str) {
        super(str);
    }

    public QAb(SAb sAb) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Missing argument for option: ");
        stringBuffer.append(sAb.l());
        this(stringBuffer.toString());
        this.a = sAb;
    }
}
