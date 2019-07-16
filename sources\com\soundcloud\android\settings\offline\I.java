package com.soundcloud.android.settings.offline;

import com.soundcloud.android.offline.Oc;

@EVa(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u001aB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001b"}, d2 = {"Lcom/soundcloud/android/settings/offline/OfflineSettingsViewModel;", "", "downloadAutomatically", "", "onlyDownloadViaWifi", "changeStorageLocationSetting", "Lcom/soundcloud/android/settings/offline/OfflineSettingsViewModel$ChangeStorageLocationSetting;", "downloadHighQualityAudio", "(ZZLcom/soundcloud/android/settings/offline/OfflineSettingsViewModel$ChangeStorageLocationSetting;Z)V", "getChangeStorageLocationSetting", "()Lcom/soundcloud/android/settings/offline/OfflineSettingsViewModel$ChangeStorageLocationSetting;", "getDownloadAutomatically", "()Z", "getDownloadHighQualityAudio", "getOnlyDownloadViaWifi", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "ChangeStorageLocationSetting", "base_release"}, mv = {1, 1, 15})
/* compiled from: OfflineSettingsPresenter.kt */
public final class I {
    private final boolean a;
    private final boolean b;
    private final a c;
    private final boolean d;

    @EVa(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/soundcloud/android/settings/offline/OfflineSettingsViewModel$ChangeStorageLocationSetting;", "", "()V", "Hidden", "Visible", "Lcom/soundcloud/android/settings/offline/OfflineSettingsViewModel$ChangeStorageLocationSetting$Hidden;", "Lcom/soundcloud/android/settings/offline/OfflineSettingsViewModel$ChangeStorageLocationSetting$Visible;", "base_release"}, mv = {1, 1, 15})
    /* compiled from: OfflineSettingsPresenter.kt */
    public static abstract class a {

        /* renamed from: com.soundcloud.android.settings.offline.I$a$a reason: collision with other inner class name */
        /* compiled from: OfflineSettingsPresenter.kt */
        public static final class C0169a extends a {
            public static final C0169a a = new C0169a();

            private C0169a() {
                super(null);
            }
        }

        /* compiled from: OfflineSettingsPresenter.kt */
        public static final class b extends a {
            private final Oc a;

            public b(Oc oc) {
                C7471uYa.b(oc, "storageLocation");
                super(null);
                this.a = oc;
            }

            public final Oc a() {
                return this.a;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
                if (defpackage.C7471uYa.a((java.lang.Object) r1.a, (java.lang.Object) ((com.soundcloud.android.settings.offline.I.a.b) r2).a) != false) goto L_0x0015;
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
                Oc oc = this.a;
                if (oc != null) {
                    return oc.hashCode();
                }
                return 0;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("Visible(storageLocation=");
                sb.append(this.a);
                sb.append(")");
                return sb.toString();
            }
        }

        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public I(boolean z, boolean z2, a aVar, boolean z3) {
        C7471uYa.b(aVar, "changeStorageLocationSetting");
        this.a = z;
        this.b = z2;
        this.c = aVar;
        this.d = z3;
    }

    public final a a() {
        return this.c;
    }

    public final boolean b() {
        return this.a;
    }

    public final boolean c() {
        return this.d;
    }

    public final boolean d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof I) {
                I i = (I) obj;
                if (this.a == i.a) {
                    if ((this.b == i.b) && C7471uYa.a((Object) this.c, (Object) i.c)) {
                        if (this.d == i.d) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        boolean z = this.a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (z ? 1 : 0) * true;
        boolean z2 = this.b;
        if (z2) {
            z2 = true;
        }
        int i3 = (i2 + (z2 ? 1 : 0)) * 31;
        a aVar = this.c;
        int hashCode = (i3 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        boolean z3 = this.d;
        if (!z3) {
            i = z3;
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OfflineSettingsViewModel(downloadAutomatically=");
        sb.append(this.a);
        sb.append(", onlyDownloadViaWifi=");
        sb.append(this.b);
        sb.append(", changeStorageLocationSetting=");
        sb.append(this.c);
        sb.append(", downloadHighQualityAudio=");
        sb.append(this.d);
        sb.append(")");
        return sb.toString();
    }
}
