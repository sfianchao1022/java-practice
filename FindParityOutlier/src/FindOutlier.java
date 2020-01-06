public class FindOutlier{
  static int find(int[] integers){
  
    int e=0;
    int o=0;
    int ans=0;
    
    for(int i=0;i<integers.length;i++){
      if(integers[i]%2==0){
        //even
        e++;
      }
      else{
        //odd
        o++;
      }
    }
    
    if(o>e){
      //return even
      for(int i=0;i<integers.length;i++){
        if(integers[i]%2==0){
         ans = integers[i];
        }
      }
    }
    else{
      //return odd
      for(int i=0;i<integers.length;i++){
        if(integers[i]%2==1){
          ans = integers[i];
        }
      }
    }
    
   
    return ans;
  }
}
