package androidx.room;

import android.os.RemoteCallbackList;

/* compiled from: MultiInstanceInvalidationService */
class q extends RemoteCallbackList<C0435d> {
    final /* synthetic */ MultiInstanceInvalidationService a;

    q(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.a = multiInstanceInvalidationService;
    }

    /* renamed from: a */
    public void onCallbackDied(C0435d dVar, Object obj) {
        this.a.b.e(((Integer) obj).intValue());
    }
}
