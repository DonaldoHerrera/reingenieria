package defpackage;

import java.io.IOException;

/* renamed from: Wxb reason: default package */
/* compiled from: Cache */
class Wxb extends C7168qAb {
    final /* synthetic */ c b;
    final /* synthetic */ b c;

    Wxb(b bVar, HAb hAb, c cVar) {
        this.c = bVar;
        this.b = cVar;
        super(hAb);
    }

    public void close() throws IOException {
        this.b.close();
        super.close();
    }
}
