package com.soundcloud.android.settings.streamingquality;

@EVa(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0007H\u0016J\b\u0010\u0013\u001a\u00020\u0007H\u0016J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0007H\u0016J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0007H\u0016R\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u001c\u0010\u000f\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/soundcloud/android/settings/streamingquality/StreamingQualitySettings;", "", "streamingQualityStorage", "Lcom/soundcloud/android/settings/streamingquality/StreamingQualityStorage;", "(Lcom/soundcloud/android/settings/streamingquality/StreamingQualityStorage;)V", "downloadsQualityPreferenceSubject", "Lcom/jakewharton/rxrelay2/PublishRelay;", "Lcom/soundcloud/android/settings/streamingquality/StreamingQualitySettings$StreamingQuality;", "kotlin.jvm.PlatformType", "onDownloadsQualityPreferenceChange", "Lio/reactivex/Observable;", "getOnDownloadsQualityPreferenceChange", "()Lio/reactivex/Observable;", "onStreamingQualityPreferenceChange", "getOnStreamingQualityPreferenceChange", "qualityPreferenceSubject", "clearQualityPreference", "", "getDownloadsQualityPreference", "getStreamingQualityPreference", "saveDownloadsQualityPreference", "streamingQuality", "saveStreamingQualityPreference", "IllegalDownloadQualityException", "StreamingQuality", "settings_release"}, mv = {1, 1, 15})
/* compiled from: StreamingQualitySettings.kt */
public class e {
    private final C2332VH<b> a;
    private final C2332VH<b> b;
    private final t c;

    /* compiled from: StreamingQualitySettings.kt */
    private static final class a extends IllegalArgumentException {
        public a(String str) {
            C7471uYa.b(str, "message");
            super(str);
        }
    }

    @EVa(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0001\u0003\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/soundcloud/android/settings/streamingquality/StreamingQualitySettings$StreamingQuality;", "", "()V", "key", "", "getKey", "()Ljava/lang/String;", "Auto", "High", "Standard", "Lcom/soundcloud/android/settings/streamingquality/StreamingQualitySettings$StreamingQuality$Standard;", "Lcom/soundcloud/android/settings/streamingquality/StreamingQualitySettings$StreamingQuality$High;", "Lcom/soundcloud/android/settings/streamingquality/StreamingQualitySettings$StreamingQuality$Auto;", "settings_release"}, mv = {1, 1, 15})
    /* compiled from: StreamingQualitySettings.kt */
    public static abstract class b {

        /* compiled from: StreamingQualitySettings.kt */
        public static final class a extends b {
            public static final a a = new a();

            private a() {
                super(null);
            }

            public String a() {
                return "auto";
            }
        }

        /* renamed from: com.soundcloud.android.settings.streamingquality.e$b$b reason: collision with other inner class name */
        /* compiled from: StreamingQualitySettings.kt */
        public static final class C0171b extends b {
            public static final C0171b a = new C0171b();

            private C0171b() {
                super(null);
            }

            public String a() {
                return "hq";
            }
        }

        /* compiled from: StreamingQualitySettings.kt */
        public static final class c extends b {
            public static final c a = new c();

            private c() {
                super(null);
            }

            public String a() {
                return "sq";
            }
        }

        private b() {
        }

        public abstract String a();

        public /* synthetic */ b(C7264rYa rya) {
            this();
        }
    }

    public e(t tVar) {
        C7471uYa.b(tVar, "streamingQualityStorage");
        this.c = tVar;
        C2332VH<b> s = C2332VH.s();
        String str = "PublishRelay.create<StreamingQuality>()";
        C7471uYa.a((Object) s, str);
        this.a = s;
        C2332VH<b> s2 = C2332VH.s();
        C7471uYa.a((Object) s2, str);
        this.b = s2;
    }

    public void a(b bVar) {
        C7471uYa.b(bVar, "streamingQuality");
        if (!C7471uYa.a((Object) bVar, (Object) C0171b.a) && !C7471uYa.a((Object) bVar, (Object) c.a)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unsupported streaming quality for downloads: ");
            sb.append(bVar);
            throw new a(sb.toString());
        }
        this.c.a(bVar.a());
        this.b.accept(bVar);
    }

    public void b(b bVar) {
        C7471uYa.b(bVar, "streamingQuality");
        this.c.b(bVar.a());
        this.a.accept(bVar);
    }

    public APa<b> c() {
        APa<b> d = this.b.d();
        C7471uYa.a((Object) d, "downloadsQualityPreferen…ct.distinctUntilChanged()");
        return d;
    }

    public APa<b> d() {
        APa<b> d = this.a.d();
        C7471uYa.a((Object) d, "qualityPreferenceSubject.distinctUntilChanged()");
        return d;
    }

    public b e() {
        String c2 = this.c.c();
        if (c2 == null) {
            return c.a;
        }
        if (C7471uYa.a((Object) c2, (Object) C0171b.a.a())) {
            return C0171b.a;
        }
        if (C7471uYa.a((Object) c2, (Object) a.a.a())) {
            return a.a;
        }
        return c.a;
    }

    public b b() {
        String b2 = this.c.b();
        if (b2 == null) {
            return c.a;
        }
        if (C7471uYa.a((Object) b2, (Object) C0171b.a.a())) {
            return C0171b.a;
        }
        if (!C7471uYa.a((Object) b2, (Object) a.a.a())) {
            return c.a;
        }
        throw new a("Auto streaming quality is not supported for downloads!");
    }

    public void a() {
        this.c.a();
        this.a.accept(e());
        this.b.accept(b());
    }
}
