package defpackage;

import android.content.ContentValues;
import java.util.List;

/* renamed from: LBa reason: default package and case insensitive filesystem */
/* compiled from: ReplacePlaylistTracksCommand */
class C5075LBa extends C1286fT<List<C3508cda>, C6431fLa> {
    /* access modifiers changed from: private */
    public C3508cda b;

    public C5075LBa(C5500ZKa zKa) {
        super(zKa);
    }

    public C5075LBa a(C3508cda cda) {
        this.b = cda;
        return this;
    }

    /* access modifiers changed from: protected */
    public C6431fLa a(C5500ZKa zKa, List<C3508cda> list) {
        return zKa.a((a) new C5044KBa(this, list));
    }

    /* access modifiers changed from: private */
    public ContentValues a(C3508cda cda, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("playlist_id", Long.valueOf(this.b.c()));
        contentValues.put("track_id", Long.valueOf(cda.c()));
        contentValues.put("position", Integer.valueOf(i));
        return contentValues;
    }
}
