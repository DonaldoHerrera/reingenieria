package defpackage;

import java.util.concurrent.ThreadFactory;

/* renamed from: wq reason: default package and case insensitive filesystem */
/* compiled from: lambda */
public final /* synthetic */ class C1822wq implements ThreadFactory {
    private final /* synthetic */ String a;

    public /* synthetic */ C1822wq(String str) {
        this.a = str;
    }

    public final Thread newThread(Runnable runnable) {
        return C0471ar.a(this.a, runnable);
    }
}
