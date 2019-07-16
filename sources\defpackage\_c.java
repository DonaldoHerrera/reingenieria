package defpackage;

import android.content.res.AssetManager.AssetInputStream;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;

/* renamed from: _c reason: default package */
/* compiled from: ExifInterface */
public class _c {
    private static final HashMap<Integer, c>[] A;
    private static final HashMap<String, c>[] B;
    private static final HashSet<String> C = new HashSet<>(Arrays.asList(new String[]{"FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"}));
    private static final HashMap<Integer, Integer> D = new HashMap<>();
    static final Charset E = Charset.forName("US-ASCII");
    static final byte[] F = "Exif\u0000\u0000".getBytes(E);
    private static final Pattern G = Pattern.compile(".*[1-9].*");
    private static final Pattern H = Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
    private static final List<Integer> a;
    private static final List<Integer> b;
    public static final int[] c = {8, 8, 8};
    public static final int[] d = {4};
    public static final int[] e = {8};
    static final byte[] f = {-1, -40, -1};
    private static final byte[] g = {79, 76, 89, 77, 80, 0};
    private static final byte[] h = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    private static SimpleDateFormat i = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
    static final String[] j = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE"};
    static final int[] k = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    static final byte[] l = {65, 83, 67, 73, 73, 0, 0, 0};
    private static final c[] m = {new c("NewSubfileType", 254, 4), new c("SubfileType", 255, 4), new c("ImageWidth", 256, 3, 4), new c("ImageLength", 257, 3, 4), new c("BitsPerSample", 258, 3), new c("Compression", 259, 3), new c("PhotometricInterpretation", 262, 3), new c("ImageDescription", 270, 2), new c("Make", 271, 2), new c("Model", 272, 2), new c("StripOffsets", 273, 3, 4), new c("Orientation", 274, 3), new c("SamplesPerPixel", 277, 3), new c("RowsPerStrip", 278, 3, 4), new c("StripByteCounts", 279, 3, 4), new c("XResolution", 282, 5), new c("YResolution", 283, 5), new c("PlanarConfiguration", 284, 3), new c("ResolutionUnit", 296, 3), new c("TransferFunction", 301, 3), new c("Software", 305, 2), new c("DateTime", 306, 2), new c("Artist", 315, 2), new c("WhitePoint", 318, 5), new c("PrimaryChromaticities", 319, 5), new c("SubIFDPointer", 330, 4), new c("JPEGInterchangeFormat", 513, 4), new c("JPEGInterchangeFormatLength", 514, 4), new c("YCbCrCoefficients", 529, 5), new c("YCbCrSubSampling", 530, 3), new c("YCbCrPositioning", 531, 3), new c("ReferenceBlackWhite", 532, 5), new c("Copyright", 33432, 2), new c("ExifIFDPointer", 34665, 4), new c("GPSInfoIFDPointer", 34853, 4), new c("SensorTopBorder", 4, 4), new c("SensorLeftBorder", 5, 4), new c("SensorBottomBorder", 6, 4), new c("SensorRightBorder", 7, 4), new c("ISO", 23, 3), new c("JpgFromRaw", 46, 7)};
    private static final c[] n = {new c("ExposureTime", 33434, 5), new c("FNumber", 33437, 5), new c("ExposureProgram", 34850, 3), new c("SpectralSensitivity", 34852, 2), new c("PhotographicSensitivity", 34855, 3), new c("OECF", 34856, 7), new c("ExifVersion", 36864, 2), new c("DateTimeOriginal", 36867, 2), new c("DateTimeDigitized", 36868, 2), new c("ComponentsConfiguration", 37121, 7), new c("CompressedBitsPerPixel", 37122, 5), new c("ShutterSpeedValue", 37377, 10), new c("ApertureValue", 37378, 5), new c("BrightnessValue", 37379, 10), new c("ExposureBiasValue", 37380, 10), new c("MaxApertureValue", 37381, 5), new c("SubjectDistance", 37382, 5), new c("MeteringMode", 37383, 3), new c("LightSource", 37384, 3), new c("Flash", 37385, 3), new c("FocalLength", 37386, 5), new c("SubjectArea", 37396, 3), new c("MakerNote", 37500, 7), new c("UserComment", 37510, 7), new c("SubSecTime", 37520, 2), new c("SubSecTimeOriginal", 37521, 2), new c("SubSecTimeDigitized", 37522, 2), new c("FlashpixVersion", 40960, 7), new c("ColorSpace", 40961, 3), new c("PixelXDimension", 40962, 3, 4), new c("PixelYDimension", 40963, 3, 4), new c("RelatedSoundFile", 40964, 2), new c("InteroperabilityIFDPointer", 40965, 4), new c("FlashEnergy", 41483, 5), new c("SpatialFrequencyResponse", 41484, 7), new c("FocalPlaneXResolution", 41486, 5), new c("FocalPlaneYResolution", 41487, 5), new c("FocalPlaneResolutionUnit", 41488, 3), new c("SubjectLocation", 41492, 3), new c("ExposureIndex", 41493, 5), new c("SensingMethod", 41495, 3), new c("FileSource", 41728, 7), new c("SceneType", 41729, 7), new c("CFAPattern", 41730, 7), new c("CustomRendered", 41985, 3), new c("ExposureMode", 41986, 3), new c("WhiteBalance", 41987, 3), new c("DigitalZoomRatio", 41988, 5), new c("FocalLengthIn35mmFilm", 41989, 3), new c("SceneCaptureType", 41990, 3), new c("GainControl", 41991, 3), new c("Contrast", 41992, 3), new c("Saturation", 41993, 3), new c("Sharpness", 41994, 3), new c("DeviceSettingDescription", 41995, 7), new c("SubjectDistanceRange", 41996, 3), new c("ImageUniqueID", 42016, 2), new c("DNGVersion", 50706, 1), new c("DefaultCropSize", 50720, 3, 4)};
    private static final c[] o = {new c("GPSVersionID", 0, 1), new c("GPSLatitudeRef", 1, 2), new c("GPSLatitude", 2, 5), new c("GPSLongitudeRef", 3, 2), new c("GPSLongitude", 4, 5), new c("GPSAltitudeRef", 5, 1), new c("GPSAltitude", 6, 5), new c("GPSTimeStamp", 7, 5), new c("GPSSatellites", 8, 2), new c("GPSStatus", 9, 2), new c("GPSMeasureMode", 10, 2), new c("GPSDOP", 11, 5), new c("GPSSpeedRef", 12, 2), new c("GPSSpeed", 13, 5), new c("GPSTrackRef", 14, 2), new c("GPSTrack", 15, 5), new c("GPSImgDirectionRef", 16, 2), new c("GPSImgDirection", 17, 5), new c("GPSMapDatum", 18, 2), new c("GPSDestLatitudeRef", 19, 2), new c("GPSDestLatitude", 20, 5), new c("GPSDestLongitudeRef", 21, 2), new c("GPSDestLongitude", 22, 5), new c("GPSDestBearingRef", 23, 2), new c("GPSDestBearing", 24, 5), new c("GPSDestDistanceRef", 25, 2), new c("GPSDestDistance", 26, 5), new c("GPSProcessingMethod", 27, 7), new c("GPSAreaInformation", 28, 7), new c("GPSDateStamp", 29, 2), new c("GPSDifferential", 30, 3)};
    private static final c[] p = {new c("InteroperabilityIndex", 1, 2)};
    private static final c[] q = {new c("NewSubfileType", 254, 4), new c("SubfileType", 255, 4), new c("ThumbnailImageWidth", 256, 3, 4), new c("ThumbnailImageLength", 257, 3, 4), new c("BitsPerSample", 258, 3), new c("Compression", 259, 3), new c("PhotometricInterpretation", 262, 3), new c("ImageDescription", 270, 2), new c("Make", 271, 2), new c("Model", 272, 2), new c("StripOffsets", 273, 3, 4), new c("Orientation", 274, 3), new c("SamplesPerPixel", 277, 3), new c("RowsPerStrip", 278, 3, 4), new c("StripByteCounts", 279, 3, 4), new c("XResolution", 282, 5), new c("YResolution", 283, 5), new c("PlanarConfiguration", 284, 3), new c("ResolutionUnit", 296, 3), new c("TransferFunction", 301, 3), new c("Software", 305, 2), new c("DateTime", 306, 2), new c("Artist", 315, 2), new c("WhitePoint", 318, 5), new c("PrimaryChromaticities", 319, 5), new c("SubIFDPointer", 330, 4), new c("JPEGInterchangeFormat", 513, 4), new c("JPEGInterchangeFormatLength", 514, 4), new c("YCbCrCoefficients", 529, 5), new c("YCbCrSubSampling", 530, 3), new c("YCbCrPositioning", 531, 3), new c("ReferenceBlackWhite", 532, 5), new c("Copyright", 33432, 2), new c("ExifIFDPointer", 34665, 4), new c("GPSInfoIFDPointer", 34853, 4), new c("DNGVersion", 50706, 1), new c("DefaultCropSize", 50720, 3, 4)};
    private static final c r = new c("StripOffsets", 273, 3);
    private static final c[] s = {new c("ThumbnailImage", 256, 7), new c("CameraSettingsIFDPointer", 8224, 4), new c("ImageProcessingIFDPointer", 8256, 4)};
    private static final c[] t = {new c("PreviewImageStart", 257, 4), new c("PreviewImageLength", 258, 4)};
    private static final c[] u = {new c("AspectFrame", 4371, 3)};
    private static final c[] v = {new c("ColorSpace", 55, 3)};
    static final c[][] w;
    private static final c[] x = {new c("SubIFDPointer", 330, 4), new c("ExifIFDPointer", 34665, 4), new c("GPSInfoIFDPointer", 34853, 4), new c("InteroperabilityIFDPointer", 40965, 4), new c("CameraSettingsIFDPointer", 8224, 1), new c("ImageProcessingIFDPointer", 8256, 1)};
    private static final c y = new c("JPEGInterchangeFormat", 513, 4);
    private static final c z = new c("JPEGInterchangeFormatLength", 514, 4);
    private final String I;
    private final AssetInputStream J;
    private int K;
    private final HashMap<String, b>[] L;
    private Set<Integer> M;
    private ByteOrder N = ByteOrder.BIG_ENDIAN;
    private boolean O;
    private int P;
    private int Q;
    private byte[] R;
    private int S;
    private int T;
    private int U;
    private int V;
    private int W;
    private int X;
    private boolean Y;

    /* renamed from: _c$a */
    /* compiled from: ExifInterface */
    private static class a extends InputStream implements DataInput {
        private static final ByteOrder a = ByteOrder.LITTLE_ENDIAN;
        private static final ByteOrder b = ByteOrder.BIG_ENDIAN;
        private DataInputStream c;
        private ByteOrder d;
        final int e;
        int f;

        public a(InputStream inputStream) throws IOException {
            this.d = ByteOrder.BIG_ENDIAN;
            this.c = new DataInputStream(inputStream);
            this.e = this.c.available();
            this.f = 0;
            this.c.mark(this.e);
        }

        public void a(ByteOrder byteOrder) {
            this.d = byteOrder;
        }

        public int available() throws IOException {
            return this.c.available();
        }

        public long b() throws IOException {
            return ((long) readInt()) & 4294967295L;
        }

        public void h(long j) throws IOException {
            int i = this.f;
            if (((long) i) > j) {
                this.f = 0;
                this.c.reset();
                this.c.mark(this.e);
            } else {
                j -= (long) i;
            }
            int i2 = (int) j;
            if (skipBytes(i2) != i2) {
                throw new IOException("Couldn't seek up to the byteCount");
            }
        }

        public int read() throws IOException {
            this.f++;
            return this.c.read();
        }

        public boolean readBoolean() throws IOException {
            this.f++;
            return this.c.readBoolean();
        }

        public byte readByte() throws IOException {
            this.f++;
            if (this.f <= this.e) {
                int read = this.c.read();
                if (read >= 0) {
                    return (byte) read;
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public char readChar() throws IOException {
            this.f += 2;
            return this.c.readChar();
        }

        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readLong());
        }

        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readInt());
        }

        public void readFully(byte[] bArr, int i, int i2) throws IOException {
            this.f += i2;
            if (this.f > this.e) {
                throw new EOFException();
            } else if (this.c.read(bArr, i, i2) != i2) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        public int readInt() throws IOException {
            this.f += 4;
            if (this.f <= this.e) {
                int read = this.c.read();
                int read2 = this.c.read();
                int read3 = this.c.read();
                int read4 = this.c.read();
                if ((read | read2 | read3 | read4) >= 0) {
                    ByteOrder byteOrder = this.d;
                    if (byteOrder == a) {
                        return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                    }
                    if (byteOrder == b) {
                        return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid byte order: ");
                    sb.append(this.d);
                    throw new IOException(sb.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public String readLine() throws IOException {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        public long readLong() throws IOException {
            this.f += 8;
            if (this.f <= this.e) {
                int read = this.c.read();
                int read2 = this.c.read();
                int read3 = this.c.read();
                int read4 = this.c.read();
                int read5 = this.c.read();
                int read6 = this.c.read();
                int read7 = this.c.read();
                int read8 = this.c.read();
                if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                    ByteOrder byteOrder = this.d;
                    if (byteOrder == a) {
                        return (((long) read8) << 56) + (((long) read7) << 48) + (((long) read6) << 40) + (((long) read5) << 32) + (((long) read4) << 24) + (((long) read3) << 16) + (((long) read2) << 8) + ((long) read);
                    }
                    int i = read2;
                    if (byteOrder == b) {
                        return (((long) read) << 56) + (((long) i) << 48) + (((long) read3) << 40) + (((long) read4) << 32) + (((long) read5) << 24) + (((long) read6) << 16) + (((long) read7) << 8) + ((long) read8);
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid byte order: ");
                    sb.append(this.d);
                    throw new IOException(sb.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public short readShort() throws IOException {
            this.f += 2;
            if (this.f <= this.e) {
                int read = this.c.read();
                int read2 = this.c.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.d;
                    if (byteOrder == a) {
                        return (short) ((read2 << 8) + read);
                    }
                    if (byteOrder == b) {
                        return (short) ((read << 8) + read2);
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid byte order: ");
                    sb.append(this.d);
                    throw new IOException(sb.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public String readUTF() throws IOException {
            this.f += 2;
            return this.c.readUTF();
        }

        public int readUnsignedByte() throws IOException {
            this.f++;
            return this.c.readUnsignedByte();
        }

        public int readUnsignedShort() throws IOException {
            this.f += 2;
            if (this.f <= this.e) {
                int read = this.c.read();
                int read2 = this.c.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.d;
                    if (byteOrder == a) {
                        return (read2 << 8) + read;
                    }
                    if (byteOrder == b) {
                        return (read << 8) + read2;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid byte order: ");
                    sb.append(this.d);
                    throw new IOException(sb.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public int skipBytes(int i) throws IOException {
            int min = Math.min(i, this.e - this.f);
            int i2 = 0;
            while (i2 < min) {
                i2 += this.c.skipBytes(min - i2);
            }
            this.f += i2;
            return i2;
        }

        public int a() {
            return this.f;
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            int read = this.c.read(bArr, i, i2);
            this.f += read;
            return read;
        }

        public void readFully(byte[] bArr) throws IOException {
            this.f += bArr.length;
            if (this.f > this.e) {
                throw new EOFException();
            } else if (this.c.read(bArr, 0, bArr.length) != bArr.length) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        public a(byte[] bArr) throws IOException {
            this((InputStream) new ByteArrayInputStream(bArr));
        }
    }

    /* renamed from: _c$b */
    /* compiled from: ExifInterface */
    private static class b {
        public final int a;
        public final int b;
        public final byte[] c;

        b(int i, int i2, byte[] bArr) {
            this.a = i;
            this.b = i2;
            this.c = bArr;
        }

        public static b a(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(_c.k[3] * iArr.length)]);
            wrap.order(byteOrder);
            for (int i : iArr) {
                wrap.putShort((short) i);
            }
            return new b(3, iArr.length, wrap.array());
        }

        public int b(ByteOrder byteOrder) {
            Object d = d(byteOrder);
            if (d == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            } else if (d instanceof String) {
                return Integer.parseInt((String) d);
            } else {
                String str = "There are more than one component";
                if (d instanceof long[]) {
                    long[] jArr = (long[]) d;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException(str);
                } else if (d instanceof int[]) {
                    int[] iArr = (int[]) d;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException(str);
                } else {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
            }
        }

        public String c(ByteOrder byteOrder) {
            Object d = d(byteOrder);
            if (d == null) {
                return null;
            }
            if (d instanceof String) {
                return (String) d;
            }
            StringBuilder sb = new StringBuilder();
            String str = ",";
            int i = 0;
            if (d instanceof long[]) {
                long[] jArr = (long[]) d;
                while (i < jArr.length) {
                    sb.append(jArr[i]);
                    i++;
                    if (i != jArr.length) {
                        sb.append(str);
                    }
                }
                return sb.toString();
            } else if (d instanceof int[]) {
                int[] iArr = (int[]) d;
                while (i < iArr.length) {
                    sb.append(iArr[i]);
                    i++;
                    if (i != iArr.length) {
                        sb.append(str);
                    }
                }
                return sb.toString();
            } else if (d instanceof double[]) {
                double[] dArr = (double[]) d;
                while (i < dArr.length) {
                    sb.append(dArr[i]);
                    i++;
                    if (i != dArr.length) {
                        sb.append(str);
                    }
                }
                return sb.toString();
            } else if (!(d instanceof d[])) {
                return null;
            } else {
                d[] dVarArr = (d[]) d;
                while (i < dVarArr.length) {
                    sb.append(dVarArr[i].a);
                    sb.append('/');
                    sb.append(dVarArr[i].b);
                    i++;
                    if (i != dVarArr.length) {
                        sb.append(str);
                    }
                }
                return sb.toString();
            }
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Removed duplicated region for block: B:164:0x01ab A[SYNTHETIC, Splitter:B:164:0x01ab] */
        public Object d(ByteOrder byteOrder) {
            a aVar;
            String str = "IOException occurred while closing InputStream";
            String str2 = "ExifInterface";
            try {
                aVar = new a(this.c);
                try {
                    aVar.a(byteOrder);
                    boolean z = true;
                    int i = 0;
                    switch (this.a) {
                        case 1:
                        case 6:
                            if (this.c.length != 1 || this.c[0] < 0 || this.c[0] > 1) {
                                String str3 = new String(this.c, _c.E);
                                try {
                                    aVar.close();
                                } catch (IOException e) {
                                    Log.e(str2, str, e);
                                }
                                return str3;
                            }
                            String str4 = new String(new char[]{(char) (this.c[0] + 48)});
                            try {
                                aVar.close();
                            } catch (IOException e2) {
                                Log.e(str2, str, e2);
                            }
                            return str4;
                        case 2:
                        case 7:
                            if (this.b >= _c.l.length) {
                                int i2 = 0;
                                while (true) {
                                    if (i2 < _c.l.length) {
                                        if (this.c[i2] != _c.l[i2]) {
                                            z = false;
                                        } else {
                                            i2++;
                                        }
                                    }
                                }
                                if (z) {
                                    i = _c.l.length;
                                }
                            }
                            StringBuilder sb = new StringBuilder();
                            while (true) {
                                if (i < this.b) {
                                    byte b2 = this.c[i];
                                    if (b2 != 0) {
                                        if (b2 >= 32) {
                                            sb.append((char) b2);
                                        } else {
                                            sb.append('?');
                                        }
                                        i++;
                                    }
                                }
                            }
                            String sb2 = sb.toString();
                            try {
                                aVar.close();
                            } catch (IOException e3) {
                                Log.e(str2, str, e3);
                            }
                            return sb2;
                        case 3:
                            int[] iArr = new int[this.b];
                            while (i < this.b) {
                                iArr[i] = aVar.readUnsignedShort();
                                i++;
                            }
                            try {
                                aVar.close();
                            } catch (IOException e4) {
                                Log.e(str2, str, e4);
                            }
                            return iArr;
                        case 4:
                            long[] jArr = new long[this.b];
                            while (i < this.b) {
                                jArr[i] = aVar.b();
                                i++;
                            }
                            try {
                                aVar.close();
                            } catch (IOException e5) {
                                Log.e(str2, str, e5);
                            }
                            return jArr;
                        case 5:
                            d[] dVarArr = new d[this.b];
                            while (i < this.b) {
                                dVarArr[i] = new d(aVar.b(), aVar.b());
                                i++;
                            }
                            try {
                                aVar.close();
                            } catch (IOException e6) {
                                Log.e(str2, str, e6);
                            }
                            return dVarArr;
                        case 8:
                            int[] iArr2 = new int[this.b];
                            while (i < this.b) {
                                iArr2[i] = aVar.readShort();
                                i++;
                            }
                            try {
                                aVar.close();
                            } catch (IOException e7) {
                                Log.e(str2, str, e7);
                            }
                            return iArr2;
                        case 9:
                            int[] iArr3 = new int[this.b];
                            while (i < this.b) {
                                iArr3[i] = aVar.readInt();
                                i++;
                            }
                            try {
                                aVar.close();
                            } catch (IOException e8) {
                                Log.e(str2, str, e8);
                            }
                            return iArr3;
                        case 10:
                            d[] dVarArr2 = new d[this.b];
                            while (i < this.b) {
                                dVarArr2[i] = new d((long) aVar.readInt(), (long) aVar.readInt());
                                i++;
                            }
                            try {
                                aVar.close();
                            } catch (IOException e9) {
                                Log.e(str2, str, e9);
                            }
                            return dVarArr2;
                        case 11:
                            double[] dArr = new double[this.b];
                            while (i < this.b) {
                                dArr[i] = (double) aVar.readFloat();
                                i++;
                            }
                            try {
                                aVar.close();
                            } catch (IOException e10) {
                                Log.e(str2, str, e10);
                            }
                            return dArr;
                        case 12:
                            double[] dArr2 = new double[this.b];
                            while (i < this.b) {
                                dArr2[i] = aVar.readDouble();
                                i++;
                            }
                            try {
                                aVar.close();
                            } catch (IOException e11) {
                                Log.e(str2, str, e11);
                            }
                            return dArr2;
                        default:
                            try {
                                aVar.close();
                            } catch (IOException e12) {
                                Log.e(str2, str, e12);
                            }
                            return null;
                    }
                } catch (IOException e13) {
                    e = e13;
                }
                e = e13;
            } catch (IOException e14) {
                e = e14;
                aVar = null;
            } catch (Throwable th) {
                th = th;
                aVar = null;
                if (aVar != null) {
                }
                throw th;
            }
            try {
                Log.w(str2, "IOException occurred during reading a value", e);
                if (aVar != null) {
                    try {
                        aVar.close();
                    } catch (IOException e15) {
                        Log.e(str2, str, e15);
                    }
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                if (aVar != null) {
                    try {
                        aVar.close();
                    } catch (IOException e16) {
                        Log.e(str2, str, e16);
                    }
                }
                throw th;
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("(");
            sb.append(_c.j[this.a]);
            sb.append(", data length:");
            sb.append(this.c.length);
            sb.append(")");
            return sb.toString();
        }

        public static b a(int i, ByteOrder byteOrder) {
            return a(new int[]{i}, byteOrder);
        }

        public static b a(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(_c.k[4] * jArr.length)]);
            wrap.order(byteOrder);
            for (long j : jArr) {
                wrap.putInt((int) j);
            }
            return new b(4, jArr.length, wrap.array());
        }

        public static b a(long j, ByteOrder byteOrder) {
            return a(new long[]{j}, byteOrder);
        }

        public static b a(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(0);
            byte[] bytes = sb.toString().getBytes(_c.E);
            return new b(2, bytes.length, bytes);
        }

        public static b a(d[] dVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(_c.k[5] * dVarArr.length)]);
            wrap.order(byteOrder);
            for (d dVar : dVarArr) {
                wrap.putInt((int) dVar.a);
                wrap.putInt((int) dVar.b);
            }
            return new b(5, dVarArr.length, wrap.array());
        }

        public static b a(d dVar, ByteOrder byteOrder) {
            return a(new d[]{dVar}, byteOrder);
        }

        public double a(ByteOrder byteOrder) {
            Object d = d(byteOrder);
            if (d == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            } else if (d instanceof String) {
                return Double.parseDouble((String) d);
            } else {
                String str = "There are more than one component";
                if (d instanceof long[]) {
                    long[] jArr = (long[]) d;
                    if (jArr.length == 1) {
                        return (double) jArr[0];
                    }
                    throw new NumberFormatException(str);
                } else if (d instanceof int[]) {
                    int[] iArr = (int[]) d;
                    if (iArr.length == 1) {
                        return (double) iArr[0];
                    }
                    throw new NumberFormatException(str);
                } else if (d instanceof double[]) {
                    double[] dArr = (double[]) d;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException(str);
                } else if (d instanceof d[]) {
                    d[] dVarArr = (d[]) d;
                    if (dVarArr.length == 1) {
                        return dVarArr[0].a();
                    }
                    throw new NumberFormatException(str);
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
            }
        }
    }

    /* renamed from: _c$c */
    /* compiled from: ExifInterface */
    static class c {
        public final int a;
        public final String b;
        public final int c;
        public final int d;

        c(String str, int i, int i2) {
            this.b = str;
            this.a = i;
            this.c = i2;
            this.d = -1;
        }

        /* access modifiers changed from: 0000 */
        public boolean a(int i) {
            int i2 = this.c;
            if (!(i2 == 7 || i == 7 || i2 == i)) {
                int i3 = this.d;
                if (i3 != i) {
                    if ((i2 == 4 || i3 == 4) && i == 3) {
                        return true;
                    }
                    if ((this.c == 9 || this.d == 9) && i == 8) {
                        return true;
                    }
                    if ((this.c == 12 || this.d == 12) && i == 11) {
                        return true;
                    }
                    return false;
                }
            }
            return true;
        }

        c(String str, int i, int i2, int i3) {
            this.b = str;
            this.a = i;
            this.c = i2;
            this.d = i3;
        }
    }

    /* renamed from: _c$d */
    /* compiled from: ExifInterface */
    private static class d {
        public final long a;
        public final long b;

        d(long j, long j2) {
            if (j2 == 0) {
                this.a = 0;
                this.b = 1;
                return;
            }
            this.a = j;
            this.b = j2;
        }

        public double a() {
            return ((double) this.a) / ((double) this.b);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.a);
            sb.append("/");
            sb.append(this.b);
            return sb.toString();
        }
    }

    static {
        c[] cVarArr;
        Integer valueOf = Integer.valueOf(1);
        Integer valueOf2 = Integer.valueOf(3);
        Integer valueOf3 = Integer.valueOf(2);
        Integer valueOf4 = Integer.valueOf(8);
        a = Arrays.asList(new Integer[]{valueOf, Integer.valueOf(6), valueOf2, valueOf4});
        Integer valueOf5 = Integer.valueOf(7);
        Integer valueOf6 = Integer.valueOf(5);
        b = Arrays.asList(new Integer[]{valueOf3, valueOf5, Integer.valueOf(4), valueOf6});
        c[] cVarArr2 = m;
        w = new c[][]{cVarArr2, n, o, p, q, cVarArr2, s, t, u, v};
        c[][] cVarArr3 = w;
        A = new HashMap[cVarArr3.length];
        B = new HashMap[cVarArr3.length];
        i.setTimeZone(TimeZone.getTimeZone("UTC"));
        for (int i2 = 0; i2 < w.length; i2++) {
            A[i2] = new HashMap<>();
            B[i2] = new HashMap<>();
            for (c cVar : w[i2]) {
                A[i2].put(Integer.valueOf(cVar.a), cVar);
                B[i2].put(cVar.b, cVar);
            }
        }
        D.put(Integer.valueOf(x[0].a), valueOf6);
        D.put(Integer.valueOf(x[1].a), valueOf);
        D.put(Integer.valueOf(x[2].a), valueOf3);
        D.put(Integer.valueOf(x[3].a), valueOf2);
        D.put(Integer.valueOf(x[4].a), valueOf5);
        D.put(Integer.valueOf(x[5].a), valueOf4);
    }

    public _c(String str) throws IOException {
        c[][] cVarArr = w;
        this.L = new HashMap[cVarArr.length];
        this.M = new HashSet(cVarArr.length);
        if (str != null) {
            FileInputStream fileInputStream = null;
            this.J = null;
            this.I = str;
            try {
                FileInputStream fileInputStream2 = new FileInputStream(str);
                try {
                    a((InputStream) fileInputStream2);
                    a((Closeable) fileInputStream2);
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    a((Closeable) fileInputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                a((Closeable) fileInputStream);
                throw th;
            }
        } else {
            throw new IllegalArgumentException("filename cannot be null");
        }
    }

    private b b(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        for (int i2 = 0; i2 < w.length; i2++) {
            b bVar = (b) this.L[i2].get(str);
            if (bVar != null) {
                return bVar;
            }
        }
        return null;
    }

    private boolean c(byte[] bArr) throws IOException {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i2 = 0; i2 < bytes.length; i2++) {
            if (bArr[i2] != bytes[i2]) {
                return false;
            }
        }
        return true;
    }

    private boolean d(byte[] bArr) throws IOException {
        a aVar = new a(bArr);
        this.N = e(aVar);
        aVar.a(this.N);
        short readShort = aVar.readShort();
        aVar.close();
        return readShort == 85;
    }

    private ByteOrder e(a aVar) throws IOException {
        short readShort = aVar.readShort();
        if (readShort == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid byte order: ");
        sb.append(Integer.toHexString(readShort));
        throw new IOException(sb.toString());
    }

    private void f(a aVar) throws IOException {
        HashMap<String, b> hashMap = this.L[4];
        b bVar = (b) hashMap.get("Compression");
        if (bVar != null) {
            this.S = bVar.b(this.N);
            int i2 = this.S;
            if (i2 != 1) {
                if (i2 == 6) {
                    a(aVar, (HashMap) hashMap);
                    return;
                } else if (i2 != 7) {
                    return;
                }
            }
            if (a((HashMap) hashMap)) {
                b(aVar, (HashMap) hashMap);
                return;
            }
            return;
        }
        this.S = 6;
        a(aVar, (HashMap) hashMap);
    }

    public String a(String str) {
        b b2 = b(str);
        if (b2 != null) {
            if (!C.contains(str)) {
                return b2.c(this.N);
            }
            if (str.equals("GPSTimeStamp")) {
                int i2 = b2.a;
                String str2 = "ExifInterface";
                if (i2 == 5 || i2 == 10) {
                    d[] dVarArr = (d[]) b2.d(this.N);
                    if (dVarArr == null || dVarArr.length != 3) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Invalid GPS Timestamp array. array=");
                        sb.append(Arrays.toString(dVarArr));
                        Log.w(str2, sb.toString());
                        return null;
                    }
                    return String.format("%02d:%02d:%02d", new Object[]{Integer.valueOf((int) (((float) dVarArr[0].a) / ((float) dVarArr[0].b))), Integer.valueOf((int) (((float) dVarArr[1].a) / ((float) dVarArr[1].b))), Integer.valueOf((int) (((float) dVarArr[2].a) / ((float) dVarArr[2].b)))});
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("GPS Timestamp format is not rational. format=");
                sb2.append(b2.a);
                Log.w(str2, sb2.toString());
                return null;
            }
            try {
                return Double.toString(b2.a(this.N));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    private boolean b(byte[] bArr) throws IOException {
        a aVar = new a(bArr);
        this.N = e(aVar);
        aVar.a(this.N);
        short readShort = aVar.readShort();
        aVar.close();
        return readShort == 20306 || readShort == 21330;
    }

    private void c(a aVar) throws IOException {
        a(aVar, aVar.available());
        b(aVar, 0);
        d(aVar, 0);
        d(aVar, 5);
        d(aVar, 4);
        b((InputStream) aVar);
        if (this.K == 8) {
            b bVar = (b) this.L[1].get("MakerNote");
            if (bVar != null) {
                a aVar2 = new a(bVar.c);
                aVar2.a(this.N);
                aVar2.h(6);
                b(aVar2, 9);
                String str = "ColorSpace";
                b bVar2 = (b) this.L[9].get(str);
                if (bVar2 != null) {
                    this.L[1].put(str, bVar2);
                }
            }
        }
    }

    private void d(a aVar) throws IOException {
        c(aVar);
        if (((b) this.L[0].get("JpgFromRaw")) != null) {
            a(aVar, this.X, 5);
        }
        b bVar = (b) this.L[0].get("ISO");
        String str = "PhotographicSensitivity";
        b bVar2 = (b) this.L[1].get(str);
        if (bVar != null && bVar2 == null) {
            this.L[1].put(str, bVar);
        }
    }

    private void b(a aVar) throws IOException {
        aVar.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        aVar.read(bArr);
        aVar.skipBytes(4);
        aVar.read(bArr2);
        int i2 = ByteBuffer.wrap(bArr).getInt();
        int i3 = ByteBuffer.wrap(bArr2).getInt();
        a(aVar, i2, 5);
        aVar.h((long) i3);
        aVar.a(ByteOrder.BIG_ENDIAN);
        int readInt = aVar.readInt();
        for (int i4 = 0; i4 < readInt; i4++) {
            int readUnsignedShort = aVar.readUnsignedShort();
            int readUnsignedShort2 = aVar.readUnsignedShort();
            if (readUnsignedShort == r.a) {
                short readShort = aVar.readShort();
                short readShort2 = aVar.readShort();
                b a2 = b.a((int) readShort, this.N);
                b a3 = b.a((int) readShort2, this.N);
                this.L[0].put("ImageLength", a2);
                this.L[0].put("ImageWidth", a3);
                return;
            }
            aVar.skipBytes(readUnsignedShort2);
        }
    }

    private void d(a aVar, int i2) throws IOException {
        b bVar;
        b bVar2;
        b bVar3 = (b) this.L[i2].get("DefaultCropSize");
        b bVar4 = (b) this.L[i2].get("SensorTopBorder");
        b bVar5 = (b) this.L[i2].get("SensorLeftBorder");
        b bVar6 = (b) this.L[i2].get("SensorBottomBorder");
        b bVar7 = (b) this.L[i2].get("SensorRightBorder");
        String str = "ImageLength";
        String str2 = "ImageWidth";
        if (bVar3 != null) {
            String str3 = "Invalid crop size values. cropSize=";
            String str4 = "ExifInterface";
            if (bVar3.a == 5) {
                d[] dVarArr = (d[]) bVar3.d(this.N);
                if (dVarArr == null || dVarArr.length != 2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str3);
                    sb.append(Arrays.toString(dVarArr));
                    Log.w(str4, sb.toString());
                    return;
                }
                bVar2 = b.a(dVarArr[0], this.N);
                bVar = b.a(dVarArr[1], this.N);
            } else {
                int[] iArr = (int[]) bVar3.d(this.N);
                if (iArr == null || iArr.length != 2) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str3);
                    sb2.append(Arrays.toString(iArr));
                    Log.w(str4, sb2.toString());
                    return;
                }
                bVar2 = b.a(iArr[0], this.N);
                bVar = b.a(iArr[1], this.N);
            }
            this.L[i2].put(str2, bVar2);
            this.L[i2].put(str, bVar);
        } else if (bVar4 == null || bVar5 == null || bVar6 == null || bVar7 == null) {
            c(aVar, i2);
        } else {
            int b2 = bVar4.b(this.N);
            int b3 = bVar6.b(this.N);
            int b4 = bVar7.b(this.N);
            int b5 = bVar5.b(this.N);
            if (b3 > b2 && b4 > b5) {
                int i3 = b4 - b5;
                b a2 = b.a(b3 - b2, this.N);
                b a3 = b.a(i3, this.N);
                this.L[i2].put(str, a2);
                this.L[i2].put(str2, a3);
            }
        }
    }

    public int a(String str, int i2) {
        b b2 = b(str);
        if (b2 == null) {
            return i2;
        }
        try {
            return b2.b(this.N);
        } catch (NumberFormatException unused) {
            return i2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0045, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r4.Y = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004d, code lost:
        a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0050, code lost:
        throw r5;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0047 */
    private void a(InputStream inputStream) throws IOException {
        int i2 = 0;
        while (true) {
            if (i2 < w.length) {
                this.L[i2] = new HashMap<>();
                i2++;
            } else {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
                this.K = a(bufferedInputStream);
                a aVar = new a((InputStream) bufferedInputStream);
                switch (this.K) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 11:
                        c(aVar);
                        break;
                    case 4:
                        a(aVar, 0, 0);
                        break;
                    case 7:
                        a(aVar);
                        break;
                    case 9:
                        b(aVar);
                        break;
                    case 10:
                        d(aVar);
                        break;
                }
                f(aVar);
                this.Y = true;
            }
        }
        a();
    }

    private void c(a aVar, int i2) throws IOException {
        b bVar = (b) this.L[i2].get("ImageWidth");
        if (((b) this.L[i2].get("ImageLength")) == null || bVar == null) {
            b bVar2 = (b) this.L[i2].get("JPEGInterchangeFormat");
            if (bVar2 != null) {
                a(aVar, bVar2.b(this.N), i2);
            }
        }
    }

    private int a(BufferedInputStream bufferedInputStream) throws IOException {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (a(bArr)) {
            return 4;
        }
        if (c(bArr)) {
            return 9;
        }
        if (b(bArr)) {
            return 7;
        }
        return d(bArr) ? 10 : 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:87:0x027d, code lost:
        if ("Model".equals(r6.b) != false) goto L_0x027f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x028b, code lost:
        if (r5.c(r0.N).contains("PENTAX") == false) goto L_0x028d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0293, code lost:
        if (r8.equals(r6.b) == false) goto L_0x02a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x029e, code lost:
        if (r5.b(r0.N) != 65535) goto L_0x02a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02a0, code lost:
        r0.K = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02a9, code lost:
        if (((long) r24.a()) == r13) goto L_0x02ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02ab, code lost:
        r1.h(r13);
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00f5  */
    private void b(a aVar, int i2) throws IOException {
        String str;
        boolean z2;
        long j2;
        short s2;
        short s3;
        c cVar;
        int i3;
        int i4;
        int i5;
        a aVar2 = aVar;
        int i6 = i2;
        this.M.add(Integer.valueOf(aVar2.f));
        if (aVar2.f + 2 <= aVar2.e) {
            short readShort = aVar.readShort();
            if (aVar2.f + (readShort * 12) <= aVar2.e && readShort > 0) {
                short s4 = 0;
                while (true) {
                    str = "ExifInterface";
                    if (s4 >= readShort) {
                        break;
                    }
                    int readUnsignedShort = aVar.readUnsignedShort();
                    int readUnsignedShort2 = aVar.readUnsignedShort();
                    int readInt = aVar.readInt();
                    long a2 = ((long) aVar.a()) + 4;
                    c cVar2 = (c) A[i6].get(Integer.valueOf(readUnsignedShort));
                    if (cVar2 == null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Skip the tag entry since tag number is not defined: ");
                        sb.append(readUnsignedShort);
                        Log.w(str, sb.toString());
                    } else if (readUnsignedShort2 <= 0 || readUnsignedShort2 >= k.length) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Skip the tag entry since data format is invalid: ");
                        sb2.append(readUnsignedShort2);
                        Log.w(str, sb2.toString());
                    } else if (!cVar2.a(readUnsignedShort2)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Skip the tag entry since data format (");
                        sb3.append(j[readUnsignedShort2]);
                        sb3.append(") is unexpected for tag: ");
                        sb3.append(cVar2.b);
                        Log.w(str, sb3.toString());
                    } else {
                        if (readUnsignedShort2 == 7) {
                            readUnsignedShort2 = cVar2.c;
                        }
                        String str2 = str;
                        j2 = ((long) readInt) * ((long) k[readUnsignedShort2]);
                        if (j2 < 0 || j2 > 2147483647L) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("Skip the tag entry since the number of components is invalid: ");
                            sb4.append(readInt);
                            str = str2;
                            Log.w(str, sb4.toString());
                            z2 = false;
                            if (!z2) {
                                aVar2.h(a2);
                                s3 = readShort;
                                s2 = s4;
                            } else {
                                String str3 = "Compression";
                                if (j2 > 4) {
                                    int readInt2 = aVar.readInt();
                                    s3 = readShort;
                                    int i7 = this.K;
                                    s2 = s4;
                                    if (i7 == 7) {
                                        if ("MakerNote".equals(cVar2.b)) {
                                            this.U = readInt2;
                                        } else if (i6 == 6) {
                                            if ("ThumbnailImage".equals(cVar2.b)) {
                                                this.V = readInt2;
                                                this.W = readInt;
                                                b a3 = b.a(6, this.N);
                                                i3 = readUnsignedShort2;
                                                i4 = readInt;
                                                b a4 = b.a((long) this.V, this.N);
                                                b a5 = b.a((long) this.W, this.N);
                                                this.L[4].put(str3, a3);
                                                this.L[4].put("JPEGInterchangeFormat", a4);
                                                this.L[4].put("JPEGInterchangeFormatLength", a5);
                                            }
                                        }
                                        i3 = readUnsignedShort2;
                                        i4 = readInt;
                                    } else {
                                        i3 = readUnsignedShort2;
                                        i4 = readInt;
                                        if (i7 == 10) {
                                            if ("JpgFromRaw".equals(cVar2.b)) {
                                                this.X = readInt2;
                                            }
                                        }
                                    }
                                    long j3 = (long) readInt2;
                                    cVar = cVar2;
                                    if (j3 + j2 <= ((long) aVar2.e)) {
                                        aVar2.h(j3);
                                    } else {
                                        StringBuilder sb5 = new StringBuilder();
                                        sb5.append("Skip the tag entry since data offset is invalid: ");
                                        sb5.append(readInt2);
                                        Log.w(str, sb5.toString());
                                        aVar2.h(a2);
                                    }
                                } else {
                                    s3 = readShort;
                                    cVar = cVar2;
                                    s2 = s4;
                                    i3 = readUnsignedShort2;
                                    i4 = readInt;
                                }
                                Integer num = (Integer) D.get(Integer.valueOf(readUnsignedShort));
                                if (num != null) {
                                    long j4 = -1;
                                    int i8 = i3;
                                    if (i8 == 3) {
                                        i5 = aVar.readUnsignedShort();
                                        j4 = (long) i5;
                                    } else if (i8 != 4) {
                                        if (i8 == 8) {
                                            i5 = aVar.readShort();
                                        } else if (i8 == 9 || i8 == 13) {
                                            i5 = aVar.readInt();
                                        }
                                        j4 = (long) i5;
                                    } else {
                                        j4 = aVar.b();
                                    }
                                    if (j4 <= 0 || j4 >= ((long) aVar2.e)) {
                                        StringBuilder sb6 = new StringBuilder();
                                        sb6.append("Skip jump into the IFD since its offset is invalid: ");
                                        sb6.append(j4);
                                        Log.w(str, sb6.toString());
                                    } else if (!this.M.contains(Integer.valueOf((int) j4))) {
                                        aVar2.h(j4);
                                        b(aVar2, num.intValue());
                                    } else {
                                        StringBuilder sb7 = new StringBuilder();
                                        sb7.append("Skip jump into the IFD since it has already been read: IfdType ");
                                        sb7.append(num);
                                        sb7.append(" (at ");
                                        sb7.append(j4);
                                        sb7.append(")");
                                        Log.w(str, sb7.toString());
                                    }
                                    aVar2.h(a2);
                                } else {
                                    int i9 = i3;
                                    byte[] bArr = new byte[((int) j2)];
                                    aVar2.readFully(bArr);
                                    b bVar = new b(i9, i4, bArr);
                                    c cVar3 = cVar;
                                    this.L[i2].put(cVar3.b, bVar);
                                    if ("DNGVersion".equals(cVar3.b)) {
                                        this.K = 3;
                                    }
                                    if (!"Make".equals(cVar3.b)) {
                                    }
                                }
                            }
                            s4 = (short) (s2 + 1);
                            i6 = i2;
                            readShort = s3;
                        } else {
                            z2 = true;
                            str = str2;
                            if (!z2) {
                            }
                            s4 = (short) (s2 + 1);
                            i6 = i2;
                            readShort = s3;
                        }
                    }
                    j2 = 0;
                    z2 = false;
                    if (!z2) {
                    }
                    s4 = (short) (s2 + 1);
                    i6 = i2;
                    readShort = s3;
                }
                if (aVar.a() + 4 <= aVar2.e) {
                    int readInt3 = aVar.readInt();
                    long j5 = (long) readInt3;
                    if (j5 <= 0 || readInt3 >= aVar2.e) {
                        StringBuilder sb8 = new StringBuilder();
                        sb8.append("Stop reading file since a wrong offset may cause an infinite loop: ");
                        sb8.append(readInt3);
                        Log.w(str, sb8.toString());
                    } else if (!this.M.contains(Integer.valueOf(readInt3))) {
                        aVar2.h(j5);
                        if (this.L[4].isEmpty()) {
                            b(aVar2, 4);
                        } else if (this.L[5].isEmpty()) {
                            b(aVar2, 5);
                        }
                    } else {
                        StringBuilder sb9 = new StringBuilder();
                        sb9.append("Stop reading file since re-reading an IFD may cause an infinite loop: ");
                        sb9.append(readInt3);
                        Log.w(str, sb9.toString());
                    }
                }
            }
        }
    }

    private static boolean a(byte[] bArr) throws IOException {
        int i2 = 0;
        while (true) {
            byte[] bArr2 = f;
            if (i2 >= bArr2.length) {
                return true;
            }
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
            i2++;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0088 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00f7 A[SYNTHETIC] */
    private void a(a aVar, int i2, int i3) throws IOException {
        aVar.a(ByteOrder.BIG_ENDIAN);
        aVar.h((long) i2);
        byte readByte = aVar.readByte();
        String str = "Invalid marker: ";
        if (readByte == -1) {
            int i4 = i2 + 1;
            if (aVar.readByte() == -40) {
                int i5 = i4 + 1;
                while (true) {
                    byte readByte2 = aVar.readByte();
                    if (readByte2 == -1) {
                        int i6 = i5 + 1;
                        byte readByte3 = aVar.readByte();
                        int i7 = i6 + 1;
                        if (readByte3 == -39 || readByte3 == -38) {
                            aVar.a(this.N);
                        } else {
                            int readUnsignedShort = aVar.readUnsignedShort() - 2;
                            int i8 = i7 + 2;
                            String str2 = "Invalid length";
                            if (readUnsignedShort >= 0) {
                                String str3 = "Invalid exif";
                                if (readByte3 == -31) {
                                    if (readUnsignedShort >= 6) {
                                        byte[] bArr = new byte[6];
                                        if (aVar.read(bArr) == 6) {
                                            i8 += 6;
                                            readUnsignedShort -= 6;
                                            if (Arrays.equals(bArr, F)) {
                                                if (readUnsignedShort > 0) {
                                                    this.T = i8;
                                                    byte[] bArr2 = new byte[readUnsignedShort];
                                                    if (aVar.read(bArr2) == readUnsignedShort) {
                                                        i8 += readUnsignedShort;
                                                        a(bArr2, i3);
                                                    } else {
                                                        throw new IOException(str3);
                                                    }
                                                } else {
                                                    throw new IOException(str3);
                                                }
                                            }
                                        } else {
                                            throw new IOException(str3);
                                        }
                                    }
                                    if (readUnsignedShort < 0) {
                                    }
                                } else if (readByte3 != -2) {
                                    switch (readByte3) {
                                        case -64:
                                        case -63:
                                        case -62:
                                        case -61:
                                            if (aVar.skipBytes(1) != 1) {
                                            }
                                            break;
                                        default:
                                            switch (readByte3) {
                                                case -59:
                                                case -58:
                                                case -57:
                                                    break;
                                                default:
                                                    switch (readByte3) {
                                                        case -55:
                                                        case -54:
                                                        case -53:
                                                            break;
                                                        default:
                                                            switch (readByte3) {
                                                                case -51:
                                                                case -50:
                                                                case -49:
                                                                    break;
                                                            }
                                                    }
                                            }
                                            if (aVar.skipBytes(1) != 1) {
                                                this.L[i3].put("ImageLength", b.a((long) aVar.readUnsignedShort(), this.N));
                                                this.L[i3].put("ImageWidth", b.a((long) aVar.readUnsignedShort(), this.N));
                                                readUnsignedShort -= 5;
                                                break;
                                            } else {
                                                throw new IOException("Invalid SOFx");
                                            }
                                            break;
                                    }
                                    if (readUnsignedShort < 0) {
                                        throw new IOException(str2);
                                    } else if (aVar.skipBytes(readUnsignedShort) == readUnsignedShort) {
                                        i5 = i8 + readUnsignedShort;
                                    } else {
                                        throw new IOException("Invalid JPEG segment");
                                    }
                                } else {
                                    byte[] bArr3 = new byte[readUnsignedShort];
                                    if (aVar.read(bArr3) == readUnsignedShort) {
                                        String str4 = "UserComment";
                                        if (a(str4) == null) {
                                            this.L[1].put(str4, b.a(new String(bArr3, E)));
                                        }
                                    } else {
                                        throw new IOException(str3);
                                    }
                                }
                                readUnsignedShort = 0;
                                if (readUnsignedShort < 0) {
                                }
                            } else {
                                throw new IOException(str2);
                            }
                        }
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Invalid marker:");
                        sb.append(Integer.toHexString(readByte2 & 255));
                        throw new IOException(sb.toString());
                    }
                }
                aVar.a(this.N);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(Integer.toHexString(readByte & 255));
            throw new IOException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append(Integer.toHexString(readByte & 255));
        throw new IOException(sb3.toString());
    }

    private void a(a aVar) throws IOException {
        c(aVar);
        b bVar = (b) this.L[1].get("MakerNote");
        if (bVar != null) {
            a aVar2 = new a(bVar.c);
            aVar2.a(this.N);
            byte[] bArr = new byte[g.length];
            aVar2.readFully(bArr);
            aVar2.h(0);
            byte[] bArr2 = new byte[h.length];
            aVar2.readFully(bArr2);
            if (Arrays.equals(bArr, g)) {
                aVar2.h(8);
            } else if (Arrays.equals(bArr2, h)) {
                aVar2.h(12);
            }
            b(aVar2, 6);
            b bVar2 = (b) this.L[7].get("PreviewImageStart");
            b bVar3 = (b) this.L[7].get("PreviewImageLength");
            if (!(bVar2 == null || bVar3 == null)) {
                this.L[5].put("JPEGInterchangeFormat", bVar2);
                this.L[5].put("JPEGInterchangeFormatLength", bVar3);
            }
            b bVar4 = (b) this.L[8].get("AspectFrame");
            if (bVar4 != null) {
                int[] iArr = (int[]) bVar4.d(this.N);
                if (iArr == null || iArr.length != 4) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid aspect frame values. frame=");
                    sb.append(Arrays.toString(iArr));
                    Log.w("ExifInterface", sb.toString());
                } else if (iArr[2] > iArr[0] && iArr[3] > iArr[1]) {
                    int i2 = (iArr[2] - iArr[0]) + 1;
                    int i3 = (iArr[3] - iArr[1]) + 1;
                    if (i2 < i3) {
                        int i4 = i2 + i3;
                        i3 = i4 - i3;
                        i2 = i4 - i3;
                    }
                    b a2 = b.a(i2, this.N);
                    b a3 = b.a(i3, this.N);
                    this.L[0].put("ImageWidth", a2);
                    this.L[0].put("ImageLength", a3);
                }
            }
        }
    }

    private void b(a aVar, HashMap hashMap) throws IOException {
        b bVar = (b) hashMap.get("StripOffsets");
        b bVar2 = (b) hashMap.get("StripByteCounts");
        if (!(bVar == null || bVar2 == null)) {
            long[] a2 = a(bVar.d(this.N));
            long[] a3 = a(bVar2.d(this.N));
            String str = "ExifInterface";
            if (a2 == null) {
                Log.w(str, "stripOffsets should not be null.");
            } else if (a3 == null) {
                Log.w(str, "stripByteCounts should not be null.");
            } else {
                long j2 = 0;
                for (long j3 : a3) {
                    j2 += j3;
                }
                byte[] bArr = new byte[((int) j2)];
                int i2 = 0;
                int i3 = 0;
                for (int i4 = 0; i4 < a2.length; i4++) {
                    int i5 = (int) a3[i4];
                    int i6 = ((int) a2[i4]) - i2;
                    if (i6 < 0) {
                        Log.d(str, "Invalid strip offset value");
                    }
                    aVar.h((long) i6);
                    int i7 = i2 + i6;
                    byte[] bArr2 = new byte[i5];
                    aVar.read(bArr2);
                    i2 = i7 + i5;
                    System.arraycopy(bArr2, 0, bArr, i3, bArr2.length);
                    i3 += bArr2.length;
                }
                this.O = true;
                this.R = bArr;
                this.Q = bArr.length;
            }
        }
    }

    private void a(byte[] bArr, int i2) throws IOException {
        a aVar = new a(bArr);
        a(aVar, bArr.length);
        b(aVar, i2);
    }

    private void a() {
        String a2 = a("DateTimeOriginal");
        if (a2 != null) {
            String str = "DateTime";
            if (a(str) == null) {
                this.L[0].put(str, b.a(a2));
            }
        }
        String str2 = "ImageWidth";
        if (a(str2) == null) {
            this.L[0].put(str2, b.a(0, this.N));
        }
        String str3 = "ImageLength";
        if (a(str3) == null) {
            this.L[0].put(str3, b.a(0, this.N));
        }
        String str4 = "Orientation";
        if (a(str4) == null) {
            this.L[0].put(str4, b.a(0, this.N));
        }
        String str5 = "LightSource";
        if (a(str5) == null) {
            this.L[1].put(str5, b.a(0, this.N));
        }
    }

    private boolean b(HashMap hashMap) throws IOException {
        b bVar = (b) hashMap.get("ImageLength");
        b bVar2 = (b) hashMap.get("ImageWidth");
        if (!(bVar == null || bVar2 == null)) {
            int b2 = bVar.b(this.N);
            int b3 = bVar2.b(this.N);
            if (b2 <= 512 && b3 <= 512) {
                return true;
            }
        }
        return false;
    }

    private void b(InputStream inputStream) throws IOException {
        a(0, 5);
        a(0, 4);
        a(5, 4);
        b bVar = (b) this.L[1].get("PixelXDimension");
        b bVar2 = (b) this.L[1].get("PixelYDimension");
        if (!(bVar == null || bVar2 == null)) {
            this.L[0].put("ImageWidth", bVar);
            this.L[0].put("ImageLength", bVar2);
        }
        if (this.L[4].isEmpty() && b((HashMap) this.L[5])) {
            HashMap<String, b>[] hashMapArr = this.L;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        if (!b((HashMap) this.L[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
    }

    private void a(a aVar, int i2) throws IOException {
        this.N = e(aVar);
        aVar.a(this.N);
        int readUnsignedShort = aVar.readUnsignedShort();
        int i3 = this.K;
        if (i3 == 7 || i3 == 10 || readUnsignedShort == 42) {
            int readInt = aVar.readInt();
            if (readInt < 8 || readInt >= i2) {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid first Ifd offset: ");
                sb.append(readInt);
                throw new IOException(sb.toString());
            }
            int i4 = readInt - 8;
            if (i4 > 0 && aVar.skipBytes(i4) != i4) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Couldn't jump to first Ifd: ");
                sb2.append(i4);
                throw new IOException(sb2.toString());
            }
            return;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Invalid start code: ");
        sb3.append(Integer.toHexString(readUnsignedShort));
        throw new IOException(sb3.toString());
    }

    private void a(a aVar, HashMap hashMap) throws IOException {
        int i2;
        b bVar = (b) hashMap.get("JPEGInterchangeFormat");
        b bVar2 = (b) hashMap.get("JPEGInterchangeFormatLength");
        if (bVar != null && bVar2 != null) {
            int b2 = bVar.b(this.N);
            int min = Math.min(bVar2.b(this.N), aVar.available() - b2);
            int i3 = this.K;
            if (i3 == 4 || i3 == 9 || i3 == 10) {
                i2 = this.T;
            } else {
                if (i3 == 7) {
                    i2 = this.U;
                }
                if (b2 > 0 && min > 0) {
                    this.O = true;
                    this.P = b2;
                    this.Q = min;
                    if (this.I == null && this.J == null) {
                        byte[] bArr = new byte[min];
                        aVar.h((long) b2);
                        aVar.readFully(bArr);
                        this.R = bArr;
                        return;
                    }
                    return;
                }
            }
            b2 += i2;
            if (b2 > 0) {
            }
        }
    }

    private boolean a(HashMap hashMap) throws IOException {
        b bVar = (b) hashMap.get("BitsPerSample");
        if (bVar != null) {
            int[] iArr = (int[]) bVar.d(this.N);
            if (Arrays.equals(c, iArr)) {
                return true;
            }
            if (this.K == 3) {
                b bVar2 = (b) hashMap.get("PhotometricInterpretation");
                if (bVar2 != null) {
                    int b2 = bVar2.b(this.N);
                    if ((b2 == 1 && Arrays.equals(iArr, e)) || (b2 == 6 && Arrays.equals(iArr, c))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private void a(int i2, int i3) throws IOException {
        if (!this.L[i2].isEmpty() && !this.L[i3].isEmpty()) {
            String str = "ImageLength";
            b bVar = (b) this.L[i2].get(str);
            String str2 = "ImageWidth";
            b bVar2 = (b) this.L[i2].get(str2);
            b bVar3 = (b) this.L[i3].get(str);
            b bVar4 = (b) this.L[i3].get(str2);
            if (bVar != null && bVar2 != null && bVar3 != null && bVar4 != null) {
                int b2 = bVar.b(this.N);
                int b3 = bVar2.b(this.N);
                int b4 = bVar3.b(this.N);
                int b5 = bVar4.b(this.N);
                if (b2 < b4 && b3 < b5) {
                    HashMap<String, b>[] hashMapArr = this.L;
                    HashMap<String, b> hashMap = hashMapArr[i2];
                    hashMapArr[i2] = hashMapArr[i3];
                    hashMapArr[i3] = hashMap;
                }
            }
        }
    }

    private static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    private static long[] a(Object obj) {
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            long[] jArr = new long[iArr.length];
            for (int i2 = 0; i2 < iArr.length; i2++) {
                jArr[i2] = (long) iArr[i2];
            }
            return jArr;
        } else if (obj instanceof long[]) {
            return (long[]) obj;
        } else {
            return null;
        }
    }
}
