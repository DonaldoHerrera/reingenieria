package com.soundcloud.android.collections.data;

import androidx.room.t.b;
import androidx.room.v.a;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: com.soundcloud.android.collections.data.o reason: case insensitive filesystem */
/* compiled from: CollectionsDatabase_Impl */
class C2859o extends a {
    final /* synthetic */ CollectionsDatabase_Impl b;

    C2859o(CollectionsDatabase_Impl collectionsDatabase_Impl, int i) {
        this.b = collectionsDatabase_Impl;
        super(i);
    }

    public void a(Ud ud) {
        ud.g("CREATE TABLE IF NOT EXISTS `likes` (`urn` TEXT NOT NULL, `type` INTEGER NOT NULL, `createdAt` INTEGER NOT NULL, `addedAt` INTEGER, `removedAt` INTEGER, PRIMARY KEY(`urn`, `type`))");
        ud.g("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        ud.g("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '2d36cfe39ee4357f85e1f4028a7ab8dc')");
    }

    public void b(Ud ud) {
        ud.g("DROP TABLE IF EXISTS `likes`");
    }

    /* access modifiers changed from: protected */
    public void c(Ud ud) {
        if (this.b.h != null) {
            int size = this.b.h.size();
            for (int i = 0; i < size; i++) {
                ((b) this.b.h.get(i)).a(ud);
            }
        }
    }

    public void d(Ud ud) {
        this.b.a = ud;
        this.b.a(ud);
        if (this.b.h != null) {
            int size = this.b.h.size();
            for (int i = 0; i < size; i++) {
                ((b) this.b.h.get(i)).b(ud);
            }
        }
    }

    public void e(Ud ud) {
    }

    public void f(Ud ud) {
        Md.a(ud);
    }

    /* access modifiers changed from: protected */
    public void g(Ud ud) {
        HashMap hashMap = new HashMap(5);
        String str = "urn";
        hashMap.put(str, new a(str, "TEXT", true, 1));
        String str2 = C1325gg.TYPE;
        String str3 = "INTEGER";
        hashMap.put(str2, new a(str2, str3, true, 2));
        String str4 = "createdAt";
        hashMap.put(str4, new a(str4, str3, true, 0));
        String str5 = "addedAt";
        hashMap.put(str5, new a(str5, str3, false, 0));
        String str6 = "removedAt";
        hashMap.put(str6, new a(str6, str3, false, 0));
        String str7 = "likes";
        Od od = new Od(str7, hashMap, new HashSet(0), new HashSet(0));
        Od a = Od.a(ud, str7);
        if (!od.equals(a)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Migration didn't properly handle likes(com.soundcloud.android.collections.data.LikeEntity).\n Expected:\n");
            sb.append(od);
            sb.append("\n Found:\n");
            sb.append(a);
            throw new IllegalStateException(sb.toString());
        }
    }
}
