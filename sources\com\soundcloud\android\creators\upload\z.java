package com.soundcloud.android.creators.upload;

import android.content.Context;
import android.text.TextUtils;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.features.record.Recording;
import com.soundcloud.android.features.record.ia;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.C3702d;
import java.io.File;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* compiled from: Uploader */
public class z implements Runnable {
    private final dfa a;
    /* access modifiers changed from: private */
    public final Recording b;
    private volatile boolean c;
    private final Context d;
    private final VPa e;
    /* access modifiers changed from: private */
    public final C2350WH<Xaa> f;
    private C3700b g;

    /* compiled from: Uploader */
    private final class a extends C5037Jua<Xaa> {
        private a() {
        }

        public void a(Xaa xaa) {
            if (xaa.d() && z.this.b.getId() == xaa.b().getId()) {
                SDb.a(SoundCloudApplication.a).a("canceling upload of %s", z.this.b);
                z.this.a();
            }
        }
    }

    /* compiled from: Uploader */
    private class b implements d {
        private final Recording a;
        private long b;

        public b(Recording recording) {
            this.a = recording;
        }

        public void a(long j, long j2) throws IOException {
            if (z.this.b()) {
                throw new ia();
            } else if (System.currentTimeMillis() - this.b > 500) {
                z.this.f.accept(Xaa.b(this.a, (int) Math.min(100, (j * 100) / j2)));
                this.b = System.currentTimeMillis();
            }
        }
    }

    public z(Context context, dfa dfa, Recording recording, C2350WH<Xaa> wh, C3700b bVar) {
        this.a = dfa;
        this.b = recording;
        this.d = context;
        a aVar = new a();
        wh.c(aVar);
        this.e = aVar;
        this.f = wh;
        this.g = bVar;
    }

    private void c() {
        File y = this.b.y();
        if (y == null || !y.exists()) {
            throw new IllegalArgumentException("File to be uploaded does not exist");
        } else if (y.length() != 0) {
            try {
                if (!b()) {
                    SDb.a(SoundCloudApplication.a).a("starting upload of %s", y);
                    this.f.accept(Xaa.j(this.b));
                    jfa a2 = this.a.a(b(this.d, this.b));
                    if (a2.g()) {
                        a(a2);
                        this.g.a((C3702d) new com.soundcloud.android.foundation.events.C3702d.c.a(this.b.o));
                        return;
                    }
                    a((Exception) a2.a());
                    return;
                }
                throw new ia();
            } catch (IOException e2) {
                if (!b()) {
                    a((Exception) e2);
                }
            }
        } else {
            throw new IllegalArgumentException("File to be uploaded is empty");
        }
    }

    public void run() {
        defpackage.SDb.b a2 = SDb.a(UploadService.a);
        StringBuilder sb = new StringBuilder();
        sb.append("Uploader.run(");
        sb.append(this.b);
        sb.append(")");
        a2.a(sb.toString(), new Object[0]);
        try {
            c();
        } catch (IllegalArgumentException e2) {
            a((Exception) e2);
        } catch (Throwable th) {
            this.e.dispose();
            throw th;
        }
        this.e.dispose();
    }

    public void a() {
        this.c = true;
    }

    public boolean b() {
        return this.c;
    }

    private Map<String, ?> a(Context context, Recording recording) {
        HashMap hashMap = new HashMap();
        recording.e = recording.e(context);
        hashMap.put("track[title]", recording.e);
        hashMap.put("track[track_type]", "recording");
        hashMap.put("track[sharing]", recording.L() ? "public" : "private");
        hashMap.put("track[downloadable]", Boolean.valueOf(false));
        hashMap.put("track[streamable]", Boolean.valueOf(true));
        String U = recording.U();
        if (!TextUtils.isEmpty(U)) {
            hashMap.put("track[tag_list]", U);
        }
        if (!TextUtils.isEmpty(recording.i)) {
            hashMap.put("track[description]", recording.i);
        }
        if (!TextUtils.isEmpty(recording.j)) {
            hashMap.put("track[genre]", recording.j);
        }
        return hashMap;
    }

    private hfa b(Context context, Recording recording) {
        String str;
        defpackage.hfa.b d2 = hfa.c("/tracks").d();
        Map a2 = a(context, recording);
        a(d2, a2);
        File y = recording.y();
        if (!recording.o) {
            String obj = a2.get("track[title]").toString();
            if (obj == null) {
                obj = "unknown";
            }
            str = String.format("%s.%s", new Object[]{URLEncoder.encode(obj.replace(" ", "_")), "ogg"});
        } else {
            str = y.getName();
        }
        String str2 = "application/octet-stream";
        d2.a((lfa) kfa.a("track[asset_data]", y, str, str2));
        File file = recording.m;
        if (file != null) {
            d2.a((lfa) kfa.a("track[artwork_data]", file, str2));
        }
        d2.a((d) new b(recording));
        return d2.b();
    }

    private void a(defpackage.hfa.b bVar, Map<String, ?> map) {
        for (Entry entry : map.entrySet()) {
            if (entry.getValue() instanceof Iterable) {
                for (Object obj : (Iterable) entry.getValue()) {
                    bVar.a((lfa) nfa.a((String) entry.getKey(), obj.toString()));
                }
            } else {
                bVar.a((lfa) nfa.a((String) entry.getKey(), entry.getValue().toString()));
            }
        }
    }

    private void a(Exception exc) {
        SDb.a(SoundCloudApplication.a).a((Throwable) exc, "Error uploading", new Object[0]);
        if (!(exc instanceof ifa) || !((ifa) exc).h()) {
            this.f.accept(Xaa.b(this.b));
        } else {
            this.f.accept(Xaa.c(this.b));
        }
    }

    private void a(jfa jfa) {
        SDb.a(SoundCloudApplication.a).a("Upload successful : %s", jfa);
        this.b.N();
        Recording recording = this.b;
        if (!recording.o) {
            C6630iGa.b(recording.g());
            C6630iGa.b(this.b.f());
        }
        File file = this.b.n;
        if (file != null) {
            C6630iGa.b(file);
        }
        this.f.accept(Xaa.k(this.b));
    }
}
