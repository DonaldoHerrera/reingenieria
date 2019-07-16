package com.adjust.sdk;

import android.util.Log;
import java.util.Arrays;
import java.util.Locale;

public class Logger implements ILogger {
    private static String formatErrorMessage = "Error formating log message: %s, with params: %s";
    private boolean isProductionEnvironment = false;
    private LogLevel logLevel;
    private boolean logLevelLocked = false;

    public Logger() {
        setLogLevel(LogLevel.INFO, this.isProductionEnvironment);
    }

    public void Assert(String str, Object... objArr) {
        String str2 = Constants.LOGTAG;
        if (!this.isProductionEnvironment && this.logLevel.androidLogLevel <= 7) {
            try {
                Log.println(7, str2, Util.formatString(str, objArr));
            } catch (Exception unused) {
                Log.e(str2, Util.formatString(formatErrorMessage, str, Arrays.toString(objArr)));
            }
        }
    }

    public void debug(String str, Object... objArr) {
        String str2 = Constants.LOGTAG;
        if (!this.isProductionEnvironment && this.logLevel.androidLogLevel <= 3) {
            try {
                Log.d(str2, Util.formatString(str, objArr));
            } catch (Exception unused) {
                Log.e(str2, Util.formatString(formatErrorMessage, str, Arrays.toString(objArr)));
            }
        }
    }

    public void error(String str, Object... objArr) {
        String str2 = Constants.LOGTAG;
        if (!this.isProductionEnvironment && this.logLevel.androidLogLevel <= 6) {
            try {
                Log.e(str2, Util.formatString(str, objArr));
            } catch (Exception unused) {
                Log.e(str2, Util.formatString(formatErrorMessage, str, Arrays.toString(objArr)));
            }
        }
    }

    public void info(String str, Object... objArr) {
        String str2 = Constants.LOGTAG;
        if (!this.isProductionEnvironment && this.logLevel.androidLogLevel <= 4) {
            try {
                Log.i(str2, Util.formatString(str, objArr));
            } catch (Exception unused) {
                Log.e(str2, Util.formatString(formatErrorMessage, str, Arrays.toString(objArr)));
            }
        }
    }

    public void lockLogLevel() {
        this.logLevelLocked = true;
    }

    public void setLogLevel(LogLevel logLevel2, boolean z) {
        if (!this.logLevelLocked) {
            this.logLevel = logLevel2;
            this.isProductionEnvironment = z;
        }
    }

    public void setLogLevelString(String str, boolean z) {
        if (str != null) {
            try {
                setLogLevel(LogLevel.valueOf(str.toUpperCase(Locale.US)), z);
            } catch (IllegalArgumentException unused) {
                error("Malformed logLevel '%s', falling back to 'info'", str);
            }
        }
    }

    public void verbose(String str, Object... objArr) {
        String str2 = Constants.LOGTAG;
        if (!this.isProductionEnvironment && this.logLevel.androidLogLevel <= 2) {
            try {
                Log.v(str2, Util.formatString(str, objArr));
            } catch (Exception unused) {
                Log.e(str2, Util.formatString(formatErrorMessage, str, Arrays.toString(objArr)));
            }
        }
    }

    public void warn(String str, Object... objArr) {
        String str2 = Constants.LOGTAG;
        if (!this.isProductionEnvironment && this.logLevel.androidLogLevel <= 5) {
            try {
                Log.w(str2, Util.formatString(str, objArr));
            } catch (Exception unused) {
                Log.e(str2, Util.formatString(formatErrorMessage, str, Arrays.toString(objArr)));
            }
        }
    }

    public void warnInProduction(String str, Object... objArr) {
        String str2 = Constants.LOGTAG;
        if (this.logLevel.androidLogLevel <= 5) {
            try {
                Log.w(str2, Util.formatString(str, objArr));
            } catch (Exception unused) {
                Log.e(str2, Util.formatString(formatErrorMessage, str, Arrays.toString(objArr)));
            }
        }
    }
}
