package defpackage;

import java.util.concurrent.ThreadFactory;

/* renamed from: Hyb reason: default package */
/* compiled from: lambda */
public final /* synthetic */ class Hyb implements ThreadFactory {
    private final /* synthetic */ String a;
    private final /* synthetic */ boolean b;

    public /* synthetic */ Hyb(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final Thread newThread(Runnable runnable) {
        return Kyb.a(this.a, this.b, runnable);
    }
}
