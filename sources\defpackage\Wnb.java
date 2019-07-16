package defpackage;

import java.io.IOException;

/* renamed from: Wnb reason: default package */
/* compiled from: MessageLite */
public interface Wnb extends Xnb {

    /* renamed from: Wnb$a */
    /* compiled from: MessageLite */
    public interface a extends Cloneable, Xnb {
        a a(Gnb gnb, Inb inb) throws IOException;

        Wnb build();
    }

    void a(Hnb hnb) throws IOException;

    a b();

    int c();

    a d();

    Ynb<? extends Wnb> e();
}
