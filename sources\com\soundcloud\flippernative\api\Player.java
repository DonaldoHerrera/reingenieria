package com.soundcloud.flippernative.api;

public class Player {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public static final class LogLevel {
        public static final LogLevel Debug = new LogLevel("Debug");
        public static final LogLevel Error = new LogLevel("Error");
        public static final LogLevel Info = new LogLevel("Info");
        public static final LogLevel Warn = new LogLevel("Warn");
        private static int swigNext = 0;
        private static LogLevel[] swigValues = {Debug, Info, Warn, Error};
        private final String swigName;
        private final int swigValue;

        private LogLevel(String str) {
            this.swigName = str;
            int i = swigNext;
            swigNext = i + 1;
            this.swigValue = i;
        }

        public static LogLevel swigToEnum(int i) {
            LogLevel[] logLevelArr = swigValues;
            if (i < logLevelArr.length && i >= 0 && logLevelArr[i].swigValue == i) {
                return logLevelArr[i];
            }
            int i2 = 0;
            while (true) {
                LogLevel[] logLevelArr2 = swigValues;
                if (i2 >= logLevelArr2.length) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("No enum ");
                    sb.append(LogLevel.class);
                    sb.append(" with value ");
                    sb.append(i);
                    throw new IllegalArgumentException(sb.toString());
                } else if (logLevelArr2[i2].swigValue == i) {
                    return logLevelArr2[i2];
                } else {
                    i2++;
                }
            }
        }

        public final int swigValue() {
            return this.swigValue;
        }

        public String toString() {
            return this.swigName;
        }

        private LogLevel(String str, int i) {
            this.swigName = str;
            this.swigValue = i;
            swigNext = i + 1;
        }

        private LogLevel(String str, LogLevel logLevel) {
            this.swigName = str;
            this.swigValue = logLevel.swigValue;
            swigNext = this.swigValue + 1;
        }
    }

    protected Player(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    protected static long getCPtr(Player player) {
        if (player == null) {
            return 0;
        }
        return player.swigCPtr;
    }

    public static VectorMediaType getSupportedMediaTypes() {
        return new VectorMediaType(PlayerJniJNI.Player_getSupportedMediaTypes(), true);
    }

    public static void setCustomLogger(CustomLogger customLogger) {
        PlayerJniJNI.Player_setCustomLogger(CustomLogger.getCPtr(customLogger), customLogger);
    }

    public static void setLogLevel(LogLevel logLevel) {
        PlayerJniJNI.Player_setLogLevel(logLevel.swigValue());
    }

    public synchronized void delete() {
        if (this.swigCPtr != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                PlayerJniJNI.delete_Player(this.swigCPtr);
            }
            this.swigCPtr = 0;
        }
    }

    public void destroy() {
        PlayerJniJNI.Player_destroy(this.swigCPtr, this);
    }

    public void enableCaching(boolean z) {
        PlayerJniJNI.Player_enableCaching(this.swigCPtr, this, z);
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        delete();
    }

    public long getPlayerBuildNumber() {
        return PlayerJniJNI.Player_getPlayerBuildNumber(this.swigCPtr, this);
    }

    public String getPlayerVersion() {
        return PlayerJniJNI.Player_getPlayerVersion(this.swigCPtr, this);
    }

    public double getVolume() {
        return PlayerJniJNI.Player_getVolume(this.swigCPtr, this);
    }

    public boolean isMuted() {
        return PlayerJniJNI.Player_isMuted(this.swigCPtr, this);
    }

    public void mute() {
        PlayerJniJNI.Player_mute(this.swigCPtr, this);
    }

    public boolean open(String str, long j) {
        return PlayerJniJNI.Player_open__SWIG_0(this.swigCPtr, this, str, j);
    }

    public boolean openEncrypted(String str, byte[] bArr, byte[] bArr2, long j, MediaFormat mediaFormat) {
        return PlayerJniJNI.Player_openEncrypted__SWIG_0(this.swigCPtr, this, str, bArr, bArr2, j, mediaFormat.swigValue());
    }

    public void pause() {
        PlayerJniJNI.Player_pause(this.swigCPtr, this);
    }

    public void play() {
        PlayerJniJNI.Player_play(this.swigCPtr, this);
    }

    public void prefetch(String str) {
        PlayerJniJNI.Player_prefetch(this.swigCPtr, this, str);
    }

    public void seek(long j) {
        PlayerJniJNI.Player_seek(this.swigCPtr, this, j);
    }

    public void setMediaCodecDelegate(MediaCodecDelegate mediaCodecDelegate) {
        PlayerJniJNI.Player_setMediaCodecDelegate(this.swigCPtr, this, MediaCodecDelegate.getCPtr(mediaCodecDelegate), mediaCodecDelegate);
    }

    public void setVolume(double d) {
        PlayerJniJNI.Player_setVolume(this.swigCPtr, this, d);
    }

    public void stop() {
        PlayerJniJNI.Player_stop(this.swigCPtr, this);
    }

    public void unmute() {
        PlayerJniJNI.Player_unmute(this.swigCPtr, this);
    }

    public boolean open(String str) {
        return PlayerJniJNI.Player_open__SWIG_1(this.swigCPtr, this, str);
    }

    public boolean openEncrypted(String str, byte[] bArr, byte[] bArr2, long j) {
        return PlayerJniJNI.Player_openEncrypted__SWIG_1(this.swigCPtr, this, str, bArr, bArr2, j);
    }

    public boolean openEncrypted(String str, byte[] bArr, byte[] bArr2) {
        return PlayerJniJNI.Player_openEncrypted__SWIG_2(this.swigCPtr, this, str, bArr, bArr2);
    }

    public Player() {
        this(PlayerJniJNI.new_Player__SWIG_0(), true);
    }

    public Player(PlayerConfiguration playerConfiguration, PlayerListener playerListener) {
        this(PlayerJniJNI.new_Player__SWIG_1(PlayerConfiguration.getCPtr(playerConfiguration), playerConfiguration, PlayerListener.getCPtr(playerListener), playerListener), true);
    }
}
