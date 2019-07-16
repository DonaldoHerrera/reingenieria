package defpackage;

import java.util.concurrent.Callable;

/* renamed from: Pia reason: default package */
/* compiled from: lambda */
public final /* synthetic */ class Pia implements Callable {
    private final /* synthetic */ Bja a;
    private final /* synthetic */ Via b;

    public /* synthetic */ Pia(Bja bja, Via via) {
        this.a = bja;
        this.b = via;
    }

    public final Object call() {
        return this.a.b(this.b);
    }
}
