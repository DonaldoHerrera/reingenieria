package defpackage;

import com.google.android.gms.cast.MediaInfo;
import java.util.concurrent.Callable;

/* renamed from: gS reason: default package and case insensitive filesystem */
/* compiled from: lambda */
public final /* synthetic */ class C3021gS implements Callable {
    private final /* synthetic */ C3281tS a;
    private final /* synthetic */ MediaInfo b;
    private final /* synthetic */ boolean c;
    private final /* synthetic */ long d;
    private final /* synthetic */ C3261sS e;

    public /* synthetic */ C3021gS(C3281tS tSVar, MediaInfo mediaInfo, boolean z, long j, C3261sS sSVar) {
        this.a = tSVar;
        this.b = mediaInfo;
        this.c = z;
        this.d = j;
        this.e = sSVar;
    }

    public final Object call() {
        return this.a.a(this.b, this.c, this.d, this.e);
    }
}
