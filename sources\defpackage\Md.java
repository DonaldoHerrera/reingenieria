package defpackage;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.Build.VERSION;
import androidx.room.t;
import java.util.ArrayList;

/* renamed from: Md reason: default package */
/* compiled from: DBUtil */
public class Md {
    public static Cursor a(t tVar, Xd xd, boolean z) {
        Cursor a = tVar.a(xd);
        if (!z || !(a instanceof AbstractWindowedCursor)) {
            return a;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) a;
        int count = abstractWindowedCursor.getCount();
        return (VERSION.SDK_INT < 23 || (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) ? Ld.a(abstractWindowedCursor) : a;
    }

    /* JADX INFO: finally extract failed */
    public static void a(Ud ud) {
        ArrayList<String> arrayList = new ArrayList<>();
        Cursor i = ud.i("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (i.moveToNext()) {
            try {
                arrayList.add(i.getString(0));
            } catch (Throwable th) {
                i.close();
                throw th;
            }
        }
        i.close();
        for (String str : arrayList) {
            if (str.startsWith("room_fts_content_sync_")) {
                StringBuilder sb = new StringBuilder();
                sb.append("DROP TRIGGER IF EXISTS ");
                sb.append(str);
                ud.g(sb.toString());
            }
        }
    }
}
