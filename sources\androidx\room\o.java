package androidx.room;

import android.os.RemoteException;
import android.util.Log;
import androidx.room.h.b;
import java.util.Set;

/* compiled from: MultiInstanceInvalidationClient */
class o extends b {
    final /* synthetic */ p b;

    o(p pVar, String[] strArr) {
        this.b = pVar;
        super(strArr);
    }

    public void a(Set<String> set) {
        if (!this.b.i.get()) {
            try {
                this.b.f.a(this.b.c, (String[]) set.toArray(new String[0]));
            } catch (RemoteException e) {
                Log.w("ROOM", "Cannot broadcast invalidation", e);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean a() {
        return true;
    }
}
