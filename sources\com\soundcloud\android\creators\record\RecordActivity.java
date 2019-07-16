package com.soundcloud.android.creators.record;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.A;
import androidx.fragment.app.Fragment;
import com.soundcloud.android.creators.upload.MetadataFragment;
import com.soundcloud.android.creators.upload.UploadMonitorFragment;
import com.soundcloud.android.creators.upload.UploadService;
import com.soundcloud.android.features.record.K;
import com.soundcloud.android.features.record.RecordFragment;
import com.soundcloud.android.features.record.Recording;
import com.soundcloud.android.features.record.ba;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.ia;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.main.F;
import com.soundcloud.android.main.LoggedInActivity;
import com.soundcloud.android.properties.a;
import com.soundcloud.android.properties.m;
import com.soundcloud.lightcycle.ActivityLightCycle;
import com.soundcloud.lightcycle.LightCycle;
import com.soundcloud.lightcycle.LightCycles;

public class RecordActivity extends LoggedInActivity implements K, _ca {
    C2350WH<Xaa> A;
    ba B;
    C3700b C;
    C4581ija D;
    a E;
    private VPa F = C4881Eua.b();
    @LightCycle
    F x;
    C4834DJa y;
    @LightCycle
    @f
    ActivityLightCycle<AppCompatActivity> z;

    public final class LightCycleBinder {
        public static void bind(RecordActivity recordActivity) {
            com.soundcloud.android.main.LoggedInActivity.LightCycleBinder.bind(recordActivity);
            recordActivity.bind(LightCycles.lift((ActivityLightCycle<Source>) recordActivity.x));
            recordActivity.bind(LightCycles.lift(recordActivity.z));
        }
    }

    private MetadataFragment D() {
        return (MetadataFragment) getSupportFragmentManager().a("metadata_fragment");
    }

    private Fragment E() {
        return getSupportFragmentManager().a("recording_fragment");
    }

    private UploadMonitorFragment F() {
        return (UploadMonitorFragment) getSupportFragmentManager().a("upload_progress_fragment");
    }

    private void G() {
        if (getSupportFragmentManager().a(i.container) == null) {
            C7531vPa f = this.A.f();
            C5190Oua a = C5190Oua.a(new a(this));
            f.c(a);
            this.F = a;
        }
    }

    public void B() {
        Fragment E2 = E();
        if (E2 == null) {
            E2 = RecordFragment.Qb();
        }
        getSupportFragmentManager().a((String) null, 1);
        A a = getSupportFragmentManager().a();
        a.a(ia.a.ak_fade_in, ia.a.ak_fade_out);
        a.b(i.container, E2, "recording_fragment");
        a.a();
    }

    public void C() {
        if (this.E.a((a) m.A.a)) {
            finish();
            return;
        }
        Fragment E2 = E();
        if (E2 == null) {
            E2 = RecordFragment.Qb();
        }
        a(E2, "recording_fragment", false);
    }

    public void a(boolean z2) {
        Fragment D2 = D();
        if (D2 == null) {
            D2 = MetadataFragment.Qb();
        }
        a(D2, "metadata_fragment", z2);
    }

    public void b(Recording recording) {
        Fragment F2 = F();
        if (F2 == null) {
            F2 = UploadMonitorFragment.a(recording);
        }
        getSupportFragmentManager().a((String) null, 1);
        a(F2, "upload_progress_fragment", false);
    }

    public void c(Recording recording) {
        startService(new Intent(this, UploadService.class));
        this.A.accept(Xaa.h(recording));
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 6709 || i == 9000 || i == 9001) {
            MetadataFragment D2 = D();
            if (D2 != null) {
                D2.onActivityResult(i, i2, intent);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown requestCode: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        getWindow().requestFeature(12);
        super.onCreate(bundle);
        G();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        this.F.dispose();
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (a(intent)) {
            a(false);
        }
    }

    public boolean onSupportNavigateUp() {
        this.D.a((Context) this);
        finish();
        return true;
    }

    /* access modifiers changed from: protected */
    public void setActivityContentView() {
        this.y.c(this);
    }

    public Yca x() {
        return Yca.UNKNOWN;
    }

    public void a(Recording recording) {
        Fragment F2 = F();
        if (F2 == null) {
            F2 = UploadMonitorFragment.a(recording);
        }
        A a = getSupportFragmentManager().a();
        a.a(ia.a.ak_fade_in, ia.a.ak_fade_out);
        a.b(i.container, F2, "upload_progress_fragment");
        a.a();
    }

    public void a(Zca zca) {
        this.C.a(zca);
    }

    public void a(Yca yca) {
        this.C.a(yca);
    }

    public /* synthetic */ void a(Xaa xaa) throws Exception {
        if (xaa.v()) {
            a(xaa.b());
        } else if (!a(getIntent())) {
            B();
        } else {
            a(false);
        }
    }

    private void a(Fragment fragment, String str, boolean z2) {
        A a = getSupportFragmentManager().a();
        a.a(ia.a.ak_fade_in, ia.a.ak_fade_out, ia.a.ak_fade_in, ia.a.ak_fade_out);
        a.b(i.container, fragment, str);
        if (z2) {
            a.a((String) null);
        }
        a.a();
    }

    private boolean a(Intent intent) {
        Recording a = Recording.a(intent);
        if (a == null) {
            return false;
        }
        this.B.n();
        this.B.a(a);
        intent.removeExtra("recording");
        return true;
    }
}
