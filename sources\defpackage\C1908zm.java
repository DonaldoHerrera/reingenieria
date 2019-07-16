package defpackage;

import android.media.AudioTrack;

/* renamed from: zm reason: default package and case insensitive filesystem */
/* compiled from: DefaultAudioSink */
class C1908zm extends Thread {
    final /* synthetic */ AudioTrack a;
    final /* synthetic */ Am b;

    C1908zm(Am am, AudioTrack audioTrack) {
        this.b = am;
        this.a = audioTrack;
    }

    public void run() {
        this.a.release();
    }
}
