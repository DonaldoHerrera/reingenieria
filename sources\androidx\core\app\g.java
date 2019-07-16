package androidx.core.app;

import android.view.FrameMetrics;
import android.view.Window;
import android.view.Window.OnFrameMetricsAvailableListener;

/* compiled from: FrameMetricsAggregator */
class g implements OnFrameMetricsAvailableListener {
    final /* synthetic */ a a;

    g(a aVar) {
        this.a = aVar;
    }

    public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
        a aVar = this.a;
        if ((aVar.c & 1) != 0) {
            aVar.a(aVar.d[0], frameMetrics.getMetric(8));
        }
        a aVar2 = this.a;
        if ((aVar2.c & 2) != 0) {
            aVar2.a(aVar2.d[1], frameMetrics.getMetric(1));
        }
        a aVar3 = this.a;
        if ((aVar3.c & 4) != 0) {
            aVar3.a(aVar3.d[2], frameMetrics.getMetric(3));
        }
        a aVar4 = this.a;
        if ((aVar4.c & 8) != 0) {
            aVar4.a(aVar4.d[3], frameMetrics.getMetric(4));
        }
        a aVar5 = this.a;
        if ((aVar5.c & 16) != 0) {
            aVar5.a(aVar5.d[4], frameMetrics.getMetric(5));
        }
        a aVar6 = this.a;
        if ((aVar6.c & 64) != 0) {
            aVar6.a(aVar6.d[6], frameMetrics.getMetric(7));
        }
        a aVar7 = this.a;
        if ((aVar7.c & 32) != 0) {
            aVar7.a(aVar7.d[5], frameMetrics.getMetric(6));
        }
        a aVar8 = this.a;
        if ((aVar8.c & 128) != 0) {
            aVar8.a(aVar8.d[7], frameMetrics.getMetric(0));
        }
        a aVar9 = this.a;
        if ((aVar9.c & 256) != 0) {
            aVar9.a(aVar9.d[8], frameMetrics.getMetric(2));
        }
    }
}
