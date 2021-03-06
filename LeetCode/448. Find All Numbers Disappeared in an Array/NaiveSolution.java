public class NaiveSolution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
        List<Integer> missingNumbers = new ArrayList<Integer>();
        
        int count=0;
        
        for(int i=0;i<nums.length;i++){
            if(hmap.get(nums[i])==null)
                hmap.put(nums[i],1);
        }
        
        for(int i=1; i<=nums.length; i++){
            if(hmap.get(i)==null)
            missingNumbers.add(i);
        }
        
        return missingNumbers;
    }
}