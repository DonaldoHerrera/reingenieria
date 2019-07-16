package defpackage;

import com.soundcloud.android.utilities.android.k;
import java.util.ArrayList;

/* renamed from: JDa reason: default package and case insensitive filesystem */
/* compiled from: MediaStreamsStorageWriter.kt */
public class C5014JDa {
    private final C4797CDa a;
    private final k b;

    public C5014JDa(C4797CDa cDa, k kVar) {
        C7471uYa.b(cDa, "mediaStreamsStorage");
        C7471uYa.b(kVar, "threadChecker");
        this.a = cDa;
        this.b = kVar;
    }

    public void a(Iterable<C7587wDa> iterable) {
        C7471uYa.b(iterable, "mediaStreamEntries");
        this.b.a("MediaStreamsStorageWriter#write should not be called on the main thread.");
        C4797CDa cDa = this.a;
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) iterable, 10));
        for (C7587wDa wda : iterable) {
            arrayList.add(new a(wda.b(), wda.a().a()));
        }
        cDa.b(arrayList);
    }
}
