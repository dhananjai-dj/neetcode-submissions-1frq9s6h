class Solution {
    private  Map<String, List<String>> map = new HashMap<>();

	public  List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> result = new ArrayList<>();
		for (String str : strs) {
			String freqKey = getFrequencyMap(str);
			map.computeIfAbsent(freqKey, k -> new ArrayList<>()).add(str);
		}
		for (String key : map.keySet()) {
			List<String> list = map.get(key);
			result.add(list);
		}
		return result;
	}

	private  String getFrequencyMap(String string) {
		int[] freqMap = new int[26];
		int n = string.length();
		for (int i = 0; i < n; i++) {
			int index = string.charAt(i) - 97;
			freqMap[index] = freqMap[index] + 1;
		}
		StringBuilder sb = new StringBuilder();
		for (int i : freqMap) {
			sb.append(i + "#");
		}
		return sb.toString();
	}

}
