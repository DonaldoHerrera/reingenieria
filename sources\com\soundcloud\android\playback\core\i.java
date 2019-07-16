package com.soundcloud.android.playback.core;

/* compiled from: PlaybackItem.kt */
final class i extends C7540vYa implements PXa<String> {
    final /* synthetic */ PlaybackItem a;

    i(PlaybackItem playbackItem) {
        this.a = playbackItem;
        super(0);
    }

    public final String d() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a.f().b());
        sb.append(':');
        sb.append(this.a.c().b());
        return String.valueOf(sb.toString().hashCode());
    }
}
