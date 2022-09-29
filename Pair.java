
/**
 * Write a description of Pair here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pair<A> {
    
    A first;
    A sec;
    
    public Pair(A f, A s){
        
        this.first = f;
        this.sec = s;
    }
    
    public A getF(){    return first;}
    
    public A getC(){    return sec;}
}
