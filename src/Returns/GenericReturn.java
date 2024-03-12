package Returns;

public class GenericReturn <T, U extends String>{
    public T object;
    public U toString ;

    public GenericReturn(T object){this.object=object;}
    public GenericReturn(U toString){this.toString = toString;}

}
