package com.soundcloud.android.playback;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

/* renamed from: com.soundcloud.android.playback.sb reason: case insensitive filesystem */
/* compiled from: PlaySessionStateStorage */
public class C4421sb {
    private final SharedPreferences a;

    /* renamed from: com.soundcloud.android.playback.sb$a */
    /* compiled from: PlaySessionStateStorage */
    enum a {
        PROGRESS,
        DURATION,
        ITEM,
        PLAY_ID
    }

    public C4421sb(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    /* access modifiers changed from: 0000 */
    public void a(C3508cda cda) {
        Editor edit = this.a.edit();
        edit.putString(a.ITEM.name(), cda.toString());
        edit.remove(a.PLAY_ID.name());
        edit.apply();
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        Editor edit = this.a.edit();
        edit.remove(a.PROGRESS.name());
        edit.remove(a.DURATION.name());
        edit.apply();
    }

    /* access modifiers changed from: 0000 */
    public String c() {
        return this.a.getString(a.PLAY_ID.name(), "");
    }

    /* access modifiers changed from: 0000 */
    public C3508cda d() {
        return this.a.contains(a.ITEM.name()) ? new C3508cda(this.a.getString(a.ITEM.name(), "")) : C3508cda.a;
    }

    /* access modifiers changed from: 0000 */
    public long e() {
        return this.a.getLong(a.DURATION.name(), 0);
    }

    /* access modifiers changed from: 0000 */
    public long f() {
        return this.a.getLong(a.PROGRESS.name(), 0);
    }

    public boolean g() {
        return this.a.contains(a.PLAY_ID.name());
    }

    /* access modifiers changed from: 0000 */
    public void a(String str) {
        Editor edit = this.a.edit();
        edit.putString(a.PLAY_ID.name(), str);
        edit.apply();
    }

    /* access modifiers changed from: 0000 */
    public void a(long j, long j2) {
        Editor edit = this.a.edit();
        edit.putLong(a.PROGRESS.name(), j);
        edit.putLong(a.DURATION.name(), j2);
        edit.apply();
    }

    public void a() {
        b();
        Editor edit = this.a.edit();
        edit.remove(a.ITEM.name());
        edit.remove(a.PLAY_ID.name());
        edit.apply();
    }
}
