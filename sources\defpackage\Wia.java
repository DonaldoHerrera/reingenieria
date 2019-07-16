package defpackage;

import android.os.Bundle;
import com.soundcloud.android.deeplinks.e;
import com.soundcloud.android.features.record.Recording;
import com.soundcloud.android.foundation.events.K;
import com.soundcloud.android.foundation.events.PromotedSourceInfo;
import com.soundcloud.android.foundation.events.SearchQuerySourceInfo;
import com.soundcloud.android.foundation.playqueue.m;
import java.util.Date;

/* renamed from: Wia reason: default package */
/* compiled from: AutoValue_NavigationTarget */
final class Wia extends Fia {
    Wia(Date date, C4928GKa<e> gKa, C4928GKa<c> gKa2, C4928GKa<String> gKa3, Yca yca, C4928GKa<String> gKa4, C4928GKa<C3508cda> gKa5, C4928GKa<C3508cda> gKa6, C4928GKa<m> gKa7, C4928GKa<f> gKa8, C4928GKa<SearchQuerySourceInfo> gKa9, C4928GKa<PromotedSourceInfo> gKa10, C4928GKa<b> gKa11, C4928GKa<d> gKa12, C4928GKa<K> gKa13, C4928GKa<Recording> gKa14, C4928GKa<e> gKa15, C4928GKa<C3920yea> gKa16, C4928GKa<Bundle> gKa17, C4928GKa<String> gKa18, C4928GKa<Long> gKa19, C4928GKa<Boolean> gKa20) {
        super(date, gKa, gKa2, gKa3, yca, gKa4, gKa5, gKa6, gKa7, gKa8, gKa9, gKa10, gKa11, gKa12, gKa13, gKa14, gKa15, gKa16, gKa17, gKa18, gKa19, gKa20);
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4621nja)) {
            return false;
        }
        C4621nja nja = (C4621nja) obj;
        if (!c().equals(nja.c()) || !z().equals(nja.z()) || !d().equals(nja.d()) || !I().equals(nja.I()) || !H().equals(nja.H()) || !F().equals(nja.F()) || !M().equals(nja.M()) || !e().equals(nja.e()) || !L().equals(nja.L()) || !J().equals(nja.J()) || !E().equals(nja.E()) || !a().equals(nja.a()) || !C().equals(nja.C()) || !P().equals(nja.P()) || !G().equals(nja.G()) || !D().equals(nja.D()) || !Q().equals(nja.Q()) || !y().equals(nja.y()) || !K().equals(nja.K()) || !N().equals(nja.N()) || !x().equals(nja.x())) {
            z = false;
        }
        return z;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((c().hashCode() ^ 1000003) * 1000003) ^ z().hashCode()) * 1000003) ^ d().hashCode()) * 1000003) ^ I().hashCode()) * 1000003) ^ H().hashCode()) * 1000003) ^ F().hashCode()) * 1000003) ^ M().hashCode()) * 1000003) ^ e().hashCode()) * 1000003) ^ L().hashCode()) * 1000003) ^ J().hashCode()) * 1000003) ^ E().hashCode()) * 1000003) ^ a().hashCode()) * 1000003) ^ C().hashCode()) * 1000003) ^ P().hashCode()) * 1000003) ^ G().hashCode()) * 1000003) ^ D().hashCode()) * 1000003) ^ Q().hashCode()) * 1000003) ^ y().hashCode()) * 1000003) ^ K().hashCode()) * 1000003) ^ N().hashCode()) * 1000003) ^ x().hashCode();
    }
}
