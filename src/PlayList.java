import  java.util.*;
public class PlayList<Media> {

    private ArrayList <Media> list ;
    private static int ratioUso;

    public PlayList()
    {
      this.list=new ArrayList<>();
    }

    public void Add(Media m){
        list.add(m);
    }
    public void Remove(int i){
        list.remove(i);
    }
    public ArrayList <Media> getplaylist(){
        return list;
    }
    public Cancion Recorrer ()
    {
        Iterator<Media> it = list.iterator();
        while (it.hasNext())
        {
           Media i=it.next();
            return (Cancion) i;
        }
        return null;
    }





}
