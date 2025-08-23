class SmallestInfiniteSet {
    Set<Integer> set=new HashSet<>();

    public SmallestInfiniteSet() {
        for(int i=1;i<=1000;i++){
            this.set.add(i);

        }
        
    }
    
    public int popSmallest() {
        List<Integer> list= new ArrayList<>(this.set);
        Collections.sort(list);
        int num=0;
        for(int i: list){
            set.remove(i);
            num=i;
            break;
        }
        return num;
        
    }
    
    public void addBack(int num) {
        if(num>0){
            this.set.add(num);

        }
        
        
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */