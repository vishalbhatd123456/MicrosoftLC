class Solution {
    public int minMeetingRooms(int[][] intervals) {
        if(intervals.length == 0){
            return 0;
        }
        
        //min heap
        PriorityQueue<Integer> allocator = new PriorityQueue<Integer>(intervals.length,new Comparator<Integer>(){
            public int compare(Integer a, Integer b){
                return a-b;
            }
        });
        
        //sort the intervals by the satrt time
        Arrays.sort(intervals, new Comparator<int[]>(){
            public int compare(final int[] a, final int[] b){
                return a[0]-b[0];
            }
        });
        
        allocator.add(intervals[0][1]);
        
        //iterate over the remaing intervals
        for(int i = 1;i<intervals.length;i++){
            if(intervals[i][0] >= allocator.peek()){
                allocator.poll();
            }
            
            allocator.add(intervals[i][1]);
        }
        
        return allocator.size();
    }
}
