package com.soundcloud.android.playback;

import android.annotation.TargetApi;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: AudioPortTracker.kt */
public class E {
    /* access modifiers changed from: private */
    public final I a = I.a;
    /* access modifiers changed from: private */
    public final C2332VH<String> b;
    private final APa<String> c;
    private final AudioManager d;
    private final C5467YGa e;

    public E(AudioManager audioManager, C5467YGa yGa) {
        C7471uYa.b(audioManager, "audioManager");
        C7471uYa.b(yGa, "buildHelper");
        this.d = audioManager;
        this.e = yGa;
        C2332VH<String> s = C2332VH.s();
        C7471uYa.a((Object) s, "PublishRelay.create<String>()");
        this.b = s;
        APa<String> h = this.b.h();
        C7471uYa.a((Object) h, "onAudioPortsChangedRelay.hide()");
        this.c = h;
    }

    @TargetApi(23)
    private void d() {
        AudioDeviceInfo[] devices = this.d.getDevices(2);
        C7471uYa.a((Object) devices, "audioManager.getDevices(…ager.GET_DEVICES_OUTPUTS)");
        for (AudioDeviceInfo type : a(devices)) {
            this.a.add(new C4415ra(type.getType()));
        }
        this.d.registerAudioDeviceCallback(new D(this), null);
    }

    private List<String> e() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (this.d.isSpeakerphoneOn()) {
            linkedHashSet.add("TYPE_BUILTIN_SPEAKER");
        }
        if (this.d.isWiredHeadsetOn()) {
            linkedHashSet.add("TYPE_WIRED_HEADSET");
        }
        if (this.d.isBluetoothScoOn()) {
            linkedHashSet.add("TYPE_BLUETOOTH_SCO");
        }
        if (this.d.isBluetoothA2dpOn()) {
            linkedHashSet.add("TYPE_BLUETOOTH_A2DP");
        }
        return C7676xWa.q(linkedHashSet);
    }

    public void c() {
        if (this.e.b() >= 23) {
            d();
        }
    }

    public APa<String> b() {
        return this.c;
    }

    public String a() {
        if (this.e.b() < 23) {
            return C7676xWa.a(e(), "|", null, null, 0, null, null, 62, null);
        }
        return a(C7676xWa.q(this.a));
    }

    /* access modifiers changed from: private */
    public String a(List<C4415ra> list) {
        if (list.isEmpty()) {
            return "";
        }
        return C7676xWa.a(list, "|", null, null, 0, null, C.a, 30, null);
    }

    /* access modifiers changed from: private */
    public List<AudioDeviceInfo> a(AudioDeviceInfo[] audioDeviceInfoArr) {
        ArrayList arrayList = new ArrayList();
        for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
            if (audioDeviceInfo.isSink()) {
                arrayList.add(audioDeviceInfo);
            }
        }
        return arrayList;
    }
}
