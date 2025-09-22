class TimeMap {
    List<String> keys ;
    List<List<String>> values;
    List<List<Integer>> timestamps;


    public TimeMap() {
        keys= new ArrayList<>();
        values= new ArrayList<>();
        timestamps= new ArrayList<>();

        
    }
    
    public void set(String key, String value, int timestamp) {
        int idx= keys.indexOf(key);
        if(idx==-1){
            keys.add(key);
        values.add(new ArrayList<>(Arrays.asList(value)));
        timestamps.add(new ArrayList<>(Arrays.asList(timestamp)));

        }
        else{
            values.get(idx).add(value);
            timestamps.get(idx).add(timestamp);
        }
        
        

        
    }
    
    public String get(String key, int timestamp) {
        String res= new String();
        int idx= keys.indexOf(key);
        if(idx==-1){
            return res;
        }
        List<Integer> time= new ArrayList<>();
        time=timestamps.get(idx);
        List<String> val= new ArrayList<>();
        val=values.get(idx);
        

        int start=0;
        int end= time.size()-1;
        while(start<=end){
            int mid= (start+end)/2;
            if(time.get(mid)<=timestamp){
                res=val.get(mid);
                start=mid+1;

            }
            else{
                end=mid-1;

            }

        }

        
       
        return res;    
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */