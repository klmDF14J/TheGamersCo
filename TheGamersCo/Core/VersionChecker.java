package TheGamersCo.Core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.net.HttpURLConnection;
import java.net.URL;

import TheGamersCo.Handlers.ConfigHandler;

public class VersionChecker {
	public static String currentVersion = "0.9";
	public static String currentVersionFinal = currentVersion + ":";
	
	public static String getVersion() {
		return currentVersion;
	}
	
	public static String getPresentableString() {
		return currentVersionFinal;
	}
	public static void setVersion(String par1Version) {
		currentVersion = par1Version;
	}
	public static boolean isVersionUpToDate(String par1Version) {
		boolean isUpToDate = false;
		if(par1Version == currentVersion) {
			isUpToDate = true;
			if(ConfigHandler.enableDebug)System.out.println("[TheGamersCo] You Are Up To Date");
		}
		else {
			isUpToDate = false;
			if(ConfigHandler.enableDebug)System.out.println("[TheGamersCo] You Are Out Of Date. Update At http://www.minecraftforum.net/topic/1604765-146forgeregular-updates-the-gamers-co-mod-07-out-now/");
		}
		return isUpToDate;
	}
}
