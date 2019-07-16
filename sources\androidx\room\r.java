package androidx.room;

import android.os.RemoteException;
import android.util.Log;
import androidx.room.C0436e.a;

/* compiled from: MultiInstanceInvalidationService */
class r extends a {
    final /* synthetic */ MultiInstanceInvalidationService a;

    r(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.a = multiInstanceInvalidationService;
    }

    public int a(C0435d dVar, String str) {
        if (str == null) {
            return 0;
        }
        synchronized (this.a.c) {
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.a;
            int i = multiInstanceInvalidationService.a + 1;
            multiInstanceInvalidationService.a = i;
            if (this.a.c.register(dVar, Integer.valueOf(i))) {
                this.a.b.a(i, str);
                return i;
            }
            this.a.a--;
            return 0;
        }
    }

    public void a(C0435d dVar, int i) {
        synchronized (this.a.c) {
            this.a.c.unregister(dVar);
            this.a.b.e(i);
        }
    }

    public void a(int i, String[] strArr) {
        synchronized (this.a.c) {
            String str = (String) this.a.b.b(i);
            if (str == null) {
                Log.w("ROOM", "Remote invalidation client ID not registered");
                return;
            }
            int beginBroadcast = this.a.c.beginBroadcast();
            for (int i2 = 0; i2 < beginBroadcast; i2++) {
                try {
                    int intValue = ((Integer) this.a.c.getBroadcastCookie(i2)).intValue();
                    String str2 = (String) this.a.b.b(intValue);
                    if (i != intValue && str.equals(str2)) {
                        ((C0435d) this.a.c.getBroadcastItem(i2)).a(strArr);
                    }
                } catch (RemoteException e) {
                    Log.w("ROOM", "Error invoking a remote callback", e);
                } catch (Throwable th) {
                    this.a.c.finishBroadcast();
                    throw th;
                }
            }
            this.a.c.finishBroadcast();
        }
    }
}
