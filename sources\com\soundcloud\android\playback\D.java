package com.soundcloud.android.playback;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* compiled from: AudioPortTracker.kt */
public final class D extends AudioDeviceCallback {
    final /* synthetic */ E a;

    D(E e) {
        this.a = e;
    }

    public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        C7471uYa.b(audioDeviceInfoArr, "devices");
        for (AudioDeviceInfo type : this.a.a(audioDeviceInfoArr)) {
            this.a.a.add(new C4415ra(type.getType()));
        }
        C2332VH b = this.a.b;
        E e = this.a;
        b.accept(e.a(C7676xWa.q(e.a)));
    }

    public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        C7471uYa.b(audioDeviceInfoArr, "devices");
        for (AudioDeviceInfo type : this.a.a(audioDeviceInfoArr)) {
            this.a.a.remove(new C4415ra(type.getType()));
        }
        C2332VH b = this.a.b;
        E e = this.a;
        b.accept(e.a(C7676xWa.q(e.a)));
    }
}
