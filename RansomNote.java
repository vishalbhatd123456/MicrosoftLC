static void checkMagazine(String[] magazine, String[] note) {
        LinkedHashMap<String,Integer> map1 = new LinkedHashMap<>();
        LinkedHashMap<String,Integer> map2 = new LinkedHashMap<>();
        
        for(int i = 0;i<magazine.length;i++){
            map1.put(magazine[i],0);
        }
        
        for(int i = 0;i<note.length;i++){
            map2.put(note[i],0);
        }
        
        for(int i = 0;i<note.length;i++){
            if(!map1.containsKey(map2.get(i))){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
