package com.soundcloud.android.listeners.dev.playback;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.listeners.dev.U.i;
import com.soundcloud.android.listeners.dev.U.l;
import com.soundcloud.android.playback.C4431ub;
import com.soundcloud.android.playback.C4519wc;
import com.soundcloud.android.playback.E;
import com.soundcloud.android.view.customfontviews.CustomFontTextView;
import dagger.android.support.e;
import java.util.HashMap;

/* compiled from: PlaybackDevFragment.kt */
public final class d extends e {
    public C5327TLa b;
    public E c;
    public C7181qKa d;
    private final UPa e = new UPa();
    private HashMap f;

    private final void Rb() {
        CustomFontTextView customFontTextView = (CustomFontTextView) c(i.player_versions);
        C7471uYa.a((Object) customFontTextView, "player_versions");
        StringBuilder sb = new StringBuilder();
        sb.append("Flipper: ");
        C7181qKa qka = this.d;
        String str = "applicationConfiguration";
        if (qka != null) {
            sb.append(qka.d());
            sb.append("; Exo: ");
            C7181qKa qka2 = this.d;
            if (qka2 != null) {
                sb.append(qka2.h());
                customFontTextView.setText(sb.toString());
                return;
            }
            C7471uYa.b(str);
            throw null;
        }
        C7471uYa.b(str);
        throw null;
    }

    /* access modifiers changed from: private */
    public final void c(String str) {
        CustomFontTextView customFontTextView = (CustomFontTextView) c(i.audio_ports);
        C7471uYa.a((Object) customFontTextView, "audio_ports");
        StringBuilder sb = new StringBuilder();
        sb.append("Audio Ports: ");
        sb.append(str);
        customFontTextView.setText(sb.toString());
    }

    public void Qb() {
        HashMap hashMap = this.f;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View c(int i) {
        if (this.f == null) {
            this.f = new HashMap();
        }
        View view = (View) this.f.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7471uYa.b(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(l.playback_dev_fragment, viewGroup, false);
        C7471uYa.a((Object) inflate, "inflater.inflate(R.layou…agment, container, false)");
        return inflate;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.e.b();
        Qb();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C7471uYa.b(view, "view");
        Rb();
        UPa uPa = this.e;
        C5327TLa tLa = this.b;
        String str = "eventBus";
        if (tLa != null) {
            C5443XLa<C4431ub> xLa = C3876taa.b;
            C7471uYa.a((Object) xLa, "EventQueue.PLAYBACK_STATE_CHANGED");
            GPa c2 = tLa.a(xLa).c(C5220Pua.a((C6776kQa<T>) new a<T>(this)));
            C7471uYa.a((Object) c2, "eventBus.queue(EventQueu… { renderPlayState(it) })");
            XUa.a(uPa, (VPa) c2);
            UPa uPa2 = this.e;
            C5327TLa tLa2 = this.b;
            if (tLa2 != null) {
                C5443XLa<C4519wc> xLa2 = C3876taa.c;
                C7471uYa.a((Object) xLa2, "EventQueue.PLAYBACK_PROGRESS");
                GPa c3 = tLa2.a(xLa2).c(C5220Pua.a((C6776kQa<T>) new b<T>(this)));
                C7471uYa.a((Object) c3, "eventBus.queue(EventQueu…erPlaybackProgress(it) })");
                XUa.a(uPa2, (VPa) c3);
                UPa uPa3 = this.e;
                E e2 = this.c;
                String str2 = "audioPortTracker";
                if (e2 != null) {
                    APa b2 = e2.b();
                    E e3 = this.c;
                    if (e3 != null) {
                        GPa c4 = b2.e(e3.a()).c(C5220Pua.a((C6776kQa<T>) new c<T>(this)));
                        C7471uYa.a((Object) c4, "audioPortTracker.onAudio…{ renderAudioPorts(it) })");
                        XUa.a(uPa3, (VPa) c4);
                        return;
                    }
                    C7471uYa.b(str2);
                    throw null;
                }
                C7471uYa.b(str2);
                throw null;
            }
            C7471uYa.b(str);
            throw null;
        }
        C7471uYa.b(str);
        throw null;
    }

    /* access modifiers changed from: private */
    public final void a(C4431ub ubVar) {
        CustomFontTextView customFontTextView = (CustomFontTextView) c(i.player_name);
        C7471uYa.a((Object) customFontTextView, "player_name");
        StringBuilder sb = new StringBuilder();
        sb.append("Player: ");
        String a = ubVar.a();
        if (a == null) {
            a = "not available";
        }
        sb.append(a);
        customFontTextView.setText(sb.toString());
        CustomFontTextView customFontTextView2 = (CustomFontTextView) c(i.play_state_session_is_active);
        C7471uYa.a((Object) customFontTextView2, "play_state_session_is_active");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Play session: ");
        sb2.append(ubVar.p() ? "ACTIVE" : "INACTIVE");
        customFontTextView2.setText(sb2.toString());
        CustomFontTextView customFontTextView3 = (CustomFontTextView) c(i.play_state_progress);
        C7471uYa.a((Object) customFontTextView3, "play_state_progress");
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Play state progress: ");
        sb3.append(ubVar.getPosition());
        sb3.append(" : ");
        sb3.append(ubVar.getDuration());
        customFontTextView3.setText(sb3.toString());
        CustomFontTextView customFontTextView4 = (CustomFontTextView) c(i.play_state_item_urn);
        C7471uYa.a((Object) customFontTextView4, "play_state_item_urn");
        StringBuilder sb4 = new StringBuilder();
        sb4.append('[');
        sb4.append(ubVar.g());
        sb4.append("]<");
        sb4.append(ubVar.n());
        sb4.append("> ");
        sb4.append(ubVar.s().b());
        customFontTextView4.setText(sb4.toString());
    }

    /* access modifiers changed from: private */
    public final void a(C4519wc wcVar) {
        CustomFontTextView customFontTextView = (CustomFontTextView) c(i.playback_progress);
        C7471uYa.a((Object) customFontTextView, "playback_progress");
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        sb.append(wcVar.e());
        sb.append("] progress: ");
        sb.append(wcVar.d());
        sb.append(" : ");
        sb.append(wcVar.c());
        customFontTextView.setText(sb.toString());
    }
}
