package com.facebook.stetho.dumpapp;

import java.io.InputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Dumper {
    private final Map<String, DumperPlugin> mDumperPlugins;
    private final GlobalOptions mGlobalOptions;
    private final NAb mParser;

    public Dumper(Iterable<DumperPlugin> iterable) {
        this(iterable, new OAb());
    }

    private int doDump(InputStream inputStream, PrintStream printStream, PrintStream printStream2, String[] strArr) throws WAb, DumpException {
        MAb a = this.mParser.a(this.mGlobalOptions.options, strArr, true);
        if (a.b(this.mGlobalOptions.optionHelp.n())) {
            dumpUsage(printStream);
            return 0;
        } else if (a.b(this.mGlobalOptions.optionListPlugins.n())) {
            dumpAvailablePlugins(printStream);
            return 0;
        } else if (!a.a().isEmpty()) {
            dumpPluginOutput(inputStream, printStream, printStream2, a);
            return 0;
        } else {
            dumpUsage(printStream2);
            return 1;
        }
    }

    private void dumpAvailablePlugins(PrintStream printStream) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (DumperPlugin name : this.mDumperPlugins.values()) {
            arrayList.add(name.getName());
        }
        Collections.sort(arrayList);
        for (String println : arrayList) {
            printStream.println(println);
        }
    }

    private void dumpPluginOutput(InputStream inputStream, PrintStream printStream, PrintStream printStream2, MAb mAb) throws DumpException {
        ArrayList arrayList = new ArrayList(mAb.a());
        if (arrayList.size() >= 1) {
            String str = (String) arrayList.remove(0);
            DumperPlugin dumperPlugin = (DumperPlugin) this.mDumperPlugins.get(str);
            if (dumperPlugin != null) {
                DumperContext dumperContext = new DumperContext(inputStream, printStream, printStream2, this.mParser, arrayList);
                dumperPlugin.dump(dumperContext);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("No plugin named '");
            sb.append(str);
            sb.append("'");
            throw new DumpException(sb.toString());
        }
        throw new DumpException("Expected plugin argument");
    }

    private void dumpUsage(PrintStream printStream) {
        PAb pAb = new PAb();
        printStream.println("Usage: dumpapp [options] <plugin> [plugin-options]");
        PrintWriter printWriter = new PrintWriter(printStream);
        try {
            pAb.a(printWriter, pAb.d(), this.mGlobalOptions.options, pAb.b(), pAb.a());
        } finally {
            printWriter.flush();
        }
    }

    private static Map<String, DumperPlugin> generatePluginMap(Iterable<DumperPlugin> iterable) {
        HashMap hashMap = new HashMap();
        for (DumperPlugin dumperPlugin : iterable) {
            hashMap.put(dumperPlugin.getName(), dumperPlugin);
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public int dump(InputStream inputStream, PrintStream printStream, PrintStream printStream2, String[] strArr) {
        try {
            return doDump(inputStream, printStream, printStream2, strArr);
        } catch (WAb e) {
            printStream2.println(e.getMessage());
            dumpUsage(printStream2);
            return 1;
        } catch (DumpException e2) {
            printStream2.println(e2.getMessage());
            return 1;
        } catch (DumpappOutputBrokenException e3) {
            throw e3;
        } catch (RuntimeException e4) {
            e4.printStackTrace(printStream2);
            return 1;
        }
    }

    public Dumper(Iterable<DumperPlugin> iterable, NAb nAb) {
        this.mDumperPlugins = generatePluginMap(iterable);
        this.mParser = nAb;
        this.mGlobalOptions = new GlobalOptions();
    }
}
