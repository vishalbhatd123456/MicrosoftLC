class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<List<String>>();
        HashMap<String,List<String>> map = new HashMap<>();
        
        for(String i : strs){
            char[] ch = i.toCharArray();
            Arrays.sort(ch);
            String s = String.valueOf(ch);
            if(map.containsKey(s)){
                map.get(s).add(i); //if the map aldready has the sorted version, insert into the map
            }else{
                //create a new list and then insert
                List<String> list = new ArrayList<>();
                list.add(i);
                ans.add(list);
                map.put(s,list);
            }
        }
        return ans;
    }
}
