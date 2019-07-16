package com.soundcloud.android.features.record;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

public class AmplitudeData implements Iterable<Float>, Parcelable {
    public static final Creator<AmplitudeData> CREATOR = new C3666s();
    private final int a;
    /* access modifiers changed from: private */
    public float[] b;
    /* access modifiers changed from: private */
    public int c;

    public AmplitudeData() {
        this(5400);
    }

    private void m(int i) {
        float[] fArr = this.b;
        if (i > fArr.length) {
            float[] fArr2 = new float[Math.max(fArr.length << 1, i)];
            float[] fArr3 = this.b;
            System.arraycopy(fArr3, 0, fArr2, 0, fArr3.length);
            this.b = fArr2;
        }
    }

    public void c(int i) {
        if (i > 0) {
            float[] fArr = new float[i];
            System.arraycopy(this.b, 0, fArr, 0, i);
            this.b = fArr;
            this.c = i;
        }
    }

    public void clear() {
        this.b = new float[this.a];
        this.c = 0;
    }

    public int describeContents() {
        return 0;
    }

    public float get(int i) {
        if (i < this.c) {
            return this.b[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public Iterator<Float> iterator() {
        return new C3667t(this);
    }

    public int size() {
        return this.c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AmplitudeData{pos=");
        sb.append(this.c);
        sb.append(", initialCapacity=");
        sb.append(this.a);
        sb.append('}');
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.c);
        parcel.writeInt(this.b.length);
        parcel.writeInt(this.b.length);
        for (int i2 = 0; i2 < this.c; i2++) {
            parcel.writeFloat(this.b[i2]);
        }
    }

    public AmplitudeData(int i) {
        this.a = i;
        this.b = new float[i];
    }

    public void a(float f) {
        m(this.c + 1);
        float[] fArr = this.b;
        int i = this.c;
        this.c = i + 1;
        fArr[i] = f;
    }

    public void b(File file) throws IOException {
        String str = ba.b;
        StringBuilder sb = new StringBuilder();
        sb.append("writing amplitude data to ");
        sb.append(file);
        Log.d(str, sb.toString());
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        Parcel obtain = Parcel.obtain();
        writeToParcel(obtain, 0);
        fileOutputStream.write(obtain.marshall());
        fileOutputStream.close();
        obtain.recycle();
    }

    public static AmplitudeData a(File file) throws IOException {
        byte[] a2 = AXa.a(new FileInputStream(file));
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(a2, 0, a2.length);
        obtain.setDataPosition(0);
        AmplitudeData amplitudeData = new AmplitudeData(obtain);
        obtain.recycle();
        return amplitudeData;
    }

    public AmplitudeData(Parcel parcel) {
        this.a = parcel.readInt();
        this.c = parcel.readInt();
        this.b = new float[parcel.readInt()];
        parcel.readFloatArray(this.b);
    }
}
