package com.soundcloud.android.settings.streamingquality;

import java.util.List;

/* compiled from: StreamingQualitySettingsPresenter.kt */
public final class r {
    private final List<a> a;
    private final int b;

    public r(List<a> list, int i) {
        C7471uYa.b(list, "settings");
        this.a = list;
        this.b = i;
    }

    public final int a() {
        return this.b;
    }

    public final List<a> b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof r) {
                r rVar = (r) obj;
                if (C7471uYa.a((Object) this.a, (Object) rVar.a)) {
                    if (this.b == rVar.b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        List<a> list = this.a;
        return ((list != null ? list.hashCode() : 0) * 31) + this.b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StreamingQualitySettingsViewModel(settings=");
        sb.append(this.a);
        sb.append(", selectedPosition=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
