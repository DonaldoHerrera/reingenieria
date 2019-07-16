package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* renamed from: Bk reason: default package */
/* compiled from: ViewIndexingTrigger */
public class Bk implements SensorEventListener {
    private a a;

    /* renamed from: Bk$a */
    /* compiled from: ViewIndexingTrigger */
    public interface a {
        void a();
    }

    public void a(a aVar) {
        this.a = aVar;
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        if (this.a != null) {
            float[] fArr = sensorEvent.values;
            float f = fArr[0];
            double d = (double) (f / 9.80665f);
            double d2 = (double) (fArr[1] / 9.80665f);
            double d3 = (double) (fArr[2] / 9.80665f);
            if (Math.sqrt((d * d) + (d2 * d2) + (d3 * d3)) > 2.299999952316284d) {
                this.a.a();
            }
        }
    }
}
