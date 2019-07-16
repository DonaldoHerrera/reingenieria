package com.soundcloud.android.foundation.events;

import com.adjust.sdk.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

@EVa(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\r\u000e\u000f\u0010\u0011B;\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012*\u0010\u0004\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00060\u0005\"\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\u0010\u0007R'\u0010\u0004\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00060\u0005¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u0001\u0005\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lcom/soundcloud/android/foundation/events/AnalyticsEvent;", "", "name", "", "args", "", "Lkotlin/Pair;", "(Ljava/lang/String;[Lkotlin/Pair;)V", "getArgs", "()[Lkotlin/Pair;", "[Lkotlin/Pair;", "getName", "()Ljava/lang/String;", "Ads", "Core", "Creator", "Growth", "Permanent", "Lcom/soundcloud/android/foundation/events/AnalyticsEvent$Permanent;", "Lcom/soundcloud/android/foundation/events/AnalyticsEvent$Core;", "Lcom/soundcloud/android/foundation/events/AnalyticsEvent$Ads;", "Lcom/soundcloud/android/foundation/events/AnalyticsEvent$Growth;", "Lcom/soundcloud/android/foundation/events/AnalyticsEvent$Creator;", "events_release"}, mv = {1, 1, 15})
/* renamed from: com.soundcloud.android.foundation.events.d reason: case insensitive filesystem */
/* compiled from: AnalyticsEvent.kt */
public abstract class C3702d {
    private final String a;
    private final HVa<String, Object>[] b;

    @EVa(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\t\n\u000b\fB;\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012*\u0010\u0004\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u00060\u0005\"\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\b\u0001\u0004\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/soundcloud/android/foundation/events/AnalyticsEvent$Ads;", "Lcom/soundcloud/android/foundation/events/AnalyticsEvent;", "name", "", "args", "", "Lkotlin/Pair;", "", "(Ljava/lang/String;[Lkotlin/Pair;)V", "ExtraAdInDb", "OMTrackingFailure", "StartVideoAdTrackingFailure", "VideoAdFetch", "Lcom/soundcloud/android/foundation/events/AnalyticsEvent$Ads$ExtraAdInDb;", "Lcom/soundcloud/android/foundation/events/AnalyticsEvent$Ads$VideoAdFetch;", "Lcom/soundcloud/android/foundation/events/AnalyticsEvent$Ads$OMTrackingFailure;", "Lcom/soundcloud/android/foundation/events/AnalyticsEvent$Ads$StartVideoAdTrackingFailure;", "events_release"}, mv = {1, 1, 15})
    /* renamed from: com.soundcloud.android.foundation.events.d$a */
    /* compiled from: AnalyticsEvent.kt */
    public static abstract class a extends C3702d {

        /* renamed from: com.soundcloud.android.foundation.events.d$a$a reason: collision with other inner class name */
        /* compiled from: AnalyticsEvent.kt */
        public static final class C0092a extends a {
            private final int c;

            public C0092a(int i) {
                super("ads_extra_ad_in_db", new HVa[]{NVa.a("number_of_ads", Integer.valueOf(i))}, null);
                this.c = i;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C0092a) {
                        if (this.c == ((C0092a) obj).c) {
                            return true;
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return this.c;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("ExtraAdInDb(size=");
                sb.append(this.c);
                sb.append(")");
                return sb.toString();
            }
        }

        /* renamed from: com.soundcloud.android.foundation.events.d$a$b */
        /* compiled from: AnalyticsEvent.kt */
        public static final class b extends a {
            private final String c;
            private final String d;

            public b(String str, String str2) {
                C7471uYa.b(str, "exceptionType");
                C7471uYa.b(str2, "message");
                super("ads_om_tracking_failure", new HVa[]{NVa.a("exception_type", str), NVa.a("exception_message", str2)}, null);
                this.c = str;
                this.d = str2;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
                if (defpackage.C7471uYa.a((java.lang.Object) r2.d, (java.lang.Object) r3.d) != false) goto L_0x001f;
             */
            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof b) {
                        b bVar = (b) obj;
                        if (C7471uYa.a((Object) this.c, (Object) bVar.c)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                String str = this.c;
                int i = 0;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                String str2 = this.d;
                if (str2 != null) {
                    i = str2.hashCode();
                }
                return hashCode + i;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("OMTrackingFailure(exceptionType=");
                sb.append(this.c);
                sb.append(", message=");
                sb.append(this.d);
                sb.append(")");
                return sb.toString();
            }
        }

        /* renamed from: com.soundcloud.android.foundation.events.d$a$c */
        /* compiled from: AnalyticsEvent.kt */
        public static final class c extends a {
            public static final c c = new c();

            private c() {
                super("android_start_tracking_video_ad_failed", new HVa[0], null);
            }
        }

        /* renamed from: com.soundcloud.android.foundation.events.d$a$d reason: collision with other inner class name */
        /* compiled from: AnalyticsEvent.kt */
        public static final class C0093d extends a {
            private final String c;
            private final boolean d;

            public C0093d(String str, boolean z) {
                String str2 = "source";
                C7471uYa.b(str, str2);
                super("ads_video_fetch", new HVa[]{NVa.a(str2, str), NVa.a("success", Boolean.valueOf(z))}, null);
                this.c = str;
                this.d = z;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C0093d) {
                        C0093d dVar = (C0093d) obj;
                        if (C7471uYa.a((Object) this.c, (Object) dVar.c)) {
                            if (this.d == dVar.d) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                String str = this.c;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                boolean z = this.d;
                if (z) {
                    z = true;
                }
                return hashCode + (z ? 1 : 0);
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("VideoAdFetch(source=");
                sb.append(this.c);
                sb.append(", isSuccess=");
                sb.append(this.d);
                sb.append(")");
                return sb.toString();
            }
        }

        private a(String str, HVa<String, ? extends Object>... hVaArr) {
            super(str, (HVa[]) Arrays.copyOf(hVaArr, hVaArr.length), null);
        }

        public /* synthetic */ a(String str, HVa[] hVaArr, C7264rYa rya) {
            this(str, hVaArr);
        }
    }

    @EVa(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\t\n\u000b\fB;\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012*\u0010\u0004\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u00060\u0005\"\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\b\u0001\u0004\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/soundcloud/android/foundation/events/AnalyticsEvent$Core;", "Lcom/soundcloud/android/foundation/events/AnalyticsEvent;", "name", "", "args", "", "Lkotlin/Pair;", "", "(Ljava/lang/String;[Lkotlin/Pair;)V", "DeeplinkReportEvent", "InAppUpdate", "OOM", "RemoteConfigSyncEvent", "Lcom/soundcloud/android/foundation/events/AnalyticsEvent$Core$DeeplinkReportEvent;", "Lcom/soundcloud/android/foundation/events/AnalyticsEvent$Core$RemoteConfigSyncEvent;", "Lcom/soundcloud/android/foundation/events/AnalyticsEvent$Core$InAppUpdate;", "Lcom/soundcloud/android/foundation/events/AnalyticsEvent$Core$OOM;", "events_release"}, mv = {1, 1, 15})
    /* renamed from: com.soundcloud.android.foundation.events.d$b */
    /* compiled from: AnalyticsEvent.kt */
    public static abstract class b extends C3702d {

        /* renamed from: com.soundcloud.android.foundation.events.d$b$a */
        /* compiled from: AnalyticsEvent.kt */
        public static final class a extends b {
            private final String c;
            private final boolean d;

            public a(String str, boolean z) {
                C7471uYa.b(str, Constants.REFERRER);
                super("core_deeplinks_report", new HVa[]{NVa.a(str, Boolean.valueOf(z))}, null);
                this.c = str;
                this.d = z;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof a) {
                        a aVar = (a) obj;
                        if (C7471uYa.a((Object) this.c, (Object) aVar.c)) {
                            if (this.d == aVar.d) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                String str = this.c;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                boolean z = this.d;
                if (z) {
                    z = true;
                }
                return hashCode + (z ? 1 : 0);
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("DeeplinkReportEvent(referrer=");
                sb.append(this.c);
                sb.append(", success=");
                sb.append(this.d);
                sb.append(")");
                return sb.toString();
            }
        }

        /* renamed from: com.soundcloud.android.foundation.events.d$b$b reason: collision with other inner class name */
        /* compiled from: AnalyticsEvent.kt */
        public static final class C0094b extends b {
            private final Map<String, Object> c;

            public C0094b(Map<String, ? extends Object> map) {
                C7471uYa.b(map, "argsMap");
                Set<Entry> entrySet = map.entrySet();
                ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) entrySet, 10));
                for (Entry entry : entrySet) {
                    arrayList.add(new HVa(entry.getKey(), entry.getValue()));
                }
                Object[] array = arrayList.toArray(new HVa[0]);
                if (array != null) {
                    HVa[] hVaArr = (HVa[]) array;
                    super("core_in_app_update_event", (HVa[]) Arrays.copyOf(hVaArr, hVaArr.length), null);
                    this.c = map;
                    return;
                }
                throw new OVa("null cannot be cast to non-null type kotlin.Array<T>");
            }

            /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
                if (defpackage.C7471uYa.a((java.lang.Object) r1.c, (java.lang.Object) ((com.soundcloud.android.foundation.events.C3702d.b.C0094b) r2).c) != false) goto L_0x0015;
             */
            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C0094b) {
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                Map<String, Object> map = this.c;
                if (map != null) {
                    return map.hashCode();
                }
                return 0;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("InAppUpdate(argsMap=");
                sb.append(this.c);
                sb.append(")");
                return sb.toString();
            }
        }

        /* renamed from: com.soundcloud.android.foundation.events.d$b$c */
        /* compiled from: AnalyticsEvent.kt */
        public static final class c extends b {
            private final String c;

            public c(String str) {
                String str2 = "screen";
                C7471uYa.b(str, str2);
                super("core_oom", new HVa[]{NVa.a(str2, str)}, null);
                this.c = str;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
                if (defpackage.C7471uYa.a((java.lang.Object) r1.c, (java.lang.Object) ((com.soundcloud.android.foundation.events.C3702d.b.c) r2).c) != false) goto L_0x0015;
             */
            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof c) {
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                String str = this.c;
                if (str != null) {
                    return str.hashCode();
                }
                return 0;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("OOM(screen=");
                sb.append(this.c);
                sb.append(")");
                return sb.toString();
            }
        }

        /* renamed from: com.soundcloud.android.foundation.events.d$b$d reason: collision with other inner class name */
        /* compiled from: AnalyticsEvent.kt */
        public static final class C0095d extends b {
            private final boolean c;

            public C0095d(boolean z) {
                super("core_periodic_remote_config_sync", new HVa[]{NVa.a("success", Boolean.valueOf(z))}, null);
                this.c = z;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C0095d) {
                        if (this.c == ((C0095d) obj).c) {
                            return true;
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                boolean z = this.c;
                if (z) {
                    return 1;
                }
                return z ? 1 : 0;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("RemoteConfigSyncEvent(success=");
                sb.append(this.c);
                sb.append(")");
                return sb.toString();
            }
        }

        private b(String str, HVa<String, ? extends Object>... hVaArr) {
            super(str, (HVa[]) Arrays.copyOf(hVaArr, hVaArr.length), null);
        }

        public /* synthetic */ b(String str, HVa[] hVaArr, C7264rYa rya) {
            this(str, hVaArr);
        }
    }

    @EVa(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\tB;\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012*\u0010\u0004\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u00060\u0005\"\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\b\u0001\u0001\n¨\u0006\u000b"}, d2 = {"Lcom/soundcloud/android/foundation/events/AnalyticsEvent$Creator;", "Lcom/soundcloud/android/foundation/events/AnalyticsEvent;", "name", "", "args", "", "Lkotlin/Pair;", "", "(Ljava/lang/String;[Lkotlin/Pair;)V", "UploadSuccess", "Lcom/soundcloud/android/foundation/events/AnalyticsEvent$Creator$UploadSuccess;", "events_release"}, mv = {1, 1, 15})
    /* renamed from: com.soundcloud.android.foundation.events.d$c */
    /* compiled from: AnalyticsEvent.kt */
    public static abstract class c extends C3702d {

        /* renamed from: com.soundcloud.android.foundation.events.d$c$a */
        /* compiled from: AnalyticsEvent.kt */
        public static final class a extends c {
            private final boolean c;

            public a(boolean z) {
                super("creator_upload_success", new HVa[]{NVa.a("is_external_upload", Boolean.valueOf(z))}, null);
                this.c = z;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof a) {
                        if (this.c == ((a) obj).c) {
                            return true;
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                boolean z = this.c;
                if (z) {
                    return 1;
                }
                return z ? 1 : 0;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("UploadSuccess(externalUpload=");
                sb.append(this.c);
                sb.append(")");
                return sb.toString();
            }
        }

        private c(String str, HVa<String, ? extends Object>... hVaArr) {
            super(str, (HVa[]) Arrays.copyOf(hVaArr, hVaArr.length), null);
        }

        public /* synthetic */ c(String str, HVa[] hVaArr, C7264rYa rya) {
            this(str, hVaArr);
        }
    }

    @EVa(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\t\n\u000b\fB;\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012*\u0010\u0004\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u00060\u0005\"\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\b\u0001\u0004\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/soundcloud/android/foundation/events/AnalyticsEvent$Growth;", "Lcom/soundcloud/android/foundation/events/AnalyticsEvent;", "name", "", "args", "", "Lkotlin/Pair;", "", "(Ljava/lang/String;[Lkotlin/Pair;)V", "Onboarding", "ResolveUpgradeAttempt", "UpgradeSuccess", "UpgradeViewed", "Lcom/soundcloud/android/foundation/events/AnalyticsEvent$Growth$Onboarding;", "Lcom/soundcloud/android/foundation/events/AnalyticsEvent$Growth$UpgradeViewed;", "Lcom/soundcloud/android/foundation/events/AnalyticsEvent$Growth$UpgradeSuccess;", "Lcom/soundcloud/android/foundation/events/AnalyticsEvent$Growth$ResolveUpgradeAttempt;", "events_release"}, mv = {1, 1, 15})
    /* renamed from: com.soundcloud.android.foundation.events.d$d reason: collision with other inner class name */
    /* compiled from: AnalyticsEvent.kt */
    public static abstract class C0096d extends C3702d {

        /* renamed from: com.soundcloud.android.foundation.events.d$d$a */
        /* compiled from: AnalyticsEvent.kt */
        public static final class a extends C0096d {
            private final String c;
            private final Map<String, String> d;

            public a(String str, Map<String, String> map) {
                String str2 = "kind";
                C7471uYa.b(str, str2);
                C7471uYa.b(map, "argsMap");
                JYa jYa = new JYa(2);
                jYa.a((Object) NVa.a(str2, str));
                Set<Entry> entrySet = map.entrySet();
                ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) entrySet, 10));
                for (Entry entry : entrySet) {
                    arrayList.add(new HVa(entry.getKey(), entry.getValue()));
                }
                Object[] array = arrayList.toArray(new HVa[0]);
                if (array != null) {
                    jYa.b(array);
                    super("growth_onboarding", (HVa[]) jYa.a((Object[]) new HVa[jYa.a()]), null);
                    this.c = str;
                    this.d = map;
                    return;
                }
                throw new OVa("null cannot be cast to non-null type kotlin.Array<T>");
            }

            /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
                if (defpackage.C7471uYa.a((java.lang.Object) r2.d, (java.lang.Object) r3.d) != false) goto L_0x001f;
             */
            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof a) {
                        a aVar = (a) obj;
                        if (C7471uYa.a((Object) this.c, (Object) aVar.c)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                String str = this.c;
                int i = 0;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                Map<String, String> map = this.d;
                if (map != null) {
                    i = map.hashCode();
                }
                return hashCode + i;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("Onboarding(kind=");
                sb.append(this.c);
                sb.append(", argsMap=");
                sb.append(this.d);
                sb.append(")");
                return sb.toString();
            }
        }

        /* renamed from: com.soundcloud.android.foundation.events.d$d$b */
        /* compiled from: AnalyticsEvent.kt */
        public static final class b extends C0096d {
            private final String c;

            public b(String str) {
                String str2 = "result";
                C7471uYa.b(str, str2);
                super("growth_resolve_upgrade_attempt", new HVa[]{NVa.a(str2, str)}, null);
                this.c = str;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
                if (defpackage.C7471uYa.a((java.lang.Object) r1.c, (java.lang.Object) ((com.soundcloud.android.foundation.events.C3702d.C0096d.b) r2).c) != false) goto L_0x0015;
             */
            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof b) {
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                String str = this.c;
                if (str != null) {
                    return str.hashCode();
                }
                return 0;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("ResolveUpgradeAttempt(result=");
                sb.append(this.c);
                sb.append(")");
                return sb.toString();
            }
        }

        /* renamed from: com.soundcloud.android.foundation.events.d$d$c */
        /* compiled from: AnalyticsEvent.kt */
        public static final class c extends C0096d {
            public static final c c = new c();

            private c() {
                super("growth_upgrade_success", new HVa[0], null);
            }
        }

        /* renamed from: com.soundcloud.android.foundation.events.d$d$d reason: collision with other inner class name */
        /* compiled from: AnalyticsEvent.kt */
        public static final class C0097d extends C0096d {
            public static final C0097d c = new C0097d();

            private C0097d() {
                super("growth_upgrade_viewed", new HVa[0], null);
            }
        }

        private C0096d(String str, HVa<String, ? extends Object>... hVaArr) {
            super(str, (HVa[]) Arrays.copyOf(hVaArr, hVaArr.length), null);
        }

        public /* synthetic */ C0096d(String str, HVa[] hVaArr, C7264rYa rya) {
            this(str, hVaArr);
        }
    }

    @EVa(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0011\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019B;\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012*\u0010\u0004\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u00060\u0005\"\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\b\u0001\u0011\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*¨\u0006+"}, d2 = {"Lcom/soundcloud/android/foundation/events/AnalyticsEvent$Permanent;", "Lcom/soundcloud/android/foundation/events/AnalyticsEvent;", "name", "", "args", "", "Lkotlin/Pair;", "", "(Ljava/lang/String;[Lkotlin/Pair;)V", "AdPlayCheckpoint", "Comment", "Follow", "PlayCheckpoint", "PlaylistLike", "PlaylistRepost", "PlaylistShare", "PlaylistUnlike", "PlaylistUnrepost", "ProfileShare", "TrackLike", "TrackRepost", "TrackShare", "TrackUnlike", "TrackUnrepost", "Uncomment", "Unfollow", "Lcom/soundcloud/android/foundation/events/AnalyticsEvent$Permanent$PlayCheckpoint;", "Lcom/soundcloud/android/foundation/events/AnalyticsEvent$Permanent$AdPlayCheckpoint;", "Lcom/soundcloud/android/foundation/events/AnalyticsEvent$Permanent$TrackLike;", "Lcom/soundcloud/android/foundation/events/AnalyticsEvent$Permanent$PlaylistLike;", "Lcom/soundcloud/android/foundation/events/AnalyticsEvent$Permanent$TrackUnlike;", "Lcom/soundcloud/android/foundation/events/AnalyticsEvent$Permanent$PlaylistUnlike;", "Lcom/soundcloud/android/foundation/events/AnalyticsEvent$Permanent$TrackRepost;", "Lcom/soundcloud/android/foundation/events/AnalyticsEvent$Permanent$PlaylistRepost;", "Lcom/soundcloud/android/foundation/events/AnalyticsEvent$Permanent$TrackUnrepost;", "Lcom/soundcloud/android/foundation/events/AnalyticsEvent$Permanent$PlaylistUnrepost;", "Lcom/soundcloud/android/foundation/events/AnalyticsEvent$Permanent$Follow;", "Lcom/soundcloud/android/foundation/events/AnalyticsEvent$Permanent$Unfollow;", "Lcom/soundcloud/android/foundation/events/AnalyticsEvent$Permanent$Comment;", "Lcom/soundcloud/android/foundation/events/AnalyticsEvent$Permanent$Uncomment;", "Lcom/soundcloud/android/foundation/events/AnalyticsEvent$Permanent$TrackShare;", "Lcom/soundcloud/android/foundation/events/AnalyticsEvent$Permanent$PlaylistShare;", "Lcom/soundcloud/android/foundation/events/AnalyticsEvent$Permanent$ProfileShare;", "events_release"}, mv = {1, 1, 15})
    /* renamed from: com.soundcloud.android.foundation.events.d$e */
    /* compiled from: AnalyticsEvent.kt */
    public static abstract class e extends C3702d {

        /* renamed from: com.soundcloud.android.foundation.events.d$e$a */
        /* compiled from: AnalyticsEvent.kt */
        public static final class a extends e {
            private final String c;

            public a(String str) {
                C7471uYa.b(str, "adType");
                super("ad_play_checkpoint", new HVa[]{NVa.a("ad_type", str)}, null);
                this.c = str;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
                if (defpackage.C7471uYa.a((java.lang.Object) r1.c, (java.lang.Object) ((com.soundcloud.android.foundation.events.C3702d.e.a) r2).c) != false) goto L_0x0015;
             */
            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof a) {
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                String str = this.c;
                if (str != null) {
                    return str.hashCode();
                }
                return 0;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("AdPlayCheckpoint(adType=");
                sb.append(this.c);
                sb.append(")");
                return sb.toString();
            }
        }

        /* renamed from: com.soundcloud.android.foundation.events.d$e$b */
        /* compiled from: AnalyticsEvent.kt */
        public static final class b extends e {
            public static final b c = new b();

            private b() {
                super("comment", new HVa[0], null);
            }
        }

        /* renamed from: com.soundcloud.android.foundation.events.d$e$c */
        /* compiled from: AnalyticsEvent.kt */
        public static final class c extends e {
            public static final c c = new c();

            private c() {
                super("follow", new HVa[0], null);
            }
        }

        /* renamed from: com.soundcloud.android.foundation.events.d$e$d reason: collision with other inner class name */
        /* compiled from: AnalyticsEvent.kt */
        public static final class C0098d extends e {
            private final String c;

            public C0098d(String str) {
                C7471uYa.b(str, "originScreen");
                super("play_checkpoint", new HVa[]{NVa.a("origin_screen", str)}, null);
                this.c = str;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
                if (defpackage.C7471uYa.a((java.lang.Object) r1.c, (java.lang.Object) ((com.soundcloud.android.foundation.events.C3702d.e.C0098d) r2).c) != false) goto L_0x0015;
             */
            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C0098d) {
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                String str = this.c;
                if (str != null) {
                    return str.hashCode();
                }
                return 0;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("PlayCheckpoint(originScreen=");
                sb.append(this.c);
                sb.append(")");
                return sb.toString();
            }
        }

        /* renamed from: com.soundcloud.android.foundation.events.d$e$e reason: collision with other inner class name */
        /* compiled from: AnalyticsEvent.kt */
        public static final class C0099e extends e {
            public static final C0099e c = new C0099e();

            private C0099e() {
                super("playlist_like", new HVa[0], null);
            }
        }

        /* renamed from: com.soundcloud.android.foundation.events.d$e$f */
        /* compiled from: AnalyticsEvent.kt */
        public static final class f extends e {
            public static final f c = new f();

            private f() {
                super("playlist_repost", new HVa[0], null);
            }
        }

        /* renamed from: com.soundcloud.android.foundation.events.d$e$g */
        /* compiled from: AnalyticsEvent.kt */
        public static final class g extends e {
            public static final g c = new g();

            private g() {
                super("playlist_share", new HVa[0], null);
            }
        }

        /* renamed from: com.soundcloud.android.foundation.events.d$e$h */
        /* compiled from: AnalyticsEvent.kt */
        public static final class h extends e {
            public static final h c = new h();

            private h() {
                super("playlist_unlike", new HVa[0], null);
            }
        }

        /* renamed from: com.soundcloud.android.foundation.events.d$e$i */
        /* compiled from: AnalyticsEvent.kt */
        public static final class i extends e {
            public static final i c = new i();

            private i() {
                super("playlist_unrepost", new HVa[0], null);
            }
        }

        /* renamed from: com.soundcloud.android.foundation.events.d$e$j */
        /* compiled from: AnalyticsEvent.kt */
        public static final class j extends e {
            public static final j c = new j();

            private j() {
                super("profile_share", new HVa[0], null);
            }
        }

        /* renamed from: com.soundcloud.android.foundation.events.d$e$k */
        /* compiled from: AnalyticsEvent.kt */
        public static final class k extends e {
            public static final k c = new k();

            private k() {
                super("track_like", new HVa[0], null);
            }
        }

        /* renamed from: com.soundcloud.android.foundation.events.d$e$l */
        /* compiled from: AnalyticsEvent.kt */
        public static final class l extends e {
            public static final l c = new l();

            private l() {
                super("track_repost", new HVa[0], null);
            }
        }

        /* renamed from: com.soundcloud.android.foundation.events.d$e$m */
        /* compiled from: AnalyticsEvent.kt */
        public static final class m extends e {
            public static final m c = new m();

            private m() {
                super("track_share", new HVa[0], null);
            }
        }

        /* renamed from: com.soundcloud.android.foundation.events.d$e$n */
        /* compiled from: AnalyticsEvent.kt */
        public static final class n extends e {
            public static final n c = new n();

            private n() {
                super("track_unlike", new HVa[0], null);
            }
        }

        /* renamed from: com.soundcloud.android.foundation.events.d$e$o */
        /* compiled from: AnalyticsEvent.kt */
        public static final class o extends e {
            public static final o c = new o();

            private o() {
                super("track_unrepost", new HVa[0], null);
            }
        }

        /* renamed from: com.soundcloud.android.foundation.events.d$e$p */
        /* compiled from: AnalyticsEvent.kt */
        public static final class p extends e {
            public static final p c = new p();

            private p() {
                super("uncomment", new HVa[0], null);
            }
        }

        /* renamed from: com.soundcloud.android.foundation.events.d$e$q */
        /* compiled from: AnalyticsEvent.kt */
        public static final class q extends e {
            public static final q c = new q();

            private q() {
                super("unfollow", new HVa[0], null);
            }
        }

        private e(String str, HVa<String, ? extends Object>... hVaArr) {
            super(str, (HVa[]) Arrays.copyOf(hVaArr, hVaArr.length), null);
        }

        public /* synthetic */ e(String str, HVa[] hVaArr, C7264rYa rya) {
            this(str, hVaArr);
        }
    }

    private C3702d(String str, HVa<String, ? extends Object>... hVaArr) {
        this.a = str;
        this.b = hVaArr;
    }

    public final HVa<String, Object>[] a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public /* synthetic */ C3702d(String str, HVa[] hVaArr, C7264rYa rya) {
        this(str, hVaArr);
    }
}
