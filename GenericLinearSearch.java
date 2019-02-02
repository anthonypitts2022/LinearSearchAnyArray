public class GenericLinearSearch implements LinearSearchInterface{
    
    public GenericMethods(){}
    
    public <AnyType extends Comparable<AnyType>> int linearSearch(AnyType[] a, AnyType x){//simple linearSearch
        for(int i=0; i<a.length; i++){
            if(((a[i]).compareTo(x))==(0)){
                return i;
            }
        }
        return -1;
    }
    
}
