class Solution {
	HashMap<Integer,HashMap<Integer,Boolean>> hmap=new HashMap<Integer,HashMap<Integer,Boolean>>();
	public boolean ThefloorIsLava(int[] furnitures) {
    	if(furnitures.length==2 && furnitures[1]!=1)
        	return false;
   	 
	HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
   	 
	for(int i=0;i<furnitures.length;i++)
	{
    	map.put(furnitures[i],i);
	}
 return helper(map,furnitures,1,1);   	 
   	 
	}
	boolean helper(HashMap<Integer,Integer> map,int[] furnitures,int s,int start)
	{   
    	if(hmap.containsKey(start))
    	{
        	if(hmap.get(start).containsKey(s))
        	{
            	return hmap.get(start).get(s);
        	}
    	}
    	//System.out.println("s="+s+" start="+start);
    	if(start==furnitures.length-1)
        	return true;       	 
    	int[] k=new int[3];
    	k[0]=s-1;
    	k[1]=s;
    	k[2]=s+1;
    	boolean ans=false;
    	for(int i=0;i<k.length;i++)
    	{
        	//System.out.println("value of k="+k[i]);
        	if(k[i]!=0 && map.containsKey(furnitures[start]+k[i]))
        	{
           	 
            	ans=helper(map,stones,k[i],map.get(furnitures[start]+k[i]));
            	if(ans==true)
            	{
                	break;
            	}
        	}
    	}
    	HashMap<Integer,Boolean> sudo=hmap.getOrDefault(start,new HashMap<Integer,Boolean>());
    	sudo.put(s,sudo.getOrDefault(s,ans));
    	hmap.put(start,sudo);
   	 
    	return ans;
	}
}
