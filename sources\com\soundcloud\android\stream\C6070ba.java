package com.soundcloud.android.stream;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.soundcloud.android.stream.C6074da.a;

/* renamed from: com.soundcloud.android.stream.ba reason: case insensitive filesystem */
/* compiled from: StreamDepthConsumer.kt */
public class C6070ba {
    private C6074da a;
    private final a b;

    public C6070ba(a aVar) {
        C7471uYa.b(aVar, "streamDepthPublisherFactory");
        this.b = aVar;
    }

    public void a(int i) {
        C6074da daVar = this.a;
        if (daVar != null) {
            daVar.a(i);
        }
    }

    public void a(HVa<? extends StaggeredGridLayoutManager, Boolean> hVa) {
        C7471uYa.b(hVa, "parameters");
        a((StaggeredGridLayoutManager) hVa.c(), ((Boolean) hVa.d()).booleanValue()).a(((Boolean) hVa.d()).booleanValue());
    }

    private C6074da a(StaggeredGridLayoutManager staggeredGridLayoutManager, boolean z) {
        C6074da daVar = this.a;
        if (daVar == null) {
            daVar = this.b.a(staggeredGridLayoutManager, z);
        }
        this.a = daVar;
        C7471uYa.a((Object) daVar, "publisher");
        return daVar;
    }
}
