package defpackage;

import com.google.common.base.Ascii;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* renamed from: HDb reason: default package */
/* compiled from: Ser */
final class HDb implements Externalizable {
    private byte a;
    private Object b;

    public HDb() {
    }

    private static void a(byte b2, Object obj, DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(b2);
        if (b2 == 1) {
            ((IDb) obj).a(dataOutput);
        } else if (b2 == 2) {
            ((KDb) obj).a(dataOutput);
        } else if (b2 == 3) {
            ((MDb) obj).a(dataOutput);
        } else {
            throw new InvalidClassException("Unknown serialized type");
        }
    }

    static long b(DataInput dataInput) throws IOException {
        byte readByte = dataInput.readByte() & 255;
        if (readByte == 255) {
            return dataInput.readLong();
        }
        return (((long) (((readByte << Ascii.DLE) + ((dataInput.readByte() & 255) << 8)) + (dataInput.readByte() & 255))) * 900) - 4575744000L;
    }

    static PBb c(DataInput dataInput) throws IOException {
        byte readByte = dataInput.readByte();
        return readByte == Byte.MAX_VALUE ? PBb.a(dataInput.readInt()) : PBb.a(readByte * 900);
    }

    private Object readResolve() {
        return this.b;
    }

    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        this.a = objectInput.readByte();
        this.b = a(this.a, (DataInput) objectInput);
    }

    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        a(this.a, this.b, objectOutput);
    }

    HDb(byte b2, Object obj) {
        this.a = b2;
        this.b = obj;
    }

    static Object a(DataInput dataInput) throws IOException, ClassNotFoundException {
        return a(dataInput.readByte(), dataInput);
    }

    private static Object a(byte b2, DataInput dataInput) throws IOException, ClassNotFoundException {
        if (b2 == 1) {
            return IDb.a(dataInput);
        }
        if (b2 == 2) {
            return KDb.a(dataInput);
        }
        if (b2 == 3) {
            return MDb.a(dataInput);
        }
        throw new StreamCorruptedException("Unknown serialized type");
    }

    static void a(PBb pBb, DataOutput dataOutput) throws IOException {
        int d = pBb.d();
        int i = d % 900 == 0 ? d / 900 : 127;
        dataOutput.writeByte(i);
        if (i == 127) {
            dataOutput.writeInt(d);
        }
    }

    static void a(long j, DataOutput dataOutput) throws IOException {
        if (j < -4575744000L || j >= 10413792000L || j % 900 != 0) {
            dataOutput.writeByte(255);
            dataOutput.writeLong(j);
            return;
        }
        int i = (int) ((j + 4575744000L) / 900);
        dataOutput.writeByte((i >>> 16) & 255);
        dataOutput.writeByte((i >>> 8) & 255);
        dataOutput.writeByte(i & 255);
    }
}
