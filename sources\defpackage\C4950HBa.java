package defpackage;

import android.content.ContentValues;
import java.util.Collections;

/* renamed from: HBa reason: default package and case insensitive filesystem */
/* compiled from: ReplacePlaylistPostCommand */
class C4950HBa extends a {
    final /* synthetic */ C3508cda b;
    final /* synthetic */ C3927zda c;
    final /* synthetic */ C4981IBa d;

    C4950HBa(C4981IBa iBa, C3508cda cda, C3927zda zda) {
        this.d = iBa;
        this.b = cda;
        this.c = zda;
    }

    private void c(C5500ZKa zKa) {
        this.d.d.b(Collections.singletonList(this.c.s()));
        a(this.d.e.a(zKa, this.c));
    }

    private void d(C5500ZKa zKa) {
        a(zKa.a((C5116MLa) e.c, C6907mLa.a().a(e.d, (Object) Long.valueOf(this.b.c())).a(e.e, (Object) Integer.valueOf(1))));
    }

    private void e(C5500ZKa zKa) {
        ContentValues contentValues = new ContentValues();
        String str = "playlist_id";
        contentValues.put(str, Long.valueOf(this.c.a().c()));
        contentValues.putNull("added_at");
        a(zKa.a((C5116MLa) _ea.PlaylistTracks, contentValues, C6907mLa.a().d(str, (Object) Long.valueOf(this.b.c()))));
    }

    public void b(C5500ZKa zKa) {
        c(zKa);
        e(zKa);
        d(zKa);
        c();
        b();
    }

    private void c() {
        this.d.f.a(this.b, this.c);
    }

    private void b() {
        this.d.c.a(this.b, this.c.a());
    }
}
