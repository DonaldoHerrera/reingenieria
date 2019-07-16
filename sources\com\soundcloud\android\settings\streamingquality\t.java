package com.soundcloud.android.settings.streamingquality;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.soundcloud.android.settings.V;

@EVa(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0016\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/soundcloud/android/settings/streamingquality/StreamingQualityStorage;", "", "streamingSettingsPrefs", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "clear", "", "getDownloadsQuality", "", "getStreamingQuality", "saveDownloadsQuality", "quality", "saveStreamingQuality", "Companion", "settings_release"}, mv = {1, 1, 15})
/* compiled from: StreamingQualityStorage.kt */
public class t {
    public static final a a = new a(null);
    private final SharedPreferences b;

    /* compiled from: StreamingQualityStorage.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public t(@V SharedPreferences sharedPreferences) {
        C7471uYa.b(sharedPreferences, "streamingSettingsPrefs");
        this.b = sharedPreferences;
    }

    public void a(String str) {
        C7471uYa.b(str, "quality");
        Editor edit = this.b.edit();
        C7471uYa.a((Object) edit, "editor");
        edit.putString("downloads_quality", str);
        edit.apply();
    }

    public void b(String str) {
        C7471uYa.b(str, "quality");
        Editor edit = this.b.edit();
        C7471uYa.a((Object) edit, "editor");
        edit.putString("streaming_quality", str);
        edit.apply();
    }

    public String c() {
        return this.b.getString("streaming_quality", null);
    }

    public void a() {
        Editor edit = this.b.edit();
        C7471uYa.a((Object) edit, "editor");
        edit.remove("streaming_quality");
        edit.remove("downloads_quality");
        edit.apply();
    }

    public String b() {
        return this.b.getString("downloads_quality", null);
    }
}
