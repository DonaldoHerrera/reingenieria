package com.google.android.exoplayer2;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.drm.n;
import com.google.android.exoplayer2.metadata.f;
import com.google.android.exoplayer2.metadata.g;
import java.util.ArrayList;

/* compiled from: DefaultRenderersFactory */
public class r implements S {
    private final Context a;
    private n<com.google.android.exoplayer2.drm.r> b;
    private int c = 0;
    private long d = 5000;
    private boolean e;
    private Oo f = Oo.a;

    public r(Context context) {
        this.a = context;
    }

    /* access modifiers changed from: protected */
    public void a(Context context, Handler handler, int i, ArrayList<O> arrayList) {
    }

    public O[] a(Handler handler, com.google.android.exoplayer2.video.r rVar, C1668rm rmVar, C1241dp dpVar, f fVar, n<com.google.android.exoplayer2.drm.r> nVar) {
        n<com.google.android.exoplayer2.drm.r> nVar2 = nVar == null ? this.b : nVar;
        ArrayList arrayList = new ArrayList();
        n<com.google.android.exoplayer2.drm.r> nVar3 = nVar2;
        a(this.a, this.c, this.f, nVar3, this.e, handler, rVar, this.d, arrayList);
        a(this.a, this.c, this.f, nVar3, this.e, a(), handler, rmVar, arrayList);
        ArrayList arrayList2 = arrayList;
        a(this.a, dpVar, handler.getLooper(), this.c, arrayList2);
        a(this.a, fVar, handler.getLooper(), this.c, arrayList2);
        a(this.a, this.c, arrayList);
        Handler handler2 = handler;
        a(this.a, handler, this.c, arrayList);
        return (O[]) arrayList.toArray(new O[0]);
    }

    /* access modifiers changed from: protected */
    public void a(Context context, int i, Oo oo, n<com.google.android.exoplayer2.drm.r> nVar, boolean z, Handler handler, com.google.android.exoplayer2.video.r rVar, long j, ArrayList<O> arrayList) {
        int i2 = i;
        ArrayList<O> arrayList2 = arrayList;
        com.google.android.exoplayer2.video.n nVar2 = new com.google.android.exoplayer2.video.n(context, oo, j, nVar, z, handler, rVar, 50);
        arrayList2.add(nVar2);
        if (i2 != 0) {
            int size = arrayList.size();
            if (i2 == 2) {
                size--;
            }
            try {
                arrayList2.add(size, (O) Class.forName("com.google.android.exoplayer2.ext.vp9.LibvpxVideoRenderer").getConstructor(new Class[]{Long.TYPE, Handler.class, com.google.android.exoplayer2.video.r.class, Integer.TYPE}).newInstance(new Object[]{Long.valueOf(j), handler, rVar, Integer.valueOf(50)}));
                Iq.c("DefaultRenderersFactory", "Loaded LibvpxVideoRenderer.");
            } catch (ClassNotFoundException unused) {
            } catch (Exception e2) {
                throw new RuntimeException("Error instantiating VP9 extension", e2);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0067, code lost:
        throw new java.lang.RuntimeException("Error instantiating Opus extension", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x009a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a2, code lost:
        throw new java.lang.RuntimeException("Error instantiating FLAC extension", r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x005f A[ExcHandler: Exception (r0v16 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:7:0x0030] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009a A[ExcHandler: Exception (r0v10 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:19:0x006b] */
    public void a(Context context, int i, Oo oo, n<com.google.android.exoplayer2.drm.r> nVar, boolean z, C1639qm[] qmVarArr, Handler handler, C1668rm rmVar, ArrayList<O> arrayList) {
        int i2;
        int i3;
        int i4 = i;
        ArrayList<O> arrayList2 = arrayList;
        String str = "DefaultRenderersFactory";
        Em em = new Em(context, oo, nVar, z, handler, rmVar, C1516mm.a(context), qmVarArr);
        arrayList2.add(em);
        if (i4 != 0) {
            int size = arrayList.size();
            if (i4 == 2) {
                size--;
            }
            try {
                i2 = size + 1;
                arrayList2.add(size, (O) Class.forName("com.google.android.exoplayer2.ext.opus.LibopusAudioRenderer").getConstructor(new Class[]{Handler.class, C1668rm.class, C1639qm[].class}).newInstance(new Object[]{handler, rmVar, qmVarArr}));
                Iq.c(str, "Loaded LibopusAudioRenderer.");
            } catch (ClassNotFoundException unused) {
                i2 = size;
            } catch (Exception e2) {
            }
            try {
                i3 = i2 + 1;
                arrayList2.add(i2, (O) Class.forName("com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer").getConstructor(new Class[]{Handler.class, C1668rm.class, C1639qm[].class}).newInstance(new Object[]{handler, rmVar, qmVarArr}));
                Iq.c(str, "Loaded LibflacAudioRenderer.");
            } catch (ClassNotFoundException unused2) {
                i3 = i2;
            } catch (Exception e3) {
            }
            try {
                arrayList2.add(i3, (O) Class.forName("com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(new Class[]{Handler.class, C1668rm.class, C1639qm[].class}).newInstance(new Object[]{handler, rmVar, qmVarArr}));
                Iq.c(str, "Loaded FfmpegAudioRenderer.");
            } catch (ClassNotFoundException unused3) {
            } catch (Exception e4) {
                throw new RuntimeException("Error instantiating FFmpeg extension", e4);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void a(Context context, C1241dp dpVar, Looper looper, int i, ArrayList<O> arrayList) {
        arrayList.add(new C1272ep(dpVar, looper));
    }

    /* access modifiers changed from: protected */
    public void a(Context context, f fVar, Looper looper, int i, ArrayList<O> arrayList) {
        arrayList.add(new g(fVar, looper));
    }

    /* access modifiers changed from: protected */
    public void a(Context context, int i, ArrayList<O> arrayList) {
        arrayList.add(new C1243dr());
    }

    /* access modifiers changed from: protected */
    public C1639qm[] a() {
        return new C1639qm[0];
    }
}
