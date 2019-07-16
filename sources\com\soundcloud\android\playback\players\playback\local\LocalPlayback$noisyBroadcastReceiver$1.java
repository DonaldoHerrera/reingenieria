package com.soundcloud.android.playback.players.playback.local;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

@EVa(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"com/soundcloud/android/playback/players/playback/local/LocalPlayback$noisyBroadcastReceiver$1", "Landroid/content/BroadcastReceiver;", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "players_release"}, mv = {1, 1, 15})
/* compiled from: LocalPlayback.kt */
public final class LocalPlayback$noisyBroadcastReceiver$1 extends BroadcastReceiver {
    final /* synthetic */ b a;

    LocalPlayback$noisyBroadcastReceiver$1(b bVar) {
        this.a = bVar;
    }

    public void onReceive(Context context, Intent intent) {
        if (C7471uYa.a((Object) "android.media.AUDIO_BECOMING_NOISY", (Object) intent != null ? intent.getAction() : null)) {
            this.a.q.a("LocalPlayback", "Headphones disconnected: Noisy broadcast received.");
            if (this.a.d()) {
                this.a.pause();
            }
        }
    }
}
