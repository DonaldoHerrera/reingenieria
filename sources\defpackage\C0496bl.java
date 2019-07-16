package defpackage;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import com.facebook.B;
import java.util.UUID;

/* renamed from: bl reason: default package and case insensitive filesystem */
/* compiled from: SessionInfo */
class C0496bl {
    private Long a;
    private Long b;
    private int c;
    private Long d;
    private C1238dl e;
    private UUID f;

    public C0496bl(Long l, Long l2) {
        this(l, l2, UUID.randomUUID());
    }

    public static void a() {
        Editor edit = PreferenceManager.getDefaultSharedPreferences(B.e()).edit();
        edit.remove("com.facebook.appevents.SessionInfo.sessionStartTime");
        edit.remove("com.facebook.appevents.SessionInfo.sessionEndTime");
        edit.remove("com.facebook.appevents.SessionInfo.interruptionCount");
        edit.remove("com.facebook.appevents.SessionInfo.sessionId");
        edit.apply();
        C1238dl.a();
    }

    public static C0496bl h() {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(B.e());
        long j = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionStartTime", 0);
        long j2 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionEndTime", 0);
        String string = defaultSharedPreferences.getString("com.facebook.appevents.SessionInfo.sessionId", null);
        if (j == 0 || j2 == 0 || string == null) {
            return null;
        }
        C0496bl blVar = new C0496bl(Long.valueOf(j), Long.valueOf(j2));
        blVar.c = defaultSharedPreferences.getInt("com.facebook.appevents.SessionInfo.interruptionCount", 0);
        blVar.e = C1238dl.b();
        blVar.d = Long.valueOf(System.currentTimeMillis());
        blVar.f = UUID.fromString(string);
        return blVar;
    }

    public long b() {
        Long l = this.d;
        if (l == null) {
            return 0;
        }
        return l.longValue();
    }

    public int c() {
        return this.c;
    }

    public UUID d() {
        return this.f;
    }

    public Long e() {
        return this.b;
    }

    public long f() {
        if (this.a != null) {
            Long l = this.b;
            if (l != null) {
                return l.longValue() - this.a.longValue();
            }
        }
        return 0;
    }

    public C1238dl g() {
        return this.e;
    }

    public void i() {
        this.c++;
    }

    public void j() {
        Editor edit = PreferenceManager.getDefaultSharedPreferences(B.e()).edit();
        edit.putLong("com.facebook.appevents.SessionInfo.sessionStartTime", this.a.longValue());
        edit.putLong("com.facebook.appevents.SessionInfo.sessionEndTime", this.b.longValue());
        edit.putInt("com.facebook.appevents.SessionInfo.interruptionCount", this.c);
        edit.putString("com.facebook.appevents.SessionInfo.sessionId", this.f.toString());
        edit.apply();
        C1238dl dlVar = this.e;
        if (dlVar != null) {
            dlVar.c();
        }
    }

    public C0496bl(Long l, Long l2, UUID uuid) {
        this.a = l;
        this.b = l2;
        this.f = uuid;
    }

    public void a(Long l) {
        this.b = l;
    }
}
