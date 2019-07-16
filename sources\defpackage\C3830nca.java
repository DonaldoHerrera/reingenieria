package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.soundcloud.android.foundation.playqueue.PlaySessionSource;
import com.soundcloud.android.foundation.playqueue.j;
import com.soundcloud.android.foundation.playqueue.o;
import java.util.List;
import java.util.Set;

/* renamed from: nca reason: default package and case insensitive filesystem */
/* compiled from: PlayQueueOperations */
class C3830nca {
    private final SharedPreferences a;
    private final C3846pca b;
    private final j c;
    private final HPa d;

    /* renamed from: nca$a */
    /* compiled from: PlayQueueOperations */
    enum a {
        PLAY_POSITION
    }

    C3830nca(Context context, C3846pca pca, j jVar, HPa hPa) {
        this.c = jVar;
        this.d = hPa;
        this.a = context.getSharedPreferences("playlistPos", 0);
        this.b = pca;
    }

    public /* synthetic */ C7669xPa a(Set set) throws Exception {
        return this.b.a(set).e(Rba.a).i().b(this.d);
    }

    /* access modifiers changed from: 0000 */
    public C6979nPa b(o oVar) {
        return C6979nPa.b((C6368eQa) new Vba(this, oVar));
    }

    /* access modifiers changed from: 0000 */
    public int c() {
        return this.a.getInt(a.PLAY_POSITION.name(), 0);
    }

    /* access modifiers changed from: 0000 */
    public C7531vPa<o> d() {
        if (this.a.contains(a.PLAY_POSITION.name())) {
            return this.c.a().c((C7118pQa<? super T, ? extends C7669xPa<? extends R>>) new Uba<Object,Object>(this));
        }
        SDb.b("No last stored playqueue as the last playqueue is empty", new Object[0]);
        return C7531vPa.c();
    }

    /* access modifiers changed from: 0000 */
    public PlaySessionSource e() {
        return new PlaySessionSource(this.a);
    }

    /* access modifiers changed from: 0000 */
    public List<C3508cda> b() {
        return this.b.b();
    }

    public /* synthetic */ void a(o oVar) throws Exception {
        this.b.b(oVar);
    }

    /* access modifiers changed from: 0000 */
    public void a(int i, PlaySessionSource playSessionSource) {
        SDb.c("Saving playback info. position [%s], source: %s", Integer.valueOf(i), playSessionSource);
        Editor edit = this.a.edit();
        playSessionSource.b(edit);
        edit.putInt(a.PLAY_POSITION.name(), i);
        edit.apply();
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        SDb.c("Clearing play info", new Object[0]);
        Editor edit = this.a.edit();
        edit.remove(a.PLAY_POSITION.name());
        PlaySessionSource.a(edit);
        edit.apply();
        this.b.a().b(this.d).g();
    }
}
