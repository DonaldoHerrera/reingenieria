package com.soundcloud.android.collection.recentlyplayed;

import android.database.Cursor;
import com.soundcloud.android.collection.C2839u;
import com.soundcloud.android.collection.Fa.b;
import com.soundcloud.android.collection.playhistory.ua;
import com.soundcloud.android.collection.recentlyplayed.G.l;
import com.soundcloud.android.collection.recentlyplayed.G.m;
import java.util.List;
import java.util.Set;

/* compiled from: RecentlyPlayedStorage.kt */
public class Ga {
    private final _Xa<Cursor, ua> a = new Da(this);
    /* access modifiers changed from: private */
    public final C2839u b;

    public Ga(C2839u uVar) {
        C7471uYa.b(uVar, "collectionDatabase");
        this.b = uVar;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [_Xa<android.database.Cursor, com.soundcloud.android.collection.playhistory.ua>, _Xa] */
    /* JADX WARNING: type inference failed for: r0v1 */
    /* JADX WARNING: type inference failed for: r1v2, types: [com.soundcloud.android.collection.recentlyplayed.Fa] */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    public APa<List<ua>> b(int i) {
        C2839u uVar = this.b;
        ? r0 = this.a;
        if (r0 != 0) {
            r0 = new Fa(r0);
        }
        C6772kMa kma = (C6772kMa) r0;
        C6840lMa b2 = b.a.b();
        C7471uYa.a((Object) b2, "FACTORY.selectRecentlyPlayed()");
        return uVar.a(kma, "RecentlyPlayed", b2);
    }

    public List<ua> c() {
        return a(true);
    }

    public List<ua> d() {
        return a(false);
    }

    private void d(List<? extends ua> list) {
        this.b.a((PXa<RVa>) new Ca<RVa>(this, list));
    }

    public Set<Long> a(int i) {
        C2839u uVar = this.b;
        C6840lMa a2 = b.a.a((long) i);
        C7471uYa.a((Object) a2, "FACTORY.selectIdsByConte…ype(contextType.toLong())");
        C6772kMa a3 = b.a.a();
        C7471uYa.a((Object) a3, "FACTORY.selectIdsByContextTypeMapper()");
        return C7676xWa.t(uVar.c((Xd) a2, a3));
    }

    public void b(List<? extends ua> list) {
        C7471uYa.b(list, "records");
        d(list);
    }

    public void c(List<? extends ua> list) {
        C7471uYa.b(list, "records");
        this.b.a((PXa<RVa>) new Ea<RVa>(this, list));
    }

    public void a(List<? extends ua> list) {
        C7471uYa.b(list, "records");
        d(list);
    }

    public boolean b() {
        C2839u uVar = this.b;
        C6840lMa c = b.a.c();
        C7471uYa.a((Object) c, "FACTORY.unsyncedRecentlyPlayedCount()");
        C6772kMa d = b.a.d();
        C7471uYa.a((Object) d, "FACTORY.unsyncedRecentlyPlayedCountMapper()");
        if (((Long) uVar.c((Xd) c, d).get(0)).longValue() > 0) {
            return true;
        }
        return false;
    }

    public void c(int i) {
        l lVar = new l(this.b.a());
        lVar.a((long) i);
        this.b.c("RecentlyPlayed", (Yd) lVar);
    }

    public void a(ua uaVar) {
        C7471uYa.b(uaVar, "record");
        m mVar = new m(this.b.a());
        C3508cda b2 = uaVar.b();
        C7471uYa.a((Object) b2, "record.contextUrn()");
        mVar.a(b2.c(), (long) uaVar.c(), uaVar.h());
        this.b.a("RecentlyPlayed", (Yd) mVar);
    }

    public long b(Cursor cursor, String str) {
        C7471uYa.b(cursor, "$this$getAsLong");
        C7471uYa.b(str, "columnName");
        return cursor.getLong(cursor.getColumnIndex(str));
    }

    public void a() {
        this.b.a("RecentlyPlayed");
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [_Xa<android.database.Cursor, com.soundcloud.android.collection.playhistory.ua>, _Xa] */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r2v0, types: [com.soundcloud.android.collection.recentlyplayed.Fa] */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    private List<ua> a(boolean z) {
        C2839u uVar = this.b;
        C6840lMa a2 = b.a.a(Boolean.valueOf(z));
        C7471uYa.a((Object) a2, "FACTORY.selectRecentlyPlayedBySyncStatus(synced)");
        ? r1 = this.a;
        if (r1 != 0) {
            r1 = new Fa(r1);
        }
        return uVar.c((Xd) a2, (C6772kMa) r1);
    }

    public int a(Cursor cursor, String str) {
        C7471uYa.b(cursor, "$this$getAsInt");
        C7471uYa.b(str, "columnName");
        return cursor.getInt(cursor.getColumnIndex(str));
    }
}
