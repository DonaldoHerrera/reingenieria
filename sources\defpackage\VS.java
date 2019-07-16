package defpackage;

import java.util.concurrent.Callable;

/* renamed from: VS reason: default package */
/* compiled from: lambda */
public final /* synthetic */ class VS implements Callable {
    private final /* synthetic */ C1255eT a;
    private final /* synthetic */ Object b;

    public /* synthetic */ VS(C1255eT eTVar, Object obj) {
        this.a = eTVar;
        this.b = obj;
    }

    public final Object call() {
        return this.a.b(this.b);
    }
}
