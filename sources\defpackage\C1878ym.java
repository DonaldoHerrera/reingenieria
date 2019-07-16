package defpackage;

import android.media.AudioTrack;

/* renamed from: ym reason: default package and case insensitive filesystem */
/* compiled from: DefaultAudioSink */
class C1878ym extends Thread {
    final /* synthetic */ AudioTrack a;
    final /* synthetic */ Am b;

    C1878ym(Am am, AudioTrack audioTrack) {
        this.b = am;
        this.a = audioTrack;
    }

    public void run() {
        try {
            this.a.flush();
            this.a.release();
        } finally {
            this.b.j.open();
        }
    }
}
