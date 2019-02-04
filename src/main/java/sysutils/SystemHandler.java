package sysutils;

import enums.JulyJavaVersionEnum;
import enums.JulyMacVersionEnum;
import enums.JulyOperationalSystemEnum;
import enums.JulyWindowsVersionEnum;
import customexceptions.JulyClassNotFoundException;
import customexceptions.JulyIOException;
import java.util.HashMap;
import org.apache.commons.lang3.SystemUtils;
import serializer.SerializeHandler;

public class SystemHandler {

    private static HashMap<String, Object> userProperties = new HashMap<>();

    public static void abortSystem(int code) {
        System.exit(code);
    }

    // apache system utils
    public static String getAwtToolkit() {
        return SystemUtils.AWT_TOOLKIT;
    }

    public static String getFileEncoding() {
        return SystemUtils.FILE_ENCODING;
    }

    public static boolean isJavaVersion(JulyJavaVersionEnum param) {
        switch (param) {
            case JAVA_10:
                return SystemUtils.IS_JAVA_10;
            case JAVA_11:
                return false; // FIXME: update jdk
            case JAVA_1_1:
                return SystemUtils.IS_JAVA_1_1;
            case JAVA_1_2:
                return SystemUtils.IS_JAVA_1_2;
            case JAVA_1_3:
                return SystemUtils.IS_JAVA_1_3;
            case JAVA_1_4:
                return SystemUtils.IS_JAVA_1_4;
            case JAVA_1_5:
                return SystemUtils.IS_JAVA_1_5;
            case JAVA_1_6:
                return SystemUtils.IS_JAVA_1_6;
            case JAVA_1_7:
                return SystemUtils.IS_JAVA_1_7;
            case JAVA_1_8:
                return SystemUtils.IS_JAVA_1_8;
            case JAVA_9:
                return SystemUtils.IS_JAVA_9;
            default:
                return false;
        }
    }

    public static boolean isOperationalSystem(JulyOperationalSystemEnum param) {
        switch (param) {
            case OS_IBM_400:
                return SystemUtils.IS_OS_400;
            case OS_AIX:
                return SystemUtils.IS_OS_AIX;
            case OS_FREE_BSD:
                return SystemUtils.IS_OS_FREE_BSD;
            case OS_HP_UX:
                return SystemUtils.IS_OS_HP_UX;
            case OS_IRIX:
                return SystemUtils.IS_OS_IRIX;
            case OS_LINUX:
                return SystemUtils.IS_OS_LINUX;
            case OS_MAC:
                return SystemUtils.IS_OS_MAC;
            case OS_NET_BSD:
                return SystemUtils.IS_OS_NET_BSD;
            case OS_OPEN_BSD:
                return SystemUtils.IS_OS_OPEN_BSD;
            case OS_UNIX:
                return SystemUtils.IS_OS_UNIX;
            case OS_SUN:
                return SystemUtils.IS_OS_SUN_OS;
            case OS_OS2:
                return SystemUtils.IS_OS_OS2;
            case OS_SOLARIS:
                return SystemUtils.IS_OS_SOLARIS;
            case OS_WINDOWS:
                return SystemUtils.IS_OS_WINDOWS;
            case OS_Z_OS:
                return SystemUtils.IS_OS_ZOS;
            default:
                return false;

        }
    }

    public static boolean isMacVersion(JulyMacVersionEnum param) {
        switch (param) {
            case MAC_CHEETAH:
                return SystemUtils.IS_OS_MAC_OSX_CHEETAH;
            case MAC_EL_CAPITAN:
                return SystemUtils.IS_OS_MAC_OSX_EL_CAPITAN;
            case MAC_JAGUAR:
                return SystemUtils.IS_OS_MAC_OSX_JAGUAR;
            case MAC_LION:
                return SystemUtils.IS_OS_MAC_OSX_LION;
            case MAC_MAVERICKS:
                return SystemUtils.IS_OS_MAC_OSX_MAVERICKS;
            case MAC_MOUNTAIN_LION:
                return SystemUtils.IS_OS_MAC_OSX_MOUNTAIN_LION;
            case MAC_PANTHER:
                return SystemUtils.IS_OS_MAC_OSX_PANTHER;
            case MAC_PUMA:
                return SystemUtils.IS_OS_MAC_OSX_PUMA;
            case MAC_SNOW_LEOPARD:
                return SystemUtils.IS_OS_MAC_OSX_SNOW_LEOPARD;
            case MAC_TIGER:
                return SystemUtils.IS_OS_MAC_OSX_TIGER;
            case MAC_YOSEMITE:
                return SystemUtils.IS_OS_MAC_OSX_YOSEMITE;
            default:
                return false;
        }

    }

    public static boolean isWindowsVersion(JulyWindowsVersionEnum param) {
        switch (param) {
            case WINDOWS_10:
                return SystemUtils.IS_OS_WINDOWS_10;
            case WINDOWS_2000:
                return SystemUtils.IS_OS_WINDOWS_2000;
            case WINDOWS_2003:
                return SystemUtils.IS_OS_WINDOWS_2003;
            case WINDOWS_2008:
                return SystemUtils.IS_OS_WINDOWS_2008;
            case WINDOWS_2012:
                return SystemUtils.IS_OS_WINDOWS_2012;
            case WINDOWS_7:
                return SystemUtils.IS_OS_WINDOWS_7;
            case WINDOWS_8:
                return SystemUtils.IS_OS_WINDOWS_8;
            case WINDOWS_95:
                return SystemUtils.IS_OS_WINDOWS_95;
            case WINDOWS_98:
                return SystemUtils.IS_OS_WINDOWS_98;
            case WINDOWS_ME:
                return SystemUtils.IS_OS_WINDOWS_ME;
            case WINDOWS_NT:
                return SystemUtils.IS_OS_WINDOWS_NT;
            case WINDOWS_VISTA:
                return SystemUtils.IS_OS_WINDOWS_VISTA;
            case WINDOWS_XP:
                return SystemUtils.IS_OS_WINDOWS_XP;
            default:
                return false;
        }

    }

    // system properties
    public static void setSystemProperty(String property,
            Object value) {
        System.setProperty(property, (String) value);
    }

    public static String getSystemProperty(String property) {
        return System.getProperty(property);
    }

    public static String getJavaClassPath() {
        return System.getProperty("java.class.path");
    }

    public static String getJavaHome() {
        return System.getProperty("java.home");
    }

    public static String getJavaVendor() {
        return System.getProperty("java.vendor");
    }

    public static String getJavaVendorURL() {
        return System.getProperty("java.vendor.url");
    }

    public static String getJavaVersion() {
        return System.getProperty("java.version");
    }

    public static String getFileSeparator() {
        return System.getProperty("file.separator");
    }

    public static String getPathSeparator() {
        return System.getProperty("path.separator");
    }

    public static String getLineSeparator() {
        return System.getProperty("line.separator");
    }

    public static String getOperationalSystemArchitecture() {
        return System.getProperty("os.arch");
    }

    public static String getOperationalSystemName() {
        return System.getProperty("os.name");
    }

    public static String getOperationalSystemVersion() {
        return System.getProperty("os.version");
    }

    public static String getUserDir() {
        return System.getProperty("user.dir");
    }

    public static String getUserHome() {
        return System.getProperty("user.home");
    }

    public static String getUserName() {
        return System.getProperty("user.name");
    }

    // custom properties. can be defined at run time
    public static HashMap getCustomProperties() {
        return userProperties;
    }

    public static void serUserProperty(String property,
            Object value) {
        userProperties.put(property, value);
    }

    public static String getUserProperty(String property) {
        if (containsProperty(property)) {
            return (String) userProperties.get(property);
        }
        return "";
    }

    public static boolean containsProperty(String property) {
        return userProperties.containsKey(property);
    }

    public static void removeProperty(String property) {
        if (containsProperty(property)) {
            userProperties.remove(property);
        }
    }

    public static boolean hasAnyPropertySet() {
        return !(userProperties.isEmpty() || userProperties == null);
    }

    public static void setUserProperties(HashMap properties) {
        userProperties = properties;
    }

    public static void setSerializedUserProperties(String serial)
            throws JulyIOException, JulyClassNotFoundException {
        userProperties = (HashMap<String, Object>) SerializeHandler.deserialize(serial);
    }

    public static void clearUserProperties() {
        userProperties = null;
        userProperties = new HashMap<>();
    }

    public static String getSerializedProperties()
            throws JulyIOException {
        return hasAnyPropertySet() ? SerializeHandler.serialize(userProperties) : null;
    }

}
