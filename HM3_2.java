
public class HM3_2 {

    public static void sort(int[] in){
        if(in.length <2) return; 
        int mid = in.length/2;
        int left[] = new int[mid];
        int right[] = new int[in.length-mid];
        for(int i=0; i<mid; i++){ 
            left[i] = in[i];
        }
        for(int i=0; i<in.length-mid; i++){ 
            right[i] = in[mid+i];
        }
        sort(left);
        sort(right);
        merge(left, right, in);
    }
    
    private static void merge(int[] a, int[] b, int[] all){
        int i=0, j=0, k=0;
        while(i<a.length && j<b.length){
            if(a[i] < b[j]){
                all[k] = a[i];
                i++;
            }else{
                all[k] = b[j];
                j++;
            }
            k++;
        }
        while(i<a.length){ 
            all[k++] = a[i++];
        }
        while(j<b.length){ 
            all[k++] = b[j++];
        }
    }
    
    public static void main(String[] args){
        int[] a = {2,3,6,4,9,22,25,1};
        sort(a);    
        for(int j=0; j<a.length; j++){
            System.out.print(a[j] + " ");
        }   
     }

}
