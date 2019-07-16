package com.soundcloud.android.ui.visualplayer;

import com.soundcloud.android.foundation.playqueue.q;
import com.soundcloud.android.tracks.C6185ma;

@EVa(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\n\u000b\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0000H&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0001\u0002\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/soundcloud/android/ui/visualplayer/PlayerItem;", "", "kind", "Lcom/soundcloud/android/ui/visualplayer/PlayerItem$Kind;", "(Lcom/soundcloud/android/ui/visualplayer/PlayerItem$Kind;)V", "getKind", "()Lcom/soundcloud/android/ui/visualplayer/PlayerItem$Kind;", "isIdentityEqualTo", "", "secondItem", "Ad", "Kind", "Track", "Lcom/soundcloud/android/ui/visualplayer/PlayerItem$Track;", "Lcom/soundcloud/android/ui/visualplayer/PlayerItem$Ad;", "visual-player_release"}, mv = {1, 1, 15})
/* compiled from: VisualPlayerAdapter.kt */
public abstract class c {
    private final b a;

    /* compiled from: VisualPlayerAdapter.kt */
    public static final class a extends c {
        private final q b;

        public a(q qVar) {
            C7471uYa.b(qVar, "adItem");
            super(b.AD, null);
            this.b = qVar;
        }

        public boolean a(c cVar) {
            C7471uYa.b(cVar, "secondItem");
            return (cVar instanceof a) && C7471uYa.a((Object) ((a) cVar).b.c(), (Object) this.b.c());
        }

        public final q b() {
            return this.b;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) r1.b, (java.lang.Object) ((com.soundcloud.android.ui.visualplayer.c.a) r2).b) != false) goto L_0x0015;
         */
        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            q qVar = this.b;
            if (qVar != null) {
                return qVar.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Ad(adItem=");
            sb.append(this.b);
            sb.append(")");
            return sb.toString();
        }
    }

    /* compiled from: VisualPlayerAdapter.kt */
    public enum b {
        TRACK,
        AD
    }

    /* renamed from: com.soundcloud.android.ui.visualplayer.c$c reason: collision with other inner class name */
    /* compiled from: VisualPlayerAdapter.kt */
    public static final class C0175c extends c {
        private final C6185ma b;

        public C0175c(C6185ma maVar) {
            C7471uYa.b(maVar, "trackItem");
            super(b.TRACK, null);
            this.b = maVar;
        }

        public boolean a(c cVar) {
            C7471uYa.b(cVar, "secondItem");
            return (cVar instanceof C0175c) && C7471uYa.a((Object) ((C0175c) cVar).b.a(), (Object) this.b.a());
        }

        public final C6185ma b() {
            return this.b;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) r1.b, (java.lang.Object) ((com.soundcloud.android.ui.visualplayer.c.C0175c) r2).b) != false) goto L_0x0015;
         */
        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C0175c) {
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            C6185ma maVar = this.b;
            if (maVar != null) {
                return maVar.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Track(trackItem=");
            sb.append(this.b);
            sb.append(")");
            return sb.toString();
        }
    }

    private c(b bVar) {
        this.a = bVar;
    }

    public final b a() {
        return this.a;
    }

    public abstract boolean a(c cVar);

    public /* synthetic */ c(b bVar, C7264rYa rya) {
        this(bVar);
    }
}
