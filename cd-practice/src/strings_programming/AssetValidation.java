package strings_programming;

import java.util.HashMap;
import java.util.Map;

public class AssetValidation {

	public static void main(String[] args) {
		String assetSize = "1080x700";
		String screenPlatform = "7100";
		String str = "7100:1080x1920,1080x1080,1080x1172;8000:256x256";
		String[] firstSplit = str.split(";");
		Map<String, String> map = new HashMap<String, String>();
		for(int i = 0; i < firstSplit.length; i++) {
			//System.out.println(firstSplit[i]);
			String[] platfromSplit = firstSplit[i].split(":");
			String platform = platfromSplit[0];
			if(platform.equals(screenPlatform)) {
				String sizeList = platfromSplit[1];
				String[] sizes = sizeList.split(",");
				for (String size : sizes) {
					if(!size.equals(assetSize)) {
						System.out.println("size does not matches for " + platform);
						break;
					}
				}
			}
		}
	}
}
