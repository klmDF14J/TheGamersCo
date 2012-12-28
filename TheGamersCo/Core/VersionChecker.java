package TheGamersCo.Core;

public class VersionChecker {
	public static String currentVersion = "0.9";
	public static String currentVersionFinal = currentVersion + ":";
	
	public static String getVersion() {
		return currentVersion;
	}
	
	public static String getPresentableString() {
		return currentVersionFinal;
	}
	public void setVersion(String par1Version) {
		currentVersion = par1Version;
	}
}
