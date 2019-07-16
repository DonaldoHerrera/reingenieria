package androidx.room;

import androidx.room.C0435d.a;

/* compiled from: MultiInstanceInvalidationClient */
class j extends a {
    final /* synthetic */ p a;

    j(p pVar) {
        this.a = pVar;
    }

    public void a(String[] strArr) {
        this.a.g.execute(new i(this, strArr));
    }
}
