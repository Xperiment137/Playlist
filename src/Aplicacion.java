public class Aplicacion {
    public static void main (String [ ] args) {
    PlayList list =new PlayList();
    Cancion c1=new Cancion(3,"Naïve","KMFDM","Metal Industrial",20);
    Cancion c2=new Cancion(4,"Sonne ", "RAMMSTEIN","Metal Industrial",100);
    Podcast p1=new Podcast(8,"Rosa de los Vientos","Cebrian","Historico",100,true);
    list.Add(c1);
    list.Add(c2);
    list.Add(p1);
    System.out.println("NOMBRE:"+list.Recorrer().getNombre());
    System.out.println("AUTOR:"+list.Recorrer().getAutor());
    list.Remove(0);
    System.out.println("NOMBRE:"+list.Recorrer().getNombre());
    System.out.println("AUTOR:"+list.Recorrer().getAutor());
    }
}
