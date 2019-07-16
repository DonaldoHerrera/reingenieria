package com.soundcloud.android.tracks;

import java.util.List;

/* compiled from: VaultTrackRepository.kt */
public class Lb implements C3760eea {
    private final Hb a;

    public Lb(Hb hb) {
        C7471uYa.b(hb, "tracksVault");
        this.a = hb;
    }

    public APa<Ida<C3509cea>> a(List<C3508cda> list, a aVar) {
        C7471uYa.b(list, "urns");
        C7471uYa.b(aVar, "loadStrategy");
        StringBuilder sb = new StringBuilder();
        sb.append("An operation is not implemented: ");
        sb.append("not implemented");
        throw new GVa(sb.toString());
    }

    public APa<Pda<C3509cea>> a(C3508cda cda, a aVar) {
        C7471uYa.b(cda, "urn");
        C7471uYa.b(aVar, "loadStrategy");
        StringBuilder sb = new StringBuilder();
        sb.append("An operation is not implemented: ");
        sb.append("not implemented");
        throw new GVa(sb.toString());
    }
}
